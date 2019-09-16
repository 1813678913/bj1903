package com.entity;
public class Repertory {
    private Integer repertoryId;
    private java.util.Date inTime;
    private Integer companyId;
    private Double purchasePrice;
    private Integer carId;
    private Integer repetoryNum;
    public Repertory() {
        super();
    }
    public Repertory(Integer repertoryId,java.util.Date inTime,Integer companyId,Double purchasePrice,Integer carId,Integer repetoryNum) {
        super();
        this.repertoryId = repertoryId;
        this.inTime = inTime;
        this.companyId = companyId;
        this.purchasePrice = purchasePrice;
        this.carId = carId;
        this.repetoryNum = repetoryNum;
    }
    public Integer getRepertoryId() {
        return this.repertoryId;
    }

    public void setRepertoryId(Integer repertoryId) {
        this.repertoryId = repertoryId;
    }

    public java.util.Date getInTime() {
        return this.inTime;
    }

    public void setInTime(java.util.Date inTime) {
        this.inTime = inTime;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getPurchasePrice() {
        return this.purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getRepetoryNum() {
        return this.repetoryNum;
    }

    public void setRepetoryNum(Integer repetoryNum) {
        this.repetoryNum = repetoryNum;
    }

}
