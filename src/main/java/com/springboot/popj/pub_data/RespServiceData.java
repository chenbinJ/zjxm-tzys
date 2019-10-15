package com.springboot.popj.pub_data;

import java.io.Serializable;
import java.util.List;

public class RespServiceData<T extends SJ_Information> implements Serializable {
    private String serviceCode;
    private String serviceDataTo;
    private List<T> serviceDataInfos;

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

    public List<T> getServiceDataInfos() {
        return serviceDataInfos;
    }

    public void setServiceDataInfos(List<T> serviceDataInfos) {
        this.serviceDataInfos = serviceDataInfos;
    }
}
