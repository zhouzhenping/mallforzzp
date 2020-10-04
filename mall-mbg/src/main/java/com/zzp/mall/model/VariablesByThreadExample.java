package com.zzp.mall.model;

import java.util.ArrayList;
import java.util.List;

public class VariablesByThreadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VariablesByThreadExample() {
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

        public Criteria andThreadIdIsNull() {
            addCriterion("THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(Long value) {
            addCriterion("THREAD_ID =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(Long value) {
            addCriterion("THREAD_ID <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(Long value) {
            addCriterion("THREAD_ID >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(Long value) {
            addCriterion("THREAD_ID <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<Long> values) {
            addCriterion("THREAD_ID in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<Long> values) {
            addCriterion("THREAD_ID not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID not between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNull() {
            addCriterion("VARIABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNotNull() {
            addCriterion("VARIABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVariableNameEqualTo(String value) {
            addCriterion("VARIABLE_NAME =", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotEqualTo(String value) {
            addCriterion("VARIABLE_NAME <>", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThan(String value) {
            addCriterion("VARIABLE_NAME >", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME >=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThan(String value) {
            addCriterion("VARIABLE_NAME <", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME <=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLike(String value) {
            addCriterion("VARIABLE_NAME like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotLike(String value) {
            addCriterion("VARIABLE_NAME not like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameIn(List<String> values) {
            addCriterion("VARIABLE_NAME in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotIn(List<String> values) {
            addCriterion("VARIABLE_NAME not in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME not between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableValueIsNull() {
            addCriterion("VARIABLE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andVariableValueIsNotNull() {
            addCriterion("VARIABLE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andVariableValueEqualTo(String value) {
            addCriterion("VARIABLE_VALUE =", value, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueNotEqualTo(String value) {
            addCriterion("VARIABLE_VALUE <>", value, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueGreaterThan(String value) {
            addCriterion("VARIABLE_VALUE >", value, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_VALUE >=", value, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueLessThan(String value) {
            addCriterion("VARIABLE_VALUE <", value, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_VALUE <=", value, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueLike(String value) {
            addCriterion("VARIABLE_VALUE like", value, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueNotLike(String value) {
            addCriterion("VARIABLE_VALUE not like", value, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueIn(List<String> values) {
            addCriterion("VARIABLE_VALUE in", values, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueNotIn(List<String> values) {
            addCriterion("VARIABLE_VALUE not in", values, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueBetween(String value1, String value2) {
            addCriterion("VARIABLE_VALUE between", value1, value2, "variableValue");
            return (Criteria) this;
        }

        public Criteria andVariableValueNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_VALUE not between", value1, value2, "variableValue");
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