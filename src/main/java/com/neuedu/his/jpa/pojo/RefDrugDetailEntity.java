package com.neuedu.his.jpa.pojo;

import javax.persistence.*;

/**
 * 退药详情实体类
 */
@Entity
@Table(name = "ref_drug_detail", schema = "his", catalog = "")
public class RefDrugDetailEntity {
    private String refundDetailNo;
    private String drugCode;
    private String tradeName;
    private String specs;
    private Double applyNum;
    private Double retNum;
    private String showUnit;
    private Double unitPrice;

    @Id
    @Column(name = "REFUND_DETAIL_NO")
    public String getRefundDetailNo() {
        return refundDetailNo;
    }

    public void setRefundDetailNo(String refundDetailNo) {
        this.refundDetailNo = refundDetailNo;
    }

    @Basic
    @Column(name = "DRUG_CODE")
    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
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
    @Column(name = "SPECS")
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Basic
    @Column(name = "APPLY_NUM")
    public Double getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(Double applyNum) {
        this.applyNum = applyNum;
    }

    @Basic
    @Column(name = "RET_NUM")
    public Double getRetNum() {
        return retNum;
    }

    public void setRetNum(Double retNum) {
        this.retNum = retNum;
    }

    @Basic
    @Column(name = "SHOW_UNIT")
    public String getShowUnit() {
        return showUnit;
    }

    public void setShowUnit(String showUnit) {
        this.showUnit = showUnit;
    }

    @Basic
    @Column(name = "UNIT_PRICE")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefDrugDetailEntity that = (RefDrugDetailEntity) o;

        if (refundDetailNo != null ? !refundDetailNo.equals(that.refundDetailNo) : that.refundDetailNo != null)
            return false;
        if (drugCode != null ? !drugCode.equals(that.drugCode) : that.drugCode != null) return false;
        if (tradeName != null ? !tradeName.equals(that.tradeName) : that.tradeName != null) return false;
        if (specs != null ? !specs.equals(that.specs) : that.specs != null) return false;
        if (applyNum != null ? !applyNum.equals(that.applyNum) : that.applyNum != null) return false;
        if (retNum != null ? !retNum.equals(that.retNum) : that.retNum != null) return false;
        if (showUnit != null ? !showUnit.equals(that.showUnit) : that.showUnit != null) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = refundDetailNo != null ? refundDetailNo.hashCode() : 0;
        result = 31 * result + (drugCode != null ? drugCode.hashCode() : 0);
        result = 31 * result + (tradeName != null ? tradeName.hashCode() : 0);
        result = 31 * result + (specs != null ? specs.hashCode() : 0);
        result = 31 * result + (applyNum != null ? applyNum.hashCode() : 0);
        result = 31 * result + (retNum != null ? retNum.hashCode() : 0);
        result = 31 * result + (showUnit != null ? showUnit.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        return result;
    }
}
