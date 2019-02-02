package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_access_user_profile_map", schema = "oneaccess", catalog = "")
public class TAccessUserProfileMap {
    private int accessUserProfileMapId;
    private Integer accessUserId;
    private Integer accessProfileId;

    @Id
    @Column(name = "access_user_profile_map_id", nullable = false)
    public int getAccessUserProfileMapId() {
        return accessUserProfileMapId;
    }

    public void setAccessUserProfileMapId(int accessUserProfileMapId) {
        this.accessUserProfileMapId = accessUserProfileMapId;
    }

    @Basic
    @Column(name = "access_user_id", nullable = true)
    public Integer getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(Integer accessUserId) {
        this.accessUserId = accessUserId;
    }

    @Basic
    @Column(name = "access_profile_id", nullable = true)
    public Integer getAccessProfileId() {
        return accessProfileId;
    }

    public void setAccessProfileId(Integer accessProfileId) {
        this.accessProfileId = accessProfileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccessUserProfileMap that = (TAccessUserProfileMap) o;
        return accessUserProfileMapId == that.accessUserProfileMapId &&
                Objects.equals(accessUserId, that.accessUserId) &&
                Objects.equals(accessProfileId, that.accessProfileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessUserProfileMapId, accessUserId, accessProfileId);
    }
}
