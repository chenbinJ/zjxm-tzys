package com.springboot.popj.pub_data;

import java.io.Serializable;
import java.math.BigDecimal;

public class SJ_Bdc_Fw_Info implements Serializable {
    private String houseId;                                     //不动产信息主键
    private String householdId;                                 //交易合同中的户id
    private String seatId;                                      //交易合同中的幢id
    private String buildingNumber;                              //交易合同中的楼盘编号
    private String houseNumber;                                 //交易合同中的房屋编号
    private String immovableUnicode;                            //不动产统一编码
    private String immovablePlanningUse;                        //房屋规划用途
    private String houseLocation;                               //坐落信息
    private String immovableUnitNumber;                         //不动产单元号
    private String householdNumber;                             //户编号
    private String seatNumber;                                  //幢编号
    private String householdMark;                               //户号
    private String roomMark;                                    //房间号
    private String unitMark;                                    //单元号
    private String totalStorey;                                 //总层数
    private String locationStorey;                              //所在层
    private String projectName;                                 //项目名称
    private BigDecimal architecturalArea;                           //建筑面积
    private BigDecimal houseArchitecturalArea;                      //套内建筑面积
    private BigDecimal apportionmentArchitecturalArea;              //分摊建筑面积
    private String buildingName;                                //建筑名称
    private String mortgageSituation;                           //不动产当前抵押情况
    private String closureSituation;                            //不动产当前查封情况
    private String objectionSituation;                          //不动产当前是否存在异议
    private String remarks;                                     //备注信息
    private String status;                                      //不动产状态
    private String ext1;                                        //扩展字段1
    private String ext2;                                        //扩展字段2
    private String ext3;                                        //扩展字段3

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getImmovableUnicode() {
        return immovableUnicode;
    }

    public void setImmovableUnicode(String immovableUnicode) {
        this.immovableUnicode = immovableUnicode;
    }

    public String getImmovablePlanningUse() {
        return immovablePlanningUse;
    }

    public void setImmovablePlanningUse(String immovablePlanningUse) {
        this.immovablePlanningUse = immovablePlanningUse;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }

    public String getImmovableUnitNumber() {
        return immovableUnitNumber;
    }

    public void setImmovableUnitNumber(String immovableUnitNumber) {
        this.immovableUnitNumber = immovableUnitNumber;
    }

    public String getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getHouseholdMark() {
        return householdMark;
    }

    public void setHouseholdMark(String householdMark) {
        this.householdMark = householdMark;
    }

    public String getRoomMark() {
        return roomMark;
    }

    public void setRoomMark(String roomMark) {
        this.roomMark = roomMark;
    }

    public String getUnitMark() {
        return unitMark;
    }

    public void setUnitMark(String unitMark) {
        this.unitMark = unitMark;
    }

    public String getTotalStorey() {
        return totalStorey;
    }

    public void setTotalStorey(String totalStorey) {
        this.totalStorey = totalStorey;
    }

    public String getLocationStorey() {
        return locationStorey;
    }

    public void setLocationStorey(String locationStorey) {
        this.locationStorey = locationStorey;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public BigDecimal getArchitecturalArea() {
        return architecturalArea;
    }

    public void setArchitecturalArea(BigDecimal architecturalArea) {
        this.architecturalArea = architecturalArea;
    }

    public BigDecimal getHouseArchitecturalArea() {
        return houseArchitecturalArea;
    }

    public void setHouseArchitecturalArea(BigDecimal houseArchitecturalArea) {
        this.houseArchitecturalArea = houseArchitecturalArea;
    }

    public BigDecimal getApportionmentArchitecturalArea() {
        return apportionmentArchitecturalArea;
    }

    public void setApportionmentArchitecturalArea(BigDecimal apportionmentArchitecturalArea) {
        this.apportionmentArchitecturalArea = apportionmentArchitecturalArea;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
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
        return "SJ_Bdc_Fw_Info{" +
                "houseId='" + houseId + '\'' +
                ", householdId='" + householdId + '\'' +
                ", seatId='" + seatId + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", immovableUnicode='" + immovableUnicode + '\'' +
                ", immovablePlanningUse='" + immovablePlanningUse + '\'' +
                ", houseLocation='" + houseLocation + '\'' +
                ", immovableUnitNumber='" + immovableUnitNumber + '\'' +
                ", householdNumber='" + householdNumber + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", householdMark='" + householdMark + '\'' +
                ", roomMark='" + roomMark + '\'' +
                ", unitMark='" + unitMark + '\'' +
                ", totalStorey='" + totalStorey + '\'' +
                ", locationStorey='" + locationStorey + '\'' +
                ", projectName='" + projectName + '\'' +
                ", architecturalArea=" + architecturalArea +
                ", houseArchitecturalArea=" + houseArchitecturalArea +
                ", apportionmentArchitecturalArea=" + apportionmentArchitecturalArea +
                ", buildingName='" + buildingName + '\'' +
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
