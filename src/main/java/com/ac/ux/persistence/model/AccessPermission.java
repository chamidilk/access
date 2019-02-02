package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "access_permission", schema = "oneaccess", catalog = "")
public class AccessPermission {
    private int accessPermissionId;
    private Integer recurrentPatternId;
    private Timestamp activeFrom;
    private String specialNotes;
    private Integer version;
    private Long issuerCardId;
    private Long cardId;
    private Long deviceId;
    private Byte status;
    private Timestamp expiryDate;
    private Timestamp deviceTimestamp;
    private String deviceSequenceNo;
    private Integer noOfEntries;
    private Integer accessProfileId;
    private Integer accessUserId;
    private String isSynced;

    @Id
    @Column(name = "access_permission_id", nullable = false)
    public int getAccessPermissionId() {
        return accessPermissionId;
    }

    public void setAccessPermissionId(int accessPermissionId) {
        this.accessPermissionId = accessPermissionId;
    }

    @Basic
    @Column(name = "recurrent_pattern_id", nullable = true)
    public Integer getRecurrentPatternId() {
        return recurrentPatternId;
    }

    public void setRecurrentPatternId(Integer recurrentPatternId) {
        this.recurrentPatternId = recurrentPatternId;
    }

    @Basic
    @Column(name = "active_from", nullable = true)
    public Timestamp getActiveFrom() {
        return activeFrom;
    }

    public void setActiveFrom(Timestamp activeFrom) {
        this.activeFrom = activeFrom;
    }

    @Basic
    @Column(name = "special_notes", nullable = true, length = 100)
    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    @Basic
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "issuer_card_id", nullable = true)
    public Long getIssuerCardId() {
        return issuerCardId;
    }

    public void setIssuerCardId(Long issuerCardId) {
        this.issuerCardId = issuerCardId;
    }

    @Basic
    @Column(name = "card_id", nullable = true)
    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "device_id", nullable = true)
    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "expiry_date", nullable = true)
    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Basic
    @Column(name = "device_timestamp", nullable = true)
    public Timestamp getDeviceTimestamp() {
        return deviceTimestamp;
    }

    public void setDeviceTimestamp(Timestamp deviceTimestamp) {
        this.deviceTimestamp = deviceTimestamp;
    }

    @Basic
    @Column(name = "device_sequence_no", nullable = true, length = 20)
    public String getDeviceSequenceNo() {
        return deviceSequenceNo;
    }

    public void setDeviceSequenceNo(String deviceSequenceNo) {
        this.deviceSequenceNo = deviceSequenceNo;
    }

    @Basic
    @Column(name = "no_of_entries", nullable = true)
    public Integer getNoOfEntries() {
        return noOfEntries;
    }

    public void setNoOfEntries(Integer noOfEntries) {
        this.noOfEntries = noOfEntries;
    }

    @Basic
    @Column(name = "access_profile_id", nullable = true)
    public Integer getAccessProfileId() {
        return accessProfileId;
    }

    public void setAccessProfileId(Integer accessProfileId) {
        this.accessProfileId = accessProfileId;
    }

    @Basic
    @Column(name = "access_user_id", nullable = true)
    public Integer getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(Integer accessUserId) {
        this.accessUserId = accessUserId;
    }

    @Basic
    @Column(name = "is_synced", nullable = true, length = 1)
    public String getIsSynced() {
        return isSynced;
    }

    public void setIsSynced(String isSynced) {
        this.isSynced = isSynced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessPermission that = (AccessPermission) o;
        return accessPermissionId == that.accessPermissionId &&
                Objects.equals(recurrentPatternId, that.recurrentPatternId) &&
                Objects.equals(activeFrom, that.activeFrom) &&
                Objects.equals(specialNotes, that.specialNotes) &&
                Objects.equals(version, that.version) &&
                Objects.equals(issuerCardId, that.issuerCardId) &&
                Objects.equals(cardId, that.cardId) &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(expiryDate, that.expiryDate) &&
                Objects.equals(deviceTimestamp, that.deviceTimestamp) &&
                Objects.equals(deviceSequenceNo, that.deviceSequenceNo) &&
                Objects.equals(noOfEntries, that.noOfEntries) &&
                Objects.equals(accessProfileId, that.accessProfileId) &&
                Objects.equals(accessUserId, that.accessUserId) &&
                Objects.equals(isSynced, that.isSynced);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPermissionId, recurrentPatternId, activeFrom, specialNotes, version, issuerCardId, cardId, deviceId, status, expiryDate, deviceTimestamp, deviceSequenceNo, noOfEntries, accessProfileId, accessUserId, isSynced);
    }
}
