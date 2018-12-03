package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhaComApplyoutEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhaComApplyoutEntityExample() {
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

        public Criteria andOutNoIsNull() {
            addCriterion("OUT_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutNoIsNotNull() {
            addCriterion("OUT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutNoEqualTo(String value) {
            addCriterion("OUT_NO =", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoNotEqualTo(String value) {
            addCriterion("OUT_NO <>", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoGreaterThan(String value) {
            addCriterion("OUT_NO >", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_NO >=", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoLessThan(String value) {
            addCriterion("OUT_NO <", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_NO <=", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoLike(String value) {
            addCriterion("OUT_NO like", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoNotLike(String value) {
            addCriterion("OUT_NO not like", value, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoIn(List<String> values) {
            addCriterion("OUT_NO in", values, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoNotIn(List<String> values) {
            addCriterion("OUT_NO not in", values, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoBetween(String value1, String value2) {
            addCriterion("OUT_NO between", value1, value2, "outNo");
            return (Criteria) this;
        }

        public Criteria andOutNoNotBetween(String value1, String value2) {
            addCriterion("OUT_NO not between", value1, value2, "outNo");
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

        public Criteria andDrugTypeIsNull() {
            addCriterion("DRUG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIsNotNull() {
            addCriterion("DRUG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDrugTypeEqualTo(String value) {
            addCriterion("DRUG_TYPE =", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotEqualTo(String value) {
            addCriterion("DRUG_TYPE <>", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThan(String value) {
            addCriterion("DRUG_TYPE >", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_TYPE >=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThan(String value) {
            addCriterion("DRUG_TYPE <", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLessThanOrEqualTo(String value) {
            addCriterion("DRUG_TYPE <=", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeLike(String value) {
            addCriterion("DRUG_TYPE like", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotLike(String value) {
            addCriterion("DRUG_TYPE not like", value, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeIn(List<String> values) {
            addCriterion("DRUG_TYPE in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotIn(List<String> values) {
            addCriterion("DRUG_TYPE not in", values, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeBetween(String value1, String value2) {
            addCriterion("DRUG_TYPE between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugTypeNotBetween(String value1, String value2) {
            addCriterion("DRUG_TYPE not between", value1, value2, "drugType");
            return (Criteria) this;
        }

        public Criteria andDrugQualityIsNull() {
            addCriterion("DRUG_QUALITY is null");
            return (Criteria) this;
        }

        public Criteria andDrugQualityIsNotNull() {
            addCriterion("DRUG_QUALITY is not null");
            return (Criteria) this;
        }

        public Criteria andDrugQualityEqualTo(String value) {
            addCriterion("DRUG_QUALITY =", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityNotEqualTo(String value) {
            addCriterion("DRUG_QUALITY <>", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityGreaterThan(String value) {
            addCriterion("DRUG_QUALITY >", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_QUALITY >=", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityLessThan(String value) {
            addCriterion("DRUG_QUALITY <", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityLessThanOrEqualTo(String value) {
            addCriterion("DRUG_QUALITY <=", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityLike(String value) {
            addCriterion("DRUG_QUALITY like", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityNotLike(String value) {
            addCriterion("DRUG_QUALITY not like", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityIn(List<String> values) {
            addCriterion("DRUG_QUALITY in", values, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityNotIn(List<String> values) {
            addCriterion("DRUG_QUALITY not in", values, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityBetween(String value1, String value2) {
            addCriterion("DRUG_QUALITY between", value1, value2, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityNotBetween(String value1, String value2) {
            addCriterion("DRUG_QUALITY not between", value1, value2, "drugQuality");
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

        public Criteria andMinUnitIsNull() {
            addCriterion("MIN_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andMinUnitIsNotNull() {
            addCriterion("MIN_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andMinUnitEqualTo(String value) {
            addCriterion("MIN_UNIT =", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitNotEqualTo(String value) {
            addCriterion("MIN_UNIT <>", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitGreaterThan(String value) {
            addCriterion("MIN_UNIT >", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitGreaterThanOrEqualTo(String value) {
            addCriterion("MIN_UNIT >=", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitLessThan(String value) {
            addCriterion("MIN_UNIT <", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitLessThanOrEqualTo(String value) {
            addCriterion("MIN_UNIT <=", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitLike(String value) {
            addCriterion("MIN_UNIT like", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitNotLike(String value) {
            addCriterion("MIN_UNIT not like", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitIn(List<String> values) {
            addCriterion("MIN_UNIT in", values, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitNotIn(List<String> values) {
            addCriterion("MIN_UNIT not in", values, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitBetween(String value1, String value2) {
            addCriterion("MIN_UNIT between", value1, value2, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitNotBetween(String value1, String value2) {
            addCriterion("MIN_UNIT not between", value1, value2, "minUnit");
            return (Criteria) this;
        }

        public Criteria andShowFlagIsNull() {
            addCriterion("SHOW_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andShowFlagIsNotNull() {
            addCriterion("SHOW_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andShowFlagEqualTo(String value) {
            addCriterion("SHOW_FLAG =", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagNotEqualTo(String value) {
            addCriterion("SHOW_FLAG <>", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagGreaterThan(String value) {
            addCriterion("SHOW_FLAG >", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_FLAG >=", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagLessThan(String value) {
            addCriterion("SHOW_FLAG <", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagLessThanOrEqualTo(String value) {
            addCriterion("SHOW_FLAG <=", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagLike(String value) {
            addCriterion("SHOW_FLAG like", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagNotLike(String value) {
            addCriterion("SHOW_FLAG not like", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagIn(List<String> values) {
            addCriterion("SHOW_FLAG in", values, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagNotIn(List<String> values) {
            addCriterion("SHOW_FLAG not in", values, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagBetween(String value1, String value2) {
            addCriterion("SHOW_FLAG between", value1, value2, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagNotBetween(String value1, String value2) {
            addCriterion("SHOW_FLAG not between", value1, value2, "showFlag");
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

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNull() {
            addCriterion("APPLY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNotNull() {
            addCriterion("APPLY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStateEqualTo(String value) {
            addCriterion("APPLY_STATE =", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotEqualTo(String value) {
            addCriterion("APPLY_STATE <>", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThan(String value) {
            addCriterion("APPLY_STATE >", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_STATE >=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThan(String value) {
            addCriterion("APPLY_STATE <", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_STATE <=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLike(String value) {
            addCriterion("APPLY_STATE like", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotLike(String value) {
            addCriterion("APPLY_STATE not like", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateIn(List<String> values) {
            addCriterion("APPLY_STATE in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotIn(List<String> values) {
            addCriterion("APPLY_STATE not in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateBetween(String value1, String value2) {
            addCriterion("APPLY_STATE between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotBetween(String value1, String value2) {
            addCriterion("APPLY_STATE not between", value1, value2, "applyState");
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

        public Criteria andModifyFlagIsNull() {
            addCriterion("MODIFY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andModifyFlagIsNotNull() {
            addCriterion("MODIFY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andModifyFlagEqualTo(String value) {
            addCriterion("MODIFY_FLAG =", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagNotEqualTo(String value) {
            addCriterion("MODIFY_FLAG <>", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagGreaterThan(String value) {
            addCriterion("MODIFY_FLAG >", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_FLAG >=", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagLessThan(String value) {
            addCriterion("MODIFY_FLAG <", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_FLAG <=", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagLike(String value) {
            addCriterion("MODIFY_FLAG like", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagNotLike(String value) {
            addCriterion("MODIFY_FLAG not like", value, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagIn(List<String> values) {
            addCriterion("MODIFY_FLAG in", values, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagNotIn(List<String> values) {
            addCriterion("MODIFY_FLAG not in", values, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagBetween(String value1, String value2) {
            addCriterion("MODIFY_FLAG between", value1, value2, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andModifyFlagNotBetween(String value1, String value2) {
            addCriterion("MODIFY_FLAG not between", value1, value2, "modifyFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagIsNull() {
            addCriterion("CHARGE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andChargeFlagIsNotNull() {
            addCriterion("CHARGE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andChargeFlagEqualTo(String value) {
            addCriterion("CHARGE_FLAG =", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotEqualTo(String value) {
            addCriterion("CHARGE_FLAG <>", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagGreaterThan(String value) {
            addCriterion("CHARGE_FLAG >", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_FLAG >=", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLessThan(String value) {
            addCriterion("CHARGE_FLAG <", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_FLAG <=", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagLike(String value) {
            addCriterion("CHARGE_FLAG like", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotLike(String value) {
            addCriterion("CHARGE_FLAG not like", value, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagIn(List<String> values) {
            addCriterion("CHARGE_FLAG in", values, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotIn(List<String> values) {
            addCriterion("CHARGE_FLAG not in", values, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagBetween(String value1, String value2) {
            addCriterion("CHARGE_FLAG between", value1, value2, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andChargeFlagNotBetween(String value1, String value2) {
            addCriterion("CHARGE_FLAG not between", value1, value2, "chargeFlag");
            return (Criteria) this;
        }

        public Criteria andDrugedBillIsNull() {
            addCriterion("DRUGED_BILL is null");
            return (Criteria) this;
        }

        public Criteria andDrugedBillIsNotNull() {
            addCriterion("DRUGED_BILL is not null");
            return (Criteria) this;
        }

        public Criteria andDrugedBillEqualTo(String value) {
            addCriterion("DRUGED_BILL =", value, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillNotEqualTo(String value) {
            addCriterion("DRUGED_BILL <>", value, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillGreaterThan(String value) {
            addCriterion("DRUGED_BILL >", value, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillGreaterThanOrEqualTo(String value) {
            addCriterion("DRUGED_BILL >=", value, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillLessThan(String value) {
            addCriterion("DRUGED_BILL <", value, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillLessThanOrEqualTo(String value) {
            addCriterion("DRUGED_BILL <=", value, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillLike(String value) {
            addCriterion("DRUGED_BILL like", value, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillNotLike(String value) {
            addCriterion("DRUGED_BILL not like", value, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillIn(List<String> values) {
            addCriterion("DRUGED_BILL in", values, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillNotIn(List<String> values) {
            addCriterion("DRUGED_BILL not in", values, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillBetween(String value1, String value2) {
            addCriterion("DRUGED_BILL between", value1, value2, "drugedBill");
            return (Criteria) this;
        }

        public Criteria andDrugedBillNotBetween(String value1, String value2) {
            addCriterion("DRUGED_BILL not between", value1, value2, "drugedBill");
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

        public Criteria andDrugedEmplIsNull() {
            addCriterion("DRUGED_EMPL is null");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplIsNotNull() {
            addCriterion("DRUGED_EMPL is not null");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplEqualTo(String value) {
            addCriterion("DRUGED_EMPL =", value, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplNotEqualTo(String value) {
            addCriterion("DRUGED_EMPL <>", value, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplGreaterThan(String value) {
            addCriterion("DRUGED_EMPL >", value, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplGreaterThanOrEqualTo(String value) {
            addCriterion("DRUGED_EMPL >=", value, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplLessThan(String value) {
            addCriterion("DRUGED_EMPL <", value, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplLessThanOrEqualTo(String value) {
            addCriterion("DRUGED_EMPL <=", value, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplLike(String value) {
            addCriterion("DRUGED_EMPL like", value, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplNotLike(String value) {
            addCriterion("DRUGED_EMPL not like", value, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplIn(List<String> values) {
            addCriterion("DRUGED_EMPL in", values, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplNotIn(List<String> values) {
            addCriterion("DRUGED_EMPL not in", values, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplBetween(String value1, String value2) {
            addCriterion("DRUGED_EMPL between", value1, value2, "drugedEmpl");
            return (Criteria) this;
        }

        public Criteria andDrugedEmplNotBetween(String value1, String value2) {
            addCriterion("DRUGED_EMPL not between", value1, value2, "drugedEmpl");
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

        public Criteria andDrugedNumIsNull() {
            addCriterion("DRUGED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDrugedNumIsNotNull() {
            addCriterion("DRUGED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDrugedNumEqualTo(Double value) {
            addCriterion("DRUGED_NUM =", value, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumNotEqualTo(Double value) {
            addCriterion("DRUGED_NUM <>", value, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumGreaterThan(Double value) {
            addCriterion("DRUGED_NUM >", value, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumGreaterThanOrEqualTo(Double value) {
            addCriterion("DRUGED_NUM >=", value, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumLessThan(Double value) {
            addCriterion("DRUGED_NUM <", value, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumLessThanOrEqualTo(Double value) {
            addCriterion("DRUGED_NUM <=", value, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumIn(List<Double> values) {
            addCriterion("DRUGED_NUM in", values, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumNotIn(List<Double> values) {
            addCriterion("DRUGED_NUM not in", values, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumBetween(Double value1, Double value2) {
            addCriterion("DRUGED_NUM between", value1, value2, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDrugedNumNotBetween(Double value1, Double value2) {
            addCriterion("DRUGED_NUM not between", value1, value2, "drugedNum");
            return (Criteria) this;
        }

        public Criteria andDoseOnceIsNull() {
            addCriterion("DOSE_ONCE is null");
            return (Criteria) this;
        }

        public Criteria andDoseOnceIsNotNull() {
            addCriterion("DOSE_ONCE is not null");
            return (Criteria) this;
        }

        public Criteria andDoseOnceEqualTo(Double value) {
            addCriterion("DOSE_ONCE =", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceNotEqualTo(Double value) {
            addCriterion("DOSE_ONCE <>", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceGreaterThan(Double value) {
            addCriterion("DOSE_ONCE >", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceGreaterThanOrEqualTo(Double value) {
            addCriterion("DOSE_ONCE >=", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceLessThan(Double value) {
            addCriterion("DOSE_ONCE <", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceLessThanOrEqualTo(Double value) {
            addCriterion("DOSE_ONCE <=", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceIn(List<Double> values) {
            addCriterion("DOSE_ONCE in", values, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceNotIn(List<Double> values) {
            addCriterion("DOSE_ONCE not in", values, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceBetween(Double value1, Double value2) {
            addCriterion("DOSE_ONCE between", value1, value2, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceNotBetween(Double value1, Double value2) {
            addCriterion("DOSE_ONCE not between", value1, value2, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIsNull() {
            addCriterion("DOSE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIsNotNull() {
            addCriterion("DOSE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitEqualTo(String value) {
            addCriterion("DOSE_UNIT =", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotEqualTo(String value) {
            addCriterion("DOSE_UNIT <>", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitGreaterThan(String value) {
            addCriterion("DOSE_UNIT >", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("DOSE_UNIT >=", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLessThan(String value) {
            addCriterion("DOSE_UNIT <", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLessThanOrEqualTo(String value) {
            addCriterion("DOSE_UNIT <=", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLike(String value) {
            addCriterion("DOSE_UNIT like", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotLike(String value) {
            addCriterion("DOSE_UNIT not like", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIn(List<String> values) {
            addCriterion("DOSE_UNIT in", values, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotIn(List<String> values) {
            addCriterion("DOSE_UNIT not in", values, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitBetween(String value1, String value2) {
            addCriterion("DOSE_UNIT between", value1, value2, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotBetween(String value1, String value2) {
            addCriterion("DOSE_UNIT not between", value1, value2, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andUsageCodeIsNull() {
            addCriterion("USAGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUsageCodeIsNotNull() {
            addCriterion("USAGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUsageCodeEqualTo(String value) {
            addCriterion("USAGE_CODE =", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeNotEqualTo(String value) {
            addCriterion("USAGE_CODE <>", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeGreaterThan(String value) {
            addCriterion("USAGE_CODE >", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USAGE_CODE >=", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeLessThan(String value) {
            addCriterion("USAGE_CODE <", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeLessThanOrEqualTo(String value) {
            addCriterion("USAGE_CODE <=", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeLike(String value) {
            addCriterion("USAGE_CODE like", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeNotLike(String value) {
            addCriterion("USAGE_CODE not like", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeIn(List<String> values) {
            addCriterion("USAGE_CODE in", values, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeNotIn(List<String> values) {
            addCriterion("USAGE_CODE not in", values, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeBetween(String value1, String value2) {
            addCriterion("USAGE_CODE between", value1, value2, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeNotBetween(String value1, String value2) {
            addCriterion("USAGE_CODE not between", value1, value2, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUseNameIsNull() {
            addCriterion("USE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUseNameIsNotNull() {
            addCriterion("USE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUseNameEqualTo(String value) {
            addCriterion("USE_NAME =", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameNotEqualTo(String value) {
            addCriterion("USE_NAME <>", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameGreaterThan(String value) {
            addCriterion("USE_NAME >", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameGreaterThanOrEqualTo(String value) {
            addCriterion("USE_NAME >=", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameLessThan(String value) {
            addCriterion("USE_NAME <", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameLessThanOrEqualTo(String value) {
            addCriterion("USE_NAME <=", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameLike(String value) {
            addCriterion("USE_NAME like", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameNotLike(String value) {
            addCriterion("USE_NAME not like", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameIn(List<String> values) {
            addCriterion("USE_NAME in", values, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameNotIn(List<String> values) {
            addCriterion("USE_NAME not in", values, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameBetween(String value1, String value2) {
            addCriterion("USE_NAME between", value1, value2, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameNotBetween(String value1, String value2) {
            addCriterion("USE_NAME not between", value1, value2, "useName");
            return (Criteria) this;
        }

        public Criteria andDfqFreqIsNull() {
            addCriterion("DFQ_FREQ is null");
            return (Criteria) this;
        }

        public Criteria andDfqFreqIsNotNull() {
            addCriterion("DFQ_FREQ is not null");
            return (Criteria) this;
        }

        public Criteria andDfqFreqEqualTo(String value) {
            addCriterion("DFQ_FREQ =", value, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqNotEqualTo(String value) {
            addCriterion("DFQ_FREQ <>", value, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqGreaterThan(String value) {
            addCriterion("DFQ_FREQ >", value, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqGreaterThanOrEqualTo(String value) {
            addCriterion("DFQ_FREQ >=", value, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqLessThan(String value) {
            addCriterion("DFQ_FREQ <", value, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqLessThanOrEqualTo(String value) {
            addCriterion("DFQ_FREQ <=", value, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqLike(String value) {
            addCriterion("DFQ_FREQ like", value, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqNotLike(String value) {
            addCriterion("DFQ_FREQ not like", value, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqIn(List<String> values) {
            addCriterion("DFQ_FREQ in", values, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqNotIn(List<String> values) {
            addCriterion("DFQ_FREQ not in", values, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqBetween(String value1, String value2) {
            addCriterion("DFQ_FREQ between", value1, value2, "dfqFreq");
            return (Criteria) this;
        }

        public Criteria andDfqFreqNotBetween(String value1, String value2) {
            addCriterion("DFQ_FREQ not between", value1, value2, "dfqFreq");
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