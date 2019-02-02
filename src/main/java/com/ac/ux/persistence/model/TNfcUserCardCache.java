package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_nfc_user_card_cache", schema = "oneaccess", catalog = "")
public class TNfcUserCardCache {
    private long userCardCacheId;
    private long userId;
    private long cardId;
    private String cardNumber;
    private String pinNumber;
    private String idmNumber;

    @Id
    @Column(name = "user_card_cache_id", nullable = false)
    public long getUserCardCacheId() {
        return userCardCacheId;
    }

    public void setUserCardCacheId(long userCardCacheId) {
        this.userCardCacheId = userCardCacheId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "card_id", nullable = false)
    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "card_number", nullable = false, length = 50)
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "pin_number", nullable = true, length = 10)
    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    @Basic
    @Column(name = "idm_number", nullable = true, length = 10)
    public String getIdmNumber() {
        return idmNumber;
    }

    public void setIdmNumber(String idmNumber) {
        this.idmNumber = idmNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TNfcUserCardCache that = (TNfcUserCardCache) o;
        return userCardCacheId == that.userCardCacheId &&
                userId == that.userId &&
                cardId == that.cardId &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(pinNumber, that.pinNumber) &&
                Objects.equals(idmNumber, that.idmNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userCardCacheId, userId, cardId, cardNumber, pinNumber, idmNumber);
    }
}
