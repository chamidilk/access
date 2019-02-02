package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "profile_location_map", schema = "oneaccess", catalog = "")
public class ProfileLocationMap {
    private int profileLocationMapId;
    private int locationAccessProfileId;
    private int locationId;
    private Integer version;

    @Id
    @Column(name = "profile_location_map_id", nullable = false)
    public int getProfileLocationMapId() {
        return profileLocationMapId;
    }

    public void setProfileLocationMapId(int profileLocationMapId) {
        this.profileLocationMapId = profileLocationMapId;
    }

    @Basic
    @Column(name = "location_access_profile_id", nullable = false)
    public int getLocationAccessProfileId() {
        return locationAccessProfileId;
    }

    public void setLocationAccessProfileId(int locationAccessProfileId) {
        this.locationAccessProfileId = locationAccessProfileId;
    }

    @Basic
    @Column(name = "location_id", nullable = false)
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
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
        ProfileLocationMap that = (ProfileLocationMap) o;
        return profileLocationMapId == that.profileLocationMapId &&
                locationAccessProfileId == that.locationAccessProfileId &&
                locationId == that.locationId &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileLocationMapId, locationAccessProfileId, locationId, version);
    }
}
