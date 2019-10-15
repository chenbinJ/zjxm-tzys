package com.springboot.popj.json_data;

import com.springboot.util.TimeUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

public class JSONBdcdyxgxx implements Serializable {
    private String infoId;                          //主键
    private String receiptNumber;                   //收件编号-sj_sjsq表主键
    private String acceptanceNumber;            //不动产内网受理编号
    private String immovableSite;               //不动产坐落（收件单坐落）
    private String mortgageCertificateNo;           //抵押证明号
    private Date registrationDate;                //登记日期
    private String mortgageMode;                    //抵押方式
    private BigDecimal mortgageArea;                    //抵押面积
    private BigDecimal creditAmount;                    //债权数额
    private BigDecimal mortgageAmount;                  //抵押金额
    private BigDecimal valuationValue;                  //评估价值
    private String mortgagePeriod;                  //抵押期限
    private Date mortgageStartingDate;            //抵押期起
    private Date mortgageEndingDate;              //抵押期止
    private String mortgageReason;                  //抵押原因
    private String remarks;                         //备注附记
    private String electronicProofPath;             //电子证明存放路径
    private byte[] electronicProofByte;             //电子证明
    private String serviceCode;                     //服务code
    private String dataJson;                        //原始查询数据
    private String dataType;                        //数据类型（存量/新增）
    private String dataComeFromMode;                //数据获取方式
    private String preservationMan;                 //数据提交人
    private Date insertTime;                      //入库时间
    private String ext1;                            //扩展字段1
    private String ext2;                            //扩展字段2
    private String ext3;                            //扩展字段3

    private String glImmovableVoList;          //关联的不动产数据
    private String glMortgagorVoList;          //关联的抵押人数据
    private String glMortgageHolderVoList;     //关联的抵押权人数据

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

    public void setRegistrationDate(String registrationDate) throws ParseException {
        this.registrationDate = TimeUtil.getTimeFromString(registrationDate);
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

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
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
