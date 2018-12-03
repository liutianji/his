package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PutDrugEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PutDrugEntityExample() {
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

        public Criteria andPutDrugNoIsNull() {
            addCriterion("PUT_DRUG_NO is null");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoIsNotNull() {
            addCriterion("PUT_DRUG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoEqualTo(String value) {
            addCriterion("PUT_DRUG_NO =", value, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoNotEqualTo(String value) {
            addCriterion("PUT_DRUG_NO <>", value, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoGreaterThan(String value) {
            addCriterion("PUT_DRUG_NO >", value, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoGreaterThanOrEqualTo(String value) {
            addCriterion("PUT_DRUG_NO >=", value, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoLessThan(String value) {
            addCriterion("PUT_DRUG_NO <", value, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoLessThanOrEqualTo(String value) {
            addCriterion("PUT_DRUG_NO <=", value, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoLike(String value) {
            addCriterion("PUT_DRUG_NO like", value, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoNotLike(String value) {
            addCriterion("PUT_DRUG_NO not like", value, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoIn(List<String> values) {
            addCriterion("PUT_DRUG_NO in", values, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoNotIn(List<String> values) {
            addCriterion("PUT_DRUG_NO not in", values, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoBetween(String value1, String value2) {
            addCriterion("PUT_DRUG_NO between", value1, value2, "putDrugNo");
            return (Criteria) this;
        }

        public Criteria andPutDrugNoNotBetween(String value1, String value2) {
            addCriterion("PUT_DRUG_NO not between", value1, value2, "putDrugNo");
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

        public Criteria andTradeNameIsNull() {
            addCriterion("TRADE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTradeNameIsNotNull() {
            addCriterion("TRADE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNameEqualTo(String value) {
            addCriterion("TRADE_NAME =", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotEqualTo(String value) {
            addCriterion("TRADE_NAME <>", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThan(String value) {
            addCriterion("TRADE_NAME >", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_NAME >=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThan(String value) {
            addCriterion("TRADE_NAME <", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThanOrEqualTo(String value) {
            addCriterion("TRADE_NAME <=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLike(String value) {
            addCriterion("TRADE_NAME like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotLike(String value) {
            addCriterion("TRADE_NAME not like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameIn(List<String> values) {
            addCriterion("TRADE_NAME in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotIn(List<String> values) {
            addCriterion("TRADE_NAME not in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameBetween(String value1, String value2) {
            addCriterion("TRADE_NAME between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotBetween(String value1, String value2) {
            addCriterion("TRADE_NAME not between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andPutNumIsNull() {
            addCriterion("PUT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPutNumIsNotNull() {
            addCriterion("PUT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPutNumEqualTo(Integer value) {
            addCriterion("PUT_NUM =", value, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumNotEqualTo(Integer value) {
            addCriterion("PUT_NUM <>", value, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumGreaterThan(Integer value) {
            addCriterion("PUT_NUM >", value, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUT_NUM >=", value, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumLessThan(Integer value) {
            addCriterion("PUT_NUM <", value, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumLessThanOrEqualTo(Integer value) {
            addCriterion("PUT_NUM <=", value, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumIn(List<Integer> values) {
            addCriterion("PUT_NUM in", values, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumNotIn(List<Integer> values) {
            addCriterion("PUT_NUM not in", values, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumBetween(Integer value1, Integer value2) {
            addCriterion("PUT_NUM between", value1, value2, "putNum");
            return (Criteria) this;
        }

        public Criteria andPutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PUT_NUM not between", value1, value2, "putNum");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
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

        public Criteria andPutDateIsNull() {
            addCriterion("PUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPutDateIsNotNull() {
            addCriterion("PUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPutDateEqualTo(Date value) {
            addCriterion("PUT_DATE =", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateNotEqualTo(Date value) {
            addCriterion("PUT_DATE <>", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateGreaterThan(Date value) {
            addCriterion("PUT_DATE >", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PUT_DATE >=", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateLessThan(Date value) {
            addCriterion("PUT_DATE <", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateLessThanOrEqualTo(Date value) {
            addCriterion("PUT_DATE <=", value, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateIn(List<Date> values) {
            addCriterion("PUT_DATE in", values, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateNotIn(List<Date> values) {
            addCriterion("PUT_DATE not in", values, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateBetween(Date value1, Date value2) {
            addCriterion("PUT_DATE between", value1, value2, "putDate");
            return (Criteria) this;
        }

        public Criteria andPutDateNotBetween(Date value1, Date value2) {
            addCriterion("PUT_DATE not between", value1, value2, "putDate");
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