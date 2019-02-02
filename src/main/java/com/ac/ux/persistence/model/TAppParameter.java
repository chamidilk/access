package com.ac.ux.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_app_parameter", schema = "oneaccess", catalog = "")
public class TAppParameter {
    private String keyCode;
    private String keyDesc;
    private String keyValue;
    private String keyValueType;
    private String isEditable;
    private int version;

    @Id
    @Column(name = "key_code", nullable = false, length = 50)
    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    @Basic
    @Column(name = "key_desc", nullable = false, length = 100)
    public String getKeyDesc() {
        return keyDesc;
    }

    public void setKeyDesc(String keyDesc) {
        this.keyDesc = keyDesc;
    }

    @Basic
    @Column(name = "key_value", nullable = false, length = 100)
    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    @Basic
    @Column(name = "key_value_type", nullable = false, length = 1)
    public String getKeyValueType() {
        return keyValueType;
    }

    public void setKeyValueType(String keyValueType) {
        this.keyValueType = keyValueType;
    }

    @Basic
    @Column(name = "is_editable", nullable = false, length = 1)
    public String getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(String isEditable) {
        this.isEditable = isEditable;
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
        TAppParameter that = (TAppParameter) o;
        return version == that.version &&
                Objects.equals(keyCode, that.keyCode) &&
                Objects.equals(keyDesc, that.keyDesc) &&
                Objects.equals(keyValue, that.keyValue) &&
                Objects.equals(keyValueType, that.keyValueType) &&
                Objects.equals(isEditable, that.isEditable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyCode, keyDesc, keyValue, keyValueType, isEditable, version);
    }
}
