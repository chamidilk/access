package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "access_device", schema = "oneaccess", catalog = "")
public class AccessDevice {
    private int accessDeviceId;
    private Integer deviceId;
    private String deviceName;
    private String deviceStatus;
    private String ip;
    private Integer port;
    private String serialNo;
    private Object deviceType;
    private Timestamp dateTime;
    private Integer version;
    private String isDeleted;
    private Integer companyId;

    @Id
    @Column(name = "access_device_id", nullable = false)
    public int getAccessDeviceId() {
        return accessDeviceId;
    }

    public void setAccessDeviceId(int accessDeviceId) {
        this.accessDeviceId = accessDeviceId;
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
    @Column(name = "device_name", nullable = true, length = 40)
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Basic
    @Column(name = "device_status", nullable = true, length = 10)
    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    @Basic
    @Column(name = "ip", nullable = true, length = 16)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "port", nullable = true)
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Basic
    @Column(name = "serial_no", nullable = true, length = 20)
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    @Basic
    @Column(name = "device_type", nullable = true)
    public Object getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Object deviceType) {
        this.deviceType = deviceType;
    }

    @Basic
    @Column(name = "date_time", nullable = true)
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
    @Column(name = "is_deleted", nullable = true, length = 1)
    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "company_id", nullable = true)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessDevice that = (AccessDevice) o;
        return accessDeviceId == that.accessDeviceId &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(deviceName, that.deviceName) &&
                Objects.equals(deviceStatus, that.deviceStatus) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(port, that.port) &&
                Objects.equals(serialNo, that.serialNo) &&
                Objects.equals(deviceType, that.deviceType) &&
                Objects.equals(dateTime, that.dateTime) &&
                Objects.equals(version, that.version) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(companyId, that.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessDeviceId, deviceId, deviceName, deviceStatus, ip, port, serialNo, deviceType, dateTime, version, isDeleted, companyId);
    }
}
