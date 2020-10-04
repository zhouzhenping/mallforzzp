package com.zzp.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsExample() {
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

        public Criteria andEventCatalogIsNull() {
            addCriterion("EVENT_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andEventCatalogIsNotNull() {
            addCriterion("EVENT_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andEventCatalogEqualTo(String value) {
            addCriterion("EVENT_CATALOG =", value, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogNotEqualTo(String value) {
            addCriterion("EVENT_CATALOG <>", value, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogGreaterThan(String value) {
            addCriterion("EVENT_CATALOG >", value, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_CATALOG >=", value, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogLessThan(String value) {
            addCriterion("EVENT_CATALOG <", value, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogLessThanOrEqualTo(String value) {
            addCriterion("EVENT_CATALOG <=", value, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogLike(String value) {
            addCriterion("EVENT_CATALOG like", value, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogNotLike(String value) {
            addCriterion("EVENT_CATALOG not like", value, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogIn(List<String> values) {
            addCriterion("EVENT_CATALOG in", values, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogNotIn(List<String> values) {
            addCriterion("EVENT_CATALOG not in", values, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogBetween(String value1, String value2) {
            addCriterion("EVENT_CATALOG between", value1, value2, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventCatalogNotBetween(String value1, String value2) {
            addCriterion("EVENT_CATALOG not between", value1, value2, "eventCatalog");
            return (Criteria) this;
        }

        public Criteria andEventSchemaIsNull() {
            addCriterion("EVENT_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andEventSchemaIsNotNull() {
            addCriterion("EVENT_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andEventSchemaEqualTo(String value) {
            addCriterion("EVENT_SCHEMA =", value, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaNotEqualTo(String value) {
            addCriterion("EVENT_SCHEMA <>", value, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaGreaterThan(String value) {
            addCriterion("EVENT_SCHEMA >", value, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_SCHEMA >=", value, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaLessThan(String value) {
            addCriterion("EVENT_SCHEMA <", value, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaLessThanOrEqualTo(String value) {
            addCriterion("EVENT_SCHEMA <=", value, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaLike(String value) {
            addCriterion("EVENT_SCHEMA like", value, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaNotLike(String value) {
            addCriterion("EVENT_SCHEMA not like", value, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaIn(List<String> values) {
            addCriterion("EVENT_SCHEMA in", values, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaNotIn(List<String> values) {
            addCriterion("EVENT_SCHEMA not in", values, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaBetween(String value1, String value2) {
            addCriterion("EVENT_SCHEMA between", value1, value2, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventSchemaNotBetween(String value1, String value2) {
            addCriterion("EVENT_SCHEMA not between", value1, value2, "eventSchema");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNull() {
            addCriterion("EVENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("EVENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("EVENT_NAME =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("EVENT_NAME <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("EVENT_NAME >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("EVENT_NAME <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("EVENT_NAME like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("EVENT_NAME not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("EVENT_NAME in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("EVENT_NAME not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("EVENT_NAME between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("EVENT_NAME not between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andDefinerIsNull() {
            addCriterion("DEFINER is null");
            return (Criteria) this;
        }

        public Criteria andDefinerIsNotNull() {
            addCriterion("DEFINER is not null");
            return (Criteria) this;
        }

        public Criteria andDefinerEqualTo(String value) {
            addCriterion("DEFINER =", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerNotEqualTo(String value) {
            addCriterion("DEFINER <>", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerGreaterThan(String value) {
            addCriterion("DEFINER >", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerGreaterThanOrEqualTo(String value) {
            addCriterion("DEFINER >=", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerLessThan(String value) {
            addCriterion("DEFINER <", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerLessThanOrEqualTo(String value) {
            addCriterion("DEFINER <=", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerLike(String value) {
            addCriterion("DEFINER like", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerNotLike(String value) {
            addCriterion("DEFINER not like", value, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerIn(List<String> values) {
            addCriterion("DEFINER in", values, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerNotIn(List<String> values) {
            addCriterion("DEFINER not in", values, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerBetween(String value1, String value2) {
            addCriterion("DEFINER between", value1, value2, "definer");
            return (Criteria) this;
        }

        public Criteria andDefinerNotBetween(String value1, String value2) {
            addCriterion("DEFINER not between", value1, value2, "definer");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNull() {
            addCriterion("TIME_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNotNull() {
            addCriterion("TIME_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEqualTo(String value) {
            addCriterion("TIME_ZONE =", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotEqualTo(String value) {
            addCriterion("TIME_ZONE <>", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThan(String value) {
            addCriterion("TIME_ZONE >", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_ZONE >=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThan(String value) {
            addCriterion("TIME_ZONE <", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThanOrEqualTo(String value) {
            addCriterion("TIME_ZONE <=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLike(String value) {
            addCriterion("TIME_ZONE like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotLike(String value) {
            addCriterion("TIME_ZONE not like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIn(List<String> values) {
            addCriterion("TIME_ZONE in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotIn(List<String> values) {
            addCriterion("TIME_ZONE not in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneBetween(String value1, String value2) {
            addCriterion("TIME_ZONE between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotBetween(String value1, String value2) {
            addCriterion("TIME_ZONE not between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andEventBodyIsNull() {
            addCriterion("EVENT_BODY is null");
            return (Criteria) this;
        }

        public Criteria andEventBodyIsNotNull() {
            addCriterion("EVENT_BODY is not null");
            return (Criteria) this;
        }

        public Criteria andEventBodyEqualTo(String value) {
            addCriterion("EVENT_BODY =", value, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyNotEqualTo(String value) {
            addCriterion("EVENT_BODY <>", value, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyGreaterThan(String value) {
            addCriterion("EVENT_BODY >", value, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_BODY >=", value, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyLessThan(String value) {
            addCriterion("EVENT_BODY <", value, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyLessThanOrEqualTo(String value) {
            addCriterion("EVENT_BODY <=", value, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyLike(String value) {
            addCriterion("EVENT_BODY like", value, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyNotLike(String value) {
            addCriterion("EVENT_BODY not like", value, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyIn(List<String> values) {
            addCriterion("EVENT_BODY in", values, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyNotIn(List<String> values) {
            addCriterion("EVENT_BODY not in", values, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyBetween(String value1, String value2) {
            addCriterion("EVENT_BODY between", value1, value2, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventBodyNotBetween(String value1, String value2) {
            addCriterion("EVENT_BODY not between", value1, value2, "eventBody");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("EVENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("EVENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(String value) {
            addCriterion("EVENT_TYPE =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(String value) {
            addCriterion("EVENT_TYPE <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(String value) {
            addCriterion("EVENT_TYPE >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_TYPE >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(String value) {
            addCriterion("EVENT_TYPE <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(String value) {
            addCriterion("EVENT_TYPE <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLike(String value) {
            addCriterion("EVENT_TYPE like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotLike(String value) {
            addCriterion("EVENT_TYPE not like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<String> values) {
            addCriterion("EVENT_TYPE in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<String> values) {
            addCriterion("EVENT_TYPE not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(String value1, String value2) {
            addCriterion("EVENT_TYPE between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(String value1, String value2) {
            addCriterion("EVENT_TYPE not between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andExecuteAtIsNull() {
            addCriterion("EXECUTE_AT is null");
            return (Criteria) this;
        }

        public Criteria andExecuteAtIsNotNull() {
            addCriterion("EXECUTE_AT is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteAtEqualTo(Date value) {
            addCriterion("EXECUTE_AT =", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtNotEqualTo(Date value) {
            addCriterion("EXECUTE_AT <>", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtGreaterThan(Date value) {
            addCriterion("EXECUTE_AT >", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtGreaterThanOrEqualTo(Date value) {
            addCriterion("EXECUTE_AT >=", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtLessThan(Date value) {
            addCriterion("EXECUTE_AT <", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtLessThanOrEqualTo(Date value) {
            addCriterion("EXECUTE_AT <=", value, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtIn(List<Date> values) {
            addCriterion("EXECUTE_AT in", values, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtNotIn(List<Date> values) {
            addCriterion("EXECUTE_AT not in", values, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtBetween(Date value1, Date value2) {
            addCriterion("EXECUTE_AT between", value1, value2, "executeAt");
            return (Criteria) this;
        }

        public Criteria andExecuteAtNotBetween(Date value1, Date value2) {
            addCriterion("EXECUTE_AT not between", value1, value2, "executeAt");
            return (Criteria) this;
        }

        public Criteria andIntervalValueIsNull() {
            addCriterion("INTERVAL_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andIntervalValueIsNotNull() {
            addCriterion("INTERVAL_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalValueEqualTo(String value) {
            addCriterion("INTERVAL_VALUE =", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueNotEqualTo(String value) {
            addCriterion("INTERVAL_VALUE <>", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueGreaterThan(String value) {
            addCriterion("INTERVAL_VALUE >", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVAL_VALUE >=", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueLessThan(String value) {
            addCriterion("INTERVAL_VALUE <", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueLessThanOrEqualTo(String value) {
            addCriterion("INTERVAL_VALUE <=", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueLike(String value) {
            addCriterion("INTERVAL_VALUE like", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueNotLike(String value) {
            addCriterion("INTERVAL_VALUE not like", value, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueIn(List<String> values) {
            addCriterion("INTERVAL_VALUE in", values, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueNotIn(List<String> values) {
            addCriterion("INTERVAL_VALUE not in", values, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueBetween(String value1, String value2) {
            addCriterion("INTERVAL_VALUE between", value1, value2, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalValueNotBetween(String value1, String value2) {
            addCriterion("INTERVAL_VALUE not between", value1, value2, "intervalValue");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldIsNull() {
            addCriterion("INTERVAL_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldIsNotNull() {
            addCriterion("INTERVAL_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldEqualTo(String value) {
            addCriterion("INTERVAL_FIELD =", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldNotEqualTo(String value) {
            addCriterion("INTERVAL_FIELD <>", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldGreaterThan(String value) {
            addCriterion("INTERVAL_FIELD >", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVAL_FIELD >=", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldLessThan(String value) {
            addCriterion("INTERVAL_FIELD <", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldLessThanOrEqualTo(String value) {
            addCriterion("INTERVAL_FIELD <=", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldLike(String value) {
            addCriterion("INTERVAL_FIELD like", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldNotLike(String value) {
            addCriterion("INTERVAL_FIELD not like", value, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldIn(List<String> values) {
            addCriterion("INTERVAL_FIELD in", values, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldNotIn(List<String> values) {
            addCriterion("INTERVAL_FIELD not in", values, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldBetween(String value1, String value2) {
            addCriterion("INTERVAL_FIELD between", value1, value2, "intervalField");
            return (Criteria) this;
        }

        public Criteria andIntervalFieldNotBetween(String value1, String value2) {
            addCriterion("INTERVAL_FIELD not between", value1, value2, "intervalField");
            return (Criteria) this;
        }

        public Criteria andSqlModeIsNull() {
            addCriterion("SQL_MODE is null");
            return (Criteria) this;
        }

        public Criteria andSqlModeIsNotNull() {
            addCriterion("SQL_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlModeEqualTo(String value) {
            addCriterion("SQL_MODE =", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeNotEqualTo(String value) {
            addCriterion("SQL_MODE <>", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeGreaterThan(String value) {
            addCriterion("SQL_MODE >", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_MODE >=", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeLessThan(String value) {
            addCriterion("SQL_MODE <", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeLessThanOrEqualTo(String value) {
            addCriterion("SQL_MODE <=", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeLike(String value) {
            addCriterion("SQL_MODE like", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeNotLike(String value) {
            addCriterion("SQL_MODE not like", value, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeIn(List<String> values) {
            addCriterion("SQL_MODE in", values, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeNotIn(List<String> values) {
            addCriterion("SQL_MODE not in", values, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeBetween(String value1, String value2) {
            addCriterion("SQL_MODE between", value1, value2, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andSqlModeNotBetween(String value1, String value2) {
            addCriterion("SQL_MODE not between", value1, value2, "sqlMode");
            return (Criteria) this;
        }

        public Criteria andStartsIsNull() {
            addCriterion("STARTS is null");
            return (Criteria) this;
        }

        public Criteria andStartsIsNotNull() {
            addCriterion("STARTS is not null");
            return (Criteria) this;
        }

        public Criteria andStartsEqualTo(Date value) {
            addCriterion("STARTS =", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotEqualTo(Date value) {
            addCriterion("STARTS <>", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsGreaterThan(Date value) {
            addCriterion("STARTS >", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTS >=", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsLessThan(Date value) {
            addCriterion("STARTS <", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsLessThanOrEqualTo(Date value) {
            addCriterion("STARTS <=", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsIn(List<Date> values) {
            addCriterion("STARTS in", values, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotIn(List<Date> values) {
            addCriterion("STARTS not in", values, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsBetween(Date value1, Date value2) {
            addCriterion("STARTS between", value1, value2, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotBetween(Date value1, Date value2) {
            addCriterion("STARTS not between", value1, value2, "starts");
            return (Criteria) this;
        }

        public Criteria andEndsIsNull() {
            addCriterion("ENDS is null");
            return (Criteria) this;
        }

        public Criteria andEndsIsNotNull() {
            addCriterion("ENDS is not null");
            return (Criteria) this;
        }

        public Criteria andEndsEqualTo(Date value) {
            addCriterion("ENDS =", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsNotEqualTo(Date value) {
            addCriterion("ENDS <>", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsGreaterThan(Date value) {
            addCriterion("ENDS >", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDS >=", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsLessThan(Date value) {
            addCriterion("ENDS <", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsLessThanOrEqualTo(Date value) {
            addCriterion("ENDS <=", value, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsIn(List<Date> values) {
            addCriterion("ENDS in", values, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsNotIn(List<Date> values) {
            addCriterion("ENDS not in", values, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsBetween(Date value1, Date value2) {
            addCriterion("ENDS between", value1, value2, "ends");
            return (Criteria) this;
        }

        public Criteria andEndsNotBetween(Date value1, Date value2) {
            addCriterion("ENDS not between", value1, value2, "ends");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOnCompletionIsNull() {
            addCriterion("ON_COMPLETION is null");
            return (Criteria) this;
        }

        public Criteria andOnCompletionIsNotNull() {
            addCriterion("ON_COMPLETION is not null");
            return (Criteria) this;
        }

        public Criteria andOnCompletionEqualTo(String value) {
            addCriterion("ON_COMPLETION =", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionNotEqualTo(String value) {
            addCriterion("ON_COMPLETION <>", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionGreaterThan(String value) {
            addCriterion("ON_COMPLETION >", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionGreaterThanOrEqualTo(String value) {
            addCriterion("ON_COMPLETION >=", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionLessThan(String value) {
            addCriterion("ON_COMPLETION <", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionLessThanOrEqualTo(String value) {
            addCriterion("ON_COMPLETION <=", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionLike(String value) {
            addCriterion("ON_COMPLETION like", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionNotLike(String value) {
            addCriterion("ON_COMPLETION not like", value, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionIn(List<String> values) {
            addCriterion("ON_COMPLETION in", values, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionNotIn(List<String> values) {
            addCriterion("ON_COMPLETION not in", values, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionBetween(String value1, String value2) {
            addCriterion("ON_COMPLETION between", value1, value2, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andOnCompletionNotBetween(String value1, String value2) {
            addCriterion("ON_COMPLETION not between", value1, value2, "onCompletion");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("CREATED is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("CREATED =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("CREATED <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("CREATED >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("CREATED <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("CREATED <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("CREATED in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("CREATED not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("CREATED between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("CREATED not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andLastAlteredIsNull() {
            addCriterion("LAST_ALTERED is null");
            return (Criteria) this;
        }

        public Criteria andLastAlteredIsNotNull() {
            addCriterion("LAST_ALTERED is not null");
            return (Criteria) this;
        }

        public Criteria andLastAlteredEqualTo(Date value) {
            addCriterion("LAST_ALTERED =", value, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredNotEqualTo(Date value) {
            addCriterion("LAST_ALTERED <>", value, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredGreaterThan(Date value) {
            addCriterion("LAST_ALTERED >", value, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_ALTERED >=", value, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredLessThan(Date value) {
            addCriterion("LAST_ALTERED <", value, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredLessThanOrEqualTo(Date value) {
            addCriterion("LAST_ALTERED <=", value, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredIn(List<Date> values) {
            addCriterion("LAST_ALTERED in", values, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredNotIn(List<Date> values) {
            addCriterion("LAST_ALTERED not in", values, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredBetween(Date value1, Date value2) {
            addCriterion("LAST_ALTERED between", value1, value2, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastAlteredNotBetween(Date value1, Date value2) {
            addCriterion("LAST_ALTERED not between", value1, value2, "lastAltered");
            return (Criteria) this;
        }

        public Criteria andLastExecutedIsNull() {
            addCriterion("LAST_EXECUTED is null");
            return (Criteria) this;
        }

        public Criteria andLastExecutedIsNotNull() {
            addCriterion("LAST_EXECUTED is not null");
            return (Criteria) this;
        }

        public Criteria andLastExecutedEqualTo(Date value) {
            addCriterion("LAST_EXECUTED =", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedNotEqualTo(Date value) {
            addCriterion("LAST_EXECUTED <>", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedGreaterThan(Date value) {
            addCriterion("LAST_EXECUTED >", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_EXECUTED >=", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedLessThan(Date value) {
            addCriterion("LAST_EXECUTED <", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedLessThanOrEqualTo(Date value) {
            addCriterion("LAST_EXECUTED <=", value, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedIn(List<Date> values) {
            addCriterion("LAST_EXECUTED in", values, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedNotIn(List<Date> values) {
            addCriterion("LAST_EXECUTED not in", values, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedBetween(Date value1, Date value2) {
            addCriterion("LAST_EXECUTED between", value1, value2, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andLastExecutedNotBetween(Date value1, Date value2) {
            addCriterion("LAST_EXECUTED not between", value1, value2, "lastExecuted");
            return (Criteria) this;
        }

        public Criteria andEventCommentIsNull() {
            addCriterion("EVENT_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andEventCommentIsNotNull() {
            addCriterion("EVENT_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andEventCommentEqualTo(String value) {
            addCriterion("EVENT_COMMENT =", value, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentNotEqualTo(String value) {
            addCriterion("EVENT_COMMENT <>", value, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentGreaterThan(String value) {
            addCriterion("EVENT_COMMENT >", value, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_COMMENT >=", value, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentLessThan(String value) {
            addCriterion("EVENT_COMMENT <", value, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentLessThanOrEqualTo(String value) {
            addCriterion("EVENT_COMMENT <=", value, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentLike(String value) {
            addCriterion("EVENT_COMMENT like", value, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentNotLike(String value) {
            addCriterion("EVENT_COMMENT not like", value, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentIn(List<String> values) {
            addCriterion("EVENT_COMMENT in", values, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentNotIn(List<String> values) {
            addCriterion("EVENT_COMMENT not in", values, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentBetween(String value1, String value2) {
            addCriterion("EVENT_COMMENT between", value1, value2, "eventComment");
            return (Criteria) this;
        }

        public Criteria andEventCommentNotBetween(String value1, String value2) {
            addCriterion("EVENT_COMMENT not between", value1, value2, "eventComment");
            return (Criteria) this;
        }

        public Criteria andOriginatorIsNull() {
            addCriterion("ORIGINATOR is null");
            return (Criteria) this;
        }

        public Criteria andOriginatorIsNotNull() {
            addCriterion("ORIGINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOriginatorEqualTo(Integer value) {
            addCriterion("ORIGINATOR =", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotEqualTo(Integer value) {
            addCriterion("ORIGINATOR <>", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorGreaterThan(Integer value) {
            addCriterion("ORIGINATOR >", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORIGINATOR >=", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorLessThan(Integer value) {
            addCriterion("ORIGINATOR <", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorLessThanOrEqualTo(Integer value) {
            addCriterion("ORIGINATOR <=", value, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorIn(List<Integer> values) {
            addCriterion("ORIGINATOR in", values, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotIn(List<Integer> values) {
            addCriterion("ORIGINATOR not in", values, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorBetween(Integer value1, Integer value2) {
            addCriterion("ORIGINATOR between", value1, value2, "originator");
            return (Criteria) this;
        }

        public Criteria andOriginatorNotBetween(Integer value1, Integer value2) {
            addCriterion("ORIGINATOR not between", value1, value2, "originator");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientIsNull() {
            addCriterion("CHARACTER_SET_CLIENT is null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientIsNotNull() {
            addCriterion("CHARACTER_SET_CLIENT is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientEqualTo(String value) {
            addCriterion("CHARACTER_SET_CLIENT =", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientNotEqualTo(String value) {
            addCriterion("CHARACTER_SET_CLIENT <>", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientGreaterThan(String value) {
            addCriterion("CHARACTER_SET_CLIENT >", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientGreaterThanOrEqualTo(String value) {
            addCriterion("CHARACTER_SET_CLIENT >=", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientLessThan(String value) {
            addCriterion("CHARACTER_SET_CLIENT <", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientLessThanOrEqualTo(String value) {
            addCriterion("CHARACTER_SET_CLIENT <=", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientLike(String value) {
            addCriterion("CHARACTER_SET_CLIENT like", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientNotLike(String value) {
            addCriterion("CHARACTER_SET_CLIENT not like", value, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientIn(List<String> values) {
            addCriterion("CHARACTER_SET_CLIENT in", values, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientNotIn(List<String> values) {
            addCriterion("CHARACTER_SET_CLIENT not in", values, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientBetween(String value1, String value2) {
            addCriterion("CHARACTER_SET_CLIENT between", value1, value2, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCharacterSetClientNotBetween(String value1, String value2) {
            addCriterion("CHARACTER_SET_CLIENT not between", value1, value2, "characterSetClient");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionIsNull() {
            addCriterion("COLLATION_CONNECTION is null");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionIsNotNull() {
            addCriterion("COLLATION_CONNECTION is not null");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionEqualTo(String value) {
            addCriterion("COLLATION_CONNECTION =", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionNotEqualTo(String value) {
            addCriterion("COLLATION_CONNECTION <>", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionGreaterThan(String value) {
            addCriterion("COLLATION_CONNECTION >", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionGreaterThanOrEqualTo(String value) {
            addCriterion("COLLATION_CONNECTION >=", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionLessThan(String value) {
            addCriterion("COLLATION_CONNECTION <", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionLessThanOrEqualTo(String value) {
            addCriterion("COLLATION_CONNECTION <=", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionLike(String value) {
            addCriterion("COLLATION_CONNECTION like", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionNotLike(String value) {
            addCriterion("COLLATION_CONNECTION not like", value, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionIn(List<String> values) {
            addCriterion("COLLATION_CONNECTION in", values, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionNotIn(List<String> values) {
            addCriterion("COLLATION_CONNECTION not in", values, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionBetween(String value1, String value2) {
            addCriterion("COLLATION_CONNECTION between", value1, value2, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andCollationConnectionNotBetween(String value1, String value2) {
            addCriterion("COLLATION_CONNECTION not between", value1, value2, "collationConnection");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationIsNull() {
            addCriterion("DATABASE_COLLATION is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationIsNotNull() {
            addCriterion("DATABASE_COLLATION is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationEqualTo(String value) {
            addCriterion("DATABASE_COLLATION =", value, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationNotEqualTo(String value) {
            addCriterion("DATABASE_COLLATION <>", value, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationGreaterThan(String value) {
            addCriterion("DATABASE_COLLATION >", value, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationGreaterThanOrEqualTo(String value) {
            addCriterion("DATABASE_COLLATION >=", value, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationLessThan(String value) {
            addCriterion("DATABASE_COLLATION <", value, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationLessThanOrEqualTo(String value) {
            addCriterion("DATABASE_COLLATION <=", value, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationLike(String value) {
            addCriterion("DATABASE_COLLATION like", value, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationNotLike(String value) {
            addCriterion("DATABASE_COLLATION not like", value, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationIn(List<String> values) {
            addCriterion("DATABASE_COLLATION in", values, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationNotIn(List<String> values) {
            addCriterion("DATABASE_COLLATION not in", values, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationBetween(String value1, String value2) {
            addCriterion("DATABASE_COLLATION between", value1, value2, "databaseCollation");
            return (Criteria) this;
        }

        public Criteria andDatabaseCollationNotBetween(String value1, String value2) {
            addCriterion("DATABASE_COLLATION not between", value1, value2, "databaseCollation");
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