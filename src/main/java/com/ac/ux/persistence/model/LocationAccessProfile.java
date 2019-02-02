package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location_access_profile", schema = "oneaccess", catalog = "")
public class LocationAccessProfile {
    private int locationAccessProfileId;
    private String locationAccessProfileName;
    private Object locationAccessProfileType;
    private String profileDesc;
    private String specialNotes;
    private int version;
    private Integer recurrentPatternId;
    private Integer accessUserId;
    private Integer adminId;
    private Integer companyId;

    @Id
    @Column(name = "location_access_profile_id", nullable = false)
    public int getLocationAccessProfileId() {
        return locationAccessProfileId;
    }

    public void setLocationAccessProfileId(int locationAccessProfileId) {
        this.locationAccessProfileId = locationAccessProfileId;
    }

    @Basic
    @Column(name = "location_access_profile_name", nullable = true, length = 45)
    public String getLocationAccessProfileName() {
        return locationAccessProfileName;
    }

    public void setLocationAccessProfileName(String locationAccessProfileName) {
        this.locationAccessProfileName = locationAccessProfileName;
    }

    @Basic
    @Column(name = "location_access_profile_type", nullable = true)
    public Object getLocationAccessProfileType() {
        return locationAccessProfileType;
    }

    public void setLocationAccessProfileType(Object locationAccessProfileType) {
        this.locationAccessProfileType = locationAccessProfileType;
    }

    @Basic
    @Column(name = "profile_desc", nullable = true, length = 45)
    public String getProfileDesc() {
        return profileDesc;
    }

    public void setProfileDesc(String profileDesc) {
        this.profileDesc = profileDesc;
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
    @Column(name = "recurrent_pattern_id", nullable = true)
    public Integer getRecurrentPatternId() {
        return recurrentPatternId;
    }

    public void setRecurrentPatternId(Integer recurrentPatternId) {
        this.recurrentPatternId = recurrentPatternId;
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
    @Column(name = "admin_id", nullable = true)
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "company_id", nullable = true)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationAccessProfile that = (LocationAccessProfile) o;
        return locationAccessProfileId == that.locationAccessProfileId &&
                version == that.version &&
                Objects.equals(locationAccessProfileName, that.locationAccessProfileName) &&
                Objects.equals(locationAccessProfileType, that.locationAccessProfileType) &&
                Objects.equals(profileDesc, that.profileDesc) &&
                Objects.equals(specialNotes, that.specialNotes) &&
                Objects.equals(recurrentPatternId, that.recurrentPatternId) &&
                Objects.equals(accessUserId, that.accessUserId) &&
                Objects.equals(adminId, that.adminId) &&
                Objects.equals(companyId, that.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationAccessProfileId, locationAccessProfileName, locationAccessProfileType, profileDesc, specialNotes, version, recurrentPatternId, accessUserId, adminId, companyId);
    }
}
