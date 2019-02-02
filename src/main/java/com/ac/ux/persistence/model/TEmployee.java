package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "t_employee", schema = "oneaccess", catalog = "")
public class TEmployee {
    private int employeeId;
    private int accessUserId;
    private String employeeNo;
    private Integer functionalDivisionLevelNumber;
    private Integer functionalDivisionId;
    private String funtionalDivisionName;
    private String employeeEmailAddress;
    private String employeeDesignation;
    private String employeeDesc;
    private byte[] employeeImage;
    private Integer managerEmployeeId;
    private String specialNotes;
    private int version;
    private Integer cardId;
    private Integer companyId;
    private String employeeStatus;
    private String isCompanyAdmin;
    private String remarks;
    private Integer userId;
    private String designation;
    private String employeeCategory;
    private String activeImageUrl;

    @Id
    @Column(name = "employee_id", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "access_user_id", nullable = false)
    public int getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(int accessUserId) {
        this.accessUserId = accessUserId;
    }

    @Basic
    @Column(name = "employee_no", nullable = true, length = 45)
    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    @Basic
    @Column(name = "functional_division_level_number", nullable = true)
    public Integer getFunctionalDivisionLevelNumber() {
        return functionalDivisionLevelNumber;
    }

    public void setFunctionalDivisionLevelNumber(Integer functionalDivisionLevelNumber) {
        this.functionalDivisionLevelNumber = functionalDivisionLevelNumber;
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
    @Column(name = "funtional_division_name", nullable = true, length = 45)
    public String getFuntionalDivisionName() {
        return funtionalDivisionName;
    }

    public void setFuntionalDivisionName(String funtionalDivisionName) {
        this.funtionalDivisionName = funtionalDivisionName;
    }

    @Basic
    @Column(name = "employee_email_address", nullable = true, length = 45)
    public String getEmployeeEmailAddress() {
        return employeeEmailAddress;
    }

    public void setEmployeeEmailAddress(String employeeEmailAddress) {
        this.employeeEmailAddress = employeeEmailAddress;
    }

    @Basic
    @Column(name = "employee_designation", nullable = true, length = 45)
    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    @Basic
    @Column(name = "employee_desc", nullable = true, length = 45)
    public String getEmployeeDesc() {
        return employeeDesc;
    }

    public void setEmployeeDesc(String employeeDesc) {
        this.employeeDesc = employeeDesc;
    }

    @Basic
    @Column(name = "employee_image", nullable = true)
    public byte[] getEmployeeImage() {
        return employeeImage;
    }

    public void setEmployeeImage(byte[] employeeImage) {
        this.employeeImage = employeeImage;
    }

    @Basic
    @Column(name = "manager_employee_id", nullable = true)
    public Integer getManagerEmployeeId() {
        return managerEmployeeId;
    }

    public void setManagerEmployeeId(Integer managerEmployeeId) {
        this.managerEmployeeId = managerEmployeeId;
    }

    @Basic
    @Column(name = "special_notes", nullable = true, length = 100)
    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
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
    @Column(name = "card_id", nullable = true)
    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
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
    @Column(name = "employee_status", nullable = true, length = 5)
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    @Basic
    @Column(name = "is_company_admin", nullable = true, length = 2)
    public String getIsCompanyAdmin() {
        return isCompanyAdmin;
    }

    public void setIsCompanyAdmin(String isCompanyAdmin) {
        this.isCompanyAdmin = isCompanyAdmin;
    }

    @Basic
    @Column(name = "remarks", nullable = true, length = 45)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
    @Column(name = "designation", nullable = true, length = 70)
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Basic
    @Column(name = "employee_category", nullable = true, length = 45)
    public String getEmployeeCategory() {
        return employeeCategory;
    }

    public void setEmployeeCategory(String employeeCategory) {
        this.employeeCategory = employeeCategory;
    }

    @Basic
    @Column(name = "active_image_url", nullable = true, length = 100)
    public String getActiveImageUrl() {
        return activeImageUrl;
    }

    public void setActiveImageUrl(String activeImageUrl) {
        this.activeImageUrl = activeImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TEmployee tEmployee = (TEmployee) o;
        return employeeId == tEmployee.employeeId &&
                accessUserId == tEmployee.accessUserId &&
                version == tEmployee.version &&
                Objects.equals(employeeNo, tEmployee.employeeNo) &&
                Objects.equals(functionalDivisionLevelNumber, tEmployee.functionalDivisionLevelNumber) &&
                Objects.equals(functionalDivisionId, tEmployee.functionalDivisionId) &&
                Objects.equals(funtionalDivisionName, tEmployee.funtionalDivisionName) &&
                Objects.equals(employeeEmailAddress, tEmployee.employeeEmailAddress) &&
                Objects.equals(employeeDesignation, tEmployee.employeeDesignation) &&
                Objects.equals(employeeDesc, tEmployee.employeeDesc) &&
                Arrays.equals(employeeImage, tEmployee.employeeImage) &&
                Objects.equals(managerEmployeeId, tEmployee.managerEmployeeId) &&
                Objects.equals(specialNotes, tEmployee.specialNotes) &&
                Objects.equals(cardId, tEmployee.cardId) &&
                Objects.equals(companyId, tEmployee.companyId) &&
                Objects.equals(employeeStatus, tEmployee.employeeStatus) &&
                Objects.equals(isCompanyAdmin, tEmployee.isCompanyAdmin) &&
                Objects.equals(remarks, tEmployee.remarks) &&
                Objects.equals(userId, tEmployee.userId) &&
                Objects.equals(designation, tEmployee.designation) &&
                Objects.equals(employeeCategory, tEmployee.employeeCategory) &&
                Objects.equals(activeImageUrl, tEmployee.activeImageUrl);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(employeeId, accessUserId, employeeNo, functionalDivisionLevelNumber, functionalDivisionId, funtionalDivisionName, employeeEmailAddress, employeeDesignation, employeeDesc, managerEmployeeId, specialNotes, version, cardId, companyId, employeeStatus, isCompanyAdmin, remarks, userId, designation, employeeCategory, activeImageUrl);
        result = 31 * result + Arrays.hashCode(employeeImage);
        return result;
    }
}
