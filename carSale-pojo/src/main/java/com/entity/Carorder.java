package com.entity;
public class Carorder {
    private Integer orderId;
    private String orderType;
    private Integer companyId;
    private Double orderTotalPrice;
    private Integer orderNum;
    private Integer carId;
    private String column7;
    public Carorder() {
        super();
    }
    public Carorder(Integer orderId,String orderType,Integer companyId,Double orderTotalPrice,Integer orderNum,Integer carId,String column7) {
        super();
        this.orderId = orderId;
        this.orderType = orderType;
        this.companyId = companyId;
        this.orderTotalPrice = orderTotalPrice;
        this.orderNum = orderNum;
        this.carId = carId;
        this.column7 = column7;
    }
    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getOrderTotalPrice() {
        return this.orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Integer getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getColumn7() {
        return this.column7;
    }

    public void setColumn7(String column7) {
        this.column7 = column7;
    }

}
