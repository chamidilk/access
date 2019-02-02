package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location_device", schema = "oneaccess", catalog = "")
public class LocationDevice {
    private int locationDeviceId;
    private Integer deviceId;
    private int locationId;
    private Integer version;

    @Id
    @Column(name = "location_device_id", nullable = false)
    public int getLocationDeviceId() {
        return locationDeviceId;
    }

    public void setLocationDeviceId(int locationDeviceId) {
        this.locationDeviceId = locationDeviceId;
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
        LocationDevice that = (LocationDevice) o;
        return locationDeviceId == that.locationDeviceId &&
                locationId == that.locationId &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationDeviceId, deviceId, locationId, version);
    }
}
