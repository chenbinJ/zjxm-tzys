package com.springboot.popj.pub_data;

import java.io.Serializable;

public class SJ_Qlr_Gl implements Serializable {
    private String relationId;                      //关联id
    private String infoId;                          //收件信息id
    private String obligeeId;                       //权利人id
    private String obligeeName;                     //权利人名称
    private String obligeeType;                     //权利人类型（权利人、抵押人、债务人...）
    private Integer obligeeOrder;                    //权利人顺序
    private String sharedMode;                      //共有方式
    private Integer sharedValue;                     //共有份额
    private String infoTableIdentification;         //关联info表标识
    private String status;                          //状态

    private SJ_Qlr_Info relatedPerson;                    //相关人信息

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

    public String getObligeeId() {
        return obligeeId;
    }

    public void setObligeeId(String obligeeId) {
        this.obligeeId = obligeeId;
    }

    public String getObligeeName() {
        return obligeeName;
    }

    public void setObligeeName(String obligeeName) {
        this.obligeeName = obligeeName;
    }

    public String getObligeeType() {
        return obligeeType;
    }

    public void setObligeeType(String obligeeType) {
        this.obligeeType = obligeeType;
    }

    public Integer getObligeeOrder() {
        return obligeeOrder;
    }

    public void setObligeeOrder(Integer obligeeOrder) {
        this.obligeeOrder = obligeeOrder;
    }

    public String getSharedMode() {
        return sharedMode;
    }

    public void setSharedMode(String sharedMode) {
        this.sharedMode = sharedMode;
    }

    public Integer getSharedValue() {
        return sharedValue;
    }

    public void setSharedValue(Integer sharedValue) {
        this.sharedValue = sharedValue;
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

    public SJ_Qlr_Info getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(SJ_Qlr_Info relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    @Override
    public String toString() {
        return "SJ_Qlr_Gl{" +
                "relationId='" + relationId + '\'' +
                ", infoId='" + infoId + '\'' +
                ", obligeeId='" + obligeeId + '\'' +
                ", obligeeName='" + obligeeName + '\'' +
                ", obligeeType='" + obligeeType + '\'' +
                ", obligeeOrder=" + obligeeOrder +
                ", sharedMode='" + sharedMode + '\'' +
                ", sharedValue=" + sharedValue +
                ", infoTableIdentification='" + infoTableIdentification + '\'' +
                ", status='" + status + '\'' +
                ", relatedPerson=" + relatedPerson +
                '}';
    }
}
