package com.entity;
public class Company {
    private Integer companyId;
    private String companyName;
    public Company() {
        super();
    }
    public Company(Integer companyId,String companyName) {
        super();
        this.companyId = companyId;
        this.companyName = companyName;
    }
    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
