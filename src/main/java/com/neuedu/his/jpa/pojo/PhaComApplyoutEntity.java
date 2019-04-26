package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "pha_com_applyout", schema = "his", catalog = "")
public class PhaComApplyoutEntity {
    private String outNo;
    private String recipeNo;
    private String deptCode;
    private String drugCode;
    private String tradeName;
    private String batchNo;
    private String drugType;
    private String drugQuality;
    private String specs;
    private String packUnit;
    private Integer packQty;
    private String minUnit;
    private String showFlag;
    private String showUnit;
    private Timestamp applyDate;
    private String applyState;
    private Double applyNum;
    private String modifyFlag;
    private String chargeFlag;
    private String drugedBill;
    private String drugedDept;
    private String drugedEmpl;
    private Timestamp drugedDate;
    private Double drugedNum;
    private Double doseOnce;
    private String doseUnit;
    private String usageCode;
    private String useName;
    private String dfqFreq;

    @Id
    @Column(name = "OUT_NO", nullable = false, length = 14)
    public String getOutNo() {
        return outNo;
    }

    public void setOutNo(String outNo) {
        this.outNo = outNo;
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
    @Column(name = "DEPT_CODE", nullable = true, length = 4)
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
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
    @Column(name = "BATCH_NO", nullable = true, length = 32)
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    @Basic
    @Column(name = "DRUG_TYPE", nullable = true, length = 2)
    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    @Basic
    @Column(name = "DRUG_QUALITY", nullable = true, length = 2)
    public String getDrugQuality() {
        return drugQuality;
    }

    public void setDrugQuality(String drugQuality) {
        this.drugQuality = drugQuality;
    }

    @Basic
    @Column(name = "SPECS", nullable = true, length = 32)
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Basic
    @Column(name = "PACK_UNIT", nullable = true, length = 16)
    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    @Basic
    @Column(name = "PACK_QTY", nullable = true)
    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    @Basic
    @Column(name = "MIN_UNIT", nullable = true, length = 16)
    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    @Basic
    @Column(name = "SHOW_FLAG", nullable = true, length = 1)
    public String getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(String showFlag) {
        this.showFlag = showFlag;
    }

    @Basic
    @Column(name = "SHOW_UNIT", nullable = true, length = 16)
    public String getShowUnit() {
        return showUnit;
    }

    public void setShowUnit(String showUnit) {
        this.showUnit = showUnit;
    }

    @Basic
    @Column(name = "APPLY_DATE", nullable = true)
    public Timestamp getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "APPLY_STATE", nullable = true, length = 1)
    public String getApplyState() {
        return applyState;
    }

    public void setApplyState(String applyState) {
        this.applyState = applyState;
    }

    @Basic
    @Column(name = "APPLY_NUM", nullable = true, precision = 4)
    public Double getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(Double applyNum) {
        this.applyNum = applyNum;
    }

    @Basic
    @Column(name = "MODIFY_FLAG", nullable = true, length = 1)
    public String getModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(String modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    @Basic
    @Column(name = "CHARGE_FLAG", nullable = true, length = 1)
    public String getChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
    }

    @Basic
    @Column(name = "DRUGED_BILL", nullable = true, length = 18)
    public String getDrugedBill() {
        return drugedBill;
    }

