package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_card_replacement", schema = "oneaccess", catalog = "")
public class TCardReplacement {
    private int cardReplacementId;
    private Integer accessUserId;
    private String oldIdm;
    private String newIdm;
    private Timestamp dateTime;
    private Integer replacedByUserId;
    private Integer version;

    @Id
    @Column(name = "card_replacement_id", nullable = false)
    public int getCardReplacementId() {
        return cardReplacementId;
    }

    public void setCardReplacementId(int cardReplacementId) {
        this.cardReplacementId = cardReplacementId;
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
    @Column(name = "old_idm", nullable = true, length = 20)
    public String getOldIdm() {
        return oldIdm;
    }

    public void setOldIdm(String oldIdm) {
        this.oldIdm = oldIdm;
    }

    @Basic
    @Column(name = "new_idm", nullable = true, length = 20)
    public String getNewIdm() {
        return newIdm;
    }

    public void setNewIdm(String newIdm) {
        this.newIdm = newIdm;
    }

    @Basic
    @Column(name = "date_time", nullable = true)
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Basic
    @Column(name = "replaced_by_user_id", nullable = true)
    public Integer getReplacedByUserId() {
        return replacedByUserId;
    }

    public void setReplacedByUserId(Integer replacedByUserId) {
        this.replacedByUserId = replacedByUserId;
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
        TCardReplacement that = (TCardReplacement) o;
        return cardReplacementId == that.cardReplacementId &&
                Objects.equals(accessUserId, that.accessUserId) &&
                Objects.equals(oldIdm, that.oldIdm) &&
                Objects.equals(newIdm, that.newIdm) &&
                Objects.equals(dateTime, that.dateTime) &&
                Objects.equals(replacedByUserId, that.replacedByUserId) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardReplacementId, accessUserId, oldIdm, newIdm, dateTime, replacedByUserId, version);
    }
}
