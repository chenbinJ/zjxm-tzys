package com.springboot.popj.registration;

public class SalerInfo {
    private String salerId;//证件号码
    private String salerIdType;//证件类型编码
    private String salerName;//姓名
    private String vormerkungId;//预告证明号(bizType为YGDY时，需填写)


    public String getVormerkungId() {
        return vormerkungId;
    }

    public void setVormerkungId(String vormerkungId) {
        this.vormerkungId = vormerkungId;
    }

    public String getSalerId() {
        return salerId;
    }

    public void setSalerId(String salerId) {
        this.salerId = salerId;
    }

    public String getSalerIdType() {
        return salerIdType;
    }

    public void setSalerIdType(String salerIdType) {
        this.salerIdType = salerIdType;
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }
}
