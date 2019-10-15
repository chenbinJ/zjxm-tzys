package com.springboot.entity.chenbin.personnel;

import java.io.Serializable;
import java.util.ArrayList;

public class PersonnelUnitEntity implements Serializable {
    private String entityType;

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
}
