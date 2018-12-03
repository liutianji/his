package com.neuedu.his.jpa.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefDrugEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefDrugEntityExample() {
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

        public Criteria andRefStatusIsNull() {
            addCriterion("REF_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRefStatusIsNotNull() {
            addCriterion("REF_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRefStatusEqualTo(Integer value) {
            addCriterion("REF_STATUS =", value, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusNotEqualTo(Integer value) {
            addCriterion("REF_STATUS <>", value, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusGreaterThan(Integer value) {
            addCriterion("REF_STATUS >", value, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("REF_STATUS >=", value, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusLessThan(Integer value) {
            addCriterion("REF_STATUS <", value, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusLessThanOrEqualTo(Integer value) {
            addCriterion("REF_STATUS <=", value, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusIn(List<Integer> values) {
            addCriterion("REF_STATUS in", values, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusNotIn(List<Integer> values) {
            addCriterion("REF_STATUS not in", values, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusBetween(Integer value1, Integer value2) {
            addCriterion("REF_STATUS between", value1, value2, "refStatus");
            return (Criteria) this;
        }

        public Criteria andRefStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("REF_STATUS not between", value1, value2, "refStatus");
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

        public Criteria andRefundCostIsNull() {
            addCriterion("REFUND_COST is null");
            return (Criteria) this;
        }

        public Criteria andRefundCostIsNotNull() {
            addCriterion("REFUND_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCostEqualTo(Double value) {
            addCriterion("REFUND_COST =", value, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostNotEqualTo(Double value) {
            addCriterion("REFUND_COST <>", value, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostGreaterThan(Double value) {
            addCriterion("REFUND_COST >", value, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostGreaterThanOrEqualTo(Double value) {
            addCriterion("REFUND_COST >=", value, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostLessThan(Double value) {
            addCriterion("REFUND_COST <", value, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostLessThanOrEqualTo(Double value) {
            addCriterion("REFUND_COST <=", value, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostIn(List<Double> values) {
            addCriterion("REFUND_COST in", values, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostNotIn(List<Double> values) {
            addCriterion("REFUND_COST not in", values, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostBetween(Double value1, Double value2) {
            addCriterion("REFUND_COST between", value1, value2, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefundCostNotBetween(Double value1, Double value2) {
            addCriterion("REFUND_COST not between", value1, value2, "refundCost");
            return (Criteria) this;
        }

        public Criteria andRefFlagIsNull() {
            addCriterion("REF_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRefFlagIsNotNull() {
            addCriterion("REF_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRefFlagEqualTo(String value) {
            addCriterion("REF_FLAG =", value, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagNotEqualTo(String value) {
            addCriterion("REF_FLAG <>", value, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagGreaterThan(String value) {
            addCriterion("REF_FLAG >", value, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagGreaterThanOrEqualTo(String value) {
            addCriterion("REF_FLAG >=", value, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagLessThan(String value) {
            addCriterion("REF_FLAG <", value, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagLessThanOrEqualTo(String value) {
            addCriterion("REF_FLAG <=", value, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagLike(String value) {
            addCriterion("REF_FLAG like", value, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagNotLike(String value) {
            addCriterion("REF_FLAG not like", value, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagIn(List<String> values) {
            addCriterion("REF_FLAG in", values, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagNotIn(List<String> values) {
            addCriterion("REF_FLAG not in", values, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagBetween(String value1, String value2) {
            addCriterion("REF_FLAG between", value1, value2, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefFlagNotBetween(String value1, String value2) {
            addCriterion("REF_FLAG not between", value1, value2, "refFlag");
            return (Criteria) this;
        }

        public Criteria andRefDateIsNull() {
            addCriterion("REF_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRefDateIsNotNull() {
            addCriterion("REF_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefDateEqualTo(Date value) {
            addCriterion("REF_DATE =", value, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateNotEqualTo(Date value) {
            addCriterion("REF_DATE <>", value, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateGreaterThan(Date value) {
            addCriterion("REF_DATE >", value, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REF_DATE >=", value, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateLessThan(Date value) {
            addCriterion("REF_DATE <", value, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateLessThanOrEqualTo(Date value) {
            addCriterion("REF_DATE <=", value, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateIn(List<Date> values) {
            addCriterion("REF_DATE in", values, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateNotIn(List<Date> values) {
            addCriterion("REF_DATE not in", values, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateBetween(Date value1, Date value2) {
            addCriterion("REF_DATE between", value1, value2, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefDateNotBetween(Date value1, Date value2) {
            addCriterion("REF_DATE not between", value1, value2, "refDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateIsNull() {
            addCriterion("REF_APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateIsNotNull() {
            addCriterion("REF_APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateEqualTo(Date value) {
            addCriterion("REF_APPLY_DATE =", value, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateNotEqualTo(Date value) {
            addCriterion("REF_APPLY_DATE <>", value, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateGreaterThan(Date value) {
            addCriterion("REF_APPLY_DATE >", value, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REF_APPLY_DATE >=", value, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateLessThan(Date value) {
            addCriterion("REF_APPLY_DATE <", value, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("REF_APPLY_DATE <=", value, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateIn(List<Date> values) {
            addCriterion("REF_APPLY_DATE in", values, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateNotIn(List<Date> values) {
            addCriterion("REF_APPLY_DATE not in", values, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateBetween(Date value1, Date value2) {
            addCriterion("REF_APPLY_DATE between", value1, value2, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("REF_APPLY_DATE not between", value1, value2, "refApplyDate");
            return (Criteria) this;
        }

        public Criteria andRefRemarksIsNull() {
            addCriterion("REF_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRefRemarksIsNotNull() {
            addCriterion("REF_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRefRemarksEqualTo(String value) {
            addCriterion("REF_REMARKS =", value, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksNotEqualTo(String value) {
            addCriterion("REF_REMARKS <>", value, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksGreaterThan(String value) {
            addCriterion("REF_REMARKS >", value, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REF_REMARKS >=", value, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksLessThan(String value) {
            addCriterion("REF_REMARKS <", value, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksLessThanOrEqualTo(String value) {
            addCriterion("REF_REMARKS <=", value, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksLike(String value) {
            addCriterion("REF_REMARKS like", value, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksNotLike(String value) {
            addCriterion("REF_REMARKS not like", value, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksIn(List<String> values) {
            addCriterion("REF_REMARKS in", values, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksNotIn(List<String> values) {
            addCriterion("REF_REMARKS not in", values, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksBetween(String value1, String value2) {
            addCriterion("REF_REMARKS between", value1, value2, "refRemarks");
            return (Criteria) this;
        }

        public Criteria andRefRemarksNotBetween(String value1, String value2) {
            addCriterion("REF_REMARKS not between", value1, value2, "refRemarks");
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