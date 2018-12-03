package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 摆药实体类
 */
@Entity
@Table(name = "put_drug", schema = "his", catalog = "")
public class PutDrugEntity {
    private String putDrugNo;
    private String tradeName;
    private Integer putNum;
    private String userNo;
    private Timestamp putDate;

    @Id
    @Column(name = "PUT_DRUG_NO")
    public String getPutDrugNo() {
        return putDrugNo;
    }

    public void setPutDrugNo(String putDrugNo) {
        this.putDrugNo = putDrugNo;
    }

    @Basic
    @Column(name = "TRADE_NAME")
    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    @Basic
    @Column(name = "PUT_NUM")
    public Integer getPutNum() {
        return putNum;
    }

    public void setPutNum(Integer putNum) {
        this.putNum = putNum;
    }

    @Basic
    @Column(name = "USER_NO")
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "PUT_DATE")
    public Timestamp getPutDate() {
        return putDate;
    }

    public void setPutDate(Timestamp putDate) {
        this.putDate = putDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PutDrugEntity that = (PutDrugEntity) o;

        if (putDrugNo != null ? !putDrugNo.equals(that.putDrugNo) : that.putDrugNo != null) return false;
        if (tradeName != null ? !tradeName.equals(that.tradeName) : that.tradeName != null) return false;
        if (putNum != null ? !putNum.equals(that.putNum) : that.putNum != null) return false;
        if (userNo != null ? !userNo.equals(that.userNo) : that.userNo != null) return false;
        if (putDate != null ? !putDate.equals(that.putDate) : that.putDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = putDrugNo != null ? putDrugNo.hashCode() : 0;
        result = 31 * result + (tradeName != null ? tradeName.hashCode() : 0);
        result = 31 * result + (putNum != null ? putNum.hashCode() : 0);
        result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
        result = 31 * result + (putDate != null ? putDate.hashCode() : 0);
        return result;
    }
}
