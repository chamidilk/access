package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_access_permission_status", schema = "oneaccess", catalog = "")
public class TAccessPermissionStatus {
    private int permissionStatusId;
    private Integer accessPermissionId;
    private Integer accessUserId;
    private Integer deviceId;
    private Object isSynced;
    private Integer index;

    @Id
    @Column(name = "permission_status_id", nullable = false)
    public int getPermissionStatusId() {
        return permissionStatusId;
    }

    public void setPermissionStatusId(int permissionStatusId) {
        this.permissionStatusId = permissionStatusId;
    }

    @Basic
    @Column(name = "access_permission_id", nullable = true)
    public Integer getAccessPermissionId() {
        return accessPermissionId;
    }

    public void setAccessPermissionId(Integer accessPermissionId) {
        this.accessPermissionId = accessPermissionId;
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
    @Column(name = "device_id", nullable = true)
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "is_synced", nullable = true)
    public Object getIsSynced() {
        return isSynced;
    }

    public void setIsSynced(Object isSynced) {
        this.isSynced = isSynced;
    }

    @Basic
    @Column(name = "index", nullable = true)
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccessPermissionStatus that = (TAccessPermissionStatus) o;
        return permissionStatusId == that.permissionStatusId &&
                Objects.equals(accessPermissionId, that.accessPermissionId) &&
                Objects.equals(accessUserId, that.accessUserId) &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(isSynced, that.isSynced) &&
                Objects.equals(index, that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionStatusId, accessPermissionId, accessUserId, deviceId, isSynced, index);
    }
}
