package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemDrugEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemDrugEntityExample() {
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

        public Criteria andRemNoIsNull() {
            addCriterion("REM_NO is null");
            return (Criteria) this;
        }

        public Criteria andRemNoIsNotNull() {
            addCriterion("REM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRemNoEqualTo(String value) {
            addCriterion("REM_NO =", value, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoNotEqualTo(String value) {
            addCriterion("REM_NO <>", value, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoGreaterThan(String value) {
            addCriterion("REM_NO >", value, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoGreaterThanOrEqualTo(String value) {
            addCriterion("REM_NO >=", value, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoLessThan(String value) {
            addCriterion("REM_NO <", value, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoLessThanOrEqualTo(String value) {
            addCriterion("REM_NO <=", value, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoLike(String value) {
            addCriterion("REM_NO like", value, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoNotLike(String value) {
            addCriterion("REM_NO not like", value, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoIn(List<String> values) {
            addCriterion("REM_NO in", values, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoNotIn(List<String> values) {
            addCriterion("REM_NO not in", values, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoBetween(String value1, String value2) {
            addCriterion("REM_NO between", value1, value2, "remNo");
            return (Criteria) this;
        }

        public Criteria andRemNoNotBetween(String value1, String value2) {
            addCriterion("REM_NO not between", value1, value2, "remNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoIsNull() {
            addCriterion("RECIPE_NO is null");
            return (Criteria) this;
        }

        public Criteria andRecipeNoIsNotNull() {
            addCriterion("RECIPE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeNoEqualTo(String value) {
            addCriterion("RECIPE_NO =", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoNotEqualTo(String value) {
            addCriterion("RECIPE_NO <>", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoGreaterThan(String value) {
            addCriterion("RECIPE_NO >", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPE_NO >=", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoLessThan(String value) {
            addCriterion("RECIPE_NO <", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoLessThanOrEqualTo(String value) {
            addCriterion("RECIPE_NO <=", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoLike(String value) {
            addCriterion("RECIPE_NO like", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoNotLike(String value) {
            addCriterion("RECIPE_NO not like", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoIn(List<String> values) {
            addCriterion("RECIPE_NO in", values, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoNotIn(List<String> values) {
            addCriterion("RECIPE_NO not in", values, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoBetween(String value1, String value2) {
            addCriterion("RECIPE_NO between", value1, value2, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoNotBetween(String value1, String value2) {
            addCriterion("RECIPE_NO not between", value1, value2, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("PATIENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("PATIENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("PATIENT_NAME =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("PATIENT_NAME <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("PATIENT_NAME >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_NAME >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("PATIENT_NAME <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_NAME <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("PATIENT_NAME like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("PATIENT_NAME not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("PATIENT_NAME in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("PATIENT_NAME not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("PATIENT_NAME between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("PATIENT_NAME not between", value1, value2, "patientName");
            return (Criteria) this;
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

        public Criteria andRemRemarksIsNull() {
            addCriterion("REM_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemRemarksIsNotNull() {
            addCriterion("REM_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemRemarksEqualTo(String value) {
            addCriterion("REM_REMARKS =", value, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksNotEqualTo(String value) {
            addCriterion("REM_REMARKS <>", value, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksGreaterThan(String value) {
            addCriterion("REM_REMARKS >", value, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REM_REMARKS >=", value, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksLessThan(String value) {
            addCriterion("REM_REMARKS <", value, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksLessThanOrEqualTo(String value) {
            addCriterion("REM_REMARKS <=", value, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksLike(String value) {
            addCriterion("REM_REMARKS like", value, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksNotLike(String value) {
            addCriterion("REM_REMARKS not like", value, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksIn(List<String> values) {
            addCriterion("REM_REMARKS in", values, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksNotIn(List<String> values) {
            addCriterion("REM_REMARKS not in", values, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksBetween(String value1, String value2) {
            addCriterion("REM_REMARKS between", value1, value2, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemRemarksNotBetween(String value1, String value2) {
            addCriterion("REM_REMARKS not between", value1, value2, "remRemarks");
            return (Criteria) this;
        }

        public Criteria andRemStatusIsNull() {
            addCriterion("REM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRemStatusIsNotNull() {
            addCriterion("REM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRemStatusEqualTo(Integer value) {
            addCriterion("REM_STATUS =", value, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusNotEqualTo(Integer value) {
            addCriterion("REM_STATUS <>", value, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusGreaterThan(Integer value) {
            addCriterion("REM_STATUS >", value, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("REM_STATUS >=", value, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusLessThan(Integer value) {
            addCriterion("REM_STATUS <", value, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("REM_STATUS <=", value, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusIn(List<Integer> values) {
            addCriterion("REM_STATUS in", values, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusNotIn(List<Integer> values) {
            addCriterion("REM_STATUS not in", values, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusBetween(Integer value1, Integer value2) {
            addCriterion("REM_STATUS between", value1, value2, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("REM_STATUS not between", value1, value2, "remStatus");
            return (Criteria) this;
        }

        public Criteria andRemDateIsNull() {
            addCriterion("REM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRemDateIsNotNull() {
            addCriterion("REM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRemDateEqualTo(Date value) {
            addCriterion("REM_DATE =", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateNotEqualTo(Date value) {
            addCriterion("REM_DATE <>", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateGreaterThan(Date value) {
            addCriterion("REM_DATE >", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REM_DATE >=", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateLessThan(Date value) {
            addCriterion("REM_DATE <", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateLessThanOrEqualTo(Date value) {
            addCriterion("REM_DATE <=", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateIn(List<Date> values) {
            addCriterion("REM_DATE in", values, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateNotIn(List<Date> values) {
            addCriterion("REM_DATE not in", values, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateBetween(Date value1, Date value2) {
            addCriterion("REM_DATE between", value1, value2, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateNotBetween(Date value1, Date value2) {
            addCriterion("REM_DATE not between", value1, value2, "remDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateIsNull() {
            addCriterion("DRUGED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDrugedDateIsNotNull() {
            addCriterion("DRUGED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDrugedDateEqualTo(Date value) {
            addCriterion("DRUGED_DATE =", value, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateNotEqualTo(Date value) {
            addCriterion("DRUGED_DATE <>", value, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateGreaterThan(Date value) {
            addCriterion("DRUGED_DATE >", value, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DRUGED_DATE >=", value, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateLessThan(Date value) {
            addCriterion("DRUGED_DATE <", value, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateLessThanOrEqualTo(Date value) {
            addCriterion("DRUGED_DATE <=", value, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateIn(List<Date> values) {
            addCriterion("DRUGED_DATE in", values, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateNotIn(List<Date> values) {
            addCriterion("DRUGED_DATE not in", values, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateBetween(Date value1, Date value2) {
            addCriterion("DRUGED_DATE between", value1, value2, "drugedDate");
            return (Criteria) this;
        }

        public Criteria andDrugedDateNotBetween(Date value1, Date value2) {
            addCriterion("DRUGED_DATE not between", value1, value2, "drugedDate");
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