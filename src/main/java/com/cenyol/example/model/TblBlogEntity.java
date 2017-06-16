package com.cenyol.example.model;

import javax.persistence.*;

/**
 * Created by root on 17-6-16.
 */
@Entity
@Table(name = "tbl_blog", schema = "myblog", catalog = "")
public class TblBlogEntity {
    private int tblBlogId;
    private String tblBlogTitle;
    private String tblBlogStitle;
    private String tblBlogContent;
    private String tblBlogFrom;
    private String tblBlogAuthor;
    private String tblBlogTime;
    private String tblBlogRednumber;

    @Id
    @Column(name = "tbl_blog_id", nullable = false)
    public int getTblBlogId() {
        return tblBlogId;
    }

    public void setTblBlogId(int tblBlogId) {
        this.tblBlogId = tblBlogId;
    }

    @Basic
    @Column(name = "tbl_blog_title", nullable = false, length = 255)
    public String getTblBlogTitle() {
        return tblBlogTitle;
    }

    public void setTblBlogTitle(String tblBlogTitle) {
        this.tblBlogTitle = tblBlogTitle;
    }

    @Basic
    @Column(name = "tbl_blog_stitle", nullable = false, length = 255)
    public String getTblBlogStitle() {
        return tblBlogStitle;
    }

    public void setTblBlogStitle(String tblBlogStitle) {
        this.tblBlogStitle = tblBlogStitle;
    }

    @Basic
    @Column(name = "tbl_blog_content", nullable = false, length = -1)
    public String getTblBlogContent() {
        return tblBlogContent;
    }

    public void setTblBlogContent(String tblBlogContent) {
        this.tblBlogContent = tblBlogContent;
    }

    @Basic
    @Column(name = "tbl_blog_from", nullable = false, length = 45)
    public String getTblBlogFrom() {
        return tblBlogFrom;
    }

    public void setTblBlogFrom(String tblBlogFrom) {
        this.tblBlogFrom = tblBlogFrom;
    }

    @Basic
    @Column(name = "tbl_blog_author", nullable = false, length = 45)
    public String getTblBlogAuthor() {
        return tblBlogAuthor;
    }

    public void setTblBlogAuthor(String tblBlogAuthor) {
        this.tblBlogAuthor = tblBlogAuthor;
    }

    @Basic
    @Column(name = "tbl_blog_time", nullable = false, length = 45)
    public String getTblBlogTime() {
        return tblBlogTime;
    }

    public void setTblBlogTime(String tblBlogTime) {
        this.tblBlogTime = tblBlogTime;
    }

    @Basic
    @Column(name = "tbl_blog_rednumber", nullable = false, length = 45)
    public String getTblBlogRednumber() {
        return tblBlogRednumber;
    }

    public void setTblBlogRednumber(String tblBlogRednumber) {
        this.tblBlogRednumber = tblBlogRednumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblBlogEntity that = (TblBlogEntity) o;

        if (tblBlogId != that.tblBlogId) return false;
        if (tblBlogTitle != null ? !tblBlogTitle.equals(that.tblBlogTitle) : that.tblBlogTitle != null) return false;
        if (tblBlogStitle != null ? !tblBlogStitle.equals(that.tblBlogStitle) : that.tblBlogStitle != null)
            return false;
        if (tblBlogContent != null ? !tblBlogContent.equals(that.tblBlogContent) : that.tblBlogContent != null)
            return false;
        if (tblBlogFrom != null ? !tblBlogFrom.equals(that.tblBlogFrom) : that.tblBlogFrom != null) return false;
        if (tblBlogAuthor != null ? !tblBlogAuthor.equals(that.tblBlogAuthor) : that.tblBlogAuthor != null)
            return false;
        if (tblBlogTime != null ? !tblBlogTime.equals(that.tblBlogTime) : that.tblBlogTime != null) return false;
        if (tblBlogRednumber != null ? !tblBlogRednumber.equals(that.tblBlogRednumber) : that.tblBlogRednumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tblBlogId;
        result = 31 * result + (tblBlogTitle != null ? tblBlogTitle.hashCode() : 0);
        result = 31 * result + (tblBlogStitle != null ? tblBlogStitle.hashCode() : 0);
        result = 31 * result + (tblBlogContent != null ? tblBlogContent.hashCode() : 0);
        result = 31 * result + (tblBlogFrom != null ? tblBlogFrom.hashCode() : 0);
        result = 31 * result + (tblBlogAuthor != null ? tblBlogAuthor.hashCode() : 0);
        result = 31 * result + (tblBlogTime != null ? tblBlogTime.hashCode() : 0);
        result = 31 * result + (tblBlogRednumber != null ? tblBlogRednumber.hashCode() : 0);
        return result;
    }
}
