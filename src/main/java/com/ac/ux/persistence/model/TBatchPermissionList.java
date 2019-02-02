package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_batch_permission_list", schema = "oneaccess", catalog = "")
public class TBatchPermissionList {
    private int batchPermissionId;
    private Integer accessPermissionId;
    private Integer version;
    private Integer permissionBatchId;

    @Id
    @Column(name = "batch_permission_id", nullable = false)
    public int getBatchPermissionId() {
        return batchPermissionId;
    }

    public void setBatchPermissionId(int batchPermissionId) {
        this.batchPermissionId = batchPermissionId;
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
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "permission_batch_id", nullable = true)
    public Integer getPermissionBatchId() {
        return permissionBatchId;
    }

    public void setPermissionBatchId(Integer permissionBatchId) {
        this.permissionBatchId = permissionBatchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TBatchPermissionList that = (TBatchPermissionList) o;
        return batchPermissionId == that.batchPermissionId &&
                Objects.equals(accessPermissionId, that.accessPermissionId) &&
                Objects.equals(version, that.version) &&
                Objects.equals(permissionBatchId, that.permissionBatchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchPermissionId, accessPermissionId, version, permissionBatchId);
    }
}
