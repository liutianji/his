package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.List;

public class RefDrugDetailEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefDrugDetailEntityExample() {
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

        public Criteria andRefundDetailNoIsNull() {
            addCriterion("REFUND_DETAIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoIsNotNull() {
            addCriterion("REFUND_DETAIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoEqualTo(String value) {
            addCriterion("REFUND_DETAIL_NO =", value, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoNotEqualTo(String value) {
            addCriterion("REFUND_DETAIL_NO <>", value, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoGreaterThan(String value) {
            addCriterion("REFUND_DETAIL_NO >", value, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_DETAIL_NO >=", value, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoLessThan(String value) {
            addCriterion("REFUND_DETAIL_NO <", value, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoLessThanOrEqualTo(String value) {
            addCriterion("REFUND_DETAIL_NO <=", value, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoLike(String value) {
            addCriterion("REFUND_DETAIL_NO like", value, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoNotLike(String value) {
            addCriterion("REFUND_DETAIL_NO not like", value, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoIn(List<String> values) {
            addCriterion("REFUND_DETAIL_NO in", values, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoNotIn(List<String> values) {
            addCriterion("REFUND_DETAIL_NO not in", values, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoBetween(String value1, String value2) {
            addCriterion("REFUND_DETAIL_NO between", value1, value2, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundDetailNoNotBetween(String value1, String value2) {
            addCriterion("REFUND_DETAIL_NO not between", value1, value2, "refundDetailNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoIsNull() {
            addCriterion("REFUND_NO is null");
            return (Criteria) this;
        }

        public Criteria andRefundNoIsNotNull() {
            addCriterion("REFUND_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNoEqualTo(String value) {
            addCriterion("REFUND_NO =", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotEqualTo(String value) {
            addCriterion("REFUND_NO <>", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoGreaterThan(String value) {
            addCriterion("REFUND_NO >", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_NO >=", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLessThan(String value) {
            addCriterion("REFUND_NO <", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLessThanOrEqualTo(String value) {
            addCriterion("REFUND_NO <=", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLike(String value) {
            addCriterion("REFUND_NO like", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotLike(String value) {
            addCriterion("REFUND_NO not like", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoIn(List<String> values) {
            addCriterion("REFUND_NO in", values, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotIn(List<String> values) {
            addCriterion("REFUND_NO not in", values, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoBetween(String value1, String value2) {
            addCriterion("REFUND_NO between", value1, value2, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotBetween(String value1, String value2) {
            addCriterion("REFUND_NO not between", value1, value2, "refundNo");
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

        public Criteria andSpecsIsNull() {
            addCriterion("SPECS is null");
            return (Criteria) this;
        }

        public Criteria andSpecsIsNotNull() {
            addCriterion("SPECS is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsEqualTo(String value) {
            addCriterion("SPECS =", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotEqualTo(String value) {
            addCriterion("SPECS <>", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThan(String value) {
            addCriterion("SPECS >", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("SPECS >=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThan(String value) {
            addCriterion("SPECS <", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThanOrEqualTo(String value) {
            addCriterion("SPECS <=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLike(String value) {
            addCriterion("SPECS like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotLike(String value) {
            addCriterion("SPECS not like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsIn(List<String> values) {
            addCriterion("SPECS in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotIn(List<String> values) {
            addCriterion("SPECS not in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsBetween(String value1, String value2) {
            addCriterion("SPECS between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotBetween(String value1, String value2) {
            addCriterion("SPECS not between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNull() {
            addCriterion("APPLY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNotNull() {
            addCriterion("APPLY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumEqualTo(Double value) {
            addCriterion("APPLY_NUM =", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotEqualTo(Double value) {
            addCriterion("APPLY_NUM <>", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThan(Double value) {
            addCriterion("APPLY_NUM >", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThanOrEqualTo(Double value) {
            addCriterion("APPLY_NUM >=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThan(Double value) {
            addCriterion("APPLY_NUM <", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThanOrEqualTo(Double value) {
            addCriterion("APPLY_NUM <=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIn(List<Double> values) {
            addCriterion("APPLY_NUM in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotIn(List<Double> values) {
            addCriterion("APPLY_NUM not in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumBetween(Double value1, Double value2) {
            addCriterion("APPLY_NUM between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotBetween(Double value1, Double value2) {
            addCriterion("APPLY_NUM not between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andRetNumIsNull() {
            addCriterion("RET_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRetNumIsNotNull() {
            addCriterion("RET_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRetNumEqualTo(Double value) {
            addCriterion("RET_NUM =", value, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumNotEqualTo(Double value) {
            addCriterion("RET_NUM <>", value, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumGreaterThan(Double value) {
            addCriterion("RET_NUM >", value, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumGreaterThanOrEqualTo(Double value) {
            addCriterion("RET_NUM >=", value, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumLessThan(Double value) {
            addCriterion("RET_NUM <", value, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumLessThanOrEqualTo(Double value) {
            addCriterion("RET_NUM <=", value, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumIn(List<Double> values) {
            addCriterion("RET_NUM in", values, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumNotIn(List<Double> values) {
            addCriterion("RET_NUM not in", values, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumBetween(Double value1, Double value2) {
            addCriterion("RET_NUM between", value1, value2, "retNum");
            return (Criteria) this;
        }

        public Criteria andRetNumNotBetween(Double value1, Double value2) {
            addCriterion("RET_NUM not between", value1, value2, "retNum");
            return (Criteria) this;
        }

        public Criteria andShowUnitIsNull() {
            addCriterion("SHOW_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andShowUnitIsNotNull() {
            addCriterion("SHOW_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andShowUnitEqualTo(String value) {
            addCriterion("SHOW_UNIT =", value, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitNotEqualTo(String value) {
            addCriterion("SHOW_UNIT <>", value, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitGreaterThan(String value) {
            addCriterion("SHOW_UNIT >", value, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_UNIT >=", value, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitLessThan(String value) {
            addCriterion("SHOW_UNIT <", value, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitLessThanOrEqualTo(String value) {
            addCriterion("SHOW_UNIT <=", value, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitLike(String value) {
            addCriterion("SHOW_UNIT like", value, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitNotLike(String value) {
            addCriterion("SHOW_UNIT not like", value, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitIn(List<String> values) {
            addCriterion("SHOW_UNIT in", values, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitNotIn(List<String> values) {
            addCriterion("SHOW_UNIT not in", values, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitBetween(String value1, String value2) {
            addCriterion("SHOW_UNIT between", value1, value2, "showUnit");
            return (Criteria) this;
        }

        public Criteria andShowUnitNotBetween(String value1, String value2) {
            addCriterion("SHOW_UNIT not between", value1, value2, "showUnit");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("UNIT_PRICE =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("UNIT_PRICE <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("UNIT_PRICE >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("UNIT_PRICE >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("UNIT_PRICE <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("UNIT_PRICE <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("UNIT_PRICE in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("UNIT_PRICE not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "unitPrice");
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