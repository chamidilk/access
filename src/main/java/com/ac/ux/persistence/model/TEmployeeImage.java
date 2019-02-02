package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_employee_image", schema = "oneaccess", catalog = "")
public class TEmployeeImage {
    private int employeeImageId;
    private Integer employeeId;
    private String imageUrl;
    private Object status;
    private Integer version;
    private Timestamp addedDate;

    @Id
    @Column(name = "employee_image_id", nullable = false)
    public int getEmployeeImageId() {
        return employeeImageId;
    }

    public void setEmployeeImageId(int employeeImageId) {
        this.employeeImageId = employeeImageId;
    }

    @Basic
    @Column(name = "employee_id", nullable = true)
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "image_url", nullable = true, length = 200)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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
    @Column(name = "added_date", nullable = true)
    public Timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TEmployeeImage that = (TEmployeeImage) o;
        return employeeImageId == that.employeeImageId &&
                Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(status, that.status) &&
                Objects.equals(version, that.version) &&
                Objects.equals(addedDate, that.addedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeImageId, employeeId, imageUrl, status, version, addedDate);
    }
}
