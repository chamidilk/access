package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_access_permission", schema = "oneaccess", catalog = "")
public class TAccessPermission {
    private int accessPermissionId;
    private Timestamp activeFrom;
    private Timestamp expiryDate;
    private Integer recurrentPatternId;
    private Integer accessUserId;
    private String cardNumber;
    private Integer locationAccessProfileId;
    private Long issuerByUserId;
    private Timestamp dateTime;
    private Integer status;
    private String specialNotes;
    private Integer version;
    private String isSynced;
    private String permissionStatus;

    @Id
    @Column(name = "access_permission_id", nullable = false)
    public int getAccessPermissionId() {
        return accessPermissionId;
    }

    public void setAccessPermissionId(int accessPermissionId) {
        this.accessPermissionId = accessPermissionId;
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
    @Column(name = "expiry_date", nullable = true)
    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
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
    @Column(name = "access_user_id", nullable = true)
    public Integer getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(Integer accessUserId) {
        this.accessUserId = accessUserId;
    }

    @Basic
    @Column(name = "card_number", nullable = true, length = 45)
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "location_access_profile_id", nullable = true)
    public Integer getLocationAccessProfileId() {
        return locationAccessProfileId;
    }

    public void setLocationAccessProfileId(Integer locationAccessProfileId) {
        this.locationAccessProfileId = locationAccessProfileId;
    }

    @Basic
    @Column(name = "issuer_by_user_id", nullable = true)
    public Long getIssuerByUserId() {
        return issuerByUserId;
    }

    public void setIssuerByUserId(Long issuerByUserId) {
        this.issuerByUserId = issuerByUserId;
    }

    @Basic
    @Column(name = "date_time", nullable = true)
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    @Column(name = "is_synced", nullable = true, length = 1)
    public String getIsSynced() {
        return isSynced;
    }

    public void setIsSynced(String isSynced) {
        this.isSynced = isSynced;
    }

    @Basic
    @Column(name = "permission_status", nullable = true, length = 25)
    public String getPermissionStatus() {
        return permissionStatus;
    }

    public void setPermissionStatus(String permissionStatus) {
        this.permissionStatus = permissionStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccessPermission that = (TAccessPermission) o;
        return accessPermissionId == that.accessPermissionId &&
                Objects.equals(activeFrom, that.activeFrom) &&
                Objects.equals(expiryDate, that.expiryDate) &&
                Objects.equals(recurrentPatternId, that.recurrentPatternId) &&
                Objects.equals(accessUserId, that.accessUserId) &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(locationAccessProfileId, that.locationAccessProfileId) &&
                Objects.equals(issuerByUserId, that.issuerByUserId) &&
                Objects.equals(dateTime, that.dateTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(specialNotes, that.specialNotes) &&
                Objects.equals(version, that.version) &&
                Objects.equals(isSynced, that.isSynced) &&
                Objects.equals(permissionStatus, that.permissionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPermissionId, activeFrom, expiryDate, recurrentPatternId, accessUserId, cardNumber, locationAccessProfileId, issuerByUserId, dateTime, status, specialNotes, version, isSynced, permissionStatus);
    }
}
