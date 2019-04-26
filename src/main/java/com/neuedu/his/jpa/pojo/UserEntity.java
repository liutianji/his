package com.neuedu.his.jpa.pojo;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "his", catalog = "")
public class UserEntity {
    private String uid;
    private String uname;
    private String upwd;


    @Id
    @Column(name = "uid", nullable = false, length = 12)
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "uname", nullable = true, length = 12)
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "upwd", nullable = true, length = 32)
    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (uname != null ? !uname.equals(that.uname) : that.uname != null) return false;
        if (upwd != null ? !upwd.equals(that.upwd) : that.upwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (upwd != null ? upwd.hashCode() : 0);
        return result;
    }
}
