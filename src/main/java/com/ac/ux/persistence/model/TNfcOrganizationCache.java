package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_nfc_organization_cache", schema = "oneaccess", catalog = "")
public class TNfcOrganizationCache {
    private int organizationId;
    private String organizationName;
    private String organizationAddress;
    private Integer version;
    private String contactNumber;
    private String corporateAccountNo;

    @Id
    @Column(name = "organization_id", nullable = false)
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "organization_name", nullable = true, length = 45)
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Basic
    @Column(name = "organization_address", nullable = true, length = 45)
    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
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
    @Column(name = "contact_number", nullable = true, length = 20)
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Basic
    @Column(name = "corporate_account_no", nullable = true, length = 20)
    public String getCorporateAccountNo() {
        return corporateAccountNo;
    }

    public void setCorporateAccountNo(String corporateAccountNo) {
        this.corporateAccountNo = corporateAccountNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TNfcOrganizationCache that = (TNfcOrganizationCache) o;
        return organizationId == that.organizationId &&
                Objects.equals(organizationName, that.organizationName) &&
                Objects.equals(organizationAddress, that.organizationAddress) &&
                Objects.equals(version, that.version) &&
                Objects.equals(contactNumber, that.contactNumber) &&
                Objects.equals(corporateAccountNo, that.corporateAccountNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, organizationName, organizationAddress, version, contactNumber, corporateAccountNo);
    }
}
