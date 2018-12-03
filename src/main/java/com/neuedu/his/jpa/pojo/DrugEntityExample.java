package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugEntityExample() {
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

        public Criteria andBatchNoIsNull() {
            addCriterion("BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("BATCH_NO =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("BATCH_NO <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("BATCH_NO >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NO >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("BATCH_NO <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NO <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("BATCH_NO like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("BATCH_NO not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("BATCH_NO in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("BATCH_NO not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("BATCH_NO between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("BATCH_NO not between", value1, value2, "batchNo");
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

        public Criteria andPackUnitIsNull() {
            addCriterion("PACK_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPackUnitIsNotNull() {
            addCriterion("PACK_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPackUnitEqualTo(String value) {
            addCriterion("PACK_UNIT =", value, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitNotEqualTo(String value) {
            addCriterion("PACK_UNIT <>", value, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitGreaterThan(String value) {
            addCriterion("PACK_UNIT >", value, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PACK_UNIT >=", value, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitLessThan(String value) {
            addCriterion("PACK_UNIT <", value, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitLessThanOrEqualTo(String value) {
            addCriterion("PACK_UNIT <=", value, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitLike(String value) {
            addCriterion("PACK_UNIT like", value, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitNotLike(String value) {
            addCriterion("PACK_UNIT not like", value, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitIn(List<String> values) {
            addCriterion("PACK_UNIT in", values, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitNotIn(List<String> values) {
            addCriterion("PACK_UNIT not in", values, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitBetween(String value1, String value2) {
            addCriterion("PACK_UNIT between", value1, value2, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackUnitNotBetween(String value1, String value2) {
            addCriterion("PACK_UNIT not between", value1, value2, "packUnit");
            return (Criteria) this;
        }

        public Criteria andPackQtyIsNull() {
            addCriterion("PACK_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPackQtyIsNotNull() {
            addCriterion("PACK_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPackQtyEqualTo(Integer value) {
            addCriterion("PACK_QTY =", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyNotEqualTo(Integer value) {
            addCriterion("PACK_QTY <>", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyGreaterThan(Integer value) {
            addCriterion("PACK_QTY >", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PACK_QTY >=", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyLessThan(Integer value) {
            addCriterion("PACK_QTY <", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyLessThanOrEqualTo(Integer value) {
            addCriterion("PACK_QTY <=", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyIn(List<Integer> values) {
            addCriterion("PACK_QTY in", values, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyNotIn(List<Integer> values) {
            addCriterion("PACK_QTY not in", values, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyBetween(Integer value1, Integer value2) {
            addCriterion("PACK_QTY between", value1, value2, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("PACK_QTY not between", value1, value2, "packQty");
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

        public Criteria andPutOnQtyIsNull() {
            addCriterion("PUT_ON_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyIsNotNull() {
            addCriterion("PUT_ON_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyEqualTo(Integer value) {
            addCriterion("PUT_ON_QTY =", value, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyNotEqualTo(Integer value) {
            addCriterion("PUT_ON_QTY <>", value, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyGreaterThan(Integer value) {
            addCriterion("PUT_ON_QTY >", value, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUT_ON_QTY >=", value, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyLessThan(Integer value) {
            addCriterion("PUT_ON_QTY <", value, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyLessThanOrEqualTo(Integer value) {
            addCriterion("PUT_ON_QTY <=", value, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyIn(List<Integer> values) {
            addCriterion("PUT_ON_QTY in", values, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyNotIn(List<Integer> values) {
            addCriterion("PUT_ON_QTY not in", values, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyBetween(Integer value1, Integer value2) {
            addCriterion("PUT_ON_QTY between", value1, value2, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOnQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("PUT_ON_QTY not between", value1, value2, "putOnQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyIsNull() {
            addCriterion("PUT_OFF_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyIsNotNull() {
            addCriterion("PUT_OFF_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyEqualTo(Integer value) {
            addCriterion("PUT_OFF_QTY =", value, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyNotEqualTo(Integer value) {
            addCriterion("PUT_OFF_QTY <>", value, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyGreaterThan(Integer value) {
            addCriterion("PUT_OFF_QTY >", value, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUT_OFF_QTY >=", value, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyLessThan(Integer value) {
            addCriterion("PUT_OFF_QTY <", value, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyLessThanOrEqualTo(Integer value) {
            addCriterion("PUT_OFF_QTY <=", value, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyIn(List<Integer> values) {
            addCriterion("PUT_OFF_QTY in", values, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyNotIn(List<Integer> values) {
            addCriterion("PUT_OFF_QTY not in", values, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyBetween(Integer value1, Integer value2) {
            addCriterion("PUT_OFF_QTY between", value1, value2, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andPutOffQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("PUT_OFF_QTY not between", value1, value2, "putOffQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyIsNull() {
            addCriterion("SALE_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSaleQtyIsNotNull() {
            addCriterion("SALE_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSaleQtyEqualTo(Integer value) {
            addCriterion("SALE_QTY =", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyNotEqualTo(Integer value) {
            addCriterion("SALE_QTY <>", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyGreaterThan(Integer value) {
            addCriterion("SALE_QTY >", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALE_QTY >=", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyLessThan(Integer value) {
            addCriterion("SALE_QTY <", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyLessThanOrEqualTo(Integer value) {
            addCriterion("SALE_QTY <=", value, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyIn(List<Integer> values) {
            addCriterion("SALE_QTY in", values, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyNotIn(List<Integer> values) {
            addCriterion("SALE_QTY not in", values, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyBetween(Integer value1, Integer value2) {
            addCriterion("SALE_QTY between", value1, value2, "saleQty");
            return (Criteria) this;
        }

        public Criteria andSaleQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("SALE_QTY not between", value1, value2, "saleQty");
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