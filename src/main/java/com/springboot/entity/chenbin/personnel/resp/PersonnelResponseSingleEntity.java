package com.springboot.entity.chenbin.personnel.resp;

import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;

import java.io.Serializable;
import java.util.List;

public class PersonnelResponseSingleEntity<T extends PersonnelUnitEntity> extends PersonnelResponseEntity<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
