package com.entity;
public class Position {
    private Integer positionId;//ְ
    private String positionName;//ְ
    private String positionLevel;//ְ
    public Position() {
        super();
    }
    public Position(Integer positionId,String positionName,String positionLevel) {
        super();
        this.positionId = positionId;
        this.positionName = positionName;
        this.positionLevel = positionLevel;
    }
    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionLevel() {
        return this.positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

}
