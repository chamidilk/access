package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_visitor_history", schema = "oneaccess", catalog = "")
public class TVisitorHistory {
    private int historyId;
    private Integer visitorId;
    private Integer accessUserId;
    private String visitorName;
    private String visitorOrganization;
    private String nicNo;
    private String passportNo;
    private Timestamp inTime;
    private Timestamp outTime;
    private String purpose;
    private String specialNotes;
    private Integer companyId;
    private Integer contactPersonId;
    private String visitorCompany;
    private Timestamp registeredDate;
    private Timestamp removedDate;
    private Integer version;

    @Id
    @Column(name = "history_id", nullable = false)
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    @Basic
    @Column(name = "visitor_id", nullable = true)
    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
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
    @Column(name = "visitor_name", nullable = true, length = 45)
    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    @Basic
    @Column(name = "visitor_organization", nullable = true, length = 45)
    public String getVisitorOrganization() {
        return visitorOrganization;
    }

    public void setVisitorOrganization(String visitorOrganization) {
        this.visitorOrganization = visitorOrganization;
    }

    @Basic
    @Column(name = "nic_no", nullable = true, length = 15)
    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    @Basic
    @Column(name = "passport_no", nullable = true, length = 15)
    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    @Basic
    @Column(name = "in_time", nullable = true)
    public Timestamp getInTime() {
        return inTime;
    }

    public void setInTime(Timestamp inTime) {
        this.inTime = inTime;
    }

    @Basic
    @Column(name = "out_time", nullable = true)
    public Timestamp getOutTime() {
        return outTime;
    }

    public void setOutTime(Timestamp outTime) {
        this.outTime = outTime;
    }

    @Basic
    @Column(name = "purpose", nullable = true, length = 100)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
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
    @Column(name = "company_id", nullable = true)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "contact_person_id", nullable = true)
    public Integer getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(Integer contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    @Basic
    @Column(name = "visitor_company", nullable = true, length = 45)
    public String getVisitorCompany() {
        return visitorCompany;
    }

    public void setVisitorCompany(String visitorCompany) {
        this.visitorCompany = visitorCompany;
    }

    @Basic
    @Column(name = "registered_date", nullable = true)
    public Timestamp getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Timestamp registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Basic
    @Column(name = "removed_date", nullable = true)
    public Timestamp getRemovedDate() {
        return removedDate;
    }

    public void setRemovedDate(Timestamp removedDate) {
        this.removedDate = removedDate;
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
        TVisitorHistory that = (TVisitorHistory) o;
        return historyId == that.historyId &&
                Objects.equals(visitorId, that.visitorId) &&
                Objects.equals(accessUserId, that.accessUserId) &&
                Objects.equals(visitorName, that.visitorName) &&
                Objects.equals(visitorOrganization, that.visitorOrganization) &&
                Objects.equals(nicNo, that.nicNo) &&
                Objects.equals(passportNo, that.passportNo) &&
                Objects.equals(inTime, that.inTime) &&
                Objects.equals(outTime, that.outTime) &&
                Objects.equals(purpose, that.purpose) &&
                Objects.equals(specialNotes, that.specialNotes) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(contactPersonId, that.contactPersonId) &&
                Objects.equals(visitorCompany, that.visitorCompany) &&
                Objects.equals(registeredDate, that.registeredDate) &&
                Objects.equals(removedDate, that.removedDate) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historyId, visitorId, accessUserId, visitorName, visitorOrganization, nicNo, passportNo, inTime, outTime, purpose, specialNotes, companyId, contactPersonId, visitorCompany, registeredDate, removedDate, version);
    }
}
