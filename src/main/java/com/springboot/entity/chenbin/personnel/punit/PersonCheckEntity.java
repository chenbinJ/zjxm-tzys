package com.springboot.entity.chenbin.personnel.punit;

import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;

public class PersonCheckEntity extends PersonnelUnitEntity {
    private String gmsfzh;
    private String gmsfzh_ppddm;
    private String xm;
    private String xm_ppddm;
    private String swbs;            //死亡标识
    private String bddm;            //比对代码
    private String xsd;             //相似度

    public String getGmsfzh() {
        return gmsfzh;
    }

    public void setGmsfzh(String gmsfzh) {
        this.gmsfzh = gmsfzh;
    }

    public String getGmsfzh_ppddm() {
        return gmsfzh_ppddm;
    }

    public void setGmsfzh_ppddm(String gmsfzh_ppddm) {
        this.gmsfzh_ppddm = gmsfzh_ppddm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXm_ppddm() {
        return xm_ppddm;
    }

    public void setXm_ppddm(String xm_ppddm) {
        this.xm_ppddm = xm_ppddm;
    }

    public String getSwbs() {
        return swbs;
    }

    public void setSwbs(String swbs) {
        this.swbs = swbs;
    }

    public String getBddm() {
        return bddm;
    }

    public void setBddm(String bddm) {
        this.bddm = bddm;
    }

    public String getXsd() {
        return xsd;
    }

    public void setXsd(String xsd) {
        this.xsd = xsd;
    }
}
