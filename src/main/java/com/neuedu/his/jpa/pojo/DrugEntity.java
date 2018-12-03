package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
/**
 * 药品实体类
 */
@Entity
@Table(name = "drug", schema = "his", catalog = "")
public class DrugEntity {
    private String drugCode;
    private String tradeName;
    private String batchNo;
    private String specs;
    private String packUnit;
    private Integer packQty;
    private Double unitPrice;
    private Integer putOnQty;
    private Integer putOffQty;
    private Integer saleQty;

    @Id
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
    @Column(name = "BATCH_NO")
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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
    @Column(name = "PACK_UNIT")
    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    @Basic
    @Column(name = "PACK_QTY")
    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    @Basic
    @Column(name = "UNIT_PRICE")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "PUT_ON_QTY")
    public Integer getPutOnQty() {
        return putOnQty;
    }

    public void setPutOnQty(Integer putOnQty) {
        this.putOnQty = putOnQty;
    }

    @Basic
    @Column(name = "PUT_OFF_QTY")
    public Integer getPutOffQty() {
        return putOffQty;
    }

    public void setPutOffQty(Integer putOffQty) {
        this.putOffQty = putOffQty;
    }

    @Basic
    @Column(name = "SALE_QTY")
    public Integer getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(Integer saleQty) {
        this.saleQty = saleQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrugEntity that = (DrugEntity) o;

        if (drugCode != null ? !drugCode.equals(that.drugCode) : that.drugCode != null) return false;
        if (tradeName != null ? !tradeName.equals(that.tradeName) : that.tradeName != null) return false;
        if (batchNo != null ? !batchNo.equals(that.batchNo) : that.batchNo != null) return false;
        if (specs != null ? !specs.equals(that.specs) : that.specs != null) return false;
        if (packUnit != null ? !packUnit.equals(that.packUnit) : that.packUnit != null) return false;
        if (packQty != null ? !packQty.equals(that.packQty) : that.packQty != null) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
        if (putOnQty != null ? !putOnQty.equals(that.putOnQty) : that.putOnQty != null) return false;
        if (putOffQty != null ? !putOffQty.equals(that.putOffQty) : that.putOffQty != null) return false;
        if (saleQty != null ? !saleQty.equals(that.saleQty) : that.saleQty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = drugCode != null ? drugCode.hashCode() : 0;
        result = 31 * result + (tradeName != null ? tradeName.hashCode() : 0);
        result = 31 * result + (batchNo != null ? batchNo.hashCode() : 0);
        result = 31 * result + (specs != null ? specs.hashCode() : 0);
        result = 31 * result + (packUnit != null ? packUnit.hashCode() : 0);
        result = 31 * result + (packQty != null ? packQty.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (putOnQty != null ? putOnQty.hashCode() : 0);
        result = 31 * result + (putOffQty != null ? putOffQty.hashCode() : 0);
        result = 31 * result + (saleQty != null ? saleQty.hashCode() : 0);
        return result;
    }
}
