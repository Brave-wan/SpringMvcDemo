package com.cenyol.example.model;

import javax.persistence.*;

/**
 * Created by root on 17-6-16.
 */
@Entity
@Table(name = "tbl_contact", schema = "myblog", catalog = "")
public class TblContactEntity {
    private int tblContactId;
    private String tblContactName;
    private String tblContactEmail;
    private String tblContactPhone;
    private String tblContactMessage;
    private String tblContactTime;

    @Id
    @Column(name = "tbl_contact_id", nullable = false)
    public int getTblContactId() {
        return tblContactId;
    }

    public void setTblContactId(int tblContactId) {
        this.tblContactId = tblContactId;
    }

    @Basic
    @Column(name = "tbl_contact_name", nullable = false, length = 45)
    public String getTblContactName() {
        return tblContactName;
    }

    public void setTblContactName(String tblContactName) {
        this.tblContactName = tblContactName;
    }

    @Basic
    @Column(name = "tbl_contact_email", nullable = false, length = 45)
    public String getTblContactEmail() {
        return tblContactEmail;
    }

    public void setTblContactEmail(String tblContactEmail) {
        this.tblContactEmail = tblContactEmail;
    }

    @Basic
    @Column(name = "tbl_contact_phone", nullable = false, length = 45)
    public String getTblContactPhone() {
        return tblContactPhone;
    }

    public void setTblContactPhone(String tblContactPhone) {
        this.tblContactPhone = tblContactPhone;
    }

    @Basic
    @Column(name = "tbl_contact_message", nullable = false, length = 45)
    public String getTblContactMessage() {
        return tblContactMessage;
    }

    public void setTblContactMessage(String tblContactMessage) {
        this.tblContactMessage = tblContactMessage;
    }

    @Basic
    @Column(name = "tbl_contact_time", nullable = false, length = 255)
    public String getTblContactTime() {
        return tblContactTime;
    }

    public void setTblContactTime(String tblContactTime) {
        this.tblContactTime = tblContactTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblContactEntity that = (TblContactEntity) o;

        if (tblContactId != that.tblContactId) return false;
        if (tblContactName != null ? !tblContactName.equals(that.tblContactName) : that.tblContactName != null)
            return false;
        if (tblContactEmail != null ? !tblContactEmail.equals(that.tblContactEmail) : that.tblContactEmail != null)
            return false;
        if (tblContactPhone != null ? !tblContactPhone.equals(that.tblContactPhone) : that.tblContactPhone != null)
            return false;
        if (tblContactMessage != null ? !tblContactMessage.equals(that.tblContactMessage) : that.tblContactMessage != null)
            return false;
        if (tblContactTime != null ? !tblContactTime.equals(that.tblContactTime) : that.tblContactTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tblContactId;
        result = 31 * result + (tblContactName != null ? tblContactName.hashCode() : 0);
        result = 31 * result + (tblContactEmail != null ? tblContactEmail.hashCode() : 0);
        result = 31 * result + (tblContactPhone != null ? tblContactPhone.hashCode() : 0);
        result = 31 * result + (tblContactMessage != null ? tblContactMessage.hashCode() : 0);
        result = 31 * result + (tblContactTime != null ? tblContactTime.hashCode() : 0);
        return result;
    }
}
