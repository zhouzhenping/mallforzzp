package com.zzp.mall.model;

import java.io.Serializable;
import java.util.Date;

public class VariablesInfo implements Serializable {
    private String variableName;

    private String variableSource;

    private String variablePath;

    private String minValue;

    private String maxValue;

    private Date setTime;

    private String setUser;

    private String setHost;

    private static final long serialVersionUID = 1L;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableSource() {
        return variableSource;
    }

    public void setVariableSource(String variableSource) {
        this.variableSource = variableSource;
    }

    public String getVariablePath() {
        return variablePath;
    }

    public void setVariablePath(String variablePath) {
        this.variablePath = variablePath;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public String getSetUser() {
        return setUser;
    }

    public void setSetUser(String setUser) {
        this.setUser = setUser;
    }

    public String getSetHost() {
        return setHost;
    }

    public void setSetHost(String setHost) {
        this.setHost = setHost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", variableName=").append(variableName);
        sb.append(", variableSource=").append(variableSource);
        sb.append(", variablePath=").append(variablePath);
        sb.append(", minValue=").append(minValue);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", setTime=").append(setTime);
        sb.append(", setUser=").append(setUser);
        sb.append(", setHost=").append(setHost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}