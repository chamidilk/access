package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "access_log", schema = "oneaccess", catalog = "")
public class AccessLog {
    private int accessLogId;
    private Integer deviceId;
    private Integer visitorId;
    private String deviceSerialNumber;
    private Integer companyId;
    private String accessUserId;
    private String divisionName;
    private Integer userId;
    private String cardNumber;
    private Object inOutStatus;
    private Timestamp deviceTimeStamp;
    private String deviceSequenceNumber;
    private Timestamp appTimeStamp;
    private Integer version;
    private String imgUrl;

    @Id
    @Column(name = "access_log_id", nullable = false)
    public int getAccessLogId() {
        return accessLogId;
    }

    public void setAccessLogId(int accessLogId) {
        this.accessLogId = accessLogId;
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
    @Column(name = "visitor_id", nullable = true)
    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    @Basic
    @Column(name = "device_serial_number", nullable = true, length = 45)
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
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
    @Column(name = "access_user_id", nullable = true, length = 45)
    public String getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(String accessUserId) {
        this.accessUserId = accessUserId;
    }

    @Basic
    @Column(name = "division_name", nullable = true, length = 45)
    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "card_number", nullable = true, length = 45)
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "in_out_status", nullable = true)
    public Object getInOutStatus() {
        return inOutStatus;
    }

    public void setInOutStatus(Object inOutStatus) {
        this.inOutStatus = inOutStatus;
    }

    @Basic
    @Column(name = "device_time_stamp", nullable = true)
    public Timestamp getDeviceTimeStamp() {
        return deviceTimeStamp;
    }

    public void setDeviceTimeStamp(Timestamp deviceTimeStamp) {
        this.deviceTimeStamp = deviceTimeStamp;
    }

    @Basic
    @Column(name = "device_sequence_number", nullable = true, length = 45)
    public String getDeviceSequenceNumber() {
        return deviceSequenceNumber;
    }

    public void setDeviceSequenceNumber(String deviceSequenceNumber) {
        this.deviceSequenceNumber = deviceSequenceNumber;
    }

    @Basic
    @Column(name = "app_time_stamp", nullable = true)
    public Timestamp getAppTimeStamp() {
        return appTimeStamp;
    }

    public void setAppTimeStamp(Timestamp appTimeStamp) {
        this.appTimeStamp = appTimeStamp;
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
    @Column(name = "img_url", nullable = true, length = 200)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessLog accessLog = (AccessLog) o;
        return accessLogId == accessLog.accessLogId &&
                Objects.equals(deviceId, accessLog.deviceId) &&
                Objects.equals(visitorId, accessLog.visitorId) &&
                Objects.equals(deviceSerialNumber, accessLog.deviceSerialNumber) &&
                Objects.equals(companyId, accessLog.companyId) &&
                Objects.equals(accessUserId, accessLog.accessUserId) &&
                Objects.equals(divisionName, accessLog.divisionName) &&
                Objects.equals(userId, accessLog.userId) &&
                Objects.equals(cardNumber, accessLog.cardNumber) &&
                Objects.equals(inOutStatus, accessLog.inOutStatus) &&
                Objects.equals(deviceTimeStamp, accessLog.deviceTimeStamp) &&
                Objects.equals(deviceSequenceNumber, accessLog.deviceSequenceNumber) &&
                Objects.equals(appTimeStamp, accessLog.appTimeStamp) &&
                Objects.equals(version, accessLog.version) &&
                Objects.equals(imgUrl, accessLog.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessLogId, deviceId, visitorId, deviceSerialNumber, companyId, accessUserId, divisionName, userId, cardNumber, inOutStatus, deviceTimeStamp, deviceSequenceNumber, appTimeStamp, version, imgUrl);
    }
}
