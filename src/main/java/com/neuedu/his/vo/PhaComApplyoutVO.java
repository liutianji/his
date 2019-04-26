package com.neuedu.his.vo;

import com.neuedu.his.jpa.pojo.PhaComApplyoutEntity;

public class PhaComApplyoutVO extends PhaComApplyoutEntity{

    public PhaComApplyoutVO() {
    }


    private double unitPrice; //药品单价

    private double sumSale;//单价乘以数量

    public double getSumSale() {
        return sumSale;
    }

    public void setSumSale() {
        this.sumSale = this.unitPrice*this.getApplyNum();
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


}
