package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "put_drug", schema = "his", catalog = "")
public class PutDrugEntity {
    private String putDrugNo;
    private String drugCode;
    private String tradeName;
    private Integer putNum;
    private String userNo;
    private String rackNo;
    private Timestamp putDate;

    @Id
    @Column(name = "PUT_DRUG_NO", nullable = false, length = 12)
    public String getPutDrugNo() {
        return putDrugNo;
    }

    public void setPutDrugNo(String putDrugNo) {
        this.putDrugNo = putDrugNo;
    }

    @Basic
    @Column(name = "DRUG_CODE", nullable = true, length = 12)
    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    @Basic
    @Column(name = "TRADE_NAME", nullable = true, length = 50)
    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    @Basic
    @Column(name = "PUT_NUM", nullable = true)
    public Integer getPutNum() {
        return putNum;
    }

    public void setPutNum(Integer putNum) {
        this.putNum = putNum;
    }

    @Basic
    @Column(name = "USER_NO", nullable = true, length = 12)
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "RACK_NO", nullable = true, length = 12)
    public String getRackNo() {
        return rackNo;
    }

    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    @Basic
    @Column(name = "PUT_DATE", nullable = true)
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
        if (drugCode != null ? !drugCode.equals(that.drugCode) : that.drugCode != null) return false;
        if (tradeName != null ? !tradeName.equals(that.tradeName) : that.tradeName != null) return false;
        if (putNum != null ? !putNum.equals(that.putNum) : that.putNum != null) return false;
        if (userNo != null ? !userNo.equals(that.userNo) : that.userNo != null) return false;
        if (rackNo != null ? !rackNo.equals(that.rackNo) : that.rackNo != null) return false;
        if (putDate != null ? !putDate.equals(that.putDate) : that.putDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = putDrugNo != null ? putDrugNo.hashCode() : 0;
        result = 31 * result + (drugCode != null ? drugCode.hashCode() : 0);
        result = 31 * result + (tradeName != null ? tradeName.hashCode() : 0);
        result = 31 * result + (putNum != null ? putNum.hashCode() : 0);
        result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
        result = 31 * result + (rackNo != null ? rackNo.hashCode() : 0);
        result = 31 * result + (putDate != null ? putDate.hashCode() : 0);
        return result;
    }
}
