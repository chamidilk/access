package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_access_role", schema = "oneaccess", catalog = "")
public class TAccessRole {
    private int accessRoleId;
    private String roleName;

    @Id
    @Column(name = "access_role_id", nullable = false)
    public int getAccessRoleId() {
        return accessRoleId;
    }

    public void setAccessRoleId(int accessRoleId) {
        this.accessRoleId = accessRoleId;
    }

    @Basic
    @Column(name = "role_name", nullable = true, length = 45)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccessRole that = (TAccessRole) o;
        return accessRoleId == that.accessRoleId &&
                Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessRoleId, roleName);
    }
}
