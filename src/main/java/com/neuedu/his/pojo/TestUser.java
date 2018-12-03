package com.neuedu.his.pojo;

import java.io.Serializable;
import java.util.Date;

public class TestUser implements Serializable{

    private String uid;
    private String uname;
    private String upwd;
    private Date ubirth;
    private String uimg;
    private int ustate;

    public TestUser() {
    }

    public TestUser(String uid, String uname, String upwd, Date ubirth, String uimg, int ustate) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.ubirth = ubirth;
        this.uimg = uimg;
        this.ustate = ustate;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", ubirth=" + ubirth +
                ", uimg='" + uimg + '\'' +
                ", ustate=" + ustate +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Date getUbirth() {
        return ubirth;
    }

    public void setUbirth(Date ubirth) {
        this.ubirth = ubirth;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public int getUstate() {
        return ustate;
    }

    public void setUstate(int ustate) {
        this.ustate = ustate;
    }
}
