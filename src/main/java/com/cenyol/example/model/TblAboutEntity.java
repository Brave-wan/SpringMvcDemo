package com.cenyol.example.model;

import javax.persistence.*;

/**
 * Created by root on 17-6-16.
 */
@Entity
@Table(name = "tbl_about", schema = "myblog", catalog = "")
public class TblAboutEntity {
    private int tblAboutId;
    private String tblAboutTitle;
    private String tblAboutTime;
    private String tblAboutContent;

    @Id
    @Column(name = "tbl_about_id", nullable = false)
    public int getTblAboutId() {
        return tblAboutId;
    }

    public void setTblAboutId(int tblAboutId) {
        this.tblAboutId = tblAboutId;
    }

    @Basic
    @Column(name = "tbl_about_title", nullable = false, length = 45)
    public String getTblAboutTitle() {
        return tblAboutTitle;
    }

    public void setTblAboutTitle(String tblAboutTitle) {
        this.tblAboutTitle = tblAboutTitle;
    }

    @Basic
    @Column(name = "tbl_about_time", nullable = false, length = 45)
    public String getTblAboutTime() {
        return tblAboutTime;
    }

    public void setTblAboutTime(String tblAboutTime) {
        this.tblAboutTime = tblAboutTime;
    }

    @Basic
    @Column(name = "tbl_about_content", nullable = false, length = -1)
    public String getTblAboutContent() {
        return tblAboutContent;
    }

    public void setTblAboutContent(String tblAboutContent) {
        this.tblAboutContent = tblAboutContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblAboutEntity that = (TblAboutEntity) o;

        if (tblAboutId != that.tblAboutId) return false;
        if (tblAboutTitle != null ? !tblAboutTitle.equals(that.tblAboutTitle) : that.tblAboutTitle != null)
            return false;
        if (tblAboutTime != null ? !tblAboutTime.equals(that.tblAboutTime) : that.tblAboutTime != null) return false;
        if (tblAboutContent != null ? !tblAboutContent.equals(that.tblAboutContent) : that.tblAboutContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tblAboutId;
        result = 31 * result + (tblAboutTitle != null ? tblAboutTitle.hashCode() : 0);
        result = 31 * result + (tblAboutTime != null ? tblAboutTime.hashCode() : 0);
        result = 31 * result + (tblAboutContent != null ? tblAboutContent.hashCode() : 0);
        return result;
    }
}
