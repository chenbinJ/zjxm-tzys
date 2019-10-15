package com.springboot.component;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.springboot.config.Msgagger;
import com.springboot.constant.penghao.BizOrBizExceptionConstant;
import com.springboot.entity.ParamEntity;
import com.springboot.popj.FwInfo;
import com.springboot.popj.GlImmovable;
import com.springboot.popj.RelatedPerson;
import com.springboot.popj.netSign.BusinessContract;
import com.springboot.popj.netSign.GlHouseBuyer;
import com.springboot.popj.netSign.GlHouseSeller;
import com.springboot.popj.pub_data.Sj_Info_Qsxx;
import com.springboot.util.NetSignUtils;
import com.springboot.util.chenbin.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.*;

/**
 * 针对于宿迁流程Component
 */
@Component
@Slf4j
public class SqRealEstateMortgageComponent {
    @Value("${sq.jyht.api_id}")
    private String jyapiId;
    @Value("${sq.jyht.from_user}")
    private String jyfromUser;
    @Value("${sq.qsxx.api_id}")
    private String qsapiId;
    @Value("${sq.qsxx.from_user}")
    private String qsfromUser;
    @Value("${sq.jyht.ip}")
    private String ip;
    @Value("${sq.jyht.post}")
    private String post;
    @Value("${sq.qsxx.swjgdm}")
    private String swjgdm;
    @Value("${sq.qsxx.swrydm}")
    private String swrydm;
    @Value("${sq.qsxx.serviceMethod}")
    private String serviceMethod;

    @Autowired
    private RealEstateMortgageComponent realEstateMortgageComponent;
    @Autowired
    private NetSignUtils netSignUtils;



    /**
     * 地税信息处理
     * @param
     * @return
     */
    public ObjectRestResponse sqTaxation(String htbh) throws  Exception{
        ObjectRestResponse resultRV = new ObjectRestResponse();
        Map<String,String> header=new HashMap<>();
        header.put("api_id",qsapiId);
        header.put("from_user",qsfromUser);
        Map<String,Object> param=new HashMap<>();
        param.put("htbh",htbh);
        List<Sj_Info_Qsxx> qsxxList = new ArrayList<>();
        param.put("swjgdm",swjgdm);
        param.put("swrydm",swrydm);
        param.put("serviceMethod",serviceMethod);
        String result=netSignUtils.clfDsxx(serviceMethod,swjgdm,swrydm,htbh,"http://"+ip+":"+post+"/WxfcjyJmssendAction.do",qsfromUser,qsapiId);
        JSONObject resultObject=JSONObject.fromObject(result);
        try {
            if (resultObject.getJSONArray("griddata") !=null){
                JSONArray jsonArray = resultObject.getJSONArray("griddata");
                for (int i = 0; i < jsonArray.size(); i++) {
                    clTaxation(jsonArray.getJSONObject(i), qsxxList);
                }
                return resultRV.data(qsxxList);
            }
        }catch (Exception ex){
            resultRV.setMessage(Msgagger.DATA_FAILURE);
            resultRV.setStatus(20500);
            return resultRV;
        }
        return resultRV.data(qsxxList);
    }



    /**
     * 二手房交易合同处理
     * @param paramEntity
     * @return
     */
    public ObjectRestResponse sqTransactionContract(ParamEntity paramEntity) throws IOException {
        ObjectRestResponse resultRV = new ObjectRestResponse();
        paramEntity.setOrgId(1);
        String param= com.alibaba.fastjson.JSONObject.toJSONString(paramEntity, SerializerFeature.PrettyFormat);
        List<BusinessContract> businessContractList=new ArrayList<>();
        String resultJosn=HttpClientUtil.post(jyfromUser,jyapiId,param,"http://"+ip+":"+post+"/sqservice/sh/secondInfo");
        if (resultJosn.equals("0")){
            resultRV.setMessage(Msgagger.INTERCE_NULL);
            resultRV.setStatus(20500);
            return  resultRV;
        }
        try {
            JSONObject jyObject=JSONObject.fromObject(resultJosn);
            JSONObject dataInfo=jyObject.getJSONObject("dataInfo");
            JSONArray sInfoArray=dataInfo.getJSONArray("sInfo");
            if (null != sInfoArray) {
                for (int i = 0; i < sInfoArray.size(); i++) {
                    clTransactionContract(sInfoArray.getJSONObject(i), businessContractList);
                }
            }
        }catch (Exception e){
            resultRV.setMessage(Msgagger.INTERCE_NULL);
            resultRV.setStatus(20500);
            return  resultRV;
        }
        return resultRV.data(businessContractList);
    }


