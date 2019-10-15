package com.springboot.popj.json_data;

import com.springboot.util.TimeUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

public class JSONBdcqlxgxx implements Serializable {
    private String infoId;                          //主键
    private String receiptNumber;                   //收件编号-sj_sjsq表主键
    private String acceptanceNumber;            //不动产内网受理编号
    private String immovableSite;               //不动产坐落（收件单坐落）
    private String immovableCertificateNo;       //不动产权证号
    private String houseCertificateNo;           //房产证号
    private String landCertificateNo;            //土地证号
    private Date registrationDate;             //登记日期
    private String certificateType;              //证书类型(与sjsq中证书类型保持一致）
    private BigDecimal architecturalArea;               //建筑面积
    private BigDecimal houseArchitecturalArea;          //套内建筑面积
    private BigDecimal apportionmentArchitecturalArea;  //分摊建筑面积
    private String houseObtainingWays;                   //房屋取得方式
    private BigDecimal houseObtainingPrice;             //房屋取得价格
    private String housePlanningPurpose;                //房屋规划用途
    private String houseValuationAmount;                //房屋评估金额
    private String houseType;                           //房屋类型
    private String houseRightType;               //房屋权利类型
    private String houseRightNature;             //房屋权利性质

    private String landRightType;                //土地权利类型
    private String landRightNature;              //土地权利性质
    private Date landUseRightStartingDate;     //土地使用权起始日期
    private Date landUseRightEndingDate;       //土地使用终止日期
    private String landUseRightOwner;            //土地使用权人
    private String landUseTimeLimit;                //土地使用期限
    private String landPurpose;                     //土地用途
    private BigDecimal commonLandArea;                  //共有土地面积
    private BigDecimal singleLandArea;                  //独用土地面积
    private BigDecimal shareLandArea;                   //分摊土地面积
    private BigDecimal buildingParcelArea;                  //建筑宗地面积

    private String remarks;                      //备注附记
    private String serviceCode;                  //服务code
    private String dataJson;                     //原始数据json
    private String dataType;                     //数据类型（存量/新增）
    private String dataComeFromMode;                //数据获取方式
    private String preservationMan;                 //数据提交人
    private Date insertTime;                   //入库时间
    private String ext1;                         //扩展字段1
    private String ext2;                         //扩展字段2
    private String ext3;                         //扩展字段3
    private String glImmovableVoList;          //关联的不动产数据
    private String glObligeeVoList;            //关联的权利人数据
    private String glObligorVoList;            //关联的义务人数据

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
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

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) throws ParseException {
        this.registrationDate = TimeUtil.getTimeFromString(registrationDate);
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public BigDecimal getArchitecturalArea() {
        return architecturalArea;
    }

    public void setArchitecturalArea(BigDecimal architecturalArea) {
        this.architecturalArea = architecturalArea;
    }

    public BigDecimal getHouseArchitecturalArea() {
        return houseArchitecturalArea;
    }

    public void setHouseArchitecturalArea(BigDecimal houseArchitecturalArea) {
        this.houseArchitecturalArea = houseArchitecturalArea;
    }

    public BigDecimal getApportionmentArchitecturalArea() {
        return apportionmentArchitecturalArea;
    }

    public void setApportionmentArchitecturalArea(BigDecimal apportionmentArchitecturalArea) {
        this.apportionmentArchitecturalArea = apportionmentArchitecturalArea;
    }

    public String getHouseObtainingWays() {
        return houseObtainingWays;
    }

    public void setHouseObtainingWays(String houseObtainingWays) {
        this.houseObtainingWays = houseObtainingWays;
    }

    public BigDecimal getHouseObtainingPrice() {
        return houseObtainingPrice;
    }

    public void setHouseObtainingPrice(BigDecimal houseObtainingPrice) {
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

    public Date getLandUseRightStartingDate() {
        return landUseRightStartingDate;
    }

    public void setLandUseRightStartingDate(String landUseRightStartingDate) throws ParseException {
        this.landUseRightStartingDate = TimeUtil.getDateFromString(landUseRightStartingDate);
    }

    public Date getLandUseRightEndingDate() {
        return landUseRightEndingDate;
    }

    public void setLandUseRightEndingDate(String landUseRightEndingDate) throws ParseException {
        this.landUseRightEndingDate = TimeUtil.getDateFromString(landUseRightEndingDate);
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

    public BigDecimal getCommonLandArea() {
        return commonLandArea;
    }

    public void setCommonLandArea(BigDecimal commonLandArea) {
        this.commonLandArea = commonLandArea;
    }

    public BigDecimal getSingleLandArea() {
        return singleLandArea;
    }

    public void setSingleLandArea(BigDecimal singleLandArea) {
        this.singleLandArea = singleLandArea;
    }

    public BigDecimal getShareLandArea() {
        return shareLandArea;
    }

    public void setShareLandArea(BigDecimal shareLandArea) {
        this.shareLandArea = shareLandArea;
    }

    public BigDecimal getBuildingParcelArea() {
        return buildingParcelArea;
    }

    public void setBuildingParcelArea(BigDecimal buildingParcelArea) {
        this.buildingParcelArea = buildingParcelArea;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataComeFromMode() {
        return dataComeFromMode;
    }

    public void setDataComeFromMode(String dataComeFromMode) {
        this.dataComeFromMode = dataComeFromMode;
    }


    public String getPreservationMan() {
        return preservationMan;
    }

    public void setPreservationMan(String preservationMan) {
        this.preservationMan = preservationMan;
    }


    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) throws ParseException {
        this.insertTime =  TimeUtil.getTimeFromString(insertTime);
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

    public String getGlImmovableVoList() {
        return glImmovableVoList;
    }

    public void setGlImmovableVoList(String glImmovableVoList) {
        this.glImmovableVoList = glImmovableVoList;
    }

    public String getGlObligeeVoList() {
        return glObligeeVoList;
    }

    public void setGlObligeeVoList(String glObligeeVoList) {
        this.glObligeeVoList = glObligeeVoList;
    }

    public String getGlObligorVoList() {
        return glObligorVoList;
    }

    public void setGlObligorVoList(String glObligorVoList) {
        this.glObligorVoList = glObligorVoList;
    }
}
