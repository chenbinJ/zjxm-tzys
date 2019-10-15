package com.springboot.component;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.springboot.config.Msgagger;
import com.springboot.popj.parallel_sectors.ImmovableMortgageInquiryInformation;
import com.springboot.popj.parallel_sectors.ImmovableRightInquiryInformation;
import com.springboot.popj.pub_data.SJ_Qlr_Info;
import com.springboot.popj.warrant.ParametricData;
import com.springboot.util.HttpClientUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;



@Component
@Slf4j
public class ParallelSectorsComponent {

    @Value("${httpclient.ip}")
    private String ip;
    @Value("${httpclient.seam}")
    private String seam;
    @Autowired
    private HttpClientUtils httpClientUtils;
    @Autowired
    private RealEstateMortgageComponent realEstateMortgageComponent;

    /**
     * 不动产权属信息查询(不动产单元号,不动产证号)
     *
     * @param parametricData
     * @return
     * @throws IOException
     */
    public ObjectRestResponse getParallelSectorsCertificate(ParametricData parametricData)  {

        System.out.println("bdczh:"+parametricData.getBdczh());
        String json = "";
        ObjectRestResponse resultRV = new ObjectRestResponse();
               if (StringUtils.isNotEmpty(parametricData.getBdczh()) && StringUtils.isNotEmpty(parametricData.getObligeeName()) && StringUtils.isNotEmpty(parametricData.getObligeeId())){
            json = httpClientUtils.paramGet("http://" + ip + ":" + seam + "/api/services/app/BdcQuery/GetBdcInfoByBDCZH"+
                    "?BDCZH=" + parametricData.getBdczh()+"&obligeeName="+parametricData.getObligeeName()+"&obligeeId="+parametricData.getObligeeId());
        }else if (StringUtils.isNotEmpty(parametricData.getBdczh()) && StringUtils.isNotEmpty(parametricData.getObligeeName())){
            json = httpClientUtils.paramGet("http://" + ip + ":" + seam + "/api/services/app/BdcQuery/GetBdcInfoByBDCZH"+ "?BDCZH=" +
                    parametricData.getBdczh()+"&obligeeName="+parametricData.getObligeeName());
        }else if (StringUtils.isNotEmpty(parametricData.getBdczh()) && StringUtils.isNotEmpty(parametricData.getObligeeId())){
           json = httpClientUtils.paramGet("http://" + ip + ":" + seam + "/api/services/app/BdcQuery/GetBdcInfoByBDCZH"+ "?BDCZH=" + parametricData.getBdczh()+
                   "&obligeeId="+parametricData.getObligeeId());
       }
        if (StringUtils.isEmpty(json)){
            resultRV.setStatus(20500);
            resultRV.setMessage(Msgagger.DATA_FAILURE);
            return resultRV;
        }
        return resultRV.data(getRealPropertySj(json));
    }



