package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "employee_image", schema = "oneaccess", catalog = "")
public class EmployeeImage {
    private int employeeImageId;
    private String email;
    private String imageName;
    private String verificationCode;
    private String isVerified;
    private Integer version;
    private Timestamp dateTime;
    private String employeeNo;

    @Id
    @Column(name = "employee_image_id", nullable = false)
    public int getEmployeeImageId() {
        return employeeImageId;
    }

    public void setEmployeeImageId(int employeeImageId) {
        this.employeeImageId = employeeImageId;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "image_name", nullable = true, length = 20)
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Basic
    @Column(name = "verification_code", nullable = true, length = 8)
    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    @Basic
    @Column(name = "is_verified", nullable = true, length = 1)
    public String getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(String isVerified) {
        this.isVerified = isVerified;
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
    @Column(name = "date_time", nullable = true)
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Basic
    @Column(name = "employee_no", nullable = true, length = 10)
    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeImage that = (EmployeeImage) o;
        return employeeImageId == that.employeeImageId &&
                Objects.equals(email, that.email) &&
                Objects.equals(imageName, that.imageName) &&
                Objects.equals(verificationCode, that.verificationCode) &&
                Objects.equals(isVerified, that.isVerified) &&
                Objects.equals(version, that.version) &&
                Objects.equals(dateTime, that.dateTime) &&
                Objects.equals(employeeNo, that.employeeNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeImageId, email, imageName, verificationCode, isVerified, version, dateTime, employeeNo);
    }
}
