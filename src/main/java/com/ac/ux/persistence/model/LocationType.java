package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location_type", schema = "oneaccess", catalog = "")
public class LocationType {
    private int locationTypeId;
    private String locationType;
    private Integer version;

    @Id
    @Column(name = "location_type_id", nullable = false)
    public int getLocationTypeId() {
        return locationTypeId;
    }

    public void setLocationTypeId(int locationTypeId) {
        this.locationTypeId = locationTypeId;
    }

    @Basic
    @Column(name = "location_type", nullable = true, length = 45)
    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
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
        LocationType that = (LocationType) o;
        return locationTypeId == that.locationTypeId &&
                Objects.equals(locationType, that.locationType) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationTypeId, locationType, version);
    }
}
