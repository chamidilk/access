package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_access_permission_device", schema = "oneaccess", catalog = "")
public class TAccessPermissionDevice {
    private int accessPermissionDeviceId;
    private Integer accessPermissionId;
    private Integer deviceId;
    private String isSynced;
    private Integer version;

    @Id
    @Column(name = "access_permission_device_id", nullable = false)
    public int getAccessPermissionDeviceId() {
        return accessPermissionDeviceId;
    }

    public void setAccessPermissionDeviceId(int accessPermissionDeviceId) {
        this.accessPermissionDeviceId = accessPermissionDeviceId;
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
    @Column(name = "device_id", nullable = true)
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
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
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccessPermissionDevice that = (TAccessPermissionDevice) o;
        return accessPermissionDeviceId == that.accessPermissionDeviceId &&
                Objects.equals(accessPermissionId, that.accessPermissionId) &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(isSynced, that.isSynced) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPermissionDeviceId, accessPermissionId, deviceId, isSynced, version);
    }
}
