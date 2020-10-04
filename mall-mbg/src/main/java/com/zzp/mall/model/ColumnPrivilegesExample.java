package com.zzp.mall.model;

import java.util.ArrayList;
import java.util.List;

public class ColumnPrivilegesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColumnPrivilegesExample() {
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

        public Criteria andGranteeIsNull() {
            addCriterion("GRANTEE is null");
            return (Criteria) this;
        }

        public Criteria andGranteeIsNotNull() {
            addCriterion("GRANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andGranteeEqualTo(String value) {
            addCriterion("GRANTEE =", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeNotEqualTo(String value) {
            addCriterion("GRANTEE <>", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeGreaterThan(String value) {
            addCriterion("GRANTEE >", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeGreaterThanOrEqualTo(String value) {
            addCriterion("GRANTEE >=", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeLessThan(String value) {
            addCriterion("GRANTEE <", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeLessThanOrEqualTo(String value) {
            addCriterion("GRANTEE <=", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeLike(String value) {
            addCriterion("GRANTEE like", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeNotLike(String value) {
            addCriterion("GRANTEE not like", value, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeIn(List<String> values) {
            addCriterion("GRANTEE in", values, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeNotIn(List<String> values) {
            addCriterion("GRANTEE not in", values, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeBetween(String value1, String value2) {
            addCriterion("GRANTEE between", value1, value2, "grantee");
            return (Criteria) this;
        }

        public Criteria andGranteeNotBetween(String value1, String value2) {
            addCriterion("GRANTEE not between", value1, value2, "grantee");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIsNull() {
            addCriterion("TABLE_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIsNotNull() {
            addCriterion("TABLE_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogEqualTo(String value) {
            addCriterion("TABLE_CATALOG =", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotEqualTo(String value) {
            addCriterion("TABLE_CATALOG <>", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThan(String value) {
            addCriterion("TABLE_CATALOG >", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG >=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThan(String value) {
            addCriterion("TABLE_CATALOG <", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG <=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLike(String value) {
            addCriterion("TABLE_CATALOG like", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotLike(String value) {
            addCriterion("TABLE_CATALOG not like", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIn(List<String> values) {
            addCriterion("TABLE_CATALOG in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotIn(List<String> values) {
            addCriterion("TABLE_CATALOG not in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG not between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNull() {
            addCriterion("TABLE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("TABLE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(String value) {
            addCriterion("TABLE_SCHEMA =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(String value) {
            addCriterion("TABLE_SCHEMA >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(String value) {
            addCriterion("TABLE_SCHEMA <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLike(String value) {
            addCriterion("TABLE_SCHEMA like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotLike(String value) {
            addCriterion("TABLE_SCHEMA not like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<String> values) {
            addCriterion("TABLE_SCHEMA in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<String> values) {
            addCriterion("TABLE_SCHEMA not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("COLUMN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("COLUMN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("COLUMN_NAME =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("COLUMN_NAME <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("COLUMN_NAME >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN_NAME >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("COLUMN_NAME <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("COLUMN_NAME <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("COLUMN_NAME like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("COLUMN_NAME not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("COLUMN_NAME in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("COLUMN_NAME not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("COLUMN_NAME between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("COLUMN_NAME not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeIsNull() {
            addCriterion("PRIVILEGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeIsNotNull() {
            addCriterion("PRIVILEGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeEqualTo(String value) {
            addCriterion("PRIVILEGE_TYPE =", value, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeNotEqualTo(String value) {
            addCriterion("PRIVILEGE_TYPE <>", value, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeGreaterThan(String value) {
            addCriterion("PRIVILEGE_TYPE >", value, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_TYPE >=", value, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeLessThan(String value) {
            addCriterion("PRIVILEGE_TYPE <", value, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeLessThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_TYPE <=", value, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeLike(String value) {
            addCriterion("PRIVILEGE_TYPE like", value, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeNotLike(String value) {
            addCriterion("PRIVILEGE_TYPE not like", value, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeIn(List<String> values) {
            addCriterion("PRIVILEGE_TYPE in", values, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeNotIn(List<String> values) {
            addCriterion("PRIVILEGE_TYPE not in", values, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_TYPE between", value1, value2, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andPrivilegeTypeNotBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_TYPE not between", value1, value2, "privilegeType");
            return (Criteria) this;
        }

        public Criteria andIsGrantableIsNull() {
            addCriterion("IS_GRANTABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsGrantableIsNotNull() {
            addCriterion("IS_GRANTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsGrantableEqualTo(String value) {
            addCriterion("IS_GRANTABLE =", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableNotEqualTo(String value) {
            addCriterion("IS_GRANTABLE <>", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableGreaterThan(String value) {
            addCriterion("IS_GRANTABLE >", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GRANTABLE >=", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableLessThan(String value) {
            addCriterion("IS_GRANTABLE <", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableLessThanOrEqualTo(String value) {
            addCriterion("IS_GRANTABLE <=", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableLike(String value) {
            addCriterion("IS_GRANTABLE like", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableNotLike(String value) {
            addCriterion("IS_GRANTABLE not like", value, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableIn(List<String> values) {
            addCriterion("IS_GRANTABLE in", values, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableNotIn(List<String> values) {
            addCriterion("IS_GRANTABLE not in", values, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableBetween(String value1, String value2) {
            addCriterion("IS_GRANTABLE between", value1, value2, "isGrantable");
            return (Criteria) this;
        }

        public Criteria andIsGrantableNotBetween(String value1, String value2) {
            addCriterion("IS_GRANTABLE not between", value1, value2, "isGrantable");
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