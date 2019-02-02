package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_access_employee_role", schema = "oneaccess", catalog = "")
public class TAccessEmployeeRole {
    private int employeeRoleId;
    private Integer roleId;
    private int employeeId;
    private Integer version;

    @Id
    @Column(name = "employee_role_id", nullable = false)
    public int getEmployeeRoleId() {
        return employeeRoleId;
    }

    public void setEmployeeRoleId(int employeeRoleId) {
        this.employeeRoleId = employeeRoleId;
    }

    @Basic
    @Column(name = "role_id", nullable = true)
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "employee_id", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
        TAccessEmployeeRole that = (TAccessEmployeeRole) o;
        return employeeRoleId == that.employeeRoleId &&
                employeeId == that.employeeId &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeRoleId, roleId, employeeId, version);
    }
}
