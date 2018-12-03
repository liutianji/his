package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_user", schema = "his", catalog = "")
public class TestUserEntity {
    private String  uid;
    private String  uname;
    private String  upwd;
    private Date    ubirth;
    private String  uimg;
    private Integer ustate;

    @Id
    @Column(name = "uid")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "upwd")
    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Basic
    @Column(name = "ubirth")
    public Date getUbirth() {
        return ubirth;
    }

    public void setUbirth(Date ubirth) {
        this.ubirth = ubirth;
    }

    @Basic
    @Column(name = "uimg")
    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    @Basic
    @Column(name = "ustate")
    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestUserEntity that = (TestUserEntity) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (uname != null ? !uname.equals(that.uname) : that.uname != null) return false;
        if (upwd != null ? !upwd.equals(that.upwd) : that.upwd != null) return false;
        if (ubirth != null ? !ubirth.equals(that.ubirth) : that.ubirth != null) return false;
        if (uimg != null ? !uimg.equals(that.uimg) : that.uimg != null) return false;
        if (ustate != null ? !ustate.equals(that.ustate) : that.ustate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (upwd != null ? upwd.hashCode() : 0);
        result = 31 * result + (ubirth != null ? ubirth.hashCode() : 0);
        result = 31 * result + (uimg != null ? uimg.hashCode() : 0);
        result = 31 * result + (ustate != null ? ustate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestUserEntity{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", ubirth=" + ubirth +
                ", uimg='" + uimg + '\'' +
                ", ustate=" + ustate +
                '}';
    }
}
