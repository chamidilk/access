package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_permission_batch", schema = "oneaccess", catalog = "")
public class TPermissionBatch {
    private int tPermissionBatch;
    private String fileLocation;
    private Integer companyId;
    private Integer addedBy;
    private Integer version;

    @Id
    @Column(name = "t_permission_batch", nullable = false)
    public int gettPermissionBatch() {
        return tPermissionBatch;
    }

    public void settPermissionBatch(int tPermissionBatch) {
        this.tPermissionBatch = tPermissionBatch;
    }

    @Basic
    @Column(name = "file_location", nullable = true, length = 150)
    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Basic
    @Column(name = "company_id", nullable = true)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "added_by", nullable = true)
    public Integer getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Integer addedBy) {
        this.addedBy = addedBy;
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
        TPermissionBatch that = (TPermissionBatch) o;
        return tPermissionBatch == that.tPermissionBatch &&
                Objects.equals(fileLocation, that.fileLocation) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(addedBy, that.addedBy) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tPermissionBatch, fileLocation, companyId, addedBy, version);
    }
}
