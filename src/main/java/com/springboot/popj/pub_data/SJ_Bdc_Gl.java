package com.springboot.popj.pub_data;

import java.io.Serializable;

public class SJ_Bdc_Gl implements Serializable {
    private String relationId;                   //关联id
    private String infoId;                       //收件信息id
    private String immovableId;                  //关联不动产id
    private String immovableType;                //不动产类型，用于描述不动产是净地还是房地
    private String infoTableIdentification;      //info关联表标识（标识提供数据的表）
    private String status;                       //状态（是否废弃或挂起当前收件业务）
    private SJ_Bdc_Fw_Info fwInfo;               //房地权属信息
    private SJ_Bdc_Zd_Info zdInfo;               //净地权属信息

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

    public SJ_Bdc_Fw_Info getFwInfo() {
        return fwInfo;
    }

    public void setFwInfo(SJ_Bdc_Fw_Info fwInfo) {
        this.fwInfo = fwInfo;
    }

    public SJ_Bdc_Zd_Info getZdInfo() {
        return zdInfo;
    }

    public void setZdInfo(SJ_Bdc_Zd_Info zdInfo) {
        this.zdInfo = zdInfo;
    }

    @Override
    public String toString() {
        return "SJ_Bdc_Gl{" +
                "relationId='" + relationId + '\'' +
                ", infoId='" + infoId + '\'' +
                ", immovableId='" + immovableId + '\'' +
                ", immovableType='" + immovableType + '\'' +
                ", infoTableIdentification='" + infoTableIdentification + '\'' +
                ", status='" + status + '\'' +
                ", fwInfo=" + fwInfo +
                ", zdInfo=" + zdInfo +
                '}';
    }
}
