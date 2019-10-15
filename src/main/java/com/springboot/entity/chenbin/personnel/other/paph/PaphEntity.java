package com.springboot.entity.chenbin.personnel.other.paph;

import java.io.Serializable;
import java.util.List;

public class PaphEntity implements Serializable {
    private String bdczh;
    private String bdcdyh;
    private String bdczl;
    private String sfdy;
    private String sfqtdy;
    private List<PaphDyxx> dyxxs;
    private String sfcf;
    private List<PaphCfxx> cfxxs;

    public String getBdczh() {
        return bdczh;
    }

    public void setBdczh(String bdczh) {
        this.bdczh = bdczh;
    }

    public String getBdcdyh() {
        return bdcdyh;
    }

    public void setBdcdyh(String bdcdyh) {
        this.bdcdyh = bdcdyh;
    }

    public String getBdczl() {
        return bdczl;
    }

    public void setBdczl(String bdczl) {
        this.bdczl = bdczl;
    }

    public String getSfdy() {
        return sfdy;
    }

    public void setSfdy(String sfdy) {
        this.sfdy = sfdy;
    }

    public String getSfqtdy() {
        return sfqtdy;
    }

    public void setSfqtdy(String sfqtdy) {
        this.sfqtdy = sfqtdy;
    }

    public List<PaphDyxx> getDyxxs() {
        return dyxxs;
    }

    public void setDyxxs(List<PaphDyxx> dyxxs) {
        this.dyxxs = dyxxs;
    }

    public String getSfcf() {
        return sfcf;
    }

    public void setSfcf(String sfcf) {
        this.sfcf = sfcf;
    }

    public List<PaphCfxx> getCfxxs() {
        return cfxxs;
    }

    public void setCfxxs(List<PaphCfxx> cfxxs) {
        this.cfxxs = cfxxs;
    }
}
