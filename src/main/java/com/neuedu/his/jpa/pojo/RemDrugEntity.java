package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "rem_drug", schema = "his", catalog = "")
public class RemDrugEntity {
    private String remNo;
    private String recipeNo;
    private String patientName;
    private String wtableNo;
    private String remRemarks;
    private Integer remStatus;
    private Timestamp remDate;
    private Timestamp drugedDate;

    @Override
    public String toString() {
        return "RemDrugEntity{" +
                "remNo='" + remNo + '\'' +
                ", recipeNo='" + recipeNo + '\'' +
                ", patientName='" + patientName + '\'' +
                ", wtableNo='" + wtableNo + '\'' +
                ", remRemarks='" + remRemarks + '\'' +
                ", remStatus=" + remStatus +
                ", remDate=" + remDate +
                ", drugedDate=" + drugedDate +
                '}';
    }

    @Id
    @Column(name = "REM_NO", nullable = false, length = 12)
    public String getRemNo() {
        return remNo;
    }

    public void setRemNo(String remNo) {
        this.remNo = remNo;
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
    @Column(name = "PATIENT_NAME", nullable = true, length = 40)
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Basic
    @Column(name = "WTABLE_NO", nullable = true, length = 12)
    public String getWtableNo() {
        return wtableNo;
    }

    public void setWtableNo(String wtableNo) {
        this.wtableNo = wtableNo;
    }

    @Basic
    @Column(name = "REM_REMARKS", nullable = true, length = 100)
    public String getRemRemarks() {
        return remRemarks;
    }

    public void setRemRemarks(String remRemarks) {
        this.remRemarks = remRemarks;
    }

    @Basic
    @Column(name = "REM_STATUS", nullable = true)
    public Integer getRemStatus() {
        return remStatus;
    }

    public void setRemStatus(Integer remStatus) {
        this.remStatus = remStatus;
    }

    @Basic
    @Column(name = "REM_DATE", nullable = true)
    public Timestamp getRemDate() {
        return remDate;
    }

    public void setRemDate(Timestamp remDate) {
        this.remDate = remDate;
    }

    @Basic
    @Column(name = "DRUGED_DATE", nullable = true)
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

        RemDrugEntity that = (RemDrugEntity) o;

        if (remNo != null ? !remNo.equals(that.remNo) : that.remNo != null) return false;
        if (recipeNo != null ? !recipeNo.equals(that.recipeNo) : that.recipeNo != null) return false;
        if (patientName != null ? !patientName.equals(that.patientName) : that.patientName != null) return false;
        if (wtableNo != null ? !wtableNo.equals(that.wtableNo) : that.wtableNo != null) return false;
        if (remRemarks != null ? !remRemarks.equals(that.remRemarks) : that.remRemarks != null) return false;
        if (remStatus != null ? !remStatus.equals(that.remStatus) : that.remStatus != null) return false;
        if (remDate != null ? !remDate.equals(that.remDate) : that.remDate != null) return false;
        if (drugedDate != null ? !drugedDate.equals(that.drugedDate) : that.drugedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = remNo != null ? remNo.hashCode() : 0;
        result = 31 * result + (recipeNo != null ? recipeNo.hashCode() : 0);
        result = 31 * result + (patientName != null ? patientName.hashCode() : 0);
        result = 31 * result + (wtableNo != null ? wtableNo.hashCode() : 0);
        result = 31 * result + (remRemarks != null ? remRemarks.hashCode() : 0);
        result = 31 * result + (remStatus != null ? remStatus.hashCode() : 0);
        result = 31 * result + (remDate != null ? remDate.hashCode() : 0);
        result = 31 * result + (drugedDate != null ? drugedDate.hashCode() : 0);
        return result;
    }
}
