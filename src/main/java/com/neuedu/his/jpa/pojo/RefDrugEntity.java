package com.neuedu.his.jpa.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 退药实体类
 */
@Entity
@Table(name = "ref_drug", schema = "his", catalog = "")
public class RefDrugEntity {
    private String refundNo;
    private String recipeNo;
    private Integer refStatus;
    private Double recipeCost;
    private Double refundCost;
    private String refFlag;
    private Timestamp refDate;
    private Timestamp refApplyDate;
    private String refRemarks;

    @Id
    @Column(name = "REFUND_NO")
    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    @Basic
    @Column(name = "RECIPE_NO")
    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    @Basic
    @Column(name = "REF_STATUS")
    public Integer getRefStatus() {
        return refStatus;
    }

    public void setRefStatus(Integer refStatus) {
        this.refStatus = refStatus;
    }

    @Basic
    @Column(name = "RECIPE_COST")
    public Double getRecipeCost() {
        return recipeCost;
    }

    public void setRecipeCost(Double recipeCost) {
        this.recipeCost = recipeCost;
    }

    @Basic
    @Column(name = "REFUND_COST")
    public Double getRefundCost() {
        return refundCost;
    }

    public void setRefundCost(Double refundCost) {
        this.refundCost = refundCost;
    }

    @Basic
    @Column(name = "REF_FLAG")
    public String getRefFlag() {
        return refFlag;
    }

    public void setRefFlag(String refFlag) {
        this.refFlag = refFlag;
    }

    @Basic
    @Column(name = "REF_DATE")
    public Timestamp getRefDate() {
        return refDate;
    }

    public void setRefDate(Timestamp refDate) {
        this.refDate = refDate;
    }

    @Basic
    @Column(name = "REF_APPLY_DATE")
    public Timestamp getRefApplyDate() {
        return refApplyDate;
    }

    public void setRefApplyDate(Timestamp refApplyDate) {
        this.refApplyDate = refApplyDate;
    }

    @Basic
    @Column(name = "REF_REMARKS")
    public String getRefRemarks() {
        return refRemarks;
    }

    public void setRefRemarks(String refRemarks) {
        this.refRemarks = refRemarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefDrugEntity that = (RefDrugEntity) o;

        if (refundNo != null ? !refundNo.equals(that.refundNo) : that.refundNo != null) return false;
        if (recipeNo != null ? !recipeNo.equals(that.recipeNo) : that.recipeNo != null) return false;
        if (refStatus != null ? !refStatus.equals(that.refStatus) : that.refStatus != null) return false;
        if (recipeCost != null ? !recipeCost.equals(that.recipeCost) : that.recipeCost != null) return false;
        if (refundCost != null ? !refundCost.equals(that.refundCost) : that.refundCost != null) return false;
        if (refFlag != null ? !refFlag.equals(that.refFlag) : that.refFlag != null) return false;
        if (refDate != null ? !refDate.equals(that.refDate) : that.refDate != null) return false;
        if (refApplyDate != null ? !refApplyDate.equals(that.refApplyDate) : that.refApplyDate != null) return false;
        if (refRemarks != null ? !refRemarks.equals(that.refRemarks) : that.refRemarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = refundNo != null ? refundNo.hashCode() : 0;
        result = 31 * result + (recipeNo != null ? recipeNo.hashCode() : 0);
        result = 31 * result + (refStatus != null ? refStatus.hashCode() : 0);
        result = 31 * result + (recipeCost != null ? recipeCost.hashCode() : 0);
        result = 31 * result + (refundCost != null ? refundCost.hashCode() : 0);
        result = 31 * result + (refFlag != null ? refFlag.hashCode() : 0);
        result = 31 * result + (refDate != null ? refDate.hashCode() : 0);
        result = 31 * result + (refApplyDate != null ? refApplyDate.hashCode() : 0);
        result = 31 * result + (refRemarks != null ? refRemarks.hashCode() : 0);
        return result;
    }
}
