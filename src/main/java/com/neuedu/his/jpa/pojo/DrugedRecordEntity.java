package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "druged_record", schema = "his", catalog = "")
public class DrugedRecordEntity {
    private String drugedNo;
    private String userName;
    private Timestamp drugedDate;

    @Id
    @Column(name = "DRUGED_NO")
    public String getDrugedNo() {
        return drugedNo;
    }

    public void setDrugedNo(String drugedNo) {
        this.drugedNo = drugedNo;
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
    @Column(name = "DRUGED_DATE")
    public Timestamp getDrugedDate() {
        return drugedDate;
    }

    public void setDrugedDate(Timestamp drugedDate) {
        this.drugedDate = drugedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrugedRecordEntity that = (DrugedRecordEntity) o;

        if (drugedNo != null ? !drugedNo.equals(that.drugedNo) : that.drugedNo != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (drugedDate != null ? !drugedDate.equals(that.drugedDate) : that.drugedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = drugedNo != null ? drugedNo.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (drugedDate != null ? drugedDate.hashCode() : 0);
        return result;
    }
}
