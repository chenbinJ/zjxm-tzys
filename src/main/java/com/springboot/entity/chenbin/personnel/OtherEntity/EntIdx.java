package com.springboot.entity.chenbin.personnel.OtherEntity;

import java.io.Serializable;

public class EntIdx implements Serializable {
    private String entname;
    private String uniscid;

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname;
    }

    public String getUniscid() {
        return uniscid;
    }

    public void setUniscid(String uniscid) {
        this.uniscid = uniscid;
    }
}
