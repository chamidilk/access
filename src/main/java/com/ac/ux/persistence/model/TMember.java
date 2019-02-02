package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "t_member", schema = "oneaccess", catalog = "")
public class TMember {
    private int memberId;
    private int accessUserId;
    private String memberCategory;
    private String memberEmailAddress;
    private String memberDesc;
    private byte[] memberImage;
    private String specialNotes;
    private Integer cardId;
    private String memberStatus;
    private String memberCompanyName;
    private String hostedCompanyId;
    private String memberNo;
    private String remarks;
    private Integer userId;
    private int version;
    private Integer functionalDivisionId;

    @Id
    @Column(name = "member_id", nullable = false)
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
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
    @Column(name = "member_category", nullable = true, length = 45)
    public String getMemberCategory() {
        return memberCategory;
    }

    public void setMemberCategory(String memberCategory) {
        this.memberCategory = memberCategory;
    }

    @Basic
    @Column(name = "member_email_address", nullable = true, length = 45)
    public String getMemberEmailAddress() {
        return memberEmailAddress;
    }

    public void setMemberEmailAddress(String memberEmailAddress) {
        this.memberEmailAddress = memberEmailAddress;
    }

    @Basic
    @Column(name = "member_desc", nullable = true, length = 45)
    public String getMemberDesc() {
        return memberDesc;
    }

    public void setMemberDesc(String memberDesc) {
        this.memberDesc = memberDesc;
    }

    @Basic
    @Column(name = "member_image", nullable = true)
    public byte[] getMemberImage() {
        return memberImage;
    }

    public void setMemberImage(byte[] memberImage) {
        this.memberImage = memberImage;
    }

    @Basic
    @Column(name = "special_notes", nullable = true, length = 55)
    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    @Basic
    @Column(name = "card_id", nullable = true)
    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "member_status", nullable = true, length = 45)
    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    @Basic
    @Column(name = "member_company_name", nullable = false, length = 45)
    public String getMemberCompanyName() {
        return memberCompanyName;
    }

    public void setMemberCompanyName(String memberCompanyName) {
        this.memberCompanyName = memberCompanyName;
    }

    @Basic
    @Column(name = "hosted_company_id", nullable = false, length = 45)
    public String getHostedCompanyId() {
        return hostedCompanyId;
    }

    public void setHostedCompanyId(String hostedCompanyId) {
        this.hostedCompanyId = hostedCompanyId;
    }

    @Basic
    @Column(name = "member_no", nullable = true, length = 45)
    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    @Basic
    @Column(name = "remarks", nullable = true, length = 45)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "functional_division_id", nullable = true)
    public Integer getFunctionalDivisionId() {
        return functionalDivisionId;
    }

    public void setFunctionalDivisionId(Integer functionalDivisionId) {
        this.functionalDivisionId = functionalDivisionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMember tMember = (TMember) o;
        return memberId == tMember.memberId &&
                accessUserId == tMember.accessUserId &&
                version == tMember.version &&
                Objects.equals(memberCategory, tMember.memberCategory) &&
                Objects.equals(memberEmailAddress, tMember.memberEmailAddress) &&
                Objects.equals(memberDesc, tMember.memberDesc) &&
                Arrays.equals(memberImage, tMember.memberImage) &&
                Objects.equals(specialNotes, tMember.specialNotes) &&
                Objects.equals(cardId, tMember.cardId) &&
                Objects.equals(memberStatus, tMember.memberStatus) &&
                Objects.equals(memberCompanyName, tMember.memberCompanyName) &&
                Objects.equals(hostedCompanyId, tMember.hostedCompanyId) &&
                Objects.equals(memberNo, tMember.memberNo) &&
                Objects.equals(remarks, tMember.remarks) &&
                Objects.equals(userId, tMember.userId) &&
                Objects.equals(functionalDivisionId, tMember.functionalDivisionId);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(memberId, accessUserId, memberCategory, memberEmailAddress, memberDesc, specialNotes, cardId, memberStatus, memberCompanyName, hostedCompanyId, memberNo, remarks, userId, version, functionalDivisionId);
        result = 31 * result + Arrays.hashCode(memberImage);
        return result;
    }
}
