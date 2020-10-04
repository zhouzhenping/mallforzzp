package com.zzp.mall.model;

import java.io.Serializable;

public class SlaveRelayLogInfo implements Serializable {
    private String channelName;

    private Integer numberOfLines;

    private Long relayLogPos;

    private Long masterLogPos;

    private Integer sqlDelay;

    private Integer numberOfWorkers;

    private Integer id;

    private String privilegeChecksUsername;

    private String privilegeChecksHostname;

    private Boolean requireRowFormat;

    private String requireTablePrimaryKeyCheck;

    private String relayLogName;

    private String masterLogName;

    private static final long serialVersionUID = 1L;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public Long getRelayLogPos() {
        return relayLogPos;
    }

    public void setRelayLogPos(Long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    public Long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    public Integer getSqlDelay() {
        return sqlDelay;
    }

    public void setSqlDelay(Integer sqlDelay) {
        this.sqlDelay = sqlDelay;
    }

    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrivilegeChecksUsername() {
        return privilegeChecksUsername;
    }

    public void setPrivilegeChecksUsername(String privilegeChecksUsername) {
        this.privilegeChecksUsername = privilegeChecksUsername;
    }

    public String getPrivilegeChecksHostname() {
        return privilegeChecksHostname;
    }

    public void setPrivilegeChecksHostname(String privilegeChecksHostname) {
        this.privilegeChecksHostname = privilegeChecksHostname;
    }

    public Boolean getRequireRowFormat() {
        return requireRowFormat;
    }

    public void setRequireRowFormat(Boolean requireRowFormat) {
        this.requireRowFormat = requireRowFormat;
    }

    public String getRequireTablePrimaryKeyCheck() {
        return requireTablePrimaryKeyCheck;
    }

    public void setRequireTablePrimaryKeyCheck(String requireTablePrimaryKeyCheck) {
        this.requireTablePrimaryKeyCheck = requireTablePrimaryKeyCheck;
    }

    public String getRelayLogName() {
        return relayLogName;
    }

    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName;
    }

    public String getMasterLogName() {
        return masterLogName;
    }

    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", numberOfLines=").append(numberOfLines);
        sb.append(", relayLogPos=").append(relayLogPos);
        sb.append(", masterLogPos=").append(masterLogPos);
        sb.append(", sqlDelay=").append(sqlDelay);
        sb.append(", numberOfWorkers=").append(numberOfWorkers);
        sb.append(", id=").append(id);
        sb.append(", privilegeChecksUsername=").append(privilegeChecksUsername);
        sb.append(", privilegeChecksHostname=").append(privilegeChecksHostname);
        sb.append(", requireRowFormat=").append(requireRowFormat);
        sb.append(", requireTablePrimaryKeyCheck=").append(requireTablePrimaryKeyCheck);
        sb.append(", relayLogName=").append(relayLogName);
        sb.append(", masterLogName=").append(masterLogName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}