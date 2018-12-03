package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PhaStoRecipeEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhaStoRecipeEntityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andRecipeStateIsNull() {
            addCriterion("RECIPE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRecipeStateIsNotNull() {
            addCriterion("RECIPE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeStateEqualTo(String value) {
            addCriterion("RECIPE_STATE =", value, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateNotEqualTo(String value) {
            addCriterion("RECIPE_STATE <>", value, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateGreaterThan(String value) {
            addCriterion("RECIPE_STATE >", value, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPE_STATE >=", value, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateLessThan(String value) {
            addCriterion("RECIPE_STATE <", value, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateLessThanOrEqualTo(String value) {
            addCriterion("RECIPE_STATE <=", value, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateLike(String value) {
            addCriterion("RECIPE_STATE like", value, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateNotLike(String value) {
            addCriterion("RECIPE_STATE not like", value, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateIn(List<String> values) {
            addCriterion("RECIPE_STATE in", values, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateNotIn(List<String> values) {
            addCriterion("RECIPE_STATE not in", values, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateBetween(String value1, String value2) {
            addCriterion("RECIPE_STATE between", value1, value2, "recipeState");
            return (Criteria) this;
        }

        public Criteria andRecipeStateNotBetween(String value1, String value2) {
            addCriterion("RECIPE_STATE not between", value1, value2, "recipeState");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
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

        public Criteria andSexCodeIsNull() {
            addCriterion("SEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSexCodeIsNotNull() {
            addCriterion("SEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSexCodeEqualTo(String value) {
            addCriterion("SEX_CODE =", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotEqualTo(String value) {
            addCriterion("SEX_CODE <>", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeGreaterThan(String value) {
            addCriterion("SEX_CODE >", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SEX_CODE >=", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLessThan(String value) {
            addCriterion("SEX_CODE <", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLessThanOrEqualTo(String value) {
            addCriterion("SEX_CODE <=", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLike(String value) {
            addCriterion("SEX_CODE like", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotLike(String value) {
            addCriterion("SEX_CODE not like", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeIn(List<String> values) {
            addCriterion("SEX_CODE in", values, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotIn(List<String> values) {
            addCriterion("SEX_CODE not in", values, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeBetween(String value1, String value2) {
            addCriterion("SEX_CODE between", value1, value2, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotBetween(String value1, String value2) {
            addCriterion("SEX_CODE not between", value1, value2, "sexCode");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeIsNull() {
            addCriterion("PAYKIND_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeIsNotNull() {
            addCriterion("PAYKIND_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeEqualTo(String value) {
            addCriterion("PAYKIND_CODE =", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeNotEqualTo(String value) {
            addCriterion("PAYKIND_CODE <>", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeGreaterThan(String value) {
            addCriterion("PAYKIND_CODE >", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYKIND_CODE >=", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeLessThan(String value) {
            addCriterion("PAYKIND_CODE <", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYKIND_CODE <=", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeLike(String value) {
            addCriterion("PAYKIND_CODE like", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeNotLike(String value) {
            addCriterion("PAYKIND_CODE not like", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeIn(List<String> values) {
            addCriterion("PAYKIND_CODE in", values, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeNotIn(List<String> values) {
            addCriterion("PAYKIND_CODE not in", values, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeBetween(String value1, String value2) {
            addCriterion("PAYKIND_CODE between", value1, value2, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeNotBetween(String value1, String value2) {
            addCriterion("PAYKIND_CODE not between", value1, value2, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("REG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("REG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("REG_DATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("REG_DATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("REG_DATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_DATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("REG_DATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("REG_DATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("REG_DATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("REG_DATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("REG_DATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("REG_DATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andDoctCodeIsNull() {
            addCriterion("DOCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDoctCodeIsNotNull() {
            addCriterion("DOCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDoctCodeEqualTo(String value) {
            addCriterion("DOCT_CODE =", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeNotEqualTo(String value) {
            addCriterion("DOCT_CODE <>", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeGreaterThan(String value) {
            addCriterion("DOCT_CODE >", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DOCT_CODE >=", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeLessThan(String value) {
            addCriterion("DOCT_CODE <", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeLessThanOrEqualTo(String value) {
            addCriterion("DOCT_CODE <=", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeLike(String value) {
            addCriterion("DOCT_CODE like", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeNotLike(String value) {
            addCriterion("DOCT_CODE not like", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeIn(List<String> values) {
            addCriterion("DOCT_CODE in", values, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeNotIn(List<String> values) {
            addCriterion("DOCT_CODE not in", values, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeBetween(String value1, String value2) {
            addCriterion("DOCT_CODE between", value1, value2, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeNotBetween(String value1, String value2) {
            addCriterion("DOCT_CODE not between", value1, value2, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctDeptIsNull() {
            addCriterion("DOCT_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDoctDeptIsNotNull() {
            addCriterion("DOCT_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDoctDeptEqualTo(String value) {
            addCriterion("DOCT_DEPT =", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptNotEqualTo(String value) {
            addCriterion("DOCT_DEPT <>", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptGreaterThan(String value) {
            addCriterion("DOCT_DEPT >", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DOCT_DEPT >=", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptLessThan(String value) {
            addCriterion("DOCT_DEPT <", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptLessThanOrEqualTo(String value) {
            addCriterion("DOCT_DEPT <=", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptLike(String value) {
            addCriterion("DOCT_DEPT like", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptNotLike(String value) {
            addCriterion("DOCT_DEPT not like", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptIn(List<String> values) {
            addCriterion("DOCT_DEPT in", values, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptNotIn(List<String> values) {
            addCriterion("DOCT_DEPT not in", values, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptBetween(String value1, String value2) {
            addCriterion("DOCT_DEPT between", value1, value2, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptNotBetween(String value1, String value2) {
            addCriterion("DOCT_DEPT not between", value1, value2, "doctDept");
            return (Criteria) this;
        }

        public Criteria andFeeOperIsNull() {
            addCriterion("FEE_OPER is null");
            return (Criteria) this;
        }

        public Criteria andFeeOperIsNotNull() {
            addCriterion("FEE_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andFeeOperEqualTo(String value) {
            addCriterion("FEE_OPER =", value, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperNotEqualTo(String value) {
            addCriterion("FEE_OPER <>", value, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperGreaterThan(String value) {
            addCriterion("FEE_OPER >", value, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_OPER >=", value, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperLessThan(String value) {
            addCriterion("FEE_OPER <", value, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperLessThanOrEqualTo(String value) {
            addCriterion("FEE_OPER <=", value, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperLike(String value) {
            addCriterion("FEE_OPER like", value, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperNotLike(String value) {
            addCriterion("FEE_OPER not like", value, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperIn(List<String> values) {
            addCriterion("FEE_OPER in", values, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperNotIn(List<String> values) {
            addCriterion("FEE_OPER not in", values, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperBetween(String value1, String value2) {
            addCriterion("FEE_OPER between", value1, value2, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeOperNotBetween(String value1, String value2) {
            addCriterion("FEE_OPER not between", value1, value2, "feeOper");
            return (Criteria) this;
        }

        public Criteria andFeeDateIsNull() {
            addCriterion("FEE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFeeDateIsNotNull() {
            addCriterion("FEE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeDateEqualTo(Date value) {
            addCriterion("FEE_DATE =", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotEqualTo(Date value) {
            addCriterion("FEE_DATE <>", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateGreaterThan(Date value) {
            addCriterion("FEE_DATE >", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FEE_DATE >=", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateLessThan(Date value) {
            addCriterion("FEE_DATE <", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateLessThanOrEqualTo(Date value) {
            addCriterion("FEE_DATE <=", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateIn(List<Date> values) {
            addCriterion("FEE_DATE in", values, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotIn(List<Date> values) {
            addCriterion("FEE_DATE not in", values, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateBetween(Date value1, Date value2) {
            addCriterion("FEE_DATE between", value1, value2, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotBetween(Date value1, Date value2) {
            addCriterion("FEE_DATE not between", value1, value2, "feeDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("INVOICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("INVOICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("INVOICE_NO =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("INVOICE_NO <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("INVOICE_NO >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("INVOICE_NO <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("INVOICE_NO like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("INVOICE_NO not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("INVOICE_NO in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("INVOICE_NO not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("INVOICE_NO between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NO not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andRecipeCostIsNull() {
            addCriterion("RECIPE_COST is null");
            return (Criteria) this;
        }

        public Criteria andRecipeCostIsNotNull() {
            addCriterion("RECIPE_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeCostEqualTo(Double value) {
            addCriterion("RECIPE_COST =", value, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostNotEqualTo(Double value) {
            addCriterion("RECIPE_COST <>", value, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostGreaterThan(Double value) {
            addCriterion("RECIPE_COST >", value, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostGreaterThanOrEqualTo(Double value) {
            addCriterion("RECIPE_COST >=", value, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostLessThan(Double value) {
            addCriterion("RECIPE_COST <", value, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostLessThanOrEqualTo(Double value) {
            addCriterion("RECIPE_COST <=", value, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostIn(List<Double> values) {
            addCriterion("RECIPE_COST in", values, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostNotIn(List<Double> values) {
            addCriterion("RECIPE_COST not in", values, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostBetween(Double value1, Double value2) {
            addCriterion("RECIPE_COST between", value1, value2, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andRecipeCostNotBetween(Double value1, Double value2) {
            addCriterion("RECIPE_COST not between", value1, value2, "recipeCost");
            return (Criteria) this;
        }

        public Criteria andDrugedOperIsNull() {
            addCriterion("DRUGED_OPER is null");
            return (Criteria) this;
        }

        public Criteria andDrugedOperIsNotNull() {
            addCriterion("DRUGED_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andDrugedOperEqualTo(String value) {
            addCriterion("DRUGED_OPER =", value, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperNotEqualTo(String value) {
            addCriterion("DRUGED_OPER <>", value, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperGreaterThan(String value) {
            addCriterion("DRUGED_OPER >", value, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperGreaterThanOrEqualTo(String value) {
            addCriterion("DRUGED_OPER >=", value, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperLessThan(String value) {
            addCriterion("DRUGED_OPER <", value, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperLessThanOrEqualTo(String value) {
            addCriterion("DRUGED_OPER <=", value, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperLike(String value) {
            addCriterion("DRUGED_OPER like", value, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperNotLike(String value) {
            addCriterion("DRUGED_OPER not like", value, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperIn(List<String> values) {
            addCriterion("DRUGED_OPER in", values, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperNotIn(List<String> values) {
            addCriterion("DRUGED_OPER not in", values, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperBetween(String value1, String value2) {
            addCriterion("DRUGED_OPER between", value1, value2, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedOperNotBetween(String value1, String value2) {
            addCriterion("DRUGED_OPER not between", value1, value2, "drugedOper");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptIsNull() {
            addCriterion("DRUGED_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptIsNotNull() {
            addCriterion("DRUGED_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptEqualTo(String value) {
            addCriterion("DRUGED_DEPT =", value, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptNotEqualTo(String value) {
            addCriterion("DRUGED_DEPT <>", value, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptGreaterThan(String value) {
            addCriterion("DRUGED_DEPT >", value, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DRUGED_DEPT >=", value, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptLessThan(String value) {
            addCriterion("DRUGED_DEPT <", value, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptLessThanOrEqualTo(String value) {
            addCriterion("DRUGED_DEPT <=", value, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptLike(String value) {
            addCriterion("DRUGED_DEPT like", value, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptNotLike(String value) {
            addCriterion("DRUGED_DEPT not like", value, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptIn(List<String> values) {
            addCriterion("DRUGED_DEPT in", values, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptNotIn(List<String> values) {
            addCriterion("DRUGED_DEPT not in", values, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptBetween(String value1, String value2) {
            addCriterion("DRUGED_DEPT between", value1, value2, "drugedDept");
            return (Criteria) this;
        }

        public Criteria andDrugedDeptNotBetween(String value1, String value2) {
            addCriterion("DRUGED_DEPT not between", value1, value2, "drugedDept");
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

        public Criteria andSendOperIsNull() {
            addCriterion("SEND_OPER is null");
            return (Criteria) this;
        }

        public Criteria andSendOperIsNotNull() {
            addCriterion("SEND_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andSendOperEqualTo(String value) {
            addCriterion("SEND_OPER =", value, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperNotEqualTo(String value) {
            addCriterion("SEND_OPER <>", value, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperGreaterThan(String value) {
            addCriterion("SEND_OPER >", value, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_OPER >=", value, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperLessThan(String value) {
            addCriterion("SEND_OPER <", value, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperLessThanOrEqualTo(String value) {
            addCriterion("SEND_OPER <=", value, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperLike(String value) {
            addCriterion("SEND_OPER like", value, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperNotLike(String value) {
            addCriterion("SEND_OPER not like", value, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperIn(List<String> values) {
            addCriterion("SEND_OPER in", values, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperNotIn(List<String> values) {
            addCriterion("SEND_OPER not in", values, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperBetween(String value1, String value2) {
            addCriterion("SEND_OPER between", value1, value2, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendOperNotBetween(String value1, String value2) {
            addCriterion("SEND_OPER not between", value1, value2, "sendOper");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("SEND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("SEND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Date value) {
            addCriterion("SEND_DATE =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Date value) {
            addCriterion("SEND_DATE <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Date value) {
            addCriterion("SEND_DATE >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SEND_DATE >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Date value) {
            addCriterion("SEND_DATE <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Date value) {
            addCriterion("SEND_DATE <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Date> values) {
            addCriterion("SEND_DATE in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Date> values) {
            addCriterion("SEND_DATE not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Date value1, Date value2) {
            addCriterion("SEND_DATE between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Date value1, Date value2) {
            addCriterion("SEND_DATE not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDeptIsNull() {
            addCriterion("SEND_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andSendDeptIsNotNull() {
            addCriterion("SEND_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andSendDeptEqualTo(String value) {
            addCriterion("SEND_DEPT =", value, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptNotEqualTo(String value) {
            addCriterion("SEND_DEPT <>", value, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptGreaterThan(String value) {
            addCriterion("SEND_DEPT >", value, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_DEPT >=", value, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptLessThan(String value) {
            addCriterion("SEND_DEPT <", value, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptLessThanOrEqualTo(String value) {
            addCriterion("SEND_DEPT <=", value, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptLike(String value) {
            addCriterion("SEND_DEPT like", value, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptNotLike(String value) {
            addCriterion("SEND_DEPT not like", value, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptIn(List<String> values) {
            addCriterion("SEND_DEPT in", values, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptNotIn(List<String> values) {
            addCriterion("SEND_DEPT not in", values, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptBetween(String value1, String value2) {
            addCriterion("SEND_DEPT between", value1, value2, "sendDept");
            return (Criteria) this;
        }

        public Criteria andSendDeptNotBetween(String value1, String value2) {
            addCriterion("SEND_DEPT not between", value1, value2, "sendDept");
            return (Criteria) this;
        }

        public Criteria andValidStateIsNull() {
            addCriterion("VALID_STATE is null");
            return (Criteria) this;
        }

        public Criteria andValidStateIsNotNull() {
            addCriterion("VALID_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidStateEqualTo(String value) {
            addCriterion("VALID_STATE =", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateNotEqualTo(String value) {
            addCriterion("VALID_STATE <>", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateGreaterThan(String value) {
            addCriterion("VALID_STATE >", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_STATE >=", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateLessThan(String value) {
            addCriterion("VALID_STATE <", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateLessThanOrEqualTo(String value) {
            addCriterion("VALID_STATE <=", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateLike(String value) {
            addCriterion("VALID_STATE like", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateNotLike(String value) {
            addCriterion("VALID_STATE not like", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateIn(List<String> values) {
            addCriterion("VALID_STATE in", values, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateNotIn(List<String> values) {
            addCriterion("VALID_STATE not in", values, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateBetween(String value1, String value2) {
            addCriterion("VALID_STATE between", value1, value2, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateNotBetween(String value1, String value2) {
            addCriterion("VALID_STATE not between", value1, value2, "validState");
            return (Criteria) this;
        }

        public Criteria andBackOperIsNull() {
            addCriterion("BACK_OPER is null");
            return (Criteria) this;
        }

        public Criteria andBackOperIsNotNull() {
            addCriterion("BACK_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andBackOperEqualTo(String value) {
            addCriterion("BACK_OPER =", value, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperNotEqualTo(String value) {
            addCriterion("BACK_OPER <>", value, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperGreaterThan(String value) {
            addCriterion("BACK_OPER >", value, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_OPER >=", value, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperLessThan(String value) {
            addCriterion("BACK_OPER <", value, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperLessThanOrEqualTo(String value) {
            addCriterion("BACK_OPER <=", value, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperLike(String value) {
            addCriterion("BACK_OPER like", value, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperNotLike(String value) {
            addCriterion("BACK_OPER not like", value, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperIn(List<String> values) {
            addCriterion("BACK_OPER in", values, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperNotIn(List<String> values) {
            addCriterion("BACK_OPER not in", values, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperBetween(String value1, String value2) {
            addCriterion("BACK_OPER between", value1, value2, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackOperNotBetween(String value1, String value2) {
            addCriterion("BACK_OPER not between", value1, value2, "backOper");
            return (Criteria) this;
        }

        public Criteria andBackDateIsNull() {
            addCriterion("BACK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBackDateIsNotNull() {
            addCriterion("BACK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBackDateEqualTo(Date value) {
            addCriterion("BACK_DATE =", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateNotEqualTo(Date value) {
            addCriterion("BACK_DATE <>", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateGreaterThan(Date value) {
            addCriterion("BACK_DATE >", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BACK_DATE >=", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateLessThan(Date value) {
            addCriterion("BACK_DATE <", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateLessThanOrEqualTo(Date value) {
            addCriterion("BACK_DATE <=", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateIn(List<Date> values) {
            addCriterion("BACK_DATE in", values, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateNotIn(List<Date> values) {
            addCriterion("BACK_DATE not in", values, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateBetween(Date value1, Date value2) {
            addCriterion("BACK_DATE between", value1, value2, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateNotBetween(Date value1, Date value2) {
            addCriterion("BACK_DATE not between", value1, value2, "backDate");
            return (Criteria) this;
        }

        public Criteria andCancelOperIsNull() {
            addCriterion("CANCEL_OPER is null");
            return (Criteria) this;
        }

        public Criteria andCancelOperIsNotNull() {
            addCriterion("CANCEL_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andCancelOperEqualTo(String value) {
            addCriterion("CANCEL_OPER =", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperNotEqualTo(String value) {
            addCriterion("CANCEL_OPER <>", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperGreaterThan(String value) {
            addCriterion("CANCEL_OPER >", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_OPER >=", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperLessThan(String value) {
            addCriterion("CANCEL_OPER <", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_OPER <=", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperLike(String value) {
            addCriterion("CANCEL_OPER like", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperNotLike(String value) {
            addCriterion("CANCEL_OPER not like", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperIn(List<String> values) {
            addCriterion("CANCEL_OPER in", values, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperNotIn(List<String> values) {
            addCriterion("CANCEL_OPER not in", values, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperBetween(String value1, String value2) {
            addCriterion("CANCEL_OPER between", value1, value2, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperNotBetween(String value1, String value2) {
            addCriterion("CANCEL_OPER not between", value1, value2, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("CANCEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("CANCEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("CANCEL_DATE =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("CANCEL_DATE <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("CANCEL_DATE >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("CANCEL_DATE <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("CANCEL_DATE in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("CANCEL_DATE not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE not between", value1, value2, "cancelDate");
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