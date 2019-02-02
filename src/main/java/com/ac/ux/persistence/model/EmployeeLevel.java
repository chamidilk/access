package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee_level", schema = "oneaccess", catalog = "")
public class EmployeeLevel {
    private int employeeLevelId;
    private String employeeLevel;
    private String employeeLevelDesc;
    private Integer employeeLevelOrder;
    private Integer organizationId;
    private Integer version;

    @Id
    @Column(name = "employee_level_id", nullable = false)
    public int getEmployeeLevelId() {
        return employeeLevelId;
    }

    public void setEmployeeLevelId(int employeeLevelId) {
        this.employeeLevelId = employeeLevelId;
    }

    @Basic
    @Column(name = "employee_level", nullable = true, length = 45)
    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    @Basic
    @Column(name = "employee_level_desc", nullable = true, length = 45)
    public String getEmployeeLevelDesc() {
        return employeeLevelDesc;
    }

    public void setEmployeeLevelDesc(String employeeLevelDesc) {
        this.employeeLevelDesc = employeeLevelDesc;
    }

    @Basic
    @Column(name = "employee_level_order", nullable = true)
    public Integer getEmployeeLevelOrder() {
        return employeeLevelOrder;
    }

    public void setEmployeeLevelOrder(Integer employeeLevelOrder) {
        this.employeeLevelOrder = employeeLevelOrder;
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
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeLevel that = (EmployeeLevel) o;
        return employeeLevelId == that.employeeLevelId &&
                Objects.equals(employeeLevel, that.employeeLevel) &&
                Objects.equals(employeeLevelDesc, that.employeeLevelDesc) &&
                Objects.equals(employeeLevelOrder, that.employeeLevelOrder) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeLevelId, employeeLevel, employeeLevelDesc, employeeLevelOrder, organizationId, version);
    }
}
