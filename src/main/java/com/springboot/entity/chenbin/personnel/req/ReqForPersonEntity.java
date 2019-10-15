package com.springboot.entity.chenbin.personnel.req;

import java.io.Serializable;

public class ReqForPersonEntity implements Serializable {
    private String xm;
    private String sfzh;

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

}
