package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_fuel_division", schema = "oneaccess", catalog = "")
public class TFuelDivision {
    private long divisionId;
    private String divisionName;
    private String divisionAddress;
    private String divisionPrimaryContact;

    @Id
    @Column(name = "division_id", nullable = false)
    public long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(long divisionId) {
        this.divisionId = divisionId;
    }

    @Basic
    @Column(name = "division_name", nullable = true, length = 50)
    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    @Basic
    @Column(name = "division_address", nullable = true, length = 300)
    public String getDivisionAddress() {
        return divisionAddress;
    }

    public void setDivisionAddress(String divisionAddress) {
        this.divisionAddress = divisionAddress;
    }

    @Basic
    @Column(name = "division_primary_contact", nullable = true, length = 50)
    public String getDivisionPrimaryContact() {
        return divisionPrimaryContact;
    }

    public void setDivisionPrimaryContact(String divisionPrimaryContact) {
        this.divisionPrimaryContact = divisionPrimaryContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TFuelDivision that = (TFuelDivision) o;
        return divisionId == that.divisionId &&
                Objects.equals(divisionName, that.divisionName) &&
                Objects.equals(divisionAddress, that.divisionAddress) &&
                Objects.equals(divisionPrimaryContact, that.divisionPrimaryContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(divisionId, divisionName, divisionAddress, divisionPrimaryContact);
    }
}
