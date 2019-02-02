package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_functional_division", schema = "oneaccess", catalog = "")
public class TFunctionalDivision {
    private int functionalDivisionId;
    private Integer parentId;
    private Integer version;
    private String functionalDivisionDesc;
    private String functionalDivisionName;

    @Id
    @Column(name = "functional_division_id", nullable = false)
    public int getFunctionalDivisionId() {
        return functionalDivisionId;
    }

    public void setFunctionalDivisionId(int functionalDivisionId) {
        this.functionalDivisionId = functionalDivisionId;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
    @Column(name = "functional_division_desc", nullable = true, length = 255)
    public String getFunctionalDivisionDesc() {
        return functionalDivisionDesc;
    }

    public void setFunctionalDivisionDesc(String functionalDivisionDesc) {
        this.functionalDivisionDesc = functionalDivisionDesc;
    }

    @Basic
    @Column(name = "functional_division_name", nullable = true, length = 45)
    public String getFunctionalDivisionName() {
        return functionalDivisionName;
    }

    public void setFunctionalDivisionName(String functionalDivisionName) {
        this.functionalDivisionName = functionalDivisionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TFunctionalDivision that = (TFunctionalDivision) o;
        return functionalDivisionId == that.functionalDivisionId &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(version, that.version) &&
                Objects.equals(functionalDivisionDesc, that.functionalDivisionDesc) &&
                Objects.equals(functionalDivisionName, that.functionalDivisionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionalDivisionId, parentId, version, functionalDivisionDesc, functionalDivisionName);
    }
}
