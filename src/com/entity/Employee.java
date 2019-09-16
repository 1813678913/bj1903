package com.entity;
public class Employee {
    private Integer empId;//Ա
    private Integer companyId;
    private String empPhone;
    private Double empSalery;//Ա
    private Integer positionId;//ְ
    private Integer brandId;//Ʒ
    private String empName;//Ա
    private String empPassword;
    public Employee() {
        super();
    }
    public Employee(Integer empId,Integer companyId,String empPhone,Double empSalery,Integer positionId,Integer brandId,String empName,String empPassword) {
        super();
        this.empId = empId;
        this.companyId = companyId;
        this.empPhone = empPhone;
        this.empSalery = empSalery;
        this.positionId = positionId;
        this.brandId = brandId;
        this.empName = empName;
        this.empPassword = empPassword;
    }
    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getEmpPhone() {
        return this.empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public Double getEmpSalery() {
        return this.empSalery;
    }

    public void setEmpSalery(Double empSalery) {
        this.empSalery = empSalery;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPassword() {
        return this.empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

}
