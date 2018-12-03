package com.neuedu.his.jpa.pojo;

import javax.persistence.*;

/**
 * 人员实体类
 */
@Entity
@Table(name = "ope_user", schema = "his", catalog = "")
public class OpeUserEntity {
    private String userNo;
    private String userName;
    private String userPwd;
    private String userRole;
    private Integer userRoleNo;

    @Id
    @Column(name = "USER_NO")
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "USER_PWD")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Basic
    @Column(name = "USER_ROLE")
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Basic
    @Column(name = "USER_ROLE_NO")
    public Integer getUserRoleNo() {
        return userRoleNo;
    }

    public void setUserRoleNo(Integer userRoleNo) {
        this.userRoleNo = userRoleNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpeUserEntity that = (OpeUserEntity) o;

        if (userNo != null ? !userNo.equals(that.userNo) : that.userNo != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPwd != null ? !userPwd.equals(that.userPwd) : that.userPwd != null) return false;
        if (userRole != null ? !userRole.equals(that.userRole) : that.userRole != null) return false;
        if (userRoleNo != null ? !userRoleNo.equals(that.userRoleNo) : that.userRoleNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userNo != null ? userNo.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        result = 31 * result + (userRoleNo != null ? userRoleNo.hashCode() : 0);
        return result;
    }
}
