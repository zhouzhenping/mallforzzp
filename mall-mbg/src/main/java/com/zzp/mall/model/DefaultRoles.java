package com.zzp.mall.model;

import java.io.Serializable;

public class DefaultRoles implements Serializable {
    private String host;

    private String user;

    private String defaultRoleHost;

    private String defaultRoleUser;

    private static final long serialVersionUID = 1L;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDefaultRoleHost() {
        return defaultRoleHost;
    }

    public void setDefaultRoleHost(String defaultRoleHost) {
        this.defaultRoleHost = defaultRoleHost;
    }

    public String getDefaultRoleUser() {
        return defaultRoleUser;
    }

    public void setDefaultRoleUser(String defaultRoleUser) {
        this.defaultRoleUser = defaultRoleUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", defaultRoleHost=").append(defaultRoleHost);
        sb.append(", defaultRoleUser=").append(defaultRoleUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}