package com.springboot.popj.pub_data;

import java.io.Serializable;
import java.math.BigDecimal;

public class SJ_Bdc_Zd_Info implements Serializable {
    private String parcelId;                  //宗地编号
    private String parcelType;                //宗地类型
    private String parcelUnicode;             //宗地统一编码
    private String immovableUnitNumber;       //不动产单元号
    private String cadastralNumber;           //地籍号
    private String parcelLocation;            //宗地坐落
    private String landUse;                   //土地用途
    private BigDecimal commonLandArea;            //共有土地面积
    private BigDecimal privateLandArea;           //独用土地面积
    private BigDecimal apportionmentLandArea;     //分摊土地面积
    private String mortgageSituation;         //不动产当前抵押情况
    private String closureSituation;          //不动产当前查封情况
    private String objectionSituation;        //不动产当前是否存在异议
    private String remarks;                   //备注信息
    private String status;                    //不动产状态
    private String ext1;                      //扩展字段1
    private String ext2;                      //扩展字段2
    private String ext3;                      //扩展字段3

    public String getParcelId() {
        return parcelId;
    }

    public void setParcelId(String parcelId) {
        this.parcelId = parcelId; }

    public String getParcelType() {
        return parcelType;
    }

    public void setParcelType(String parcelType) {
        this.parcelType = parcelType;
    }

    public String getParcelUnicode() {
        return parcelUnicode;
    }

    public void setParcelUnicode(String parcelUnicode) {
        this.parcelUnicode = parcelUnicode;
    }

    public String getImmovableUnitNumber() {
        return immovableUnitNumber;
    }

    public void setImmovableUnitNumber(String immovableUnitNumber) {
        this.immovableUnitNumber = immovableUnitNumber;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public String getParcelLocation() {
        return parcelLocation;
    }

    public void setParcelLocation(String parcelLocation) {
        this.parcelLocation = parcelLocation;
    }

    public String getLandUse() {
        return landUse;
    }

    public void setLandUse(String landUse) {
        this.landUse = landUse;
    }

    public BigDecimal getCommonLandArea() {
        return commonLandArea;
    }

    public void setCommonLandArea(BigDecimal commonLandArea) {
        this.commonLandArea = commonLandArea;
    }

    public BigDecimal getPrivateLandArea() {
        return privateLandArea;
    }

    public void setPrivateLandArea(BigDecimal privateLandArea) {
        this.privateLandArea = privateLandArea;
    }

    public BigDecimal getApportionmentLandArea() {
        return apportionmentLandArea;
    }

    public void setApportionmentLandArea(BigDecimal apportionmentLandArea) {
        this.apportionmentLandArea = apportionmentLandArea;
    }

    public String getMortgageSituation() {
        return mortgageSituation;
    }

    public void setMortgageSituation(String mortgageSituation) {
        this.mortgageSituation = mortgageSituation;
    }

    public String getClosureSituation() {
        return closureSituation;
    }

    public void setClosureSituation(String closureSituation) {
        this.closureSituation = closureSituation;
    }

    public String getObjectionSituation() {
        return objectionSituation;
    }

    public void setObjectionSituation(String objectionSituation) {
        this.objectionSituation = objectionSituation;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    @Override
    public String toString() {
        return "SJ_Bdc_Zd_Info{" +
                "parcelId='" + parcelId + '\'' +
                ", parcelType='" + parcelType + '\'' +
                ", parcelUnicode='" + parcelUnicode + '\'' +
                ", immovableUnitNumber='" + immovableUnitNumber + '\'' +
                ", cadastralNumber='" + cadastralNumber + '\'' +
                ", parcelLocation='" + parcelLocation + '\'' +
                ", landUse='" + landUse + '\'' +
                ", commonLandArea=" + commonLandArea +
                ", privateLandArea=" + privateLandArea +
                ", apportionmentLandArea=" + apportionmentLandArea +
                ", mortgageSituation='" + mortgageSituation + '\'' +
                ", closureSituation='" + closureSituation + '\'' +
                ", objectionSituation='" + objectionSituation + '\'' +
                ", remarks='" + remarks + '\'' +
                ", status='" + status + '\'' +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                '}';
    }
}
