package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location_admin", schema = "oneaccess", catalog = "")
public class LocationAdmin {
    private int locationAdminId;
    private Integer locationId;
    private Integer adminUserId;
    private Integer version;

    @Id
    @Column(name = "location_admin_id", nullable = false)
    public int getLocationAdminId() {
        return locationAdminId;
    }

    public void setLocationAdminId(int locationAdminId) {
        this.locationAdminId = locationAdminId;
    }

    @Basic
    @Column(name = "location_id", nullable = true)
    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "admin_user_id", nullable = true)
    public Integer getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
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
        LocationAdmin that = (LocationAdmin) o;
        return locationAdminId == that.locationAdminId &&
                Objects.equals(locationId, that.locationId) &&
                Objects.equals(adminUserId, that.adminUserId) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationAdminId, locationId, adminUserId, version);
    }
}
