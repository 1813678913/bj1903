package com.entity;
public class Car {
    private Integer carId;
    private Double carPrice;
    private String carName;
    private java.util.Date carTime;
    private Integer seriesId;
    public Car() {
        super();
    }
    public Car(Integer carId,Double carPrice,String carName,java.util.Date carTime,Integer seriesId) {
        super();
        this.carId = carId;
        this.carPrice = carPrice;
        this.carName = carName;
        this.carTime = carTime;
        this.seriesId = seriesId;
    }
    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Double getCarPrice() {
        return this.carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public java.util.Date getCarTime() {
        return this.carTime;
    }

    public void setCarTime(java.util.Date carTime) {
        this.carTime = carTime;
    }

    public Integer getSeriesId() {
        return this.seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

}
