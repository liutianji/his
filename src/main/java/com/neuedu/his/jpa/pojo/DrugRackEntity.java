package com.neuedu.his.jpa.pojo;

import javax.persistence.*;

@Entity
@Table(name = "drug_rack", schema = "his", catalog = "")
public class DrugRackEntity {
    private String rackNo;
    private String rackName;
    private Integer maxCapacity;
    private Integer usedCapacity;
    private String capacityUnit;
    private String drugCode;
    private String drugName;

    @Id
    @Column(name = "RACK_NO", nullable = false, length = 12)
    public String getRackNo() {
        return rackNo;
    }

    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    @Basic
    @Column(name = "RACK_NAME", nullable = true, length = 20)
    public String getRackName() {
        return rackName;
    }

    public void setRackName(String rackName) {
        this.rackName = rackName;
    }

    @Basic
    @Column(name = "MAX_CAPACITY", nullable = true)
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Basic
    @Column(name = "USED_CAPACITY", nullable = true)
    public Integer getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(Integer usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    @Basic
    @Column(name = "CAPACITY_UNIT", nullable = true, length = 16)
    public String getCapacityUnit() {
        return capacityUnit;
    }

    public void setCapacityUnit(String capacityUnit) {
        this.capacityUnit = capacityUnit;
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
    @Column(name = "DRUG_NAME", nullable = true, length = 50)
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrugRackEntity that = (DrugRackEntity) o;

        if (rackNo != null ? !rackNo.equals(that.rackNo) : that.rackNo != null) return false;
        if (rackName != null ? !rackName.equals(that.rackName) : that.rackName != null) return false;
        if (maxCapacity != null ? !maxCapacity.equals(that.maxCapacity) : that.maxCapacity != null) return false;
        if (usedCapacity != null ? !usedCapacity.equals(that.usedCapacity) : that.usedCapacity != null) return false;
        if (capacityUnit != null ? !capacityUnit.equals(that.capacityUnit) : that.capacityUnit != null) return false;
        if (drugCode != null ? !drugCode.equals(that.drugCode) : that.drugCode != null) return false;
        if (drugName != null ? !drugName.equals(that.drugName) : that.drugName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rackNo != null ? rackNo.hashCode() : 0;
        result = 31 * result + (rackName != null ? rackName.hashCode() : 0);
        result = 31 * result + (maxCapacity != null ? maxCapacity.hashCode() : 0);
        result = 31 * result + (usedCapacity != null ? usedCapacity.hashCode() : 0);
        result = 31 * result + (capacityUnit != null ? capacityUnit.hashCode() : 0);
        result = 31 * result + (drugCode != null ? drugCode.hashCode() : 0);
        result = 31 * result + (drugName != null ? drugName.hashCode() : 0);
        return result;
    }
}
