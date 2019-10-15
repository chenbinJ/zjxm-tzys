package com.springboot.popj.netSign;

import com.springboot.popj.GlImmovable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 网签数据
 */
public class BusinessContract {

    private String serviceCode;                     //服务code
    private String dataJson;                        //原始查询数据
    private String dataComeFromMode;                //数据获取方式
    private String preservationMan;                 //数据提交人
    private String provideUnit;                     //数据提供单位
    private String contractId;          //合同id
    private String contractNumber;     //合同编号
    private String contractRecordNumber;       //交易合同备案号
    private String contractType;           //商品房/存量房合同
    private String contractRecordTime;     //合同备案时间
    private String contractSignTime;       //合同签订时间
    private String contractAmount;     //合同金额
    private String isReal;             //合同是否有效
    private String ext1;                //扩展字段1
    private String ext2;                //扩展字段2
    private String ext3;                //扩展字段3
    private List<GlImmovable> glImmovableVoList=new ArrayList<>(); //房屋信息
    private List<GlHouseSeller> glHouseSellerVoList=new ArrayList<>(); //权利人信息
    private List<GlHouseBuyer> glHouseBuyerVoList=new ArrayList<>();//购房人信息


    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public List<GlHouseBuyer> getGlHouseBuyerVoList() {
        return glHouseBuyerVoList;
    }

    public void setGlHouseBuyerVoList(List<GlHouseBuyer> glHouseBuyerVoList) {
        this.glHouseBuyerVoList = glHouseBuyerVoList;
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

    public String getProvideUnit() {
        return provideUnit;
    }

    public void setProvideUnit(String provideUnit) {
        this.provideUnit = provideUnit;
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

    public String getContractRecordTime() {
        return contractRecordTime;
    }

    public void setContractRecordTime(String contractRecordTime) {
        this.contractRecordTime = contractRecordTime;
    }

    public String getContractSignTime() {
        return contractSignTime;
    }

    public void setContractSignTime(String contractSignTime) {
        this.contractSignTime = contractSignTime;
    }

    public String getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(String contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getIsReal() {
        return isReal;
    }

    public void setIsReal(String isReal) {
        this.isReal = isReal;
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

    public List<GlImmovable> getGlImmovableVoList() {
        return glImmovableVoList;
    }

    public void setGlImmovableVoList(List<GlImmovable> glImmovableVoList) {
        this.glImmovableVoList = glImmovableVoList;
    }

    public List<GlHouseSeller> getGlHouseSellerVoList() {
        return glHouseSellerVoList;
    }

    public void setGlHouseSellerVoList(List<GlHouseSeller> glHouseSellerVoList) {
        this.glHouseSellerVoList = glHouseSellerVoList;
    }
}
