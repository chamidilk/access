package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_fuel_station", schema = "oneaccess", catalog = "")
public class TFuelStation {
    private long stationId;
    private long merchantId;
    private String stationName;
    private String address;
    private String contact;
    private String contactNumber1;
    private String contactNumber2;
    private String status;
    private int version;
    private String accountNo;
    private long userId;
    private Double longitude;
    private Double latitude;
    private Integer coporateDepositAmountX100;
    private String depositType;
    private String accountPrefix;

    @Id
    @Column(name = "station_id", nullable = false)
    public long getStationId() {
        return stationId;
    }

    public void setStationId(long stationId) {
        this.stationId = stationId;
    }

    @Basic
    @Column(name = "merchant_id", nullable = false)
    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    @Basic
    @Column(name = "station_name", nullable = true, length = 50)
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 300)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "contact", nullable = true, length = 50)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "contact_number_1", nullable = true, length = 50)
    public String getContactNumber1() {
        return contactNumber1;
    }

    public void setContactNumber1(String contactNumber1) {
        this.contactNumber1 = contactNumber1;
    }

    @Basic
    @Column(name = "contact_number_2", nullable = true, length = 50)
    public String getContactNumber2() {
        return contactNumber2;
    }

    public void setContactNumber2(String contactNumber2) {
        this.contactNumber2 = contactNumber2;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 3)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "account_no", nullable = true, length = 10)
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "longitude", nullable = true, precision = 0)
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude", nullable = true, precision = 0)
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "coporate_deposit_amount_x100", nullable = true)
    public Integer getCoporateDepositAmountX100() {
        return coporateDepositAmountX100;
    }

    public void setCoporateDepositAmountX100(Integer coporateDepositAmountX100) {
        this.coporateDepositAmountX100 = coporateDepositAmountX100;
    }

    @Basic
    @Column(name = "deposit_type", nullable = true, length = 5)
    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    @Basic
    @Column(name = "account_prefix", nullable = true, length = 45)
    public String getAccountPrefix() {
        return accountPrefix;
    }

    public void setAccountPrefix(String accountPrefix) {
        this.accountPrefix = accountPrefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TFuelStation that = (TFuelStation) o;
        return stationId == that.stationId &&
                merchantId == that.merchantId &&
                version == that.version &&
                userId == that.userId &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(address, that.address) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(contactNumber1, that.contactNumber1) &&
                Objects.equals(contactNumber2, that.contactNumber2) &&
                Objects.equals(status, that.status) &&
                Objects.equals(accountNo, that.accountNo) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(coporateDepositAmountX100, that.coporateDepositAmountX100) &&
                Objects.equals(depositType, that.depositType) &&
                Objects.equals(accountPrefix, that.accountPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationId, merchantId, stationName, address, contact, contactNumber1, contactNumber2, status, version, accountNo, userId, longitude, latitude, coporateDepositAmountX100, depositType, accountPrefix);
    }
}
