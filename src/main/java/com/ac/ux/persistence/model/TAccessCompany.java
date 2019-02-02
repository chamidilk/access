package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_access_company", schema = "oneaccess", catalog = "")
public class TAccessCompany {
    private long companyId;
    private String companyName;
    private String companyAddress;
    private String companyPrimaryContact;
    private Integer version;
    private String accountPrefix;
    private Integer organizationId;
    private String depositType;
    private Long depositAmount;
    private Long allowableLimit;
    private Long balance;
    private Integer functionalDivisionId;
    private Integer locationId;
    private Integer isDeleted;
    private String queueName;
    private Integer parentId;

    @Id
    @Column(name = "company_id", nullable = false)
    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "company_name", nullable = true, length = 50)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "company_address", nullable = true, length = 300)
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "company_primary_contact", nullable = true, length = 50)
    public String getCompanyPrimaryContact() {
        return companyPrimaryContact;
    }

    public void setCompanyPrimaryContact(String companyPrimaryContact) {
        this.companyPrimaryContact = companyPrimaryContact;
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
    @Column(name = "account_prefix", nullable = true, length = 10)
    public String getAccountPrefix() {
        return accountPrefix;
    }

    public void setAccountPrefix(String accountPrefix) {
        this.accountPrefix = accountPrefix;
    }

    @Basic
    @Column(name = "organization_id", nullable = true)
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "deposit_type", nullable = true, length = 10)
    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    @Basic
    @Column(name = "deposit_amount", nullable = true)
    public Long getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    @Basic
    @Column(name = "allowable_limit", nullable = true)
    public Long getAllowableLimit() {
        return allowableLimit;
    }

    public void setAllowableLimit(Long allowableLimit) {
        this.allowableLimit = allowableLimit;
    }

    @Basic
    @Column(name = "balance", nullable = true)
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "functional_division_id", nullable = true)
    public Integer getFunctionalDivisionId() {
        return functionalDivisionId;
    }

    public void setFunctionalDivisionId(Integer functionalDivisionId) {
        this.functionalDivisionId = functionalDivisionId;
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
    @Column(name = "is_deleted", nullable = true)
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "queue_name", nullable = true, length = 45)
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccessCompany that = (TAccessCompany) o;
        return companyId == that.companyId &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(companyAddress, that.companyAddress) &&
                Objects.equals(companyPrimaryContact, that.companyPrimaryContact) &&
                Objects.equals(version, that.version) &&
                Objects.equals(accountPrefix, that.accountPrefix) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(depositType, that.depositType) &&
                Objects.equals(depositAmount, that.depositAmount) &&
                Objects.equals(allowableLimit, that.allowableLimit) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(functionalDivisionId, that.functionalDivisionId) &&
                Objects.equals(locationId, that.locationId) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(queueName, that.queueName) &&
                Objects.equals(parentId, that.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, companyName, companyAddress, companyPrimaryContact, version, accountPrefix, organizationId, depositType, depositAmount, allowableLimit, balance, functionalDivisionId, locationId, isDeleted, queueName, parentId);
    }
}