    /**
     * 获取不动产权属信息
     *
     * @param json
     * @param
     * @return
     */
    public Object getRealPropertySj(String json) {
        List<Object> realPropertyCertificateList = new ArrayList<>();
        //不动产证号和不动产单元号 (返回list)
        JSONArray jsonArray = JSONArray.parseArray(json);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject BdcObject=jsonArray.getJSONObject(i);
            getClShujuPxBm(BdcObject,realPropertyCertificateList);
        }
        String a=realPropertyCertificateList.toString();
        return realPropertyCertificateList;
    }

    /**
     * 处理数据
     * @param jsonObject
     */
    private  void getClShujuPxBm(JSONObject jsonObject,List<Object> realPropertyCertificateList){
        JSONArray realEstateJsonArray= (JSONArray) jsonObject.get("realEstateUnitInfoVoList");//权属信息
        if (null != realEstateJsonArray){
            for (int i = 0; i < realEstateJsonArray.size(); i++){
              JSONObject  realEstateJsonObject=(JSONObject) realEstateJsonArray.get(i);
              realPropertyCertificateList.add(getQxxx(realEstateJsonObject,jsonObject));
            }
        }
        JSONArray dyxxJsonArray= (JSONArray) jsonObject.get("mortgageInfoVoList");//抵押信息
        if (null != dyxxJsonArray){
            for (int i = 0; i < dyxxJsonArray.size(); i++){
                JSONObject  realEstateJsonObject=(JSONObject) dyxxJsonArray.get(i);
                realPropertyCertificateList.add(getDyxx(realEstateJsonObject));
            }
        }
    }

    /**
     * 抵押信息
     * @param realEstateJsonObject
     * @return
     */
    private Object getDyxx(JSONObject  realEstateJsonObject){
        ImmovableMortgageInquiryInformation inquiryInformation=new ImmovableMortgageInquiryInformation();
        inquiryInformation.setInformationType("DY");
        inquiryInformation.setMortgageCertificateNo(realEstateJsonObject.getString("warrantId"));
        inquiryInformation.setAcceptanceNumber(realEstateJsonObject.getString("dySLBH"));
        inquiryInformation.setMortgageArea(realEstateJsonObject.getBigDecimal("mortgageArea"));
        inquiryInformation.setCreditAmount(realEstateJsonObject.getBigDecimal("creditAmount"));
        inquiryInformation.setMortgageAmount(realEstateJsonObject.getBigDecimal("evaluationValue"));
        inquiryInformation.setMortgagePeriod(realEstateJsonObject.getString("mortgageTerm"));
        inquiryInformation.setMortgageStartingDate(realEstateJsonObject.getString("mortgageStartDate"));
        inquiryInformation.setMortgageEndingDate(realEstateJsonObject.getString("mortgageEndDate"));
        inquiryInformation.setRegistrationDate(realEstateJsonObject.getString("registerDate"));
        JSONArray dyqrJsonArra=realEstateJsonObject.getJSONArray("mortgageeInfoVoList");//抵押权人
        if (null != dyqrJsonArra){
            List<SJ_Qlr_Info> obligeeVoList=new ArrayList<>();
            for (int z = 0; z < dyqrJsonArra.size(); z++){
                JSONObject  qxrJsonObject=(JSONObject) dyqrJsonArra.get(z);
                getDyqrxx(qxrJsonObject,obligeeVoList);
                inquiryInformation.setMortgageHolderVoList(obligeeVoList);
            }
        }
        JSONArray dyrJsonArra=realEstateJsonObject.getJSONArray("mortgagorInfoVoList");//抵押人
        if (null != dyrJsonArra){
            List<SJ_Qlr_Info> obligeeVoList=new ArrayList<>();
            for (int z = 0; z < dyrJsonArra.size(); z++){
                JSONObject  qxrJsonObject=(JSONObject) dyrJsonArra.get(z);
                getDyqrxx(qxrJsonObject,obligeeVoList);
                inquiryInformation.setMortgagorVoList(obligeeVoList);
            }
        }
        return  inquiryInformation;
    }


    /**
     * 权属信息
     * @param realEstateJsonObject
     * @param jsonObject
     */
    private Object getQxxx(JSONObject  realEstateJsonObject,JSONObject jsonObject){
        ImmovableRightInquiryInformation inquiryInformation=new ImmovableRightInquiryInformation();
        inquiryInformation.setInformationType("QL");
        inquiryInformation.setImmovableCertificateNo(jsonObject.getString("realEstateId"));
        inquiryInformation.setImmovableUnicode(realEstateJsonObject.getString("realEstateUnitId"));
        inquiryInformation.setArchitecturalArea(realEstateJsonObject.getBigDecimal("architectureAera "));
        inquiryInformation.setHouseArchitecturalArea(realEstateJsonObject.getBigDecimal("innerArchitectureAera"));
        inquiryInformation.setApportionmentArchitecturalArea(realEstateJsonObject.getBigDecimal("innerArchitectureAera"));
        inquiryInformation.setHouseObtainingWays(realEstateJsonObject.getString("acquireWay"));
        inquiryInformation.setHouseObtainingPrice(realEstateJsonObject.getBigDecimal("acquirePrice"));
        inquiryInformation.setImmovableSite(realEstateJsonObject.getString("sit"));
        inquiryInformation.setHousePlanningPurpose(realEstateJsonObject.getString("plannedUsage"));
        inquiryInformation.setHouseRightType(realEstateJsonObject.getString("houseRightType"));
        inquiryInformation.setHouseRightNature(realEstateJsonObject.getString("houseRightNature"));
        inquiryInformation.setLandRightType(realEstateJsonObject.getString("landRightNature"));
        inquiryInformation.setLandRightNature(realEstateJsonObject.getString("landRightNature"));
        inquiryInformation.setLandUseRightStartingDate(realEstateJsonObject.getString("landRightStartDate"));
        inquiryInformation.setLandUseRightEndingDate(realEstateJsonObject.getString("landRightEndDate"));
        inquiryInformation.setLandUseRightOwner(realEstateJsonObject.getString("landRightUser"));
        inquiryInformation.setLandUseTimeLimit(realEstateJsonObject.getString("landRightTerm"));
        inquiryInformation.setLandPurpose(realEstateJsonObject.getString("landUsage"));
        inquiryInformation.setCommonLandArea(realEstateJsonObject.getBigDecimal("commonLandArea"));
        inquiryInformation.setSingleLandArea(realEstateJsonObject.getBigDecimal("singleLandArea"));
        inquiryInformation.setShareLandArea(realEstateJsonObject.getBigDecimal("sharedLandArea"));
        JSONArray qxrJsonArra=jsonObject.getJSONArray("obligeeInfoVoList");//权利人
        if (null != qxrJsonArra){
            List<SJ_Qlr_Info> obligeeVoList=new ArrayList<>();
            for (int z = 0; z < qxrJsonArra.size(); z++){
                JSONObject  qxrJsonObject=(JSONObject) qxrJsonArra.get(z);
                getQlrxx(qxrJsonObject,obligeeVoList);
                inquiryInformation.setObligeeVoList(obligeeVoList);
            }
        }
        return  inquiryInformation;
    }

    /**
     * 抵押人，权利人，抵押权人
     * @param qxrJsonObject
     * @param obligeeVoList
     */
    private void getQlrxx( JSONObject  qxrJsonObject,List<SJ_Qlr_Info> obligeeVoList){
        SJ_Qlr_Info sj_qlr_info=new SJ_Qlr_Info();
        sj_qlr_info.setObligeeName(qxrJsonObject.getString("obligeeName"));
        sj_qlr_info.setObligeeDocumentType(realEstateMortgageComponent.getZjlb(qxrJsonObject.getString("obligeeIdType")));
        sj_qlr_info.setObligeeDocumentNumber(qxrJsonObject.getString("obligeeId"));
        obligeeVoList.add(sj_qlr_info);
    }


    private void getDyqrxx( JSONObject  qxrJsonObject,List<SJ_Qlr_Info> obligeeVoList){
        SJ_Qlr_Info sj_qlr_info=new SJ_Qlr_Info();
        sj_qlr_info.setObligeeName(qxrJsonObject.getString("mortgageeName"));
        sj_qlr_info.setObligeeDocumentType(realEstateMortgageComponent.getZjlb(qxrJsonObject.getString("mortgageeIdType")));
        sj_qlr_info.setObligeeDocumentNumber(qxrJsonObject.getString("mortgageeId"));
        obligeeVoList.add(sj_qlr_info);
    }



}
