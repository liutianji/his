package com.neuedu.his.vo;

import com.neuedu.his.jpa.pojo.RemDrugEntity;

public class RemDrugVO extends RemDrugEntity{

    private int index;//拿药序号

    public RemDrugVO() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "RemDrugVO{" +
                "index=" + index +
                '}';
    }
}
