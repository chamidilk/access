package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_access_user", schema = "oneaccess", catalog = "")
public class TAccessUser {
    private int accessUserId;
    private Integer userId;
    private String cardNumber;
    private String specialNotes;
    private int version;
    private String archived;
    private String idm;
    private Timestamp expiryDate;

    @Id
    @Column(name = "access_user_id", nullable = false)
    public int getAccessUserId() {
        return accessUserId;
    }

    public void setAccessUserId(int accessUserId) {
        this.accessUserId = accessUserId;
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
    @Column(name = "card_number", nullable = true, length = 16)
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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
    @Column(name = "archived", nullable = true, length = 1)
    public String getArchived() {
        return archived;
    }

    public void setArchived(String archived) {
        this.archived = archived;
    }

    @Basic
    @Column(name = "idm", nullable = true, length = 15)
    public String getIdm() {
        return idm;
    }

    public void setIdm(String idm) {
        this.idm = idm;
    }

    @Basic
    @Column(name = "expiry_date", nullable = true)
    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccessUser that = (TAccessUser) o;
        return accessUserId == that.accessUserId &&
                version == that.version &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(specialNotes, that.specialNotes) &&
                Objects.equals(archived, that.archived) &&
                Objects.equals(idm, that.idm) &&
                Objects.equals(expiryDate, that.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessUserId, userId, cardNumber, specialNotes, version, archived, idm, expiryDate);
    }
}
