package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "t_message_audit", schema = "oneaccess", catalog = "")
public class TMessageAudit {
    private int messageAuditId;
    private String toAddress;
    private String toBccAddress;
    private String fromAddress;
    private String subject;
    private String body;
    private String sent;
    private Timestamp msgTimestamp;
    private String messageType;
    private int version;

    @Id
    @Column(name = "message_audit_id", nullable = false)
    public int getMessageAuditId() {
        return messageAuditId;
    }

    public void setMessageAuditId(int messageAuditId) {
        this.messageAuditId = messageAuditId;
    }

    @Basic
    @Column(name = "to_address", nullable = true, length = 500)
    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    @Basic
    @Column(name = "to_bcc_address", nullable = true, length = 500)
    public String getToBccAddress() {
        return toBccAddress;
    }

    public void setToBccAddress(String toBccAddress) {
        this.toBccAddress = toBccAddress;
    }

    @Basic
    @Column(name = "from_address", nullable = true, length = 50)
    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    @Basic
    @Column(name = "subject", nullable = true, length = 500)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "body", nullable = true, length = 5000)
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Column(name = "sent", nullable = false, length = 1)
    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    @Basic
    @Column(name = "msg_timestamp", nullable = true)
    public Timestamp getMsgTimestamp() {
        return msgTimestamp;
    }

    public void setMsgTimestamp(Timestamp msgTimestamp) {
        this.msgTimestamp = msgTimestamp;
    }

    @Basic
    @Column(name = "message_type", nullable = true, length = 5)
    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @Basic
    @Column(name = "version", nullable = false)
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMessageAudit that = (TMessageAudit) o;
        return messageAuditId == that.messageAuditId &&
                version == that.version &&
                Objects.equals(toAddress, that.toAddress) &&
                Objects.equals(toBccAddress, that.toBccAddress) &&
                Objects.equals(fromAddress, that.fromAddress) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(body, that.body) &&
                Objects.equals(sent, that.sent) &&
                Objects.equals(msgTimestamp, that.msgTimestamp) &&
                Objects.equals(messageType, that.messageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageAuditId, toAddress, toBccAddress, fromAddress, subject, body, sent, msgTimestamp, messageType, version);
    }
}
