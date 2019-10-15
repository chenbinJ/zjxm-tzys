package com.springboot.popj.registration;

import java.util.List;

public class AdvanceBizInfo {

    private String applyDate;//业务申请日期
    private String htbh;//合同编号
    private String realEstateUnitId;//不动产单元号
    private String householdId;//户编号
    private String sit;//坐落
    private List<RealEstateInfo>  realEstateInfoVoList;//不动产信息列表


    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getHtbh() {
        return htbh;
    }

    public void setHtbh(String htbh) {
        this.htbh = htbh;
    }

    public String getRealEstateUnitId() {
        return realEstateUnitId;
    }

    public void setRealEstateUnitId(String realEstateUnitId) {
        this.realEstateUnitId = realEstateUnitId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getSit() {
        return sit;
    }

    public void setSit(String sit) {
        this.sit = sit;
    }

    public List<RealEstateInfo> getRealEstateInfoVoList() {
        return realEstateInfoVoList;
    }

    public void setRealEstateInfoVoList(List<RealEstateInfo> realEstateInfoVoList) {
        this.realEstateInfoVoList = realEstateInfoVoList;
    }

}
