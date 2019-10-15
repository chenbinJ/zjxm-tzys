package com.springboot.popj.pub_data;

import java.io.Serializable;

public class SJ_Qlr_Info implements Serializable {
    private String obligeeId;                     //权利人id（主键）
    private String obligeeName;                   //权利人名称
    private String obligeeDocumentType;           //权利人证件类型
    private String obligeeDocumentNumber;         //权利人证件号码
    private String status;                        //状态
    private String ext1;                          //扩展字段1
    private String ext2;                          //扩展字段2
    private String ext3;                          //扩展字段3

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

    public String getObligeeDocumentType() {
        return obligeeDocumentType;
    }

    public void setObligeeDocumentType(String obligeeDocumentType) {
        this.obligeeDocumentType = obligeeDocumentType;
    }

    public String getObligeeDocumentNumber() {
        return obligeeDocumentNumber;
    }

    public void setObligeeDocumentNumber(String obligeeDocumentNumber) {
        this.obligeeDocumentNumber = obligeeDocumentNumber;
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
        return "SJ_Qlr_Info{" +
                "obligeeId='" + obligeeId + '\'' +
                ", obligeeName='" + obligeeName + '\'' +
                ", obligeeDocumentType='" + obligeeDocumentType + '\'' +
                ", obligeeDocumentNumber='" + obligeeDocumentNumber + '\'' +
                ", status='" + status + '\'' +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                '}';
    }
}
