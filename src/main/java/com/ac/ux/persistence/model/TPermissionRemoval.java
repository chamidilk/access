package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_permission_removal", schema = "oneaccess", catalog = "")
public class TPermissionRemoval {
    private int permissionRemovalId;
    private int accessPermissionId;
    private int accessUserId;
    private String idm;
    private int removedbyUserId;
    private Timestamp dateTime;
    private Integer version;
    private String remarks;

    @Id
    @Column(name = "permission_removal_id", nullable = false)
    public int getPermissionRemovalId() {
        return permissionRemovalId;
    }

    public void setPermissionRemovalId(int permissionRemovalId) {
        this.permissionRemovalId = permissionRemovalId;
    }

    @Basic
    @Column(name = "access_permission_id", nullable = false)
    public int getAccessPermissionId() {
        return accessPermissionId;
    }

    public void setAccessPermissionId(int accessPermissionId) {
        this.accessPermissionId = accessPermissionId;
    }

    @Basic
    @Column(name = "access_user_id", nullable = false)
    public int getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(int accessUserId) {
        this.accessUserId = accessUserId;
    }

    @Basic
    @Column(name = "idm", nullable = false, length = 20)
    public String getIdm() {
        return idm;
    }

    public void setIdm(String idm) {
        this.idm = idm;
    }

    @Basic
    @Column(name = "removedby_user_id", nullable = false)
    public int getRemovedbyUserId() {
        return removedbyUserId;
    }

    public void setRemovedbyUserId(int removedbyUserId) {
        this.removedbyUserId = removedbyUserId;
    }

    @Basic
    @Column(name = "date_time", nullable = false)
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
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
    @Column(name = "remarks", nullable = true, length = 50)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TPermissionRemoval that = (TPermissionRemoval) o;
        return permissionRemovalId == that.permissionRemovalId &&
                accessPermissionId == that.accessPermissionId &&
                accessUserId == that.accessUserId &&
                removedbyUserId == that.removedbyUserId &&
                Objects.equals(idm, that.idm) &&
                Objects.equals(dateTime, that.dateTime) &&
                Objects.equals(version, that.version) &&
                Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionRemovalId, accessPermissionId, accessUserId, idm, removedbyUserId, dateTime, version, remarks);
    }
}
