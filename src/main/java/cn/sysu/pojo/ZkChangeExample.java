package cn.sysu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ZkChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZkChangeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHolecodeIsNull() {
            addCriterion("holeCode is null");
            return (Criteria) this;
        }

        public Criteria andHolecodeIsNotNull() {
            addCriterion("holeCode is not null");
            return (Criteria) this;
        }

        public Criteria andHolecodeEqualTo(String value) {
            addCriterion("holeCode =", value, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeNotEqualTo(String value) {
            addCriterion("holeCode <>", value, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeGreaterThan(String value) {
            addCriterion("holeCode >", value, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeGreaterThanOrEqualTo(String value) {
            addCriterion("holeCode >=", value, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeLessThan(String value) {
            addCriterion("holeCode <", value, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeLessThanOrEqualTo(String value) {
            addCriterion("holeCode <=", value, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeLike(String value) {
            addCriterion("holeCode like", value, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeNotLike(String value) {
            addCriterion("holeCode not like", value, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeIn(List<String> values) {
            addCriterion("holeCode in", values, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeNotIn(List<String> values) {
            addCriterion("holeCode not in", values, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeBetween(String value1, String value2) {
            addCriterion("holeCode between", value1, value2, "holecode");
            return (Criteria) this;
        }

        public Criteria andHolecodeNotBetween(String value1, String value2) {
            addCriterion("holeCode not between", value1, value2, "holecode");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Double value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Double value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Double value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Double value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Double value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Double value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Double> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Double> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Double value1, Double value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Double value1, Double value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Double value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Double value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Double value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Double value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Double value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Double value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Double> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Double> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Double value1, Double value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Double value1, Double value2) {
            addCriterion("y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWaterheightIsNull() {
            addCriterion("waterHeight is null");
            return (Criteria) this;
        }

        public Criteria andWaterheightIsNotNull() {
            addCriterion("waterHeight is not null");
            return (Criteria) this;
        }

        public Criteria andWaterheightEqualTo(String value) {
            addCriterion("waterHeight =", value, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightNotEqualTo(String value) {
            addCriterion("waterHeight <>", value, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightGreaterThan(String value) {
            addCriterion("waterHeight >", value, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightGreaterThanOrEqualTo(String value) {
            addCriterion("waterHeight >=", value, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightLessThan(String value) {
            addCriterion("waterHeight <", value, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightLessThanOrEqualTo(String value) {
            addCriterion("waterHeight <=", value, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightLike(String value) {
            addCriterion("waterHeight like", value, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightNotLike(String value) {
            addCriterion("waterHeight not like", value, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightIn(List<String> values) {
            addCriterion("waterHeight in", values, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightNotIn(List<String> values) {
            addCriterion("waterHeight not in", values, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightBetween(String value1, String value2) {
            addCriterion("waterHeight between", value1, value2, "waterheight");
            return (Criteria) this;
        }

        public Criteria andWaterheightNotBetween(String value1, String value2) {
            addCriterion("waterHeight not between", value1, value2, "waterheight");
            return (Criteria) this;
        }

        public Criteria andLevelnumIsNull() {
            addCriterion("levelNum is null");
            return (Criteria) this;
        }

        public Criteria andLevelnumIsNotNull() {
            addCriterion("levelNum is not null");
            return (Criteria) this;
        }

        public Criteria andLevelnumEqualTo(Integer value) {
            addCriterion("levelNum =", value, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumNotEqualTo(Integer value) {
            addCriterion("levelNum <>", value, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumGreaterThan(Integer value) {
            addCriterion("levelNum >", value, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelNum >=", value, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumLessThan(Integer value) {
            addCriterion("levelNum <", value, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumLessThanOrEqualTo(Integer value) {
            addCriterion("levelNum <=", value, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumIn(List<Integer> values) {
            addCriterion("levelNum in", values, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumNotIn(List<Integer> values) {
            addCriterion("levelNum not in", values, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumBetween(Integer value1, Integer value2) {
            addCriterion("levelNum between", value1, value2, "levelnum");
            return (Criteria) this;
        }

        public Criteria andLevelnumNotBetween(Integer value1, Integer value2) {
            addCriterion("levelNum not between", value1, value2, "levelnum");
            return (Criteria) this;
        }

        public Criteria andBottomheightIsNull() {
            addCriterion("bottomHeight is null");
            return (Criteria) this;
        }

        public Criteria andBottomheightIsNotNull() {
            addCriterion("bottomHeight is not null");
            return (Criteria) this;
        }

        public Criteria andBottomheightEqualTo(Double value) {
            addCriterion("bottomHeight =", value, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightNotEqualTo(Double value) {
            addCriterion("bottomHeight <>", value, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightGreaterThan(Double value) {
            addCriterion("bottomHeight >", value, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightGreaterThanOrEqualTo(Double value) {
            addCriterion("bottomHeight >=", value, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightLessThan(Double value) {
            addCriterion("bottomHeight <", value, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightLessThanOrEqualTo(Double value) {
            addCriterion("bottomHeight <=", value, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightIn(List<Double> values) {
            addCriterion("bottomHeight in", values, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightNotIn(List<Double> values) {
            addCriterion("bottomHeight not in", values, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightBetween(Double value1, Double value2) {
            addCriterion("bottomHeight between", value1, value2, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andBottomheightNotBetween(Double value1, Double value2) {
            addCriterion("bottomHeight not between", value1, value2, "bottomheight");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNull() {
            addCriterion("thickness is null");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNotNull() {
            addCriterion("thickness is not null");
            return (Criteria) this;
        }

        public Criteria andThicknessEqualTo(Double value) {
            addCriterion("thickness =", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotEqualTo(Double value) {
            addCriterion("thickness <>", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThan(Double value) {
            addCriterion("thickness >", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThanOrEqualTo(Double value) {
            addCriterion("thickness >=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThan(Double value) {
            addCriterion("thickness <", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThanOrEqualTo(Double value) {
            addCriterion("thickness <=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessIn(List<Double> values) {
            addCriterion("thickness in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotIn(List<Double> values) {
            addCriterion("thickness not in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessBetween(Double value1, Double value2) {
            addCriterion("thickness between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotBetween(Double value1, Double value2) {
            addCriterion("thickness not between", value1, value2, "thickness");
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