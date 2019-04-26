package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "pha_sto_recipe", schema = "his", catalog = "")
public class PhaStoRecipeEntity {
    private String recipeNo;
    private String recipeState;
    private String cardNo;
    private String patientName;
    private String sexCode;
    private Date birthday;
    private String paykindCode;
    private String deptCode;
    private Timestamp regDate;
    private String doctCode;
    private String doctDept;
    private String feeOper;
    private Timestamp feeDate;
    private String invoiceNo;
    private Double recipeCost;
    private String drugedOper;
    private String drugedDept;
    private Timestamp drugedDate;
    private String sendOper;
    private Timestamp sendDate;
    private String sendDept;
    private String validState;
    private String backOper;
    private Timestamp backDate;
    private String cancelOper;
    private Timestamp cancelDate;

    @Id
    @Column(name = "RECIPE_NO", nullable = false, length = 14)
    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    @Basic
    @Column(name = "RECIPE_STATE", nullable = true, length = 1)
    public String getRecipeState() {
        return recipeState;
    }

    public void setRecipeState(String recipeState) {
        this.recipeState = recipeState;
    }

    @Basic
    @Column(name = "CARD_NO", nullable = true, length = 10)
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
    @Column(name = "SEX_CODE", nullable = true, length = 2)
    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    @Basic
    @Column(name = "BIRTHDAY", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "PAYKIND_CODE", nullable = true, length = 4)
    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    @Basic
    @Column(name = "DEPT_CODE", nullable = true, length = 4)
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "REG_DATE", nullable = true)
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "DOCT_CODE", nullable = true, length = 6)
    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    @Basic
    @Column(name = "DOCT_DEPT", nullable = true, length = 4)
    public String getDoctDept() {
        return doctDept;
    }

    public void setDoctDept(String doctDept) {
        this.doctDept = doctDept;
    }

    @Basic
    @Column(name = "FEE_OPER", nullable = true, length = 6)
    public String getFeeOper() {
        return feeOper;
    }

    public void setFeeOper(String feeOper) {
        this.feeOper = feeOper;
    }

    @Basic
    @Column(name = "FEE_DATE", nullable = true)
    public Timestamp getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(Timestamp feeDate) {
        this.feeDate = feeDate;
    }

    @Basic
    @Column(name = "INVOICE_NO", nullable = true, length = 12)
    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Basic
    @Column(name = "RECIPE_COST", nullable = true, precision = 2)
    public Double getRecipeCost() {
        return recipeCost;
    }

    public void setRecipeCost(Double recipeCost) {
        this.recipeCost = recipeCost;
    }

    @Basic
    @Column(name = "DRUGED_OPER", nullable = true, length = 6)
    public String getDrugedOper() {
        return drugedOper;
    }

    public void setDrugedOper(String drugedOper) {
        this.drugedOper = drugedOper;
    }

    @Basic
    @Column(name = "DRUGED_DEPT", nullable = true, length = 4)
    public String getDrugedDept() {
        return drugedDept;
    }

    public void setDrugedDept(String drugedDept) {
        this.drugedDept = drugedDept;
    }

    @Basic
    @Column(name = "DRUGED_DATE", nullable = true)
    public Timestamp getDrugedDate() {
        return drugedDate;
    }

    public void setDrugedDate(Timestamp drugedDate) {
        this.drugedDate = drugedDate;
    }

    @Basic
    @Column(name = "SEND_OPER", nullable = true, length = 6)
    public String getSendOper() {
        return sendOper;
    }

    public void setSendOper(String sendOper) {
        this.sendOper = sendOper;
    }

    @Basic
    @Column(name = "SEND_DATE", nullable = true)
    public Timestamp getSendDate() {
        return sendDate;
    }

    public void setSendDate(Timestamp sendDate) {
        this.sendDate = sendDate;
    }

    @Basic
    @Column(name = "SEND_DEPT", nullable = true, length = 4)
    public String getSendDept() {
        return sendDept;
    }

    public void setSendDept(String sendDept) {
        this.sendDept = sendDept;
    }

    @Basic
    @Column(name = "VALID_STATE", nullable = true, length = 1)
    public String getValidState() {
        return validState;
    }

    public void setValidState(String validState) {
        this.validState = validState;
    }

    @Basic
    @Column(name = "BACK_OPER", nullable = true, length = 6)
    public String getBackOper() {
        return backOper;
    }

    public void setBackOper(String backOper) {
        this.backOper = backOper;
    }

    @Basic
    @Column(name = "BACK_DATE", nullable = true)
    public Timestamp getBackDate() {
        return backDate;
    }

    public void setBackDate(Timestamp backDate) {
        this.backDate = backDate;
    }

    @Basic
    @Column(name = "CANCEL_OPER", nullable = true, length = 6)
    public String getCancelOper() {
        return cancelOper;
    }

    public void setCancelOper(String cancelOper) {
        this.cancelOper = cancelOper;
    }

    @Basic
    @Column(name = "CANCEL_DATE", nullable = true)
    public Timestamp getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Timestamp cancelDate) {
        this.cancelDate = cancelDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhaStoRecipeEntity that = (PhaStoRecipeEntity) o;

        if (recipeNo != null ? !recipeNo.equals(that.recipeNo) : that.recipeNo != null) return false;
        if (recipeState != null ? !recipeState.equals(that.recipeState) : that.recipeState != null) return false;
        if (cardNo != null ? !cardNo.equals(that.cardNo) : that.cardNo != null) return false;
        if (patientName != null ? !patientName.equals(that.patientName) : that.patientName != null) return false;
        if (sexCode != null ? !sexCode.equals(that.sexCode) : that.sexCode != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (paykindCode != null ? !paykindCode.equals(that.paykindCode) : that.paykindCode != null) return false;
        if (deptCode != null ? !deptCode.equals(that.deptCode) : that.deptCode != null) return false;
        if (regDate != null ? !regDate.equals(that.regDate) : that.regDate != null) return false;
        if (doctCode != null ? !doctCode.equals(that.doctCode) : that.doctCode != null) return false;
        if (doctDept != null ? !doctDept.equals(that.doctDept) : that.doctDept != null) return false;
        if (feeOper != null ? !feeOper.equals(that.feeOper) : that.feeOper != null) return false;
        if (feeDate != null ? !feeDate.equals(that.feeDate) : that.feeDate != null) return false;
        if (invoiceNo != null ? !invoiceNo.equals(that.invoiceNo) : that.invoiceNo != null) return false;
        if (recipeCost != null ? !recipeCost.equals(that.recipeCost) : that.recipeCost != null) return false;
        if (drugedOper != null ? !drugedOper.equals(that.drugedOper) : that.drugedOper != null) return false;
        if (drugedDept != null ? !drugedDept.equals(that.drugedDept) : that.drugedDept != null) return false;
        if (drugedDate != null ? !drugedDate.equals(that.drugedDate) : that.drugedDate != null) return false;
        if (sendOper != null ? !sendOper.equals(that.sendOper) : that.sendOper != null) return false;
        if (sendDate != null ? !sendDate.equals(that.sendDate) : that.sendDate != null) return false;
        if (sendDept != null ? !sendDept.equals(that.sendDept) : that.sendDept != null) return false;
        if (validState != null ? !validState.equals(that.validState) : that.validState != null) return false;
        if (backOper != null ? !backOper.equals(that.backOper) : that.backOper != null) return false;
        if (backDate != null ? !backDate.equals(that.backDate) : that.backDate != null) return false;
        if (cancelOper != null ? !cancelOper.equals(that.cancelOper) : that.cancelOper != null) return false;
        if (cancelDate != null ? !cancelDate.equals(that.cancelDate) : that.cancelDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recipeNo != null ? recipeNo.hashCode() : 0;
        result = 31 * result + (recipeState != null ? recipeState.hashCode() : 0);
        result = 31 * result + (cardNo != null ? cardNo.hashCode() : 0);
        result = 31 * result + (patientName != null ? patientName.hashCode() : 0);
        result = 31 * result + (sexCode != null ? sexCode.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (paykindCode != null ? paykindCode.hashCode() : 0);
        result = 31 * result + (deptCode != null ? deptCode.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (doctCode != null ? doctCode.hashCode() : 0);
        result = 31 * result + (doctDept != null ? doctDept.hashCode() : 0);
        result = 31 * result + (feeOper != null ? feeOper.hashCode() : 0);
        result = 31 * result + (feeDate != null ? feeDate.hashCode() : 0);
        result = 31 * result + (invoiceNo != null ? invoiceNo.hashCode() : 0);
        result = 31 * result + (recipeCost != null ? recipeCost.hashCode() : 0);
        result = 31 * result + (drugedOper != null ? drugedOper.hashCode() : 0);
        result = 31 * result + (drugedDept != null ? drugedDept.hashCode() : 0);
        result = 31 * result + (drugedDate != null ? drugedDate.hashCode() : 0);
        result = 31 * result + (sendOper != null ? sendOper.hashCode() : 0);
        result = 31 * result + (sendDate != null ? sendDate.hashCode() : 0);
        result = 31 * result + (sendDept != null ? sendDept.hashCode() : 0);
        result = 31 * result + (validState != null ? validState.hashCode() : 0);
        result = 31 * result + (backOper != null ? backOper.hashCode() : 0);
        result = 31 * result + (backDate != null ? backDate.hashCode() : 0);
        result = 31 * result + (cancelOper != null ? cancelOper.hashCode() : 0);
        result = 31 * result + (cancelDate != null ? cancelDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhaStoRecipeEntity{" +
                "recipeNo='" + recipeNo + '\'' +
                ", recipeState='" + recipeState + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", patientName='" + patientName + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", birthday=" + birthday +
                ", paykindCode='" + paykindCode + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", regDate=" + regDate +
                ", doctCode='" + doctCode + '\'' +
                ", doctDept='" + doctDept + '\'' +
                ", feeOper='" + feeOper + '\'' +
                ", feeDate=" + feeDate +
                ", invoiceNo='" + invoiceNo + '\'' +
                ", recipeCost=" + recipeCost +
                ", drugedOper='" + drugedOper + '\'' +
                ", drugedDept='" + drugedDept + '\'' +
                ", drugedDate=" + drugedDate +
                ", sendOper='" + sendOper + '\'' +
                ", sendDate=" + sendDate +
                ", sendDept='" + sendDept + '\'' +
                ", validState='" + validState + '\'' +
                ", backOper='" + backOper + '\'' +
                ", backDate=" + backDate +
                ", cancelOper='" + cancelOper + '\'' +
                ", cancelDate=" + cancelDate +
                '}';
    }
}
