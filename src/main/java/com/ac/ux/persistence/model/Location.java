package com.ac.ux.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Location {
    private int locationId;
    private Integer locationTypeId;
    private String locationName;
    private Integer parentLocationId;
    private String longitude;
    private String latitude;
    private String address;
    private String locationDesc;
    private Integer version;
    private Timestamp addedDate;
    private Integer organizationId;

    @Id
    @Column(name = "location_id", nullable = false)
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "location_type_id", nullable = true)
    public Integer getLocationTypeId() {
        return locationTypeId;
    }

    public void setLocationTypeId(Integer locationTypeId) {
        this.locationTypeId = locationTypeId;
    }

    @Basic
    @Column(name = "location_name", nullable = true, length = 45)
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Basic
    @Column(name = "parent_location_id", nullable = true)
    public Integer getParentLocationId() {
        return parentLocationId;
    }

    public void setParentLocationId(Integer parentLocationId) {
        this.parentLocationId = parentLocationId;
    }

    @Basic
    @Column(name = "longitude", nullable = true, length = 15)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude", nullable = true, length = 15)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "location_desc", nullable = true, length = 100)
    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
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
    @Column(name = "added_date", nullable = true)
    public Timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
    }

    @Basic
    @Column(name = "organization_id", nullable = true)
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationId == location.locationId &&
                Objects.equals(locationTypeId, location.locationTypeId) &&
                Objects.equals(locationName, location.locationName) &&
                Objects.equals(parentLocationId, location.parentLocationId) &&
                Objects.equals(longitude, location.longitude) &&
                Objects.equals(latitude, location.latitude) &&
                Objects.equals(address, location.address) &&
                Objects.equals(locationDesc, location.locationDesc) &&
                Objects.equals(version, location.version) &&
                Objects.equals(addedDate, location.addedDate) &&
                Objects.equals(organizationId, location.organizationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locationTypeId, locationName, parentLocationId, longitude, latitude, address, locationDesc, version, addedDate, organizationId);
    }
}
