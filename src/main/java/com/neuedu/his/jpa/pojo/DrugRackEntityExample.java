package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugRackEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugRackEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRackNoIsNull() {
            addCriterion("RACK_NO is null");
            return (Criteria) this;
        }

        public Criteria andRackNoIsNotNull() {
            addCriterion("RACK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRackNoEqualTo(String value) {
            addCriterion("RACK_NO =", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoNotEqualTo(String value) {
            addCriterion("RACK_NO <>", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoGreaterThan(String value) {
            addCriterion("RACK_NO >", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoGreaterThanOrEqualTo(String value) {
            addCriterion("RACK_NO >=", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoLessThan(String value) {
            addCriterion("RACK_NO <", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoLessThanOrEqualTo(String value) {
            addCriterion("RACK_NO <=", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoLike(String value) {
            addCriterion("RACK_NO like", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoNotLike(String value) {
            addCriterion("RACK_NO not like", value, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoIn(List<String> values) {
            addCriterion("RACK_NO in", values, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoNotIn(List<String> values) {
            addCriterion("RACK_NO not in", values, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoBetween(String value1, String value2) {
            addCriterion("RACK_NO between", value1, value2, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNoNotBetween(String value1, String value2) {
            addCriterion("RACK_NO not between", value1, value2, "rackNo");
            return (Criteria) this;
        }

        public Criteria andRackNameIsNull() {
            addCriterion("RACK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRackNameIsNotNull() {
            addCriterion("RACK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRackNameEqualTo(String value) {
            addCriterion("RACK_NAME =", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotEqualTo(String value) {
            addCriterion("RACK_NAME <>", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameGreaterThan(String value) {
            addCriterion("RACK_NAME >", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameGreaterThanOrEqualTo(String value) {
            addCriterion("RACK_NAME >=", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLessThan(String value) {
            addCriterion("RACK_NAME <", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLessThanOrEqualTo(String value) {
            addCriterion("RACK_NAME <=", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameLike(String value) {
            addCriterion("RACK_NAME like", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotLike(String value) {
            addCriterion("RACK_NAME not like", value, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameIn(List<String> values) {
            addCriterion("RACK_NAME in", values, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotIn(List<String> values) {
            addCriterion("RACK_NAME not in", values, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameBetween(String value1, String value2) {
            addCriterion("RACK_NAME between", value1, value2, "rackName");
            return (Criteria) this;
        }

        public Criteria andRackNameNotBetween(String value1, String value2) {
            addCriterion("RACK_NAME not between", value1, value2, "rackName");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityIsNull() {
            addCriterion("MAX_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityIsNotNull() {
            addCriterion("MAX_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityEqualTo(Integer value) {
            addCriterion("MAX_CAPACITY =", value, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityNotEqualTo(Integer value) {
            addCriterion("MAX_CAPACITY <>", value, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityGreaterThan(Integer value) {
            addCriterion("MAX_CAPACITY >", value, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_CAPACITY >=", value, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityLessThan(Integer value) {
            addCriterion("MAX_CAPACITY <", value, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_CAPACITY <=", value, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityIn(List<Integer> values) {
            addCriterion("MAX_CAPACITY in", values, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityNotIn(List<Integer> values) {
            addCriterion("MAX_CAPACITY not in", values, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityBetween(Integer value1, Integer value2) {
            addCriterion("MAX_CAPACITY between", value1, value2, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andMaxCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_CAPACITY not between", value1, value2, "maxCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIsNull() {
            addCriterion("USED_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIsNotNull() {
            addCriterion("USED_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityEqualTo(Integer value) {
            addCriterion("USED_CAPACITY =", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotEqualTo(Integer value) {
            addCriterion("USED_CAPACITY <>", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityGreaterThan(Integer value) {
            addCriterion("USED_CAPACITY >", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("USED_CAPACITY >=", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityLessThan(Integer value) {
            addCriterion("USED_CAPACITY <", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("USED_CAPACITY <=", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIn(List<Integer> values) {
            addCriterion("USED_CAPACITY in", values, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotIn(List<Integer> values) {
            addCriterion("USED_CAPACITY not in", values, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityBetween(Integer value1, Integer value2) {
            addCriterion("USED_CAPACITY between", value1, value2, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("USED_CAPACITY not between", value1, value2, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitIsNull() {
            addCriterion("CAPACITY_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitIsNotNull() {
            addCriterion("CAPACITY_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitEqualTo(String value) {
            addCriterion("CAPACITY_UNIT =", value, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitNotEqualTo(String value) {
            addCriterion("CAPACITY_UNIT <>", value, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitGreaterThan(String value) {
            addCriterion("CAPACITY_UNIT >", value, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitGreaterThanOrEqualTo(String value) {
            addCriterion("CAPACITY_UNIT >=", value, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitLessThan(String value) {
            addCriterion("CAPACITY_UNIT <", value, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitLessThanOrEqualTo(String value) {
            addCriterion("CAPACITY_UNIT <=", value, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitLike(String value) {
            addCriterion("CAPACITY_UNIT like", value, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitNotLike(String value) {
            addCriterion("CAPACITY_UNIT not like", value, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitIn(List<String> values) {
            addCriterion("CAPACITY_UNIT in", values, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitNotIn(List<String> values) {
            addCriterion("CAPACITY_UNIT not in", values, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitBetween(String value1, String value2) {
            addCriterion("CAPACITY_UNIT between", value1, value2, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andCapacityUnitNotBetween(String value1, String value2) {
            addCriterion("CAPACITY_UNIT not between", value1, value2, "capacityUnit");
            return (Criteria) this;
        }

        public Criteria andDrugCodeIsNull() {
            addCriterion("DRUG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDrugCodeIsNotNull() {
            addCriterion("DRUG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDrugCodeEqualTo(String value) {
            addCriterion("DRUG_CODE =", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeNotEqualTo(String value) {
            addCriterion("DRUG_CODE <>", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeGreaterThan(String value) {
            addCriterion("DRUG_CODE >", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_CODE >=", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeLessThan(String value) {
            addCriterion("DRUG_CODE <", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeLessThanOrEqualTo(String value) {
            addCriterion("DRUG_CODE <=", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeLike(String value) {
            addCriterion("DRUG_CODE like", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeNotLike(String value) {
            addCriterion("DRUG_CODE not like", value, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeIn(List<String> values) {
            addCriterion("DRUG_CODE in", values, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeNotIn(List<String> values) {
            addCriterion("DRUG_CODE not in", values, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeBetween(String value1, String value2) {
            addCriterion("DRUG_CODE between", value1, value2, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugCodeNotBetween(String value1, String value2) {
            addCriterion("DRUG_CODE not between", value1, value2, "drugCode");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNull() {
            addCriterion("DRUG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDrugNameIsNotNull() {
            addCriterion("DRUG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNameEqualTo(String value) {
            addCriterion("DRUG_NAME =", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotEqualTo(String value) {
            addCriterion("DRUG_NAME <>", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThan(String value) {
            addCriterion("DRUG_NAME >", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_NAME >=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThan(String value) {
            addCriterion("DRUG_NAME <", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLessThanOrEqualTo(String value) {
            addCriterion("DRUG_NAME <=", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameLike(String value) {
            addCriterion("DRUG_NAME like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotLike(String value) {
            addCriterion("DRUG_NAME not like", value, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameIn(List<String> values) {
            addCriterion("DRUG_NAME in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotIn(List<String> values) {
            addCriterion("DRUG_NAME not in", values, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameBetween(String value1, String value2) {
            addCriterion("DRUG_NAME between", value1, value2, "drugName");
            return (Criteria) this;
        }

        public Criteria andDrugNameNotBetween(String value1, String value2) {
            addCriterion("DRUG_NAME not between", value1, value2, "drugName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}