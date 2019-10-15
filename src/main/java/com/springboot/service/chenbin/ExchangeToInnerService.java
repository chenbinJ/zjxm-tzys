package com.springboot.service.chenbin;

import com.springboot.entity.chenbin.personnel.other.paph.PaphEntity;
import com.springboot.entity.chenbin.personnel.req.PaphReqEntity;

import java.text.ParseException;
import java.util.List;

public interface ExchangeToInnerService {
    String dealYGYD2Inner(String commonInterfaceAttributer) throws ParseException;

    List<PaphEntity> getPaphMortBefore(PaphReqEntity paph);
    List<PaphEntity> getPaphMortAfter(PaphReqEntity paph);
}
