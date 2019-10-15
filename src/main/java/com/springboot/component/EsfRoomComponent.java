package com.springboot.component;

import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.springboot.component.chenbin.HttpCallComponent;
import com.springboot.config.Msgagger;
import com.springboot.config.ZtgeoBizException;
import com.springboot.entity.SdqEntry;
import com.springboot.popj.pub_data.SJ_Info_Handle_Result;
import com.springboot.popj.pub_data.SJ_Sjsq;
import com.springboot.util.HttpClientUtils;
import com.springboot.util.SysPubDataDealUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class EsfRoomComponent {

    @Autowired
    private HttpCallComponent httpCallComponent;

    @Value("${httpclient.windowAcceptanceIp}")
    private String windowAcceptanceIp; //一窗受理ip
    @Value("${httpclient.windowAcceptanceSeam}")
    private String windowAcceptanceSeam; //一窗受理接口
    @Value("${httpclient.ip}")
    private String ip;
    @Value("${httpclient.seam}")
    private String seam;
    @Value("${chenbin.registrationBureau.username}")
    private String username;
    @Value("${chenbin.registrationBureau.password}")
    private String password;

    /**
     * 二手房水电气回填数据自动接口
     *
     * @param commonInterfaceAttributer
     * @return
     */
    public ObjectRestResponse getAutoBackfillData(String commonInterfaceAttributer) throws ParseException {
        ObjectRestResponse resultRV = new ObjectRestResponse();
        SJ_Sjsq sjSjsq = SysPubDataDealUtil.parseReceiptData(commonInterfaceAttributer, null, null, null);
        if (null == sjSjsq) {
            throw new ZtgeoBizException(Msgagger.SHZH_BAD);
        }
        SdqEntry sdqEntry = new SdqEntry();
        List<SJ_Info_Handle_Result> handleResultVoList = sjSjsq.getHandleResultVoList();
        if (handleResultVoList == null) {
            throw new ZtgeoBizException("服务传入异常，水电气处理结果传入为空");
        }
        for (SJ_Info_Handle_Result handleResult : handleResultVoList) {
            String serviceCode = handleResult.getServiceCode();
            if (StringUtils.isBlank(serviceCode)) {
                throw new ZtgeoBizException("传入服务数据异常，传入的服务标识(serviceCode)为空");
            }
            switch (serviceCode) {
                case Msgagger.SHUISERVICE_CODE:
                    sdqEntry.setXshh(handleResult.getAcceptanceNumber());
                    sdqEntry.setGsdw(handleResult.getProvideUnit());
                    break;
                case Msgagger.QISERVICE_CODE:
                    sdqEntry.setXqhh(handleResult.getAcceptanceNumber());
                    sdqEntry.setGqdw(handleResult.getProvideUnit());
                    break;
                case Msgagger.DIANSERVICE_CODE:
                    sdqEntry.setXdhh(handleResult.getAcceptanceNumber());
                    sdqEntry.setGddw(handleResult.getProvideUnit());
                    break;
                case Msgagger.DIANSHISERVICE_CODE:
                    sdqEntry.setXthh(handleResult.getAcceptanceNumber());
                    sdqEntry.setGtdw(handleResult.getProvideUnit());
                    break;
                default:
                    break;
            }
        }

        sdqEntry.setSlbh(sjSjsq.getRegisterNumber());
        JSONObject jsonObject = JSONObject.fromObject(sdqEntry);

        System.out.println("最终传入数据为：" + com.alibaba.fastjson.JSONObject.toJSONString(jsonObject));

        String pingtai = HttpClientUtils.getJsonData(jsonObject, "http://" + ip + ":" + seam + "/api/services/app/BdcBizNotify/WriteBackSDQ");
        if (StringUtils.isNotBlank(pingtai)) {
            JSONObject pingObject = JSONObject.fromObject(pingtai);
            if (!(boolean) pingObject.get("success")) {
                throw new ZtgeoBizException("不动产接口执行异常，返回数据为：" + pingObject.getString("message"));
            }
        } else {
            throw new ZtgeoBizException("不动产接口返回数据异常，返回数据为空");
        }

        //返回数据到一窗受理平台保存受理编号和登记编号
        String token = httpCallComponent.getToken(username, password);
        if (StringUtils.isBlank(token)) {
            throw new ZtgeoBizException("用户token获取异常,取得的token为空");
        }

        Map<String, String> mapParmeter = new HashMap<>();
        mapParmeter.put("receiptNumber", sjSjsq.getReceiptNumber());
        mapParmeter.put("registerNumber", sjSjsq.getRegisterNumber());

        //返回一窗受理平台执行步骤提交
        String resultJson = httpCallComponent.preservationRegistryDataAndSubmit(mapParmeter, token);
        //解析一窗受理返回结果
        resultRV = httpCallComponent.adaptationPreservationReturn(resultJson);

        if (resultRV.getStatus() != 200) {
            log.error((String) resultRV.getData());
            throw new ZtgeoBizException((String) resultRV.getData());
        }

        resultRV.setData(Msgagger.AUTOINTECECG);
        return resultRV;
    }
}
