package com.springboot.rest.chenbin;

import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;
import com.springboot.entity.chenbin.personnel.req.PersonnelUnitReqEntity;
import com.springboot.service.chenbin.OuterInterfaceHandleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Api(tags = "其它外部接口api")
@RestController
@Scope("prototype")
public class OuterInterfaceHandleRest {

    @Autowired
    private OuterInterfaceHandleService outerIntfService;

    @RequestMapping(value = "/checkPersonnelUnit",method = RequestMethod.POST)
    public ObjectRestResponse<List<PersonnelUnitEntity>> checkPersonnelUnit(@RequestBody PersonnelUnitReqEntity personnelUnit){
        ObjectRestResponse<List<PersonnelUnitEntity>> rv = new ObjectRestResponse<List<PersonnelUnitEntity>>();
        return rv.data(outerIntfService.getPersonnelUnits(personnelUnit));
    }

    @RequestMapping(value = "/exchangePersonnelUnit",method = RequestMethod.POST)
    public ObjectRestResponse<List<PersonnelUnitEntity>> exchangePersonnelUnit(@RequestBody PersonnelUnitReqEntity personnelUnit){
        return null;
    }

    @RequestMapping(value = "/checkMarry2",method = RequestMethod.POST)
    public ObjectRestResponse<PersonnelUnitEntity> checkMarry2(@RequestBody PersonnelUnitReqEntity personnelUnit){
        return null;
    }
}
