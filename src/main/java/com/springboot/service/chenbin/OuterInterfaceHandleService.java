package com.springboot.service.chenbin;

import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;
import com.springboot.entity.chenbin.personnel.req.PersonnelUnitReqEntity;

import java.util.List;

public interface OuterInterfaceHandleService {
    List<PersonnelUnitEntity> getPersonnelUnits(PersonnelUnitReqEntity personnelUnitReq);
}
