package com.springboot.popj.registration;

/**
 * 不动产单元信息
 */
public class RealEstateUnitInfo {

    private String realEstateUnitId;//不动产单元号
    private String householdId;//户编号
    private String sit;//坐落

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
}
