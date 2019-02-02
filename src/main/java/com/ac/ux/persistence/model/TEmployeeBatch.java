package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_employee_batch", schema = "oneaccess", catalog = "")
public class TEmployeeBatch {
    private int employeeBatchId;
    private String cardCategory;
    private Integer companyId;
    private Integer divisionId;
    private Integer uploadedByUserId;
    private Integer version;
    private String url;
    private Timestamp uploadedDatetime;
    private Integer functionalDivisionId;

    @Id
    @Column(name = "employee_batch_id", nullable = false)
    public int getEmployeeBatchId() {
        return employeeBatchId;
    }

    public void setEmployeeBatchId(int employeeBatchId) {
        this.employeeBatchId = employeeBatchId;
    }

    @Basic
    @Column(name = "card_category", nullable = true, length = 40)
    public String getCardCategory() {
        return cardCategory;
    }

    public void setCardCategory(String cardCategory) {
        this.cardCategory = cardCategory;
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
    @Column(name = "division_id", nullable = true)
    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    @Basic
    @Column(name = "uploaded_by_user_id", nullable = true)
    public Integer getUploadedByUserId() {
        return uploadedByUserId;
    }

    public void setUploadedByUserId(Integer uploadedByUserId) {
        this.uploadedByUserId = uploadedByUserId;
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
    @Column(name = "url", nullable = true, length = 200)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "uploaded_datetime", nullable = true)
    public Timestamp getUploadedDatetime() {
        return uploadedDatetime;
    }

    public void setUploadedDatetime(Timestamp uploadedDatetime) {
        this.uploadedDatetime = uploadedDatetime;
    }

    @Basic
    @Column(name = "functional_division_id", nullable = true)
    public Integer getFunctionalDivisionId() {
        return functionalDivisionId;
    }

    public void setFunctionalDivisionId(Integer functionalDivisionId) {
        this.functionalDivisionId = functionalDivisionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TEmployeeBatch that = (TEmployeeBatch) o;
        return employeeBatchId == that.employeeBatchId &&
                Objects.equals(cardCategory, that.cardCategory) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(divisionId, that.divisionId) &&
                Objects.equals(uploadedByUserId, that.uploadedByUserId) &&
                Objects.equals(version, that.version) &&
                Objects.equals(url, that.url) &&
                Objects.equals(uploadedDatetime, that.uploadedDatetime) &&
                Objects.equals(functionalDivisionId, that.functionalDivisionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeBatchId, cardCategory, companyId, divisionId, uploadedByUserId, version, url, uploadedDatetime, functionalDivisionId);
    }
}
