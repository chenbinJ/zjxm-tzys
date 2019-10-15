package com.springboot.popj.pub_data;

import com.springboot.util.TimeUtil;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Sj_Info_Bdcdyxgxx extends SJ_Information{
    private String acceptanceNumber;            //不动产内网受理编号
    private String immovableSite;               //不动产坐落（收件单坐落）
    private String mortgageCertificateNo;           //抵押证明号
    private String registrationDate;                //登记日期
    private String mortgageMode;                    //抵押方式
    private String mortgageArea;                    //抵押面积
    private String creditAmount;                    //债权数额
    private String mortgageAmount;                  //抵押金额
    private String valuationValue;                  //评估价值
    private String mortgagePeriod;                  //抵押期限
    private String mortgageStartingDate;            //抵押期起
    private String mortgageEndingDate;              //抵押期止
    private String mortgageReason;                  //抵押原因
    private String remarks;                         //备注附记
    private String electronicProofPath;             //电子证明存放路径
    private byte[] electronicProofByte;             //电子证明
    private String dataType;                        //数据类型（存量/新增）
    private String ext1;                            //扩展字段1
    private String ext2;                            //扩展字段2
    private String ext3;                            //扩展字段3

    private List<SJ_Bdc_Gl> glImmovableVoList;          //关联的不动产数据
    private List<SJ_Qlr_Gl> glMortgagorVoList;            //关联的抵押人数据
    private List<SJ_Qlr_Gl> glMortgageHolderVoList;            //关联的抵押权人数据

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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = TimeUtil.getTimeString(registrationDate);
    }

    public String getMortgageMode() {
        return mortgageMode;
    }

    public void setMortgageMode(String mortgageMode) {
        this.mortgageMode = mortgageMode;
    }

    public String getMortgageArea() {
        return mortgageArea;
    }

    public void setMortgageArea(String mortgageArea) {
        this.mortgageArea = mortgageArea;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getMortgageAmount() {
        return mortgageAmount;
    }

    public void setMortgageAmount(String mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }

    public String getValuationValue() {
        return valuationValue;
    }

    public void setValuationValue(String valuationValue) {
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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
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
