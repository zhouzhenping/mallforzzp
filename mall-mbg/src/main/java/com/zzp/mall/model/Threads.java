package com.zzp.mall.model;

import java.io.Serializable;

public class Threads implements Serializable {
    private Long threadId;

    private String name;

    private String type;

    private Long processlistId;

    private String processlistUser;

    private String processlistHost;

    private String processlistDb;

    private String processlistCommand;

    private Long processlistTime;

    private String processlistState;

    private Long parentThreadId;

    private String role;

    private String instrumented;

    private String history;

    private String connectionType;

    private Long threadOsId;

    private String resourceGroup;

    private String processlistInfo;

    private static final long serialVersionUID = 1L;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getProcesslistId() {
        return processlistId;
    }

    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    public String getProcesslistUser() {
        return processlistUser;
    }

    public void setProcesslistUser(String processlistUser) {
        this.processlistUser = processlistUser;
    }

    public String getProcesslistHost() {
        return processlistHost;
    }

    public void setProcesslistHost(String processlistHost) {
        this.processlistHost = processlistHost;
    }

    public String getProcesslistDb() {
        return processlistDb;
    }

    public void setProcesslistDb(String processlistDb) {
        this.processlistDb = processlistDb;
    }

    public String getProcesslistCommand() {
        return processlistCommand;
    }

    public void setProcesslistCommand(String processlistCommand) {
        this.processlistCommand = processlistCommand;
    }

    public Long getProcesslistTime() {
        return processlistTime;
    }

    public void setProcesslistTime(Long processlistTime) {
        this.processlistTime = processlistTime;
    }

    public String getProcesslistState() {
        return processlistState;
    }

    public void setProcesslistState(String processlistState) {
        this.processlistState = processlistState;
    }

    public Long getParentThreadId() {
        return parentThreadId;
    }

    public void setParentThreadId(Long parentThreadId) {
        this.parentThreadId = parentThreadId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getInstrumented() {
        return instrumented;
    }

    public void setInstrumented(String instrumented) {
        this.instrumented = instrumented;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public Long getThreadOsId() {
        return threadOsId;
    }

    public void setThreadOsId(Long threadOsId) {
        this.threadOsId = threadOsId;
    }

    public String getResourceGroup() {
        return resourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public String getProcesslistInfo() {
        return processlistInfo;
    }

    public void setProcesslistInfo(String processlistInfo) {
        this.processlistInfo = processlistInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", threadId=").append(threadId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", processlistId=").append(processlistId);
        sb.append(", processlistUser=").append(processlistUser);
        sb.append(", processlistHost=").append(processlistHost);
        sb.append(", processlistDb=").append(processlistDb);
        sb.append(", processlistCommand=").append(processlistCommand);
        sb.append(", processlistTime=").append(processlistTime);
        sb.append(", processlistState=").append(processlistState);
        sb.append(", parentThreadId=").append(parentThreadId);
        sb.append(", role=").append(role);
        sb.append(", instrumented=").append(instrumented);
        sb.append(", history=").append(history);
        sb.append(", connectionType=").append(connectionType);
        sb.append(", threadOsId=").append(threadOsId);
        sb.append(", resourceGroup=").append(resourceGroup);
        sb.append(", processlistInfo=").append(processlistInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}