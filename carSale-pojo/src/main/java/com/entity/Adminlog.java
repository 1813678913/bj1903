package com.entity;
public class Adminlog {
    private Integer logId;
    private Integer empId;//Ա
    private Integer companyId;
    private String logContent;
    private java.util.Date logTime;

    @Override
    public String toString() {
        return "Adminlog{" +
                "logId=" + logId +
                ", empId=" + empId +
                ", companyId=" + companyId +
                ", logContent='" + logContent + '\'' +
                ", logTime=" + logTime +
                '}';
    }

    public Adminlog() {
        super();
    }
    public Adminlog(Integer logId,Integer empId,Integer companyId,String logContent,java.util.Date logTime) {
        super();
        this.logId = logId;
        this.empId = empId;
        this.companyId = companyId;
        this.logContent = logContent;
        this.logTime = logTime;
    }
    public Integer getLogId() {
        return this.logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
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

    public String getLogContent() {
        return this.logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public java.util.Date getLogTime() {
        return this.logTime;
    }

    public void setLogTime(java.util.Date logTime) {
        this.logTime = logTime;
    }

}
