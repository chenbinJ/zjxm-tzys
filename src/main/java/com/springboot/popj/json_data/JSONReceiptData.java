package com.springboot.popj.json_data;

import com.springboot.util.TimeUtil;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

public class JSONReceiptData implements Serializable {
    private String receiptNumber;                              //收件编号
    private String businessType;                               //业务类型
    private String registrationCategory;                       //登记大类（大类字典值）
    private String immovableType;                              //不动产类型
    private String immovableSite;                              //不动产坐落
    private String notifiedPersonName;                         //通知人名称
    private String notifiedPersonTelephone;                    //通知人电话
    private String notifiedPersonAddress;                      //通知人地址
    private String immovableProcessIdentification;             //不动产侧流程标识（pid）
    private String platform;                                   //发起平台
    private String immovableReceivingPerson;                   //不动产侧受理人员标识
    private String districtCode;                               //区县代码
    private String postscriptInformation;                      //附记信息
    private String receiptMan;                                 //收件人员
    private Date receiptTime;                                //收件时间
    private String registerNumber;                             //内网办件受理号
    private String status;                                     //状态（正常/废弃/挂起）
    private String ext1;                                       //扩展字段1
    private String ext2;                                       //扩展字段2
    private String ext3;                                       //扩展字段3
    private String ext4;                                       //扩展字段4

    private String serviceDatas;                                //服务数据

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getRegistrationCategory() {
        return registrationCategory;
    }

    public void setRegistrationCategory(String registrationCategory) {
        this.registrationCategory = registrationCategory;
    }

    public String getImmovableType() {
        return immovableType;
    }

    public void setImmovableType(String immovableType) {
        this.immovableType = immovableType;
    }

    public String getImmovableSite() {
        return immovableSite;
    }

    public void setImmovableSite(String immovableSite) {
        this.immovableSite = immovableSite;
    }

    public String getNotifiedPersonName() {
        return notifiedPersonName;
    }

    public void setNotifiedPersonName(String notifiedPersonName) {
        this.notifiedPersonName = notifiedPersonName;
    }

    public String getNotifiedPersonTelephone() {
        return notifiedPersonTelephone;
    }

    public void setNotifiedPersonTelephone(String notifiedPersonTelephone) {
        this.notifiedPersonTelephone = notifiedPersonTelephone;
    }

    public String getNotifiedPersonAddress() {
        return notifiedPersonAddress;
    }

    public void setNotifiedPersonAddress(String notifiedPersonAddress) {
        this.notifiedPersonAddress = notifiedPersonAddress;
    }

    public String getImmovableProcessIdentification() {
        return immovableProcessIdentification;
    }

    public void setImmovableProcessIdentification(String immovableProcessIdentification) {
        this.immovableProcessIdentification = immovableProcessIdentification;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getImmovableReceivingPerson() {
        return immovableReceivingPerson;
    }

    public void setImmovableReceivingPerson(String immovableReceivingPerson) {
        this.immovableReceivingPerson = immovableReceivingPerson;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getPostscriptInformation() {
        return postscriptInformation;
    }

    public void setPostscriptInformation(String postscriptInformation) {
        this.postscriptInformation = postscriptInformation;
    }

    public String getReceiptMan() {
        return receiptMan;
    }

    public void setReceiptMan(String receiptMan) {
        this.receiptMan = receiptMan;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(String receiptTime) throws ParseException {
        this.receiptTime = TimeUtil.getTimeFromString(receiptTime);
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getServiceDatas() {
        return serviceDatas;
    }

    public void setServiceDatas(String serviceDatas) {
        this.serviceDatas = serviceDatas;
    }
}