    public void setDrugedBill(String drugedBill) {
        this.drugedBill = drugedBill;
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
    @Column(name = "DRUGED_EMPL", nullable = true, length = 6)
    public String getDrugedEmpl() {
        return drugedEmpl;
    }

    public void setDrugedEmpl(String drugedEmpl) {
        this.drugedEmpl = drugedEmpl;
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
    @Column(name = "DRUGED_NUM", nullable = true, precision = 4)
    public Double getDrugedNum() {
        return drugedNum;
    }

    public void setDrugedNum(Double drugedNum) {
        this.drugedNum = drugedNum;
    }

    @Basic
    @Column(name = "DOSE_ONCE", nullable = true, precision = 4)
    public Double getDoseOnce() {
        return doseOnce;
    }

    public void setDoseOnce(Double doseOnce) {
        this.doseOnce = doseOnce;
    }

    @Basic
    @Column(name = "DOSE_UNIT", nullable = true, length = 16)
    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    @Basic
    @Column(name = "USAGE_CODE", nullable = true, length = 3)
    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    @Basic
    @Column(name = "USE_NAME", nullable = true, length = 20)
    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    @Basic
    @Column(name = "DFQ_FREQ", nullable = true, length = 6)
    public String getDfqFreq() {
        return dfqFreq;
    }

    public void setDfqFreq(String dfqFreq) {
        this.dfqFreq = dfqFreq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhaComApplyoutEntity that = (PhaComApplyoutEntity) o;

        if (outNo != null ? !outNo.equals(that.outNo) : that.outNo != null) return false;
        if (recipeNo != null ? !recipeNo.equals(that.recipeNo) : that.recipeNo != null) return false;
        if (deptCode != null ? !deptCode.equals(that.deptCode) : that.deptCode != null) return false;
        if (drugCode != null ? !drugCode.equals(that.drugCode) : that.drugCode != null) return false;
        if (tradeName != null ? !tradeName.equals(that.tradeName) : that.tradeName != null) return false;
        if (batchNo != null ? !batchNo.equals(that.batchNo) : that.batchNo != null) return false;
        if (drugType != null ? !drugType.equals(that.drugType) : that.drugType != null) return false;
        if (drugQuality != null ? !drugQuality.equals(that.drugQuality) : that.drugQuality != null) return false;
        if (specs != null ? !specs.equals(that.specs) : that.specs != null) return false;
        if (packUnit != null ? !packUnit.equals(that.packUnit) : that.packUnit != null) return false;
        if (packQty != null ? !packQty.equals(that.packQty) : that.packQty != null) return false;
        if (minUnit != null ? !minUnit.equals(that.minUnit) : that.minUnit != null) return false;
        if (showFlag != null ? !showFlag.equals(that.showFlag) : that.showFlag != null) return false;
        if (showUnit != null ? !showUnit.equals(that.showUnit) : that.showUnit != null) return false;
        if (applyDate != null ? !applyDate.equals(that.applyDate) : that.applyDate != null) return false;
        if (applyState != null ? !applyState.equals(that.applyState) : that.applyState != null) return false;
        if (applyNum != null ? !applyNum.equals(that.applyNum) : that.applyNum != null) return false;
        if (modifyFlag != null ? !modifyFlag.equals(that.modifyFlag) : that.modifyFlag != null) return false;
        if (chargeFlag != null ? !chargeFlag.equals(that.chargeFlag) : that.chargeFlag != null) return false;
        if (drugedBill != null ? !drugedBill.equals(that.drugedBill) : that.drugedBill != null) return false;
        if (drugedDept != null ? !drugedDept.equals(that.drugedDept) : that.drugedDept != null) return false;
        if (drugedEmpl != null ? !drugedEmpl.equals(that.drugedEmpl) : that.drugedEmpl != null) return false;
        if (drugedDate != null ? !drugedDate.equals(that.drugedDate) : that.drugedDate != null) return false;
        if (drugedNum != null ? !drugedNum.equals(that.drugedNum) : that.drugedNum != null) return false;
        if (doseOnce != null ? !doseOnce.equals(that.doseOnce) : that.doseOnce != null) return false;
        if (doseUnit != null ? !doseUnit.equals(that.doseUnit) : that.doseUnit != null) return false;
        if (usageCode != null ? !usageCode.equals(that.usageCode) : that.usageCode != null) return false;
        if (useName != null ? !useName.equals(that.useName) : that.useName != null) return false;
        if (dfqFreq != null ? !dfqFreq.equals(that.dfqFreq) : that.dfqFreq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = outNo != null ? outNo.hashCode() : 0;
        result = 31 * result + (recipeNo != null ? recipeNo.hashCode() : 0);
        result = 31 * result + (deptCode != null ? deptCode.hashCode() : 0);
        result = 31 * result + (drugCode != null ? drugCode.hashCode() : 0);
        result = 31 * result + (tradeName != null ? tradeName.hashCode() : 0);
        result = 31 * result + (batchNo != null ? batchNo.hashCode() : 0);
        result = 31 * result + (drugType != null ? drugType.hashCode() : 0);
        result = 31 * result + (drugQuality != null ? drugQuality.hashCode() : 0);
        result = 31 * result + (specs != null ? specs.hashCode() : 0);
        result = 31 * result + (packUnit != null ? packUnit.hashCode() : 0);
        result = 31 * result + (packQty != null ? packQty.hashCode() : 0);
        result = 31 * result + (minUnit != null ? minUnit.hashCode() : 0);
        result = 31 * result + (showFlag != null ? showFlag.hashCode() : 0);
        result = 31 * result + (showUnit != null ? showUnit.hashCode() : 0);
        result = 31 * result + (applyDate != null ? applyDate.hashCode() : 0);
        result = 31 * result + (applyState != null ? applyState.hashCode() : 0);
        result = 31 * result + (applyNum != null ? applyNum.hashCode() : 0);
        result = 31 * result + (modifyFlag != null ? modifyFlag.hashCode() : 0);
        result = 31 * result + (chargeFlag != null ? chargeFlag.hashCode() : 0);
        result = 31 * result + (drugedBill != null ? drugedBill.hashCode() : 0);
        result = 31 * result + (drugedDept != null ? drugedDept.hashCode() : 0);
        result = 31 * result + (drugedEmpl != null ? drugedEmpl.hashCode() : 0);
        result = 31 * result + (drugedDate != null ? drugedDate.hashCode() : 0);
        result = 31 * result + (drugedNum != null ? drugedNum.hashCode() : 0);
        result = 31 * result + (doseOnce != null ? doseOnce.hashCode() : 0);
        result = 31 * result + (doseUnit != null ? doseUnit.hashCode() : 0);
        result = 31 * result + (usageCode != null ? usageCode.hashCode() : 0);
        result = 31 * result + (useName != null ? useName.hashCode() : 0);
        result = 31 * result + (dfqFreq != null ? dfqFreq.hashCode() : 0);
        return result;
    }
}
