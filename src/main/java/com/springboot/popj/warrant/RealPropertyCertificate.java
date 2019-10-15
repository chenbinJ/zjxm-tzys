package com.springboot.popj.warrant;

import com.springboot.popj.GlImmovable;
import com.springboot.popj.GlMortgagor;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RealPropertyCertificate {
    private String acceptanceNumber;            //不动产内网受理编号
    private String immovableSite;               //不动产坐落（收件单坐落）
    private String immovableCertificateNo;       //不动产权证号
    private String houseCertificateNo;           //房产证号
    private String landCertificateNo;            //土地证号
    private String registrationDate;             //登记日期
    private String certificateType;              //证书类型(与sjsq中证书类型保持一致）
    private String architecturalArea;               //建筑面积
    private String houseArchitecturalArea;          //套内建筑面积
    private String apportionmentArchitecturalArea;  //分摊建筑面积
    private String houseObtainingWays;                   //房屋取得方式
    private String houseObtainingPrice;             //房屋取得价格
    private String housePlanningPurpose;                //房屋规划用途
    private String houseValuationAmount;                //房屋评估金额
    private String houseType;                           //房屋类型
    private String houseRightType;               //房屋权利类型
    private String houseRightNature;             //房屋权利性质
    private String waterNumber;                  //水号
    private String electricNumber;               //电号
    private String gasNumber;                    //气号
    private String landRightType;                //土地权利类型
    private String landRightNature;              //土地权利性质
    private String landUseRightStartingDate;     //土地使用权起始日期
    private String landUseRightEndingDate;       //土地使用终止日期
    private String landUseRightOwner;            //土地使用权人
    private String landUseTimeLimit;                //土地使用期限
    private String landPurpose;                     //土地用途
    private String commonLandArea;                  //共有土地面积
    private String singleLandArea;                  //独用土地面积
    private String shareLandArea;                   //分摊土地面积
    private String buildingParcelArea;                  //建筑宗地面积
    private String[] forecastCertificateNos;        //预告证明号
    private String[] warrantNos;                    //抵押证明号
    private String remarks;                      //备注附记
    private String dataType;                     //数据类型（存量/新增）
    private String ext1;                         //扩展字段1
    private String ext2;                         //扩展字段2
    private String ext3;                         //扩展字段3
    private List<GlImmovable> glImmovableVoList=new ArrayList<>();//不动产类型(房屋信息)
    private List<GlMortgagor> glObligeeVoList=new ArrayList<>();//权利人数据
    private List<GlMortgagor> glObligorVoList=new ArrayList<>();//义务人数据

    public String[] getWarrantNos() {
        return warrantNos;
    }

    public void setWarrantNos(String[] warrantNos) {
        this.warrantNos = warrantNos;
    }

    public String[] getForecastCertificateNos() {
        return forecastCertificateNos;
    }

    public void setForecastCertificateNos(String[] forecastCertificateNos) {
        this.forecastCertificateNos = forecastCertificateNos;
    }

    public List<GlImmovable> getGlImmovableVoList() {
        return glImmovableVoList;
    }

    public void setGlImmovableVoList(List<GlImmovable> glImmovableVoList) {
        this.glImmovableVoList = glImmovableVoList;
    }

    public String getWaterNumber() {
        return waterNumber;
    }

    public void setWaterNumber(String waterNumber) {
        this.waterNumber = waterNumber;
    }

    public String getElectricNumber() {
        return electricNumber;
    }

    public void setElectricNumber(String electricNumber) {
        this.electricNumber = electricNumber;
    }

    public String getGasNumber() {
        return gasNumber;
    }

    public void setGasNumber(String gasNumber) {
        this.gasNumber = gasNumber;
    }

    public String getAcceptanceNumber() {
        return acceptanceNumber;
    }

    public void setAcceptanceNumber(String acceptanceNumber) {
        this.acceptanceNumber = acceptanceNumber;
    }

    public String getImmovableSite() {
        return immovableSite;
    }

    public void setImmovableSite(String immovableSite) {
        this.immovableSite = immovableSite;
    }

    public String getImmovableCertificateNo() {
        return immovableCertificateNo;
    }

    public void setImmovableCertificateNo(String immovableCertificateNo) {
        this.immovableCertificateNo = immovableCertificateNo;
    }

    public String getHouseCertificateNo() {
        return houseCertificateNo;
    }

    public void setHouseCertificateNo(String houseCertificateNo) {
        this.houseCertificateNo = houseCertificateNo;
    }

    public String getLandCertificateNo() {
        return landCertificateNo;
    }

    public void setLandCertificateNo(String landCertificateNo) {
        this.landCertificateNo = landCertificateNo;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        if(StringUtils.isNotEmpty(certificateType)){
            if (certificateType.equals("房产证")||certificateType.equals("土地证")){
                this.certificateType = certificateType;
            }else{
                this.certificateType = "不动产权证";
            }
        }
        this.certificateType = certificateType;
    }

    public String getArchitecturalArea() {
        return architecturalArea;
    }

    public void setArchitecturalArea(String architecturalArea) {
        this.architecturalArea = architecturalArea;
    }

    public String getHouseArchitecturalArea() {
        return houseArchitecturalArea;
    }

    public void setHouseArchitecturalArea(String houseArchitecturalArea) {
        this.houseArchitecturalArea = houseArchitecturalArea;
    }

    public String getApportionmentArchitecturalArea() {
        return apportionmentArchitecturalArea;
    }

    public void setApportionmentArchitecturalArea(String apportionmentArchitecturalArea) {
        this.apportionmentArchitecturalArea = apportionmentArchitecturalArea;
    }

    public String getHouseObtainingWays() {
        return houseObtainingWays;
    }

    public void setHouseObtainingWays(String houseObtainingWays) {
        this.houseObtainingWays = houseObtainingWays;
    }

    public String getHouseObtainingPrice() {
        return houseObtainingPrice;
    }

    public void setHouseObtainingPrice(String houseObtainingPrice) {
        this.houseObtainingPrice = houseObtainingPrice;
    }

    public String getHousePlanningPurpose() {
        return housePlanningPurpose;
    }

    public void setHousePlanningPurpose(String housePlanningPurpose) {
        this.housePlanningPurpose = housePlanningPurpose;
    }

    public String getHouseValuationAmount() {
        return houseValuationAmount;
    }

    public void setHouseValuationAmount(String houseValuationAmount) {
        this.houseValuationAmount = houseValuationAmount;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getHouseRightType() {
        return houseRightType;
    }

    public void setHouseRightType(String houseRightType) {
        this.houseRightType = houseRightType;
    }

    public String getHouseRightNature() {
        return houseRightNature;
    }

    public void setHouseRightNature(String houseRightNature) {
        this.houseRightNature = houseRightNature;
    }

    public String getLandRightType() {
        return landRightType;
    }

    public void setLandRightType(String landRightType) {
        this.landRightType = landRightType;
    }

    public String getLandRightNature() {
        return landRightNature;
    }

    public void setLandRightNature(String landRightNature) {
        this.landRightNature = landRightNature;
    }

    public String getLandUseRightStartingDate() {
        return landUseRightStartingDate;
    }

    public void setLandUseRightStartingDate(String landUseRightStartingDate) {
        this.landUseRightStartingDate = landUseRightStartingDate;
    }

    public String getLandUseRightEndingDate() {
        return landUseRightEndingDate;
    }

    public void setLandUseRightEndingDate(String landUseRightEndingDate) {
        this.landUseRightEndingDate = landUseRightEndingDate;
    }

    public String getLandUseRightOwner() {
        return landUseRightOwner;
    }

    public void setLandUseRightOwner(String landUseRightOwner) {
        this.landUseRightOwner = landUseRightOwner;
    }

    public String getLandUseTimeLimit() {
        return landUseTimeLimit;
    }

    public void setLandUseTimeLimit(String landUseTimeLimit) {
        this.landUseTimeLimit = landUseTimeLimit;
    }

    public String getLandPurpose() {
        return landPurpose;
    }

    public void setLandPurpose(String landPurpose) {
        this.landPurpose = landPurpose;
    }

    public String getCommonLandArea() {
        return commonLandArea;
    }

    public void setCommonLandArea(String commonLandArea) {
        this.commonLandArea = commonLandArea;
    }

    public String getSingleLandArea() {
        return singleLandArea;
    }

    public void setSingleLandArea(String singleLandArea) {
        this.singleLandArea = singleLandArea;
    }

    public String getShareLandArea() {
        return shareLandArea;
    }

    public void setShareLandArea(String shareLandArea) {
        this.shareLandArea = shareLandArea;
    }

    public String getBuildingParcelArea() {
        return buildingParcelArea;
    }

    public void setBuildingParcelArea(String buildingParcelArea) {
        this.buildingParcelArea = buildingParcelArea;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }



    public List<GlMortgagor> getGlObligeeVoList() {
        return glObligeeVoList;
    }

    public void setGlObligeeVoList(List<GlMortgagor> glObjligeeVoList) {
        this.glObligeeVoList = glObligeeVoList;
    }

    public List<GlMortgagor> getGlObligorVoList() {
        return glObligorVoList;
    }

    public void setGlObligorVoList(List<GlMortgagor> glObligorVoList) {
        this.glObligorVoList = glObligorVoList;
    }
}
