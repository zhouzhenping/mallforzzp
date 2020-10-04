package com.zzp.mall.model;

import java.io.Serializable;

public class SetupThreads implements Serializable {
    private String name;

    private String enabled;

    private String history;

    private String properties;

    private Integer volatility;

    private String documentation;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Integer getVolatility() {
        return volatility;
    }

    public void setVolatility(Integer volatility) {
        this.volatility = volatility;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", enabled=").append(enabled);
        sb.append(", history=").append(history);
        sb.append(", properties=").append(properties);
        sb.append(", volatility=").append(volatility);
        sb.append(", documentation=").append(documentation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}