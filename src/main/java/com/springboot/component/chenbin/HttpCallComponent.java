package com.springboot.component.chenbin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.springboot.config.Msgagger;
import com.springboot.config.ZtgeoBizException;
import com.springboot.entity.SJ_Fjfile;
import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;
import com.springboot.entity.chenbin.personnel.punit.PersonEntity;
import com.springboot.popj.register.HttpRequestMethedEnum;
import com.springboot.popj.registration.RegistrationBureau;
import com.springboot.util.HttpClientUtils;
import com.springboot.util.ParamHttpClientUtil;
import com.springboot.util.chenbin.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import org.apache.commons.lang3.StringUtils;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class HttpCallComponent {

    @Autowired
    private HttpClientUtils httpClientUtils;

    @Value("${httpclient.ip}")
    private String ip;                  //登记局Ip
    @Value("${httpclient.seam}")
    private String seam;                //登记局端口
    @Value("${httpclient.windowAcceptanceIp}")
    private String windowAcceptanceIp; //一窗受理ip
    @Value("${httpclient.windowAcceptanceSeam}")
    private String windowAcceptanceSeam; //一窗受理接口
    @Value("${chenbin.otherBureau.ga.basicInfoUrl}")
    private String basicInfoUrl;
    @Value("${chenbin.otherBureau.ga.basicInfoCheckUrl}")
    private String basicInfoCheckUrl;
    @Value("${chenbin.otherBureau.mz.url}")
    private String mzUrl;
    @Value("${chenbin.otherBureau.gs.url}")
    private String gsUrl;

    public JSONObject callRegistrationBureauForRegister(RegistrationBureau registrationBureauVo) {
        //整理json数据
        net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(registrationBureauVo);
        System.out.println("最终传入数据为：" + jsonObject.toString());
        //发送到登记局
        String json = httpClientUtils.getJsonData(jsonObject, "http://" + ip + ":" + seam + "/api/services/app/BdcWorkFlow/CreateFlow");
        //转成json判断是否成功
        JSONObject resultObject = (JSONObject) JSONObject.parse(json);
        return resultObject;
    }

    //获取一窗受理用户token
    public String getToken(String username, String password) {
        Map<String, String> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
        Map<String, String> header = new HashMap<String, String>();
        String json = ParamHttpClientUtil.sendHttp(HttpRequestMethedEnum.HttpPost,
                "application/json",
                "http://" + windowAcceptanceIp + ":" + windowAcceptanceSeam + "/jwt/token", map, header);
        JSONObject jsonObject = (JSONObject) JSONObject.parse(json);
        Integer status = jsonObject.getInteger("status");
        if (status != 200) {
            log.error("用户名或密码错误,找不到对应用户");
            return null;
        }
        String data = jsonObject.getString("data");
        return data;
    }

    public JSONObject getTokenYcsl(String username, String password) {
        Map<String, String> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
        Map<String, String> header = new HashMap<String, String>();
        String json = ParamHttpClientUtil.sendHttp(HttpRequestMethedEnum.HttpPost,
                "application/json",
                "http://" + windowAcceptanceIp + ":" + windowAcceptanceSeam + "/jwt/token", map, header);
        JSONObject jsonObject = (JSONObject) JSONObject.parse(json);
        return jsonObject;
    }


    //获取当前办件的附件列表信息
    public List<SJ_Fjfile> getFileVoList(String receiptNumber, String token) {
        Map<String, String> header = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        params.put("receiptNumber", receiptNumber);
        header.put("Authorization", token);
        String json = HttpClientUtil.sendHttp(HttpRequestMethedEnum.HttpPost,
                "application/json",
                "http://" + windowAcceptanceIp + ":" + windowAcceptanceSeam + "/api/biz/RecService/DealRecieveFromOuter4",
                params, header);
        JSONObject oo = JSONObject.parseObject(json);
        List<SJ_Fjfile> fileVoList = JSON.parseArray(JSON.toJSONString(oo.get("data")), SJ_Fjfile.class);
        System.out.println("chenbin返回信息为：" + json);
        return fileVoList;
    }

    //转内网收到正确响应后执行向一窗受理的请求
    public String preservationRegistryData(Map<String, String> map, String token) {
        Map<String, String> header = new HashMap<String, String>();
        header.put("Authorization", token);
        String json = ParamHttpClientUtil.sendHttp(HttpRequestMethedEnum.HttpPost,
                "application/json",
                "http://" + windowAcceptanceIp + ":" + windowAcceptanceSeam + "/api/biz/RecService/DealRecieveFromOuter1",
                map, header);
        JSONObject jsonObject = (JSONObject) JSONObject.parse(json);
        System.out.println("chenbin返回信息为：" + jsonObject);
        return json;
    }

    //内网提交数据后执行向一窗受理的请求（带流程提交）
    public String preservationRegistryDataAndSubmit(Map<String, String> map, String token) {
        Map<String, String> header = new HashMap<String, String>();
        header.put("Authorization", token);
        String json = ParamHttpClientUtil.sendHttp(HttpRequestMethedEnum.HttpPost,
                "application/json",
                "http://" + windowAcceptanceIp + ":" + windowAcceptanceSeam + "/api/biz/RecService/DealRecieveFromOuter2",
                map, header);
        JSONObject jsonObject = (JSONObject) JSONObject.parse(json);
        System.out.println("chenbin返回信息为：" + jsonObject);
        return json;
    }

    public ObjectRestResponse<Object> adaptationPreservationReturn(String resultJson) {
        ObjectRestResponse<Object> resultRV = new ObjectRestResponse<Object>();
        JSONObject resultSlObject = (JSONObject) JSONObject.parse(resultJson);
        if (resultSlObject.getString("status").equals("200")) {
            resultRV.data("流程提交成功");
            log.info(Msgagger.AUTOINTECECG);
        } else {
            resultRV.setStatus(resultSlObject.getInteger("status"));
            resultRV.data(resultSlObject.getString("message"));
            log.error(Msgagger.AUTOINTECEBAD);
        }
        return resultRV;
    }

    public List<PersonEntity> callGaInterface(Map<String,String> params){
        List<PersonEntity> respDataArray = null;
        String response = HttpClientUtil.sendHttp(HttpRequestMethedEnum.HttpPost,
                "application/json",
                basicInfoUrl,
                params, new HashMap<String, String>());
        JSONObject respObj = JSONObject.parseObject(response);
        if(StringUtils.isNotBlank(respObj.getString("status")) && "0".equals(respObj.getString("status"))){
            com.alibaba.fastjson.JSONArray dataArray = respObj.getJSONArray("data");
            respDataArray = dataArray.toJavaList(PersonEntity.class);
        }else{
            throw new ZtgeoBizException("公安部人口基准信息接口调用失败，失败原因："+(StringUtils.isNotBlank(respObj.getString("msg"))?respObj.getString("msg"):"未给出失败原因"));
        }
        return respDataArray;
    }
}
