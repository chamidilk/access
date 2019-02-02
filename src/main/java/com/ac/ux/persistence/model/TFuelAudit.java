package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_fuel_audit", schema = "oneaccess", catalog = "")
public class TFuelAudit {
    private long fuelAuditId;
    private Long fuelEmployeeId;
    private Long stationId;
    private Long fuelPriceId;
    private String audit;
    private String auditCode;
    private Long executedUserId;
    private Timestamp executedTimestamp;
    private int version;
    private Long companyId;
    private Long custId;
    private Integer fuelTransactionId;
    private Integer voidTransUpdateId;
    private Integer paymentHistoryId;
    private Integer companyDevisionId;
    private Integer locationId;
    private Integer locationDeviceId;
    private Integer accessProfileId;
    private Integer accessUserId;
    private Integer accessPermissionId;

    @Id
    @Column(name = "fuel_audit_id", nullable = false)
    public long getFuelAuditId() {
        return fuelAuditId;
    }

    public void setFuelAuditId(long fuelAuditId) {
        this.fuelAuditId = fuelAuditId;
    }

    @Basic
    @Column(name = "fuel_employee_id", nullable = true)
    public Long getFuelEmployeeId() {
        return fuelEmployeeId;
    }

    public void setFuelEmployeeId(Long fuelEmployeeId) {
        this.fuelEmployeeId = fuelEmployeeId;
    }

    @Basic
    @Column(name = "station_id", nullable = true)
    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    @Basic
    @Column(name = "fuel_price_id", nullable = true)
    public Long getFuelPriceId() {
        return fuelPriceId;
    }

    public void setFuelPriceId(Long fuelPriceId) {
        this.fuelPriceId = fuelPriceId;
    }

    @Basic
    @Column(name = "audit", nullable = true, length = -1)
    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    @Basic
    @Column(name = "audit_code", nullable = true, length = 20)
    public String getAuditCode() {
        return auditCode;
    }

    public void setAuditCode(String auditCode) {
        this.auditCode = auditCode;
    }

    @Basic
    @Column(name = "executed_user_id", nullable = true)
    public Long getExecutedUserId() {
        return executedUserId;
    }

    public void setExecutedUserId(Long executedUserId) {
        this.executedUserId = executedUserId;
    }

    @Basic
    @Column(name = "executed_timestamp", nullable = true)
    public Timestamp getExecutedTimestamp() {
        return executedTimestamp;
    }

    public void setExecutedTimestamp(Timestamp executedTimestamp) {
        this.executedTimestamp = executedTimestamp;
    }

    @Basic
    @Column(name = "version", nullable = false)
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "company_id", nullable = true)
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "cust_id", nullable = true)
    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "fuel_transaction_id", nullable = true)
    public Integer getFuelTransactionId() {
        return fuelTransactionId;
    }

    public void setFuelTransactionId(Integer fuelTransactionId) {
        this.fuelTransactionId = fuelTransactionId;
    }

    @Basic
    @Column(name = "void_trans_update_id", nullable = true)
    public Integer getVoidTransUpdateId() {
        return voidTransUpdateId;
    }

    public void setVoidTransUpdateId(Integer voidTransUpdateId) {
        this.voidTransUpdateId = voidTransUpdateId;
    }

    @Basic
    @Column(name = "payment_history_id", nullable = true)
    public Integer getPaymentHistoryId() {
        return paymentHistoryId;
    }

    public void setPaymentHistoryId(Integer paymentHistoryId) {
        this.paymentHistoryId = paymentHistoryId;
    }

    @Basic
    @Column(name = "company_devision_id", nullable = true)
    public Integer getCompanyDevisionId() {
        return companyDevisionId;
    }

    public void setCompanyDevisionId(Integer companyDevisionId) {
        this.companyDevisionId = companyDevisionId;
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
    @Column(name = "location_device_id", nullable = true)
    public Integer getLocationDeviceId() {
        return locationDeviceId;
    }

    public void setLocationDeviceId(Integer locationDeviceId) {
        this.locationDeviceId = locationDeviceId;
    }

    @Basic
    @Column(name = "access_profile_id", nullable = true)
    public Integer getAccessProfileId() {
        return accessProfileId;
    }

    public void setAccessProfileId(Integer accessProfileId) {
        this.accessProfileId = accessProfileId;
    }

    @Basic
    @Column(name = "access_user_id", nullable = true)
    public Integer getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(Integer accessUserId) {
        this.accessUserId = accessUserId;
    }

    @Basic
    @Column(name = "access_permission_id", nullable = true)
    public Integer getAccessPermissionId() {
        return accessPermissionId;
    }

    public void setAccessPermissionId(Integer accessPermissionId) {
        this.accessPermissionId = accessPermissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TFuelAudit that = (TFuelAudit) o;
        return fuelAuditId == that.fuelAuditId &&
                version == that.version &&
                Objects.equals(fuelEmployeeId, that.fuelEmployeeId) &&
                Objects.equals(stationId, that.stationId) &&
                Objects.equals(fuelPriceId, that.fuelPriceId) &&
                Objects.equals(audit, that.audit) &&
                Objects.equals(auditCode, that.auditCode) &&
                Objects.equals(executedUserId, that.executedUserId) &&
                Objects.equals(executedTimestamp, that.executedTimestamp) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(custId, that.custId) &&
                Objects.equals(fuelTransactionId, that.fuelTransactionId) &&
                Objects.equals(voidTransUpdateId, that.voidTransUpdateId) &&
                Objects.equals(paymentHistoryId, that.paymentHistoryId) &&
                Objects.equals(companyDevisionId, that.companyDevisionId) &&
                Objects.equals(locationId, that.locationId) &&
                Objects.equals(locationDeviceId, that.locationDeviceId) &&
                Objects.equals(accessProfileId, that.accessProfileId) &&
                Objects.equals(accessUserId, that.accessUserId) &&
                Objects.equals(accessPermissionId, that.accessPermissionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelAuditId, fuelEmployeeId, stationId, fuelPriceId, audit, auditCode, executedUserId, executedTimestamp, version, companyId, custId, fuelTransactionId, voidTransUpdateId, paymentHistoryId, companyDevisionId, locationId, locationDeviceId, accessProfileId, accessUserId, accessPermissionId);
    }
}
