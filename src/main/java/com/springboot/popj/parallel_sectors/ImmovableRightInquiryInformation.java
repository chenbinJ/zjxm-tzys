package com.springboot.popj.parallel_sectors;



import com.springboot.popj.pub_data.SJ_Qlr_Info;

import java.math.BigDecimal;
import java.util.List;
//权利信息
public class ImmovableRightInquiryInformation extends InquiryInformation {
    private String acceptanceNumber;            //不动产内网受理编号
    private String immovableUnicode;            //不动产单元号
    private String immovableSite;               //不动产坐落（收件单坐落）
    private String immovableCertificateNo;       //不动产权证号
    private String registrationDate;             //登记日期
    private String certificateType;              //证书类型
    private String remarks;                      //备注附记

    private BigDecimal architecturalArea;               //建筑面积
    private BigDecimal houseArchitecturalArea;          //套内建筑面积
    private BigDecimal apportionmentArchitecturalArea;  //分摊建筑面积
    private String houseObtainingWays;                   //房屋取得方式
    private BigDecimal houseObtainingPrice;             //房屋取得价格
    private String housePlanningPurpose;                //房屋规划用途
    private BigDecimal houseValuationAmount;                //房屋评估金额
    private String houseType;                           //房屋类型
    private String houseRightType;               //房屋权利类型
    private String houseRightNature;             //房屋权利性质

    private String landRightType;                //土地权利类型
    private String landRightNature;              //土地权利性质
    private String landUseRightStartingDate;     //土地使用权起始日期
    private String landUseRightEndingDate;       //土地使用终止日期
    private String landUseRightOwner;            //土地使用权人
    private String landUseTimeLimit;                //土地使用期限
    private String landPurpose;                     //土地用途
    private BigDecimal commonLandArea;                  //共有土地面积
    private BigDecimal singleLandArea;                  //独用土地面积
    private BigDecimal shareLandArea;                   //分摊土地面积
    private BigDecimal buildingParcelArea;                  //建筑宗地面积

    private boolean isSequestration;                    //是否存在查封
    private boolean isObjection;                        //是否存在异议
    private boolean isMortgage;                         //是否存在抵押
    private boolean isSelfDeal;                         //他项权是否本单位受理

    private List<SJ_Qlr_Info> obligeeVoList;            //关联的权利人数据
    private List<SJ_Qlr_Info> obligorVoList;            //关联的义务人数据

    public String getAcceptanceNumber() {
        return acceptanceNumber;
    }

    public void setAcceptanceNumber(String acceptanceNumber) {
        this.acceptanceNumber = acceptanceNumber;
    }

    public String getImmovableUnicode() {
        return immovableUnicode;
    }

    public void setImmovableUnicode(String immovableUnicode) {
        this.immovableUnicode = immovableUnicode;
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
        this.certificateType = certificateType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public BigDecimal getHouseValuationAmount() {
        return houseValuationAmount;
    }

    public void setHouseValuationAmount(BigDecimal houseValuationAmount) {
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

    public boolean getIsSequestration() {
        return isSequestration;
    }

    public void setIsSequestration(boolean isSequestration) {
        this.isSequestration = isSequestration;
    }

    public boolean getIsObjection() {
        return isObjection;
    }

    public void setIsObjection(boolean isObjection) {
        this.isObjection = isObjection;
    }

    public boolean getIsMortgage() {
        return isMortgage;
    }

    public void setIsMortgage(boolean isMortgage) {
        this.isMortgage = isMortgage;
    }

    public boolean getIsSelfDeal() {
        return isSelfDeal;
    }

    public void setIsSelfDeal(boolean isSelfDeal) {
        this.isSelfDeal = isSelfDeal;
    }

    public List<SJ_Qlr_Info> getObligeeVoList() {
        return obligeeVoList;
    }

    public void setObligeeVoList(List<SJ_Qlr_Info> obligeeVoList) {
        this.obligeeVoList = obligeeVoList;
    }

    public List<SJ_Qlr_Info> getObligorVoList() {
        return obligorVoList;
    }

    public void setObligorVoList(List<SJ_Qlr_Info> obligorVoList) {
        this.obligorVoList = obligorVoList;
    }
}
