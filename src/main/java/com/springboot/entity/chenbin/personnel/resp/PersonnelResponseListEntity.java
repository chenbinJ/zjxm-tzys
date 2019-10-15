package com.springboot.entity.chenbin.personnel.resp;

import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;

import java.io.Serializable;
import java.util.List;

public class PersonnelResponseListEntity<T extends PersonnelUnitEntity> extends PersonnelResponseEntity<T> {
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
