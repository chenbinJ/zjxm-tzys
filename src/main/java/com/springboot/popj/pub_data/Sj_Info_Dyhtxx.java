package com.springboot.popj.pub_data;

import com.springboot.util.TimeUtil;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Sj_Info_Dyhtxx extends SJ_Information {
    private String mortgageContractNumber;                //抵押合同编号
    private String mortgageMode;                           //抵押方式
    private BigDecimal mortgageArea;                           //抵押面积
    private BigDecimal creditAmount;                           //债权数额
    private BigDecimal mortgageAmount;                         //抵押金额
    private BigDecimal valuationValue;                         //评估价值
    private String mortgagePeriod;                         //抵押期限
    private String mortgageStartingDate;                  //抵押期起
    private String mortgageEndingDate;                    //抵押期止
    private String mortgageReason;                         //抵押原因
    private String maximumClaimConfirm;                   //最高债权确实事实
    private BigDecimal maximumClaimAmount;                    //最高债权数额
    private String applyTime;                              //业务申请时间
    private String ext1;                                    //扩展字段1
    private String ext2;                                    //扩展字段2
    private String ext3;                                    //扩展字段3

    private List<SJ_Bdc_Gl> glImmovableVoList;          //关联的不动产数据
    private List<SJ_Qlr_Gl> glMortgagorVoList;            //关联的抵押人数据
    private List<SJ_Qlr_Gl> glMortgageHolderVoList;            //关联的抵押权人数据



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

    public String getMortgageStartingDate() {
        return mortgageStartingDate;
    }

    public void setMortgageStartingDate(Date mortgageStartingDate) {
        this.mortgageStartingDate = TimeUtil.getDateString(mortgageStartingDate);
    }

    public String getMortgageEndingDate() {
        return mortgageEndingDate;
    }

    public void setMortgageEndingDate(Date mortgageEndingDate) {
        this.mortgageEndingDate = TimeUtil.getDateString(mortgageEndingDate);
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

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = TimeUtil.getTimeString(applyTime);
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

    public List<SJ_Bdc_Gl> getGlImmovableVoList() {
        return glImmovableVoList;
    }

    public void setGlImmovableVoList(List<SJ_Bdc_Gl> glImmovableVoList) {
        this.glImmovableVoList = glImmovableVoList;
    }

    public List<SJ_Qlr_Gl> getGlMortgagorVoList() {
        return glMortgagorVoList;
    }

    public void setGlMortgagorVoList(List<SJ_Qlr_Gl> glMortgagorVoList) {
        this.glMortgagorVoList = glMortgagorVoList;
    }

    public List<SJ_Qlr_Gl> getGlMortgageHolderVoList() {
        return glMortgageHolderVoList;
    }

    public void setGlMortgageHolderVoList(List<SJ_Qlr_Gl> glMortgageHolderVoList) {
        this.glMortgageHolderVoList = glMortgageHolderVoList;
    }

}
