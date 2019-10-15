package com.springboot.feign;

import com.springboot.entity.chenbin.personnel.punit.GSCommonCheckEntity;
import com.springboot.entity.chenbin.personnel.punit.GSCommonEntity;
import com.springboot.entity.chenbin.personnel.punit.PersonCheckEntity;
import com.springboot.entity.chenbin.personnel.punit.PersonEntity;
import com.springboot.entity.chenbin.personnel.resp.PersonnelResponseListEntity;
import com.springboot.entity.chenbin.personnel.resp.PersonnelResponseSingleEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Map;

@FeignClient(name = "exchangeFeign", url = "http://10.13.0.240:8001/")
public interface ExchangeWithOuterFeign {

    @RequestMapping(value="forwardprovincial",method = RequestMethod.POST,produces = "application/json",consumes = "application/json",headers = {"api_id=bXREUCzt","from_user=0b6c220cdfc54288b6630eb1a7fa612f"})
    PersonnelResponseListEntity<PersonEntity> rkkjzxxcx(Map<String,Object> params); //公安信息

    @RequestMapping(value="forwardprovincial",method = RequestMethod.POST,produces = "application/json",consumes = "application/json",headers = {"api_id=buzcT0i9","from_user=0b6c220cdfc54288b6630eb1a7fa612f"})
    PersonnelResponseListEntity<PersonCheckEntity> rkkrxbd(Map<String,Object> params); //人像对比

    @RequestMapping(value="share/qyjbxxyz",method = RequestMethod.POST,produces = "application/json",consumes = "application/json",headers = {"api_id=xxx","from_user=0b6c220cdfc54288b6630eb1a7fa612f"})
    PersonnelResponseSingleEntity<GSCommonCheckEntity> qyjbxxyz(Map<String,Object> params); //工商-信息检查

    @RequestMapping(value="share/qyjbxxcx",method = RequestMethod.POST,produces = "application/json",consumes = "application/json",headers = {"api_id=xxx","from_user=0b6c220cdfc54288b6630eb1a7fa612f"})
    PersonnelResponseListEntity<GSCommonEntity> qyjbxxcx(Map<String,Object> params);    //工商-信息数据获取

    //社会团体
    @RequestMapping(value="share/shttfrdjzscx",method = RequestMethod.POST,produces = "application/json",consumes = "application/json",headers = {"api_id=xxx","from_user=0b6c220cdfc54288b6630eb1a7fa612f"})
    Map<String,Object> shttfrdjzscx(Map<String,Object> params);
    //民办非企业单位
    @RequestMapping(value="share/mbfqydwdjzscx",method = RequestMethod.POST,produces = "application/json",consumes = "application/json",headers = {"api_id=xxx","from_user=0b6c220cdfc54288b6630eb1a7fa612f"})
    Map<String,Object> mbfqydwdjzscx(Map<String,Object> params);
    //基金会
    @RequestMapping(value="share/jjhfrdjzscx",method = RequestMethod.POST,produces = "application/json",consumes = "application/json",headers = {"api_id=xxx","from_user=0b6c220cdfc54288b6630eb1a7fa612f"})
    Map<String,Object> jjhfrdjzscx(Map<String,Object> params);

}
