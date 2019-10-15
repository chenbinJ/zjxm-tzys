package com.springboot.popj.registration;

import java.util.List;

/**
 * 带抵押不动产信息
 */
public class RealEstateInfo {

    private String realEstateId;
    private List<RealEstateUnitInfo> realEstateUnitInfoVoList; //不动产单元信息列表
    private List<QlrGlMortgator> obligeeInfoVoList; //不动产权利人列表
    private List<SalerInfo> salerInfoVoList;//卖方信息列表
    private String landCertificate;//土地证

    public String getLandCertificate() {
        return landCertificate;
    }

    public void setLandCertificate(String landCertificate) {
        this.landCertificate = landCertificate;
    }

    public List<RealEstateUnitInfo> getRealEstateUnitInfoVoList() {
        return realEstateUnitInfoVoList;
    }

    public void setRealEstateUnitInfoVoList(List<RealEstateUnitInfo> realEstateUnitInfoVoList) {
        this.realEstateUnitInfoVoList = realEstateUnitInfoVoList;
    }

    public List<QlrGlMortgator> getObligeeInfoVoList() {
        return obligeeInfoVoList;
    }

    public void setObligeeInfoVoList(List<QlrGlMortgator> obligeeInfoVoList) {
        this.obligeeInfoVoList = obligeeInfoVoList;
    }

    public List<SalerInfo> getSalerInfoVoList() {
        return salerInfoVoList;
    }

    public void setSalerInfoVoList(List<SalerInfo> salerInfoVoList) {
        this.salerInfoVoList = salerInfoVoList;
    }

    public String getRealEstateId() {
        return realEstateId;
    }

    public void setRealEstateId(String realEstateId) {
        this.realEstateId = realEstateId;
    }
}
