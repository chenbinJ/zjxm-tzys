package com.springboot.popj.json_data;


import com.springboot.util.TimeUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

public class JSONDyhtxx implements Serializable {
    private String infoId;                          //主键
    private String receiptNumber;                   //收件编号-sj_sjsq表主键
    private String mortgageContractNumber;                //抵押合同编号
    private String mortgageMode;                           //抵押方式
    private BigDecimal mortgageArea;                           //抵押面积
    private BigDecimal creditAmount;                           //债权数额
    private BigDecimal mortgageAmount;                         //抵押金额
    private BigDecimal valuationValue;                         //评估价值
    private String mortgagePeriod;                         //抵押期限
    private Date mortgageStartingDate;                  //抵押期起
    private Date mortgageEndingDate;                    //抵押期止
    private String mortgageReason;                         //抵押原因
    private String maximumClaimConfirm;                   //最高债权确实事实
    private BigDecimal maximumClaimAmount;                    //最高债权数额
    private String dataJson;                               //原始查询数据
    private String dataComeFromMode;                //数据获取方式
    private String preservationMan;                 //数据提交人
    private String serviceCode;                            //服务code
    private Date applyTime;                              //业务申请时间
    private Date insertTime;                             //入库时间
    private String provideUnit;                             //数据提供单位
    private String ext1;                                    //扩展字段1
    private String ext2;                                    //扩展字段2
    private String ext3;                                    //扩展字段3

    private String glImmovableVoList;          //关联的不动产数据
    private String glMortgagorVoList;            //关联的抵押人数据
    private String glMortgageHolderVoList;            //关联的抵押权人数据

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

    public String getMortgageContractNumber() {
        return mortgageContractNumber;
    }

    public void setMortgageContractNumber(String mortgageContractNumber) {
        this.mortgageContractNumber = mortgageContractNumber;
    }

    public String getMortgageMode() {
        return mortgageMode;
    }

    public void setMortgageMode(String mortgageMode) {
        this.mortgageMode = mortgageMode;
    }

    public BigDecimal getMortgageArea() {
        return mortgageArea;
    }

    public void setMortgageArea(BigDecimal mortgageArea) {
        this.mortgageArea = mortgageArea;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getMortgageAmount() {
        return mortgageAmount;
    }

    public void setMortgageAmount(BigDecimal mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }

    public BigDecimal getValuationValue() {
        return valuationValue;
    }

    public void setValuationValue(BigDecimal valuationValue) {
        this.valuationValue = valuationValue;
    }

    public String getMortgagePeriod() {
        return mortgagePeriod;
    }

    public void setMortgagePeriod(String mortgagePeriod) {
        this.mortgagePeriod = mortgagePeriod;
    }

    public Date getMortgageStartingDate() {
        return mortgageStartingDate;
    }

    public void setMortgageStartingDate(String mortgageStartingDate) throws ParseException {
        this.mortgageStartingDate = TimeUtil.getDateFromString(mortgageStartingDate);
    }

    public Date getMortgageEndingDate() {
        return mortgageEndingDate;
    }

    public void setMortgageEndingDate(String mortgageEndingDate) throws ParseException {
        this.mortgageEndingDate = TimeUtil.getDateFromString(mortgageEndingDate);
    }

    public String getMortgageReason() {
        return mortgageReason;
    }

    public void setMortgageReason(String mortgageReason) {
        this.mortgageReason = mortgageReason;
    }

    public String getMaximumClaimConfirm() {
        return maximumClaimConfirm;
    }

    public void setMaximumClaimConfirm(String maximumClaimConfirm) {
        this.maximumClaimConfirm = maximumClaimConfirm;
    }

    public BigDecimal getMaximumClaimAmount() {
        return maximumClaimAmount;
    }

    public void setMaximumClaimAmount(BigDecimal maximumClaimAmount) {
        this.maximumClaimAmount = maximumClaimAmount;
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


    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) throws ParseException {
        this.applyTime = TimeUtil.getTimeFromString(applyTime);
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) throws ParseException {
        this.insertTime = TimeUtil.getTimeFromString(insertTime);
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

    public String getGlMortgagorVoList() {
        return glMortgagorVoList;
    }

    public void setGlMortgagorVoList(String glMortgagorVoList) {
        this.glMortgagorVoList = glMortgagorVoList;
    }

    public String getGlMortgageHolderVoList() {
        return glMortgageHolderVoList;
    }

    public void setGlMortgageHolderVoList(String glMortgageHolderVoList) {
        this.glMortgageHolderVoList = glMortgageHolderVoList;
    }
}
