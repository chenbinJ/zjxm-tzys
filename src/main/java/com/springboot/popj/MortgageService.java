package com.springboot.popj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MortgageService {
    private String acceptanceNumber;//不动产内网受理编号
    private String immovableSite;//不动产坐落（收件单坐落）
    private String mortgageCertificateNo;// 抵押证明号
    private Date registrationDate; //登记日期
    private String mortgageMode;//抵押类型
    private Double mortgageArea;//抵押面积
    private Double creditAmount;//贷款金额
    private Double mortgageAmount;//抵押金额
    private Double valuationValue;//评估值
    private String mortgagePeriod;//贷款年限
    private Date mortgageStartingDate;//抵押开始时间
    private Date mortgageEndingDate;//抵押到期时间
    private String mortgageReason;//贷款原因
    private String remarks;//备注
    private String dataType;//数据类型
    private String dataComeFromMode;//获取方式
    private List<GlImmovable> glImmovableVoList=new ArrayList<>();//不动产房信息
    private List<GlMortgagor> glMortgagorVoList=new ArrayList<>();//抵押人信息
    private List<GlMortgageHolder> glMortgageHolderVoList=new ArrayList<>();//银行信息

    public List<GlMortgageHolder> getGlMortgageHolderVoList() {
        return glMortgageHolderVoList;
    }

    public List<GlImmovable> getGlImmovableVoList() {
        return glImmovableVoList;
    }

    public void setGlImmovableVoList(List<GlImmovable> glImmovableVoList) {
        this.glImmovableVoList = glImmovableVoList;
    }

    public void setGlMortgageHolderVoList(List<GlMortgageHolder> glMortgageHolderVoList) {
        this.glMortgageHolderVoList = glMortgageHolderVoList;
    }

    public String getAcceptanceNumber() {
        return acceptanceNumber;
    }

    public void setAcceptanceNumber(String acceptanceNumber) {
        this.acceptanceNumber = acceptanceNumber;
    }

    public String getImmovableSite() {
        return immovableSite;
    }

    public void setImmovableSite(String immovableSite) {
        this.immovableSite = immovableSite;
    }

    public String getMortgageCertificateNo() {
        return mortgageCertificateNo;
    }

    public void setMortgageCertificateNo(String mortgageCertificateNo) {
        this.mortgageCertificateNo = mortgageCertificateNo;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getMortgageMode() {
        return mortgageMode;
    }

    public void setMortgageMode(String mortgageMode) {
        this.mortgageMode = mortgageMode;
    }

    public Double getMortgageArea() {
        return mortgageArea;
    }

    public void setMortgageArea(Double mortgageArea) {
        this.mortgageArea = mortgageArea;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Double getMortgageAmount() {
        return mortgageAmount;
    }

    public void setMortgageAmount(Double mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }

    public Double getValuationValue() {
        return valuationValue;
    }

    public void setValuationValue(Double valuationValue) {
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

    public void setMortgageStartingDate(Date mortgageStartingDate) {
        this.mortgageStartingDate = mortgageStartingDate;
    }

    public Date getMortgageEndingDate() {
        return mortgageEndingDate;
    }

    public void setMortgageEndingDate(Date mortgageEndingDate) {
        this.mortgageEndingDate = mortgageEndingDate;
    }

    public String getMortgageReason() {
        return mortgageReason;
    }

    public void setMortgageReason(String mortgageReason) {
        this.mortgageReason = mortgageReason;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataComeFromMode() {
        return dataComeFromMode;
    }

    public void setDataComeFromMode(String dataComeFromMode) {
        this.dataComeFromMode = dataComeFromMode;
    }

    public List<GlMortgagor> getGlMortgagorVoList() {
        return glMortgagorVoList;
    }

    public void setGlMortgagorVoList(List<GlMortgagor> glMortgagorVoList) {
        this.glMortgagorVoList = glMortgagorVoList;
    }
}
