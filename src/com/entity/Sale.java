package com.entity;
public class Sale {
    private Integer saleId;
    private Integer empid;//Ա
    private Integer companyId;
    private java.util.Date saleTime;
    private String saleType;
    private Integer customerId;
    private Integer saleNum;
    private Double saleCurPrice;
    private Integer carId;
    public Sale() {
        super();
    }
    public Sale(Integer saleId,Integer empid,Integer companyId,java.util.Date saleTime,String saleType,Integer customerId,Integer saleNum,Double saleCurPrice,Integer carId) {
        super();
        this.saleId = saleId;
        this.empid = empid;
        this.companyId = companyId;
        this.saleTime = saleTime;
        this.saleType = saleType;
        this.customerId = customerId;
        this.saleNum = saleNum;
        this.saleCurPrice = saleCurPrice;
        this.carId = carId;
    }
    public Integer getSaleId() {
        return this.saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getEmpid() {
        return this.empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public java.util.Date getSaleTime() {
        return this.saleTime;
    }

    public void setSaleTime(java.util.Date saleTime) {
        this.saleTime = saleTime;
    }

    public String getSaleType() {
        return this.saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getSaleNum() {
        return this.saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Double getSaleCurPrice() {
        return this.saleCurPrice;
    }

    public void setSaleCurPrice(Double saleCurPrice) {
        this.saleCurPrice = saleCurPrice;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

}
