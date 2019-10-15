package com.springboot.entity.chenbin.personnel.resp;

import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;

import java.io.Serializable;

public class PersonnelResponseEntity<T extends PersonnelUnitEntity> implements Serializable {
    private String status;
    private String msg;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