    private void clTaxation(JSONObject jsonObject, List<Sj_Info_Qsxx> sj_info_qsxxList){
        Sj_Info_Qsxx sjInfoQsxx=new Sj_Info_Qsxx();
        sjInfoQsxx.setXtsphm(jsonObject.getString("XTSPHM"));
        sjInfoQsxx.setHtbh(jsonObject.getString("HTBH"));
        sjInfoQsxx.setNsrsbh(jsonObject.getString("NSRSBH"));
        sjInfoQsxx.setNsrmc(jsonObject.getString("NSRMC"));
        sjInfoQsxx.setZrfcsfbz(jsonObject.getString("ZRFCSFBZ"));
        sjInfoQsxx.setDzsphm(jsonObject.getString("DZSPHM"));
        sjInfoQsxx.setPzzlDm(jsonObject.getString("PZZL_DM"));
        sjInfoQsxx.setPzzgDm(jsonObject.getString("PZZG_DM"));
        sjInfoQsxx.setPzhm(jsonObject.getString("PZHM"));
        sjInfoQsxx.setSkssqq(jsonObject.getString("SKSSQQ"));
        sjInfoQsxx.setSkssqz(jsonObject.getString("SKSSQZ"));
        sjInfoQsxx.setZsxmDm(jsonObject.getString("ZSXM_DM"));
        sjInfoQsxx.setZspmDm(jsonObject.getString("ZSPM_DM"));
        sjInfoQsxx.setZszmDm(jsonObject.getString("ZSZM_DM"));
        sjInfoQsxx.setZsxmMc(jsonObject.getString("ZSXM_MC"));
        sjInfoQsxx.setZspmMc(jsonObject.getString("ZSPM_MC"));
        sjInfoQsxx.setZszmMc(jsonObject.getString("ZSZM_MC"));
        sjInfoQsxx.setJsyj(jsonObject.getString("JSYJ"));
        sjInfoQsxx.setSl(jsonObject.getString("SL_1"));
        sjInfoQsxx.setSjje(jsonObject.getLong("SJJE"));
        sjInfoQsxx.setZgswskfjDm(jsonObject.getString("ZSSWJG_DM"));
        sjInfoQsxx.setZsswjgDm(jsonObject.getString("SKSSSWJG_DM"));
        sjInfoQsxx.setSkssswjgDm(jsonObject.getString("ZGSWSKFJ_MC"));
        sjInfoQsxx.setZgswskfjMc(jsonObject.getString("ZSSWJG_MC"));
        sjInfoQsxx.setZsswjgMc(jsonObject.getString("SKSSSWJG_MC"));
        sjInfoQsxx.setKjrq(jsonObject.getString("kjrq"));
        sjInfoQsxx.setBz(jsonObject.getString("BZ"));
        sjInfoQsxx.setProvideUnit(Msgagger.GXPT);
        sjInfoQsxx.setDataComeFromMode(Msgagger.INTERCE_DY);
        sjInfoQsxx.setDataJson(jsonObject.toString());
        sj_info_qsxxList.add(sjInfoQsxx);
    }






