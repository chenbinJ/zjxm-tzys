package com.springboot.popj;


public class GlMortgageHolder {

    private String obligeeName;
    private String obligeeType;
    private String obligeeOrder;
    private String status;
    private RelatedPerson relatedPerson;

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

    public String getObligeeOrder() {
        return obligeeOrder;
    }

    public void setObligeeOrder(String obligeeOrder) {
        this.obligeeOrder = obligeeOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RelatedPerson getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(RelatedPerson relatedPerson) {
        this.relatedPerson = relatedPerson;
    }
}
