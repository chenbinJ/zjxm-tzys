package com.springboot.popj.json_data;

import java.io.Serializable;

public class JSONGLBdc implements Serializable {
    private String relationId;                   //关联id
    private String infoId;                       //收件信息id
    private String immovableId;                  //关联不动产id
    private String immovableType;                //不动产类型，用于描述不动产是净地还是房地
    private String infoTableIdentification;      //info关联表标识（标识提供数据的表）
    private String status;                       //状态（是否废弃或挂起当前收件业务）
    private String fwInfo;               //房地权属信息(JSON)
    private String zdInfo;               //净地权属信息(JSON)

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFwInfo() {
        return fwInfo;
    }

    public void setFwInfo(String fwInfo) {
        this.fwInfo = fwInfo;
    }

    public String getZdInfo() {
        return zdInfo;
    }

    public void setZdInfo(String zdInfo) {
        this.zdInfo = zdInfo;
    }
}
