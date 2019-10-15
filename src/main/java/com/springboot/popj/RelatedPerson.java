package com.springboot.popj;

/**
 * 个人信息
 */
public class RelatedPerson {
    private String obligeeName;//名称
    private String obligeeDocumentType; //证件类型
    private String obligeeDocumentNumber;//证件号码
    private String status;//状态

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
}