    /**
     * 处理数据
     * @param jsonObject
     * @param businessContractList
     */
    private  void clTransactionContract(JSONObject jsonObject, List<BusinessContract> businessContractList){
        BusinessContract businessContract=new BusinessContract();
        businessContract.setContractRecordNumber(jsonObject.getString("HTBAH"));
        businessContract.setContractSignTime(jsonObject.getString("HTQDRQ"));
        businessContract.setContractAmount(jsonObject.getString("HTJE"));
        businessContract.setProvideUnit(Msgagger.GXPT);
        businessContract.setDataComeFromMode(Msgagger.INTERCE_DY);
        businessContract.setDataJson(jsonObject.toString());
        List<GlImmovable> glImmovableList=new ArrayList<>();
        GlImmovable glImmovable=new GlImmovable();
        glImmovable.setImmovableType(Msgagger.FANGDI);
        FwInfo fwInfo=new FwInfo();
        fwInfo.setSeatNumber(jsonObject.getString("FWZH"));
        fwInfo.setRoomMark(jsonObject.getString("FWFH"));
        fwInfo.setTotalStorey(jsonObject.getString("LCZS"));
        fwInfo.setLocationStorey(jsonObject.getString("SZLC"));
        fwInfo.setArchitecturalArea(jsonObject.getString("JZMJ"));
        fwInfo.setImmovableUnitNumber(jsonObject.getString("BDCDYH"));
        glImmovable.setFwInfo(fwInfo);
        glImmovableList.add(glImmovable);
        businessContract.setGlImmovableVoList(glImmovableList);
        //权利人
        List<GlHouseSeller> glHouseSellerVoList=new ArrayList<>();

        if (jsonObject.getString("MFXM").contains(",")){
            String [] obligorName=jsonObject.getString("MFXM").split(",");
            String [] obligorZjhm=jsonObject.getString("MFZJHM").split(",");
            String [] obligorZjlx=jsonObject.getString("MFZJLX").split(",");
            for (int i=0;i<obligorName.length;i++) {
                GlHouseSeller glHouseSeller=new GlHouseSeller();
                glHouseSeller.setObligeeName(obligorName[i]);
                glHouseSeller.setObligeeType(BizOrBizExceptionConstant.OBLIGEE_TYPE_OF_QLR);
                RelatedPerson relatedPerson=new RelatedPerson();
                relatedPerson.setObligeeDocumentType(obligorZjlx[i]);
                relatedPerson.setObligeeName(obligorName[i]);
                relatedPerson.setObligeeDocumentNumber(obligorZjhm[i]);
                glHouseSeller.setRelatedPerson(relatedPerson);
                glHouseSellerVoList.add(glHouseSeller);
                businessContract.setGlHouseSellerVoList(glHouseSellerVoList);
            }
        }
        //购买人
        List<GlHouseBuyer> glHouseBuyerList=new ArrayList<>();
        if (jsonObject.getString("GMFXM").contains(",")){
            String [] obligeeName=jsonObject.getString("GMFXM").split(",");
            String [] obligeeZjhm=jsonObject.getString("GMFZJHM").split(",");
            String [] obligeeZjhx=jsonObject.getString("GMFZJLX").split(",");
            for (int i=0;i<obligeeName.length;i++) {
                    GlHouseBuyer glHouseBuyer=new GlHouseBuyer();
                    glHouseBuyer.setObligeeName(obligeeName[i]);
                    glHouseBuyer.setObligeeType(BizOrBizExceptionConstant.OBLIGEE_TYPE_OF_GFZ);
                    RelatedPerson gmrelatedPerson=new RelatedPerson();
                    gmrelatedPerson.setObligeeDocumentType(obligeeZjhx[i]);
                    gmrelatedPerson.setObligeeName(obligeeName[i]);
                    gmrelatedPerson.setObligeeDocumentNumber(obligeeZjhm[i]);
                    glHouseBuyer.setRelatedPerson(gmrelatedPerson);
                    glHouseBuyerList.add(glHouseBuyer);
            }
        }
        businessContract.setGlHouseBuyerVoList(glHouseBuyerList);
        businessContractList.add(businessContract);
    }



}
