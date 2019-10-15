package com.springboot.popj.json_data;

import java.io.Serializable;

public class JSONServiceData implements Serializable {
    private String serviceCode;
    private String serviceDataTo;
    private String serviceDataInfos;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceDataTo() {
        return serviceDataTo;
    }

    public void setServiceDataTo(String serviceDataTo) {
        this.serviceDataTo = serviceDataTo;
    }

    public String getServiceDataInfos() {
        return serviceDataInfos;
    }

    public void setServiceDataInfos(String serviceDataInfos) {
        this.serviceDataInfos = serviceDataInfos;
    }
}
