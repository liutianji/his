package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorkTableEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkTableEntityExample() {
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

        public Criteria andWtableNoIsNull() {
            addCriterion("WTABLE_NO is null");
            return (Criteria) this;
        }

        public Criteria andWtableNoIsNotNull() {
            addCriterion("WTABLE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWtableNoEqualTo(String value) {
            addCriterion("WTABLE_NO =", value, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoNotEqualTo(String value) {
            addCriterion("WTABLE_NO <>", value, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoGreaterThan(String value) {
            addCriterion("WTABLE_NO >", value, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoGreaterThanOrEqualTo(String value) {
            addCriterion("WTABLE_NO >=", value, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoLessThan(String value) {
            addCriterion("WTABLE_NO <", value, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoLessThanOrEqualTo(String value) {
            addCriterion("WTABLE_NO <=", value, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoLike(String value) {
            addCriterion("WTABLE_NO like", value, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoNotLike(String value) {
            addCriterion("WTABLE_NO not like", value, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoIn(List<String> values) {
            addCriterion("WTABLE_NO in", values, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoNotIn(List<String> values) {
            addCriterion("WTABLE_NO not in", values, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoBetween(String value1, String value2) {
            addCriterion("WTABLE_NO between", value1, value2, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNoNotBetween(String value1, String value2) {
            addCriterion("WTABLE_NO not between", value1, value2, "wtableNo");
            return (Criteria) this;
        }

        public Criteria andWtableNameIsNull() {
            addCriterion("WTABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWtableNameIsNotNull() {
            addCriterion("WTABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWtableNameEqualTo(String value) {
            addCriterion("WTABLE_NAME =", value, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameNotEqualTo(String value) {
            addCriterion("WTABLE_NAME <>", value, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameGreaterThan(String value) {
            addCriterion("WTABLE_NAME >", value, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameGreaterThanOrEqualTo(String value) {
            addCriterion("WTABLE_NAME >=", value, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameLessThan(String value) {
            addCriterion("WTABLE_NAME <", value, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameLessThanOrEqualTo(String value) {
            addCriterion("WTABLE_NAME <=", value, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameLike(String value) {
            addCriterion("WTABLE_NAME like", value, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameNotLike(String value) {
            addCriterion("WTABLE_NAME not like", value, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameIn(List<String> values) {
            addCriterion("WTABLE_NAME in", values, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameNotIn(List<String> values) {
            addCriterion("WTABLE_NAME not in", values, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameBetween(String value1, String value2) {
            addCriterion("WTABLE_NAME between", value1, value2, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtableNameNotBetween(String value1, String value2) {
            addCriterion("WTABLE_NAME not between", value1, value2, "wtableName");
            return (Criteria) this;
        }

        public Criteria andWtablePositionIsNull() {
            addCriterion("WTABLE_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andWtablePositionIsNotNull() {
            addCriterion("WTABLE_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andWtablePositionEqualTo(String value) {
            addCriterion("WTABLE_POSITION =", value, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionNotEqualTo(String value) {
            addCriterion("WTABLE_POSITION <>", value, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionGreaterThan(String value) {
            addCriterion("WTABLE_POSITION >", value, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionGreaterThanOrEqualTo(String value) {
            addCriterion("WTABLE_POSITION >=", value, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionLessThan(String value) {
            addCriterion("WTABLE_POSITION <", value, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionLessThanOrEqualTo(String value) {
            addCriterion("WTABLE_POSITION <=", value, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionLike(String value) {
            addCriterion("WTABLE_POSITION like", value, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionNotLike(String value) {
            addCriterion("WTABLE_POSITION not like", value, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionIn(List<String> values) {
            addCriterion("WTABLE_POSITION in", values, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionNotIn(List<String> values) {
            addCriterion("WTABLE_POSITION not in", values, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionBetween(String value1, String value2) {
            addCriterion("WTABLE_POSITION between", value1, value2, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtablePositionNotBetween(String value1, String value2) {
            addCriterion("WTABLE_POSITION not between", value1, value2, "wtablePosition");
            return (Criteria) this;
        }

        public Criteria andWtableFlagIsNull() {
            addCriterion("WTABLE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andWtableFlagIsNotNull() {
            addCriterion("WTABLE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andWtableFlagEqualTo(String value) {
            addCriterion("WTABLE_FLAG =", value, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagNotEqualTo(String value) {
            addCriterion("WTABLE_FLAG <>", value, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagGreaterThan(String value) {
            addCriterion("WTABLE_FLAG >", value, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("WTABLE_FLAG >=", value, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagLessThan(String value) {
            addCriterion("WTABLE_FLAG <", value, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagLessThanOrEqualTo(String value) {
            addCriterion("WTABLE_FLAG <=", value, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagLike(String value) {
            addCriterion("WTABLE_FLAG like", value, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagNotLike(String value) {
            addCriterion("WTABLE_FLAG not like", value, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagIn(List<String> values) {
            addCriterion("WTABLE_FLAG in", values, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagNotIn(List<String> values) {
            addCriterion("WTABLE_FLAG not in", values, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagBetween(String value1, String value2) {
            addCriterion("WTABLE_FLAG between", value1, value2, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andWtableFlagNotBetween(String value1, String value2) {
            addCriterion("WTABLE_FLAG not between", value1, value2, "wtableFlag");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNull() {
            addCriterion("MAX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNotNull() {
            addCriterion("MAX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumEqualTo(Integer value) {
            addCriterion("MAX_NUM =", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotEqualTo(Integer value) {
            addCriterion("MAX_NUM <>", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThan(Integer value) {
            addCriterion("MAX_NUM >", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_NUM >=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThan(Integer value) {
            addCriterion("MAX_NUM <", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_NUM <=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumIn(List<Integer> values) {
            addCriterion("MAX_NUM in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotIn(List<Integer> values) {
            addCriterion("MAX_NUM not in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumBetween(Integer value1, Integer value2) {
            addCriterion("MAX_NUM between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_NUM not between", value1, value2, "maxNum");
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