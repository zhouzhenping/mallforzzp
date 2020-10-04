package com.zzp.mall.model;

import java.io.Serializable;

public class ReplicationGroupMemberStats implements Serializable {
    private String channelName;

    private String viewId;

    private String memberId;

    private Long countTransactionsInQueue;

    private Long countTransactionsChecked;

    private Long countConflictsDetected;

    private Long countTransactionsRowsValidating;

    private Long countTransactionsRemoteInApplierQueue;

    private Long countTransactionsRemoteApplied;

    private Long countTransactionsLocalProposed;

    private Long countTransactionsLocalRollback;

    private String transactionsCommittedAllMembers;

    private String lastConflictFreeTransaction;

    private static final long serialVersionUID = 1L;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Long getCountTransactionsInQueue() {
        return countTransactionsInQueue;
    }

    public void setCountTransactionsInQueue(Long countTransactionsInQueue) {
        this.countTransactionsInQueue = countTransactionsInQueue;
    }

    public Long getCountTransactionsChecked() {
        return countTransactionsChecked;
    }

    public void setCountTransactionsChecked(Long countTransactionsChecked) {
        this.countTransactionsChecked = countTransactionsChecked;
    }

    public Long getCountConflictsDetected() {
        return countConflictsDetected;
    }

    public void setCountConflictsDetected(Long countConflictsDetected) {
        this.countConflictsDetected = countConflictsDetected;
    }

    public Long getCountTransactionsRowsValidating() {
        return countTransactionsRowsValidating;
    }

    public void setCountTransactionsRowsValidating(Long countTransactionsRowsValidating) {
        this.countTransactionsRowsValidating = countTransactionsRowsValidating;
    }

    public Long getCountTransactionsRemoteInApplierQueue() {
        return countTransactionsRemoteInApplierQueue;
    }

    public void setCountTransactionsRemoteInApplierQueue(Long countTransactionsRemoteInApplierQueue) {
        this.countTransactionsRemoteInApplierQueue = countTransactionsRemoteInApplierQueue;
    }

    public Long getCountTransactionsRemoteApplied() {
        return countTransactionsRemoteApplied;
    }

    public void setCountTransactionsRemoteApplied(Long countTransactionsRemoteApplied) {
        this.countTransactionsRemoteApplied = countTransactionsRemoteApplied;
    }

    public Long getCountTransactionsLocalProposed() {
        return countTransactionsLocalProposed;
    }

    public void setCountTransactionsLocalProposed(Long countTransactionsLocalProposed) {
        this.countTransactionsLocalProposed = countTransactionsLocalProposed;
    }

    public Long getCountTransactionsLocalRollback() {
        return countTransactionsLocalRollback;
    }

    public void setCountTransactionsLocalRollback(Long countTransactionsLocalRollback) {
        this.countTransactionsLocalRollback = countTransactionsLocalRollback;
    }

    public String getTransactionsCommittedAllMembers() {
        return transactionsCommittedAllMembers;
    }

    public void setTransactionsCommittedAllMembers(String transactionsCommittedAllMembers) {
        this.transactionsCommittedAllMembers = transactionsCommittedAllMembers;
    }

    public String getLastConflictFreeTransaction() {
        return lastConflictFreeTransaction;
    }

    public void setLastConflictFreeTransaction(String lastConflictFreeTransaction) {
        this.lastConflictFreeTransaction = lastConflictFreeTransaction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", viewId=").append(viewId);
        sb.append(", memberId=").append(memberId);
        sb.append(", countTransactionsInQueue=").append(countTransactionsInQueue);
        sb.append(", countTransactionsChecked=").append(countTransactionsChecked);
        sb.append(", countConflictsDetected=").append(countConflictsDetected);
        sb.append(", countTransactionsRowsValidating=").append(countTransactionsRowsValidating);
        sb.append(", countTransactionsRemoteInApplierQueue=").append(countTransactionsRemoteInApplierQueue);
        sb.append(", countTransactionsRemoteApplied=").append(countTransactionsRemoteApplied);
        sb.append(", countTransactionsLocalProposed=").append(countTransactionsLocalProposed);
        sb.append(", countTransactionsLocalRollback=").append(countTransactionsLocalRollback);
        sb.append(", transactionsCommittedAllMembers=").append(transactionsCommittedAllMembers);
        sb.append(", lastConflictFreeTransaction=").append(lastConflictFreeTransaction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}