package com.springboot.popj;

import com.springboot.popj.warrant.ZdInfo;

public class GlImmovable {

    private String immovableId;//关联不动产id（有则提供，没有可以不提供，对应的是下方的houseId或者parcelId，具体根据不动产类型来）
    private String immovableType; //不动产类型，用于描述不动产是宗地还是房地
    private String infoTableIdentification;//info关联表标识（标识提供数据的表）
    private FwInfo fwInfo;//房地权属信息
    private ZdInfo zdInfo;//宗地信息

    public ZdInfo getZdInfo() {
        return zdInfo;
    }

    public void setZdInfo(ZdInfo zdInfo) {
        this.zdInfo = zdInfo;
    }

    public String getImmovableId() {
        return immovableId;
    }

    public void setImmovableId(String immovableId) {
        this.immovableId = immovableId;
    }

    public String getImmovableType() {
        return immovableType;
    }

    public void setImmovableType(String immovableType) {
        this.immovableType = immovableType;
    }

    public String getInfoTableIdentification() {
        return infoTableIdentification;
    }

    public void setInfoTableIdentification(String infoTableIdentification) {
        this.infoTableIdentification = infoTableIdentification;
    }

    public FwInfo getFwInfo() {
        return fwInfo;
    }

    public void setFwInfo(FwInfo fwInfo) {
        this.fwInfo = fwInfo;
    }
}
