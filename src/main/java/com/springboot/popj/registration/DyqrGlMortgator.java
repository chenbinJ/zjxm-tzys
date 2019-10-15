package com.springboot.popj.registration;

public class DyqrGlMortgator {
    private String mortgageeId;//证件号码
    private String mortgageeIdType;//证件类型编码
    private String mortgageeName;//姓名

    public String getMortgageeId() {
        return mortgageeId;
    }

    public void setMortgageeId(String mortgageeId) {
        this.mortgageeId = mortgageeId;
    }

    public String getMortgageeIdType() {
        return mortgageeIdType;
    }

    public void setMortgageeIdType(String mortgageeIdType) {
        this.mortgageeIdType = mortgageeIdType;
    }

    public String getMortgageeName() {
        return mortgageeName;
    }

    public void setMortgageeName(String mortgageeName) {
        this.mortgageeName = mortgageeName;
    }
}
