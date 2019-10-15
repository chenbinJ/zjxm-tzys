package com.springboot.service.chenbin.impl;

import com.springboot.component.chenbin.file.FromFTPDownloadComponent;
import com.springboot.config.ZtgeoBizException;
import com.springboot.entity.SJ_Fjfile;
import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;
import com.springboot.entity.chenbin.personnel.req.PersonnelUnitReqEntity;
import com.springboot.entity.chenbin.personnel.req.ReqForPersonBase64Entity;
import com.springboot.entity.chenbin.personnel.req.ReqForPersonEntity;
import com.springboot.entity.chenbin.personnel.resp.PersonnelResponseEntity;
import com.springboot.entity.chenbin.personnel.resp.PersonnelResponseListEntity;
import com.springboot.entity.chenbin.personnel.resp.PersonnelResponseSingleEntity;
import com.springboot.feign.ExchangeWithOuterFeign;
import com.springboot.service.chenbin.OuterInterfaceHandleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import sun.misc.BASE64Encoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("outerIntfService")
public class OuterInterfaceHandleServiceImpl implements OuterInterfaceHandleService {

    @Autowired
    private FromFTPDownloadComponent fromFTPDownloadComponent;

    @Autowired
    private ExchangeWithOuterFeign exchangeFeign;

    @Override
    public List<PersonnelUnitEntity> getPersonnelUnits(PersonnelUnitReqEntity personnelUnitReq) {
        String mc = personnelUnitReq.getMc();
        String zjhm = personnelUnitReq.getZjhm();
        Map<String,Object> params = new HashMap<String,Object>();
        List<PersonnelUnitEntity> rvList = new ArrayList<PersonnelUnitEntity>();
        PersonnelUnitEntity rvSingle = null;

        if(StringUtils.isNotBlank(personnelUnitReq.getZjlx())){
            String code = "";
            PersonnelResponseSingleEntity rv_single = null;
            PersonnelResponseListEntity rv_list = null;
            switch (personnelUnitReq.getZjlx()){
                case "身份证":
                    List<ReqForPersonEntity> ps = new ArrayList<ReqForPersonEntity>();
                    ReqForPersonBase64Entity p = new ReqForPersonBase64Entity();
                    p.setXm(mc);
                    p.setSfzh(zjhm);
                    code = "ga_info_check";
                    boolean isBase64 = false;
                    if(StringUtils.isNotBlank(personnelUnitReq.getFjlj())){
                        code = "ga_check";
                        isBase64 = true;
                        SJ_Fjfile fj = new SJ_Fjfile();
                        if (fromFTPDownloadComponent.downFile(
                                personnelUnitReq.getFjlj().substring(0, personnelUnitReq.getFjlj().lastIndexOf("\\")),
                                personnelUnitReq.getFjlj().substring(personnelUnitReq.getFjlj().lastIndexOf("\\") + 1),
                                fj
                        )) {
                            BASE64Encoder encoder = new BASE64Encoder();
                            String base64 = encoder.encode(fj.getFileContent());
                            p.setXczp(base64);
                        }
                    }
                    ps.add(p);
                    params.put("datalist",ps);
                    if(isBase64){
                        rv_list = exchangeFeign.rkkrxbd(params);
                    }else {
                        rv_list = exchangeFeign.rkkjzxxcx(params);
                    }
                    break;
                case "统一社会信用代码":
                    String top_1 = zjhm.substring(0,1);
                    String top_2 = zjhm.substring(1,2);
                    switch (top_1){
                        case "1":

                            break;
                        case "5":
                            params.put("org_name",mc);
                            params.put("usc_code",zjhm);
                            Map<String,Object> result = null;
                            switch (top_2){
                                case "1":       //社会团体
                                    code = "mz_social_group_check";
                                    //调用
                                    result = exchangeFeign.shttfrdjzscx(params);
                                    break;
                                case "2":       //民办非企业单位
                                    code = "mz_private_unit_check";
                                    //调用
                                    result = exchangeFeign.mbfqydwdjzscx(params);
                                    break;
                                case "3":       //基金会
                                    code = "mz_foundation_check";
                                    //调用
                                    result = exchangeFeign.jjhfrdjzscx(params);
                                    break;
                                case "9":
                                    throw new ZtgeoBizException("暂不支持验证的机构编号");
                                default:
                                    throw new ZtgeoBizException("暂不支持验证的机构编号");
                            }
                            if(result!=null){
                                String status = (String)result.get("status");
                                String msg = (String)result.get("msg");
                                if(StringUtils.isNotBlank(status) && status.equals("0")){
                                    rv_list = new PersonnelResponseListEntity();
                                    rv_list.setStatus(status);
                                    rv_list.setMsg(msg);
                                    rv_list.setData((List<Object>) result.get("data"));
                                }else{
                                    rv_single = new PersonnelResponseSingleEntity();
                                    rv_single.setStatus(status);
                                    rv_single.setMsg(msg);
                                }
                            }
                            break;
                        case "9":
                            if(mc.contains("银行")){
                                code = "gs_bank_check";
                            }else{
                                code = "gs_other_check";
                                params.put("entname",mc);
                                params.put("uniscid",zjhm);
                                rv_single = exchangeFeign.qyjbxxyz(params);
                            }
                            break;
                        default:
                            throw new ZtgeoBizException("暂不支持验证的机构编号");
                    }
                    break;
                default:
                    throw new ZtgeoBizException("暂不支持验证的证件类型");
            }

            if(rv_single!=null) {
                if (StringUtils.isNotBlank(rv_single.getStatus()) && "0".equals(rv_single.getStatus())) {
                    rvSingle = rv_single.getData();
                    rvSingle.setEntityType(code);
                    rvList.add(rvSingle);
                } else {
                    throw new ZtgeoBizException("接口调用失败，失败原因：" + (StringUtils.isNotBlank(rv_single.getMsg()) ? rv_single.getMsg() : "未给出失败原因"));
                }
            } else if(rv_list!=null){
                if(StringUtils.isNotBlank(rv_list.getStatus()) && "0".equals(rv_list.getStatus())) {
                    rvList = rv_list.getData();
                    for (PersonnelUnitEntity pu : rvList) {
                        pu.setEntityType(code);
                    }
                }else{
                    throw new ZtgeoBizException("接口调用失败，失败原因：" + (StringUtils.isNotBlank(rv_list.getMsg()) ? rv_list.getMsg() : "未给出失败原因"));
                }
            } else {
                throw new ZtgeoBizException("接口调用失败，返回值为null");
            }
        }else{
            throw new ZtgeoBizException("证件类型不可为空");
        }
        return rvList;
    }

}
