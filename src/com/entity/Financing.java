package com.entity;
public class Financing {
    private Integer financingId;
    private Integer companyId;
    private Double financingMoney;
    private Integer saleId;
    private Integer repertoryId;
    private Integer comCompanyid;
    private java.util.Date financingTime;
    private String financingType;
    public Financing() {
        super();
    }
    public Financing(Integer financingId,Integer companyId,Double financingMoney,Integer saleId,Integer repertoryId,Integer comCompanyid,java.util.Date financingTime,String financingType) {
        super();
        this.financingId = financingId;
        this.companyId = companyId;
        this.financingMoney = financingMoney;
        this.saleId = saleId;
        this.repertoryId = repertoryId;
        this.comCompanyid = comCompanyid;
        this.financingTime = financingTime;
        this.financingType = financingType;
    }
    public Integer getFinancingId() {
        return this.financingId;
    }

    public void setFinancingId(Integer financingId) {
        this.financingId = financingId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getFinancingMoney() {
        return this.financingMoney;
    }

    public void setFinancingMoney(Double financingMoney) {
        this.financingMoney = financingMoney;
    }

    public Integer getSaleId() {
        return this.saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getRepertoryId() {
        return this.repertoryId;
    }

    public void setRepertoryId(Integer repertoryId) {
        this.repertoryId = repertoryId;
    }

    public Integer getComCompanyid() {
        return this.comCompanyid;
    }

    public void setComCompanyid(Integer comCompanyid) {
        this.comCompanyid = comCompanyid;
    }

    public java.util.Date getFinancingTime() {
        return this.financingTime;
    }

    public void setFinancingTime(java.util.Date financingTime) {
        this.financingTime = financingTime;
    }

    public String getFinancingType() {
        return this.financingType;
    }

    public void setFinancingType(String financingType) {
        this.financingType = financingType;
    }

}
