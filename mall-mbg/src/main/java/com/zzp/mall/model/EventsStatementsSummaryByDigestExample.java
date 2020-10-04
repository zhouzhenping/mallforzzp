package com.zzp.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventsStatementsSummaryByDigestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsStatementsSummaryByDigestExample() {
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

        public Criteria andSchemaNameIsNull() {
            addCriterion("SCHEMA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchemaNameIsNotNull() {
            addCriterion("SCHEMA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaNameEqualTo(String value) {
            addCriterion("SCHEMA_NAME =", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotEqualTo(String value) {
            addCriterion("SCHEMA_NAME <>", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameGreaterThan(String value) {
            addCriterion("SCHEMA_NAME >", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEMA_NAME >=", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLessThan(String value) {
            addCriterion("SCHEMA_NAME <", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLessThanOrEqualTo(String value) {
            addCriterion("SCHEMA_NAME <=", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLike(String value) {
            addCriterion("SCHEMA_NAME like", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotLike(String value) {
            addCriterion("SCHEMA_NAME not like", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameIn(List<String> values) {
            addCriterion("SCHEMA_NAME in", values, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotIn(List<String> values) {
            addCriterion("SCHEMA_NAME not in", values, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameBetween(String value1, String value2) {
            addCriterion("SCHEMA_NAME between", value1, value2, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotBetween(String value1, String value2) {
            addCriterion("SCHEMA_NAME not between", value1, value2, "schemaName");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(String value) {
            addCriterion("DIGEST =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(String value) {
            addCriterion("DIGEST <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(String value) {
            addCriterion("DIGEST >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(String value) {
            addCriterion("DIGEST >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(String value) {
            addCriterion("DIGEST <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(String value) {
            addCriterion("DIGEST <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLike(String value) {
            addCriterion("DIGEST like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotLike(String value) {
            addCriterion("DIGEST not like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<String> values) {
            addCriterion("DIGEST in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<String> values) {
            addCriterion("DIGEST not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(String value1, String value2) {
            addCriterion("DIGEST between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(String value1, String value2) {
            addCriterion("DIGEST not between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andCountStarIsNull() {
            addCriterion("COUNT_STAR is null");
            return (Criteria) this;
        }

        public Criteria andCountStarIsNotNull() {
            addCriterion("COUNT_STAR is not null");
            return (Criteria) this;
        }

        public Criteria andCountStarEqualTo(Long value) {
            addCriterion("COUNT_STAR =", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarNotEqualTo(Long value) {
            addCriterion("COUNT_STAR <>", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarGreaterThan(Long value) {
            addCriterion("COUNT_STAR >", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_STAR >=", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarLessThan(Long value) {
            addCriterion("COUNT_STAR <", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_STAR <=", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarIn(List<Long> values) {
            addCriterion("COUNT_STAR in", values, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarNotIn(List<Long> values) {
            addCriterion("COUNT_STAR not in", values, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarBetween(Long value1, Long value2) {
            addCriterion("COUNT_STAR between", value1, value2, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_STAR not between", value1, value2, "countStar");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitIsNull() {
            addCriterion("SUM_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitIsNotNull() {
            addCriterion("SUM_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT =", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT <>", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WAIT >", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT >=", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitLessThan(Long value) {
            addCriterion("SUM_TIMER_WAIT <", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT <=", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitIn(List<Long> values) {
            addCriterion("SUM_TIMER_WAIT in", values, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WAIT not in", values, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WAIT between", value1, value2, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WAIT not between", value1, value2, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitIsNull() {
            addCriterion("MIN_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitIsNotNull() {
            addCriterion("MIN_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT =", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT <>", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WAIT >", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT >=", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitLessThan(Long value) {
            addCriterion("MIN_TIMER_WAIT <", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT <=", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitIn(List<Long> values) {
            addCriterion("MIN_TIMER_WAIT in", values, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WAIT not in", values, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WAIT between", value1, value2, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WAIT not between", value1, value2, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitIsNull() {
            addCriterion("AVG_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitIsNotNull() {
            addCriterion("AVG_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT =", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT <>", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WAIT >", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT >=", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitLessThan(Long value) {
            addCriterion("AVG_TIMER_WAIT <", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT <=", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitIn(List<Long> values) {
            addCriterion("AVG_TIMER_WAIT in", values, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WAIT not in", values, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WAIT between", value1, value2, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WAIT not between", value1, value2, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitIsNull() {
            addCriterion("MAX_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitIsNotNull() {
            addCriterion("MAX_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT =", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT <>", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WAIT >", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT >=", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitLessThan(Long value) {
            addCriterion("MAX_TIMER_WAIT <", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT <=", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitIn(List<Long> values) {
            addCriterion("MAX_TIMER_WAIT in", values, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WAIT not in", values, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WAIT between", value1, value2, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WAIT not between", value1, value2, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeIsNull() {
            addCriterion("SUM_LOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeIsNotNull() {
            addCriterion("SUM_LOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeEqualTo(Long value) {
            addCriterion("SUM_LOCK_TIME =", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeNotEqualTo(Long value) {
            addCriterion("SUM_LOCK_TIME <>", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeGreaterThan(Long value) {
            addCriterion("SUM_LOCK_TIME >", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_LOCK_TIME >=", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeLessThan(Long value) {
            addCriterion("SUM_LOCK_TIME <", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_LOCK_TIME <=", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeIn(List<Long> values) {
            addCriterion("SUM_LOCK_TIME in", values, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeNotIn(List<Long> values) {
            addCriterion("SUM_LOCK_TIME not in", values, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeBetween(Long value1, Long value2) {
            addCriterion("SUM_LOCK_TIME between", value1, value2, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_LOCK_TIME not between", value1, value2, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumErrorsIsNull() {
            addCriterion("SUM_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andSumErrorsIsNotNull() {
            addCriterion("SUM_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andSumErrorsEqualTo(Long value) {
            addCriterion("SUM_ERRORS =", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsNotEqualTo(Long value) {
            addCriterion("SUM_ERRORS <>", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsGreaterThan(Long value) {
            addCriterion("SUM_ERRORS >", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ERRORS >=", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsLessThan(Long value) {
            addCriterion("SUM_ERRORS <", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ERRORS <=", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsIn(List<Long> values) {
            addCriterion("SUM_ERRORS in", values, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsNotIn(List<Long> values) {
            addCriterion("SUM_ERRORS not in", values, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsBetween(Long value1, Long value2) {
            addCriterion("SUM_ERRORS between", value1, value2, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ERRORS not between", value1, value2, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumWarningsIsNull() {
            addCriterion("SUM_WARNINGS is null");
            return (Criteria) this;
        }

        public Criteria andSumWarningsIsNotNull() {
            addCriterion("SUM_WARNINGS is not null");
            return (Criteria) this;
        }

        public Criteria andSumWarningsEqualTo(Long value) {
            addCriterion("SUM_WARNINGS =", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsNotEqualTo(Long value) {
            addCriterion("SUM_WARNINGS <>", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsGreaterThan(Long value) {
            addCriterion("SUM_WARNINGS >", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_WARNINGS >=", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsLessThan(Long value) {
            addCriterion("SUM_WARNINGS <", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsLessThanOrEqualTo(Long value) {
            addCriterion("SUM_WARNINGS <=", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsIn(List<Long> values) {
            addCriterion("SUM_WARNINGS in", values, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsNotIn(List<Long> values) {
            addCriterion("SUM_WARNINGS not in", values, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsBetween(Long value1, Long value2) {
            addCriterion("SUM_WARNINGS between", value1, value2, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsNotBetween(Long value1, Long value2) {
            addCriterion("SUM_WARNINGS not between", value1, value2, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedIsNull() {
            addCriterion("SUM_ROWS_AFFECTED is null");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedIsNotNull() {
            addCriterion("SUM_ROWS_AFFECTED is not null");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedEqualTo(Long value) {
            addCriterion("SUM_ROWS_AFFECTED =", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedNotEqualTo(Long value) {
            addCriterion("SUM_ROWS_AFFECTED <>", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedGreaterThan(Long value) {
            addCriterion("SUM_ROWS_AFFECTED >", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_AFFECTED >=", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedLessThan(Long value) {
            addCriterion("SUM_ROWS_AFFECTED <", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_AFFECTED <=", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedIn(List<Long> values) {
            addCriterion("SUM_ROWS_AFFECTED in", values, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedNotIn(List<Long> values) {
            addCriterion("SUM_ROWS_AFFECTED not in", values, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_AFFECTED between", value1, value2, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_AFFECTED not between", value1, value2, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentIsNull() {
            addCriterion("SUM_ROWS_SENT is null");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentIsNotNull() {
            addCriterion("SUM_ROWS_SENT is not null");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentEqualTo(Long value) {
            addCriterion("SUM_ROWS_SENT =", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentNotEqualTo(Long value) {
            addCriterion("SUM_ROWS_SENT <>", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentGreaterThan(Long value) {
            addCriterion("SUM_ROWS_SENT >", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_SENT >=", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentLessThan(Long value) {
            addCriterion("SUM_ROWS_SENT <", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_SENT <=", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentIn(List<Long> values) {
            addCriterion("SUM_ROWS_SENT in", values, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentNotIn(List<Long> values) {
            addCriterion("SUM_ROWS_SENT not in", values, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_SENT between", value1, value2, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_SENT not between", value1, value2, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedIsNull() {
            addCriterion("SUM_ROWS_EXAMINED is null");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedIsNotNull() {
            addCriterion("SUM_ROWS_EXAMINED is not null");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedEqualTo(Long value) {
            addCriterion("SUM_ROWS_EXAMINED =", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedNotEqualTo(Long value) {
            addCriterion("SUM_ROWS_EXAMINED <>", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedGreaterThan(Long value) {
            addCriterion("SUM_ROWS_EXAMINED >", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_EXAMINED >=", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedLessThan(Long value) {
            addCriterion("SUM_ROWS_EXAMINED <", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_EXAMINED <=", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedIn(List<Long> values) {
            addCriterion("SUM_ROWS_EXAMINED in", values, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedNotIn(List<Long> values) {
            addCriterion("SUM_ROWS_EXAMINED not in", values, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_EXAMINED between", value1, value2, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_EXAMINED not between", value1, value2, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesIsNull() {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES is null");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesIsNotNull() {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES is not null");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES =", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesNotEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES <>", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesGreaterThan(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES >", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES >=", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesLessThan(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES <", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesLessThanOrEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES <=", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesIn(List<Long> values) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES in", values, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesNotIn(List<Long> values) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES not in", values, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesBetween(Long value1, Long value2) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES between", value1, value2, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesNotBetween(Long value1, Long value2) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES not between", value1, value2, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesIsNull() {
            addCriterion("SUM_CREATED_TMP_TABLES is null");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesIsNotNull() {
            addCriterion("SUM_CREATED_TMP_TABLES is not null");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES =", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesNotEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES <>", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesGreaterThan(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES >", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES >=", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesLessThan(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES <", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesLessThanOrEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES <=", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesIn(List<Long> values) {
            addCriterion("SUM_CREATED_TMP_TABLES in", values, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesNotIn(List<Long> values) {
            addCriterion("SUM_CREATED_TMP_TABLES not in", values, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesBetween(Long value1, Long value2) {
            addCriterion("SUM_CREATED_TMP_TABLES between", value1, value2, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesNotBetween(Long value1, Long value2) {
            addCriterion("SUM_CREATED_TMP_TABLES not between", value1, value2, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinIsNull() {
            addCriterion("SUM_SELECT_FULL_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinIsNotNull() {
            addCriterion("SUM_SELECT_FULL_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN =", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN <>", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinGreaterThan(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN >", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN >=", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinLessThan(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN <", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN <=", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinIn(List<Long> values) {
            addCriterion("SUM_SELECT_FULL_JOIN in", values, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_FULL_JOIN not in", values, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_FULL_JOIN between", value1, value2, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_FULL_JOIN not between", value1, value2, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinIsNull() {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinIsNotNull() {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN =", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN <>", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinGreaterThan(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN >", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN >=", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinLessThan(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN <", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN <=", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinIn(List<Long> values) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN in", values, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN not in", values, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN between", value1, value2, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN not between", value1, value2, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeIsNull() {
            addCriterion("SUM_SELECT_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeIsNotNull() {
            addCriterion("SUM_SELECT_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE =", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE <>", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeGreaterThan(Long value) {
            addCriterion("SUM_SELECT_RANGE >", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE >=", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeLessThan(Long value) {
            addCriterion("SUM_SELECT_RANGE <", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE <=", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeIn(List<Long> values) {
            addCriterion("SUM_SELECT_RANGE in", values, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_RANGE not in", values, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_RANGE between", value1, value2, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_RANGE not between", value1, value2, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckIsNull() {
            addCriterion("SUM_SELECT_RANGE_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckIsNotNull() {
            addCriterion("SUM_SELECT_RANGE_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK =", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK <>", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckGreaterThan(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK >", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK >=", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckLessThan(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK <", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK <=", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckIn(List<Long> values) {
            addCriterion("SUM_SELECT_RANGE_CHECK in", values, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_RANGE_CHECK not in", values, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_RANGE_CHECK between", value1, value2, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_RANGE_CHECK not between", value1, value2, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanIsNull() {
            addCriterion("SUM_SELECT_SCAN is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanIsNotNull() {
            addCriterion("SUM_SELECT_SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanEqualTo(Long value) {
            addCriterion("SUM_SELECT_SCAN =", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_SCAN <>", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanGreaterThan(Long value) {
            addCriterion("SUM_SELECT_SCAN >", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_SCAN >=", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanLessThan(Long value) {
            addCriterion("SUM_SELECT_SCAN <", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_SCAN <=", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanIn(List<Long> values) {
            addCriterion("SUM_SELECT_SCAN in", values, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_SCAN not in", values, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_SCAN between", value1, value2, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_SCAN not between", value1, value2, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesIsNull() {
            addCriterion("SUM_SORT_MERGE_PASSES is null");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesIsNotNull() {
            addCriterion("SUM_SORT_MERGE_PASSES is not null");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesEqualTo(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES =", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesNotEqualTo(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES <>", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesGreaterThan(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES >", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES >=", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesLessThan(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES <", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES <=", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesIn(List<Long> values) {
            addCriterion("SUM_SORT_MERGE_PASSES in", values, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesNotIn(List<Long> values) {
            addCriterion("SUM_SORT_MERGE_PASSES not in", values, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_MERGE_PASSES between", value1, value2, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_MERGE_PASSES not between", value1, value2, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeIsNull() {
            addCriterion("SUM_SORT_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeIsNotNull() {
            addCriterion("SUM_SORT_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeEqualTo(Long value) {
            addCriterion("SUM_SORT_RANGE =", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeNotEqualTo(Long value) {
            addCriterion("SUM_SORT_RANGE <>", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeGreaterThan(Long value) {
            addCriterion("SUM_SORT_RANGE >", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_RANGE >=", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeLessThan(Long value) {
            addCriterion("SUM_SORT_RANGE <", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_RANGE <=", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeIn(List<Long> values) {
            addCriterion("SUM_SORT_RANGE in", values, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeNotIn(List<Long> values) {
            addCriterion("SUM_SORT_RANGE not in", values, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_RANGE between", value1, value2, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_RANGE not between", value1, value2, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsIsNull() {
            addCriterion("SUM_SORT_ROWS is null");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsIsNotNull() {
            addCriterion("SUM_SORT_ROWS is not null");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsEqualTo(Long value) {
            addCriterion("SUM_SORT_ROWS =", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsNotEqualTo(Long value) {
            addCriterion("SUM_SORT_ROWS <>", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsGreaterThan(Long value) {
            addCriterion("SUM_SORT_ROWS >", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_ROWS >=", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsLessThan(Long value) {
            addCriterion("SUM_SORT_ROWS <", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_ROWS <=", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsIn(List<Long> values) {
            addCriterion("SUM_SORT_ROWS in", values, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsNotIn(List<Long> values) {
            addCriterion("SUM_SORT_ROWS not in", values, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_ROWS between", value1, value2, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_ROWS not between", value1, value2, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortScanIsNull() {
            addCriterion("SUM_SORT_SCAN is null");
            return (Criteria) this;
        }

        public Criteria andSumSortScanIsNotNull() {
            addCriterion("SUM_SORT_SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andSumSortScanEqualTo(Long value) {
            addCriterion("SUM_SORT_SCAN =", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanNotEqualTo(Long value) {
            addCriterion("SUM_SORT_SCAN <>", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanGreaterThan(Long value) {
            addCriterion("SUM_SORT_SCAN >", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_SCAN >=", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanLessThan(Long value) {
            addCriterion("SUM_SORT_SCAN <", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_SCAN <=", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanIn(List<Long> values) {
            addCriterion("SUM_SORT_SCAN in", values, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanNotIn(List<Long> values) {
            addCriterion("SUM_SORT_SCAN not in", values, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_SCAN between", value1, value2, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_SCAN not between", value1, value2, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedIsNull() {
            addCriterion("SUM_NO_INDEX_USED is null");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedIsNotNull() {
            addCriterion("SUM_NO_INDEX_USED is not null");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedEqualTo(Long value) {
            addCriterion("SUM_NO_INDEX_USED =", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedNotEqualTo(Long value) {
            addCriterion("SUM_NO_INDEX_USED <>", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedGreaterThan(Long value) {
            addCriterion("SUM_NO_INDEX_USED >", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NO_INDEX_USED >=", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedLessThan(Long value) {
            addCriterion("SUM_NO_INDEX_USED <", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NO_INDEX_USED <=", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedIn(List<Long> values) {
            addCriterion("SUM_NO_INDEX_USED in", values, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedNotIn(List<Long> values) {
            addCriterion("SUM_NO_INDEX_USED not in", values, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedBetween(Long value1, Long value2) {
            addCriterion("SUM_NO_INDEX_USED between", value1, value2, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NO_INDEX_USED not between", value1, value2, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedIsNull() {
            addCriterion("SUM_NO_GOOD_INDEX_USED is null");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedIsNotNull() {
            addCriterion("SUM_NO_GOOD_INDEX_USED is not null");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedEqualTo(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED =", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedNotEqualTo(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED <>", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedGreaterThan(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED >", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED >=", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedLessThan(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED <", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED <=", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedIn(List<Long> values) {
            addCriterion("SUM_NO_GOOD_INDEX_USED in", values, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedNotIn(List<Long> values) {
            addCriterion("SUM_NO_GOOD_INDEX_USED not in", values, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedBetween(Long value1, Long value2) {
            addCriterion("SUM_NO_GOOD_INDEX_USED between", value1, value2, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NO_GOOD_INDEX_USED not between", value1, value2, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNull() {
            addCriterion("FIRST_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNotNull() {
            addCriterion("FIRST_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenEqualTo(Date value) {
            addCriterion("FIRST_SEEN =", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotEqualTo(Date value) {
            addCriterion("FIRST_SEEN <>", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThan(Date value) {
            addCriterion("FIRST_SEEN >", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_SEEN >=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThan(Date value) {
            addCriterion("FIRST_SEEN <", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_SEEN <=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIn(List<Date> values) {
            addCriterion("FIRST_SEEN in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotIn(List<Date> values) {
            addCriterion("FIRST_SEEN not in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenBetween(Date value1, Date value2) {
            addCriterion("FIRST_SEEN between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_SEEN not between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNull() {
            addCriterion("LAST_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNotNull() {
            addCriterion("LAST_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andLastSeenEqualTo(Date value) {
            addCriterion("LAST_SEEN =", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotEqualTo(Date value) {
            addCriterion("LAST_SEEN <>", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThan(Date value) {
            addCriterion("LAST_SEEN >", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_SEEN >=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThan(Date value) {
            addCriterion("LAST_SEEN <", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThanOrEqualTo(Date value) {
            addCriterion("LAST_SEEN <=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIn(List<Date> values) {
            addCriterion("LAST_SEEN in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotIn(List<Date> values) {
            addCriterion("LAST_SEEN not in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenBetween(Date value1, Date value2) {
            addCriterion("LAST_SEEN between", value1, value2, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotBetween(Date value1, Date value2) {
            addCriterion("LAST_SEEN not between", value1, value2, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andQuantile95IsNull() {
            addCriterion("QUANTILE_95 is null");
            return (Criteria) this;
        }

        public Criteria andQuantile95IsNotNull() {
            addCriterion("QUANTILE_95 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantile95EqualTo(Long value) {
            addCriterion("QUANTILE_95 =", value, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95NotEqualTo(Long value) {
            addCriterion("QUANTILE_95 <>", value, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95GreaterThan(Long value) {
            addCriterion("QUANTILE_95 >", value, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95GreaterThanOrEqualTo(Long value) {
            addCriterion("QUANTILE_95 >=", value, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95LessThan(Long value) {
            addCriterion("QUANTILE_95 <", value, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95LessThanOrEqualTo(Long value) {
            addCriterion("QUANTILE_95 <=", value, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95In(List<Long> values) {
            addCriterion("QUANTILE_95 in", values, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95NotIn(List<Long> values) {
            addCriterion("QUANTILE_95 not in", values, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95Between(Long value1, Long value2) {
            addCriterion("QUANTILE_95 between", value1, value2, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile95NotBetween(Long value1, Long value2) {
            addCriterion("QUANTILE_95 not between", value1, value2, "quantile95");
            return (Criteria) this;
        }

        public Criteria andQuantile99IsNull() {
            addCriterion("QUANTILE_99 is null");
            return (Criteria) this;
        }

        public Criteria andQuantile99IsNotNull() {
            addCriterion("QUANTILE_99 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantile99EqualTo(Long value) {
            addCriterion("QUANTILE_99 =", value, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99NotEqualTo(Long value) {
            addCriterion("QUANTILE_99 <>", value, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99GreaterThan(Long value) {
            addCriterion("QUANTILE_99 >", value, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99GreaterThanOrEqualTo(Long value) {
            addCriterion("QUANTILE_99 >=", value, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99LessThan(Long value) {
            addCriterion("QUANTILE_99 <", value, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99LessThanOrEqualTo(Long value) {
            addCriterion("QUANTILE_99 <=", value, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99In(List<Long> values) {
            addCriterion("QUANTILE_99 in", values, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99NotIn(List<Long> values) {
            addCriterion("QUANTILE_99 not in", values, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99Between(Long value1, Long value2) {
            addCriterion("QUANTILE_99 between", value1, value2, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile99NotBetween(Long value1, Long value2) {
            addCriterion("QUANTILE_99 not between", value1, value2, "quantile99");
            return (Criteria) this;
        }

        public Criteria andQuantile999IsNull() {
            addCriterion("QUANTILE_999 is null");
            return (Criteria) this;
        }

        public Criteria andQuantile999IsNotNull() {
            addCriterion("QUANTILE_999 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantile999EqualTo(Long value) {
            addCriterion("QUANTILE_999 =", value, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999NotEqualTo(Long value) {
            addCriterion("QUANTILE_999 <>", value, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999GreaterThan(Long value) {
            addCriterion("QUANTILE_999 >", value, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999GreaterThanOrEqualTo(Long value) {
            addCriterion("QUANTILE_999 >=", value, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999LessThan(Long value) {
            addCriterion("QUANTILE_999 <", value, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999LessThanOrEqualTo(Long value) {
            addCriterion("QUANTILE_999 <=", value, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999In(List<Long> values) {
            addCriterion("QUANTILE_999 in", values, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999NotIn(List<Long> values) {
            addCriterion("QUANTILE_999 not in", values, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999Between(Long value1, Long value2) {
            addCriterion("QUANTILE_999 between", value1, value2, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuantile999NotBetween(Long value1, Long value2) {
            addCriterion("QUANTILE_999 not between", value1, value2, "quantile999");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenIsNull() {
            addCriterion("QUERY_SAMPLE_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenIsNotNull() {
            addCriterion("QUERY_SAMPLE_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenEqualTo(Date value) {
            addCriterion("QUERY_SAMPLE_SEEN =", value, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenNotEqualTo(Date value) {
            addCriterion("QUERY_SAMPLE_SEEN <>", value, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenGreaterThan(Date value) {
            addCriterion("QUERY_SAMPLE_SEEN >", value, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("QUERY_SAMPLE_SEEN >=", value, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenLessThan(Date value) {
            addCriterion("QUERY_SAMPLE_SEEN <", value, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenLessThanOrEqualTo(Date value) {
            addCriterion("QUERY_SAMPLE_SEEN <=", value, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenIn(List<Date> values) {
            addCriterion("QUERY_SAMPLE_SEEN in", values, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenNotIn(List<Date> values) {
            addCriterion("QUERY_SAMPLE_SEEN not in", values, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenBetween(Date value1, Date value2) {
            addCriterion("QUERY_SAMPLE_SEEN between", value1, value2, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleSeenNotBetween(Date value1, Date value2) {
            addCriterion("QUERY_SAMPLE_SEEN not between", value1, value2, "querySampleSeen");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitIsNull() {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitIsNotNull() {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitEqualTo(Long value) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT =", value, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitNotEqualTo(Long value) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT <>", value, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitGreaterThan(Long value) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT >", value, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT >=", value, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitLessThan(Long value) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT <", value, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT <=", value, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitIn(List<Long> values) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT in", values, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitNotIn(List<Long> values) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT not in", values, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitBetween(Long value1, Long value2) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT between", value1, value2, "querySampleTimerWait");
            return (Criteria) this;
        }

        public Criteria andQuerySampleTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("QUERY_SAMPLE_TIMER_WAIT not between", value1, value2, "querySampleTimerWait");
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