package com.entity;
public class Carbrand {
    private Integer brandId;//Ʒ
    private String brandName;//Ʒ
    private String brandNum;//Ʒ
    public Carbrand() {
        super();
    }
    public Carbrand(Integer brandId,String brandName,String brandNum) {
        super();
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandNum = brandNum;
    }
    public Integer getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandNum() {
        return this.brandNum;
    }

    public void setBrandNum(String brandNum) {
        this.brandNum = brandNum;
    }

}
