package com.springboot.popj.parallel_sectors;

import com.springboot.popj.pub_data.SJ_Qlr_Info;


import java.math.BigDecimal;
import java.util.List;
//抵押信息
public class ImmovableMortgageInquiryInformation extends InquiryInformation {

    private String acceptanceNumber;            //不动产内网受理编号
    private String immovableUnicode;            //不动产单元号
    private String immovableSite;               //不动产坐落（收件单坐落）
    private String mortgageCertificateNo;           //抵押证明号
    private String relevantCertificateNo;           //相关证号
    private String registrationDate;                //登记日期
    private String mortgageMode;                    //抵押方式
    private BigDecimal mortgageArea;                    //抵押面积
    private BigDecimal creditAmount;                    //债权数额
    private BigDecimal mortgageAmount;                  //抵押金额
    private BigDecimal valuationValue;                  //评估价值
    private String mortgagePeriod;                  //抵押期限
    private String mortgageStartingDate;            //抵押期起
    private String mortgageEndingDate;              //抵押期止
    private String mortgageReason;                  //抵押原因
    private String remarks;                         //备注附记
    private String electronicProofPath;             //电子证明存放路径
    private byte[] electronicProofByte;             //电子证明
    private String immovableCertificateNo;          //不动产权证号
    private List<SJ_Qlr_Info> mortgagorVoList;     //关联的抵押人数据
    private List<SJ_Qlr_Info> mortgageHolderVoList;     //关联的抵押权人数据


    public String getImmovableCertificateNo() {
        return immovableCertificateNo;
    }

    public void setImmovableCertificateNo(String immovableCertificateNo) {
        this.immovableCertificateNo = immovableCertificateNo;
    }

    public String getAcceptanceNumber() {
        return acceptanceNumber;
    }

    public void setAcceptanceNumber(String acceptanceNumber) {
        this.acceptanceNumber = acceptanceNumber;
    }

    public String getImmovableUnicode() {
        return immovableUnicode;
    }

    public void setImmovableUnicode(String immovableUnicode) {
        this.immovableUnicode = immovableUnicode;
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

    public String getRelevantCertificateNo() {
        return relevantCertificateNo;
    }

    public void setRelevantCertificateNo(String relevantCertificateNo) {
        this.relevantCertificateNo = relevantCertificateNo;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
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

    public void setMortgageStartingDate(String mortgageStartingDate) {
        this.mortgageStartingDate = mortgageStartingDate;
    }

    public String getMortgageEndingDate() {
        return mortgageEndingDate;
    }

    public void setMortgageEndingDate(String mortgageEndingDate) {
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

    public String getElectronicProofPath() {
        return electronicProofPath;
    }

    public void setElectronicProofPath(String electronicProofPath) {
        this.electronicProofPath = electronicProofPath;
    }

    public byte[] getElectronicProofByte() {
        return electronicProofByte;
    }

    public void setElectronicProofByte(byte[] electronicProofByte) {
        this.electronicProofByte = electronicProofByte;
    }

    public List<SJ_Qlr_Info> getMortgagorVoList() {
        return mortgagorVoList;
    }

    public void setMortgagorVoList(List<SJ_Qlr_Info> mortgagorVoList) {
        this.mortgagorVoList = mortgagorVoList;
    }

    public List<SJ_Qlr_Info> getMortgageHolderVoList() {
        return mortgageHolderVoList;
    }

    public void setMortgageHolderVoList(List<SJ_Qlr_Info> mortgageHolderVoList) {
        this.mortgageHolderVoList = mortgageHolderVoList;
    }
}
