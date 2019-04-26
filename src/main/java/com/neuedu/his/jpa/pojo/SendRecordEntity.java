package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "send_record", schema = "his", catalog = "")
public class SendRecordEntity {
    private String sendNo;
    private String userName;
    private String recipeNo;
    private Timestamp sendDaet;

    @Id
    @Column(name = "SEND_NO", nullable = false, length = 12)
    public String getSendNo() {
        return sendNo;
    }

    public void setSendNo(String sendNo) {
        this.sendNo = sendNo;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = true, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "RECIPE_NO", nullable = true, length = 14)
    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    @Basic
    @Column(name = "SEND_DAET", nullable = true)
    public Timestamp getSendDaet() {
        return sendDaet;
    }

    public void setSendDaet(Timestamp sendDaet) {
        this.sendDaet = sendDaet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SendRecordEntity that = (SendRecordEntity) o;

        if (sendNo != null ? !sendNo.equals(that.sendNo) : that.sendNo != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (recipeNo != null ? !recipeNo.equals(that.recipeNo) : that.recipeNo != null) return false;
        if (sendDaet != null ? !sendDaet.equals(that.sendDaet) : that.sendDaet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sendNo != null ? sendNo.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (recipeNo != null ? recipeNo.hashCode() : 0);
        result = 31 * result + (sendDaet != null ? sendDaet.hashCode() : 0);
        return result;
    }
}
