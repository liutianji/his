package com.neuedu.his.jpa.pojo;

import javax.persistence.*;

@Entity
@Table(name = "work_table", schema = "his", catalog = "")
public class WorkTableEntity {
    private String wtableNo;
    private String wtableName;
    private String wtablePosition;
    private String wtableFlag;
    private Integer maxNum;

    @Id
    @Column(name = "WTABLE_NO", nullable = false, length = 12)
    public String getWtableNo() {
        return wtableNo;
    }

    public void setWtableNo(String wtableNo) {
        this.wtableNo = wtableNo;
    }

    @Basic
    @Column(name = "WTABLE_NAME", nullable = true, length = 40)
    public String getWtableName() {
        return wtableName;
    }

    public void setWtableName(String wtableName) {
        this.wtableName = wtableName;
    }

    @Basic
    @Column(name = "WTABLE_POSITION", nullable = true, length = 14)
    public String getWtablePosition() {
        return wtablePosition;
    }

    public void setWtablePosition(String wtablePosition) {
        this.wtablePosition = wtablePosition;
    }

    @Basic
    @Column(name = "WTABLE_FLAG", nullable = true, length = 2)
    public String getWtableFlag() {
        return wtableFlag;
    }

    public void setWtableFlag(String wtableFlag) {
        this.wtableFlag = wtableFlag;
    }

    @Basic
    @Column(name = "MAX_NUM", nullable = true)
    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkTableEntity that = (WorkTableEntity) o;

        if (wtableNo != null ? !wtableNo.equals(that.wtableNo) : that.wtableNo != null) return false;
        if (wtableName != null ? !wtableName.equals(that.wtableName) : that.wtableName != null) return false;
        if (wtablePosition != null ? !wtablePosition.equals(that.wtablePosition) : that.wtablePosition != null)
            return false;
        if (wtableFlag != null ? !wtableFlag.equals(that.wtableFlag) : that.wtableFlag != null) return false;
        if (maxNum != null ? !maxNum.equals(that.maxNum) : that.maxNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wtableNo != null ? wtableNo.hashCode() : 0;
        result = 31 * result + (wtableName != null ? wtableName.hashCode() : 0);
        result = 31 * result + (wtablePosition != null ? wtablePosition.hashCode() : 0);
        result = 31 * result + (wtableFlag != null ? wtableFlag.hashCode() : 0);
        result = 31 * result + (maxNum != null ? maxNum.hashCode() : 0);
        return result;
    }
}
