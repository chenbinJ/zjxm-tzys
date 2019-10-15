package com.springboot.popj.json_data;


import com.springboot.util.TimeUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

public class JSONJyhtxx implements Serializable {
    private String infoId;                          //主键
    private String receiptNumber;                   //收件编号-sj_sjsq表主键
    private String contractId;                         //合同id
    private String contractNumber;                     //合同编号
    private String contractRecordNumber;               //交易合同备案号
    private String contractType;                       //商品房/存量房合同
    private Date contractRecordTime;                 //合同备案时间
    private Date contractSignTime;                   //合同签订时间
    private BigDecimal contractAmount;                     //合同金额
    private String isReal;                             //合同是否有效
    private String dataJson;                           //原始查询数据
    private String dataComeFromMode;                //数据获取方式
    private String preservationMan;                 //数据提交人
    private Date insertTime;                         //入库时间
    private String serviceCode;                        //服务code
    private String provideUnit;                        //数据提供单位
    private String ext1;                               //扩展字段1
    private String ext2;                               //扩展字段2
    private String ext3;                               //扩展字段3

    private String glImmovableVoList;          //关联的不动产数据
    private String glHouseBuyerVoList;            //关联的购房人数据
    private String glHouseSellerVoList;            //关联的售房人数据

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractRecordNumber() {
        return contractRecordNumber;
    }

    public void setContractRecordNumber(String contractRecordNumber) {
        this.contractRecordNumber = contractRecordNumber;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Date getContractRecordTime() {
        return contractRecordTime;
    }

    public void setContractRecordTime(String contractRecordTime) throws ParseException {
        this.contractRecordTime = TimeUtil.getTimeFromString(contractRecordTime);
    }

    public Date getContractSignTime() {
        return contractSignTime;
    }

    public void setContractSignTime(String contractSignTime) throws ParseException {
        this.contractSignTime = TimeUtil.getTimeFromString(contractSignTime);
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getIsReal() {
        return isReal;
    }

    public void setIsReal(String isReal) {
        this.isReal = isReal;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
    }

    public String getDataComeFromMode() {
        return dataComeFromMode;
    }

    public void setDataComeFromMode(String dataComeFromMode) {
        this.dataComeFromMode = dataComeFromMode;
    }

    public String getPreservationMan() {
        return preservationMan;
    }

    public void setPreservationMan(String preservationMan) {
        this.preservationMan = preservationMan;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) throws ParseException {
        this.insertTime = TimeUtil.getTimeFromString(insertTime);
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getProvideUnit() {
        return provideUnit;
    }

    public void setProvideUnit(String provideUnit) {
        this.provideUnit = provideUnit;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getGlImmovableVoList() {
        return glImmovableVoList;
    }

    public void setGlImmovableVoList(String glImmovableVoList) {
        this.glImmovableVoList = glImmovableVoList;
    }

    public String getGlHouseBuyerVoList() {
        return glHouseBuyerVoList;
    }

    public void setGlHouseBuyerVoList(String glHouseBuyerVoList) {
        this.glHouseBuyerVoList = glHouseBuyerVoList;
    }

    public String getGlHouseSellerVoList() {
        return glHouseSellerVoList;
    }

    public void setGlHouseSellerVoList(String glHouseSellerVoList) {
        this.glHouseSellerVoList = glHouseSellerVoList;
    }
}
