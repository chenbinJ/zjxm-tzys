package com.springboot.entity.chenbin.personnel.punit;

import com.springboot.entity.chenbin.personnel.PersonnelUnitEntity;

public class MZPrivateUnitEntity extends PersonnelUnitEntity {
    private String business_scope;
    private String issue_certificate_dept;
    private String registration_date;
    private String valid_to;
    private String usc_code;
    private String valid_from;
    private String legal_name;
    private String domicile_addres;
    private String org_name;
    private String registered_capital;
    private String ifcharity;
    private String manager_dept;

    public String getBusiness_scope() {
        return business_scope;
    }

    public void setBusiness_scope(String business_scope) {
        this.business_scope = business_scope;
    }

    public String getIssue_certificate_dept() {
        return issue_certificate_dept;
    }

    public void setIssue_certificate_dept(String issue_certificate_dept) {
        this.issue_certificate_dept = issue_certificate_dept;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public String getValid_to() {
        return valid_to;
    }

    public void setValid_to(String valid_to) {
        this.valid_to = valid_to;
    }

    public String getUsc_code() {
        return usc_code;
    }

    public void setUsc_code(String usc_code) {
        this.usc_code = usc_code;
    }

    public String getValid_from() {
        return valid_from;
    }

    public void setValid_from(String valid_from) {
        this.valid_from = valid_from;
    }

    public String getLegal_name() {
        return legal_name;
    }

    public void setLegal_name(String legal_name) {
        this.legal_name = legal_name;
    }

    public String getDomicile_addres() {
        return domicile_addres;
    }

    public void setDomicile_addres(String domicile_addres) {
        this.domicile_addres = domicile_addres;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getRegistered_capital() {
        return registered_capital;
    }

    public void setRegistered_capital(String registered_capital) {
        this.registered_capital = registered_capital;
    }

    public String getIfcharity() {
        return ifcharity;
    }

    public void setIfcharity(String ifcharity) {
        this.ifcharity = ifcharity;
    }

    public String getManager_dept() {
        return manager_dept;
    }

    public void setManager_dept(String manager_dept) {
        this.manager_dept = manager_dept;
    }
}
