package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_visitor", schema = "oneaccess", catalog = "")
public class TVisitor {
    private int visitorId;
    private int accessUserId;
    private String visitorName;
    private String visitorOrganization;
    private String nicNo;
    private String passportNo;
    private Timestamp inTime;
    private Timestamp outTime;
    private String purpose;
    private String specialNotes;
    private Integer version;
    private Integer companyId;
    private Object visitorStatus;
    private Integer contactPersonId;
    private String visitorCompany;
    private Timestamp registeredDate;

    @Id
    @Column(name = "visitor_id", nullable = false)
    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    @Basic
    @Column(name = "access_user_id", nullable = false)
    public int getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(int accessUserId) {
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
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
    @Column(name = "visitor_status", nullable = true)
    public Object getVisitorStatus() {
        return visitorStatus;
    }

    public void setVisitorStatus(Object visitorStatus) {
        this.visitorStatus = visitorStatus;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVisitor tVisitor = (TVisitor) o;
        return visitorId == tVisitor.visitorId &&
                accessUserId == tVisitor.accessUserId &&
                Objects.equals(visitorName, tVisitor.visitorName) &&
                Objects.equals(visitorOrganization, tVisitor.visitorOrganization) &&
                Objects.equals(nicNo, tVisitor.nicNo) &&
                Objects.equals(passportNo, tVisitor.passportNo) &&
                Objects.equals(inTime, tVisitor.inTime) &&
                Objects.equals(outTime, tVisitor.outTime) &&
                Objects.equals(purpose, tVisitor.purpose) &&
                Objects.equals(specialNotes, tVisitor.specialNotes) &&
                Objects.equals(version, tVisitor.version) &&
                Objects.equals(companyId, tVisitor.companyId) &&
                Objects.equals(visitorStatus, tVisitor.visitorStatus) &&
                Objects.equals(contactPersonId, tVisitor.contactPersonId) &&
                Objects.equals(visitorCompany, tVisitor.visitorCompany) &&
                Objects.equals(registeredDate, tVisitor.registeredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitorId, accessUserId, visitorName, visitorOrganization, nicNo, passportNo, inTime, outTime, purpose, specialNotes, version, companyId, visitorStatus, contactPersonId, visitorCompany, registeredDate);
    }
}
