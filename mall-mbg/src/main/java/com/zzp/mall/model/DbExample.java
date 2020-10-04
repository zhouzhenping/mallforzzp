package com.zzp.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbExample() {
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

        public Criteria andHostIsNull() {
            addCriterion("Host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("Host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("Host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("Host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("Host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("Host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("Host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("Host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("Host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("Host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("Host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("Host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("Host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("Host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andDbIsNull() {
            addCriterion("Db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("Db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("Db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("Db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("Db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("Db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("Db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("Db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("Db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("Db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("Db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("Db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("Db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("Db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("User is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("User is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("User =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("User <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("User >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("User >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("User <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("User <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("User like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("User not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("User in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("User not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("User between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("User not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andSelectPrivIsNull() {
            addCriterion("Select_priv is null");
            return (Criteria) this;
        }

        public Criteria andSelectPrivIsNotNull() {
            addCriterion("Select_priv is not null");
            return (Criteria) this;
        }

        public Criteria andSelectPrivEqualTo(String value) {
            addCriterion("Select_priv =", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivNotEqualTo(String value) {
            addCriterion("Select_priv <>", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivGreaterThan(String value) {
            addCriterion("Select_priv >", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Select_priv >=", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivLessThan(String value) {
            addCriterion("Select_priv <", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivLessThanOrEqualTo(String value) {
            addCriterion("Select_priv <=", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivLike(String value) {
            addCriterion("Select_priv like", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivNotLike(String value) {
            addCriterion("Select_priv not like", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivIn(List<String> values) {
            addCriterion("Select_priv in", values, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivNotIn(List<String> values) {
            addCriterion("Select_priv not in", values, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivBetween(String value1, String value2) {
            addCriterion("Select_priv between", value1, value2, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivNotBetween(String value1, String value2) {
            addCriterion("Select_priv not between", value1, value2, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivIsNull() {
            addCriterion("Insert_priv is null");
            return (Criteria) this;
        }

        public Criteria andInsertPrivIsNotNull() {
            addCriterion("Insert_priv is not null");
            return (Criteria) this;
        }

        public Criteria andInsertPrivEqualTo(String value) {
            addCriterion("Insert_priv =", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivNotEqualTo(String value) {
            addCriterion("Insert_priv <>", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivGreaterThan(String value) {
            addCriterion("Insert_priv >", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Insert_priv >=", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivLessThan(String value) {
            addCriterion("Insert_priv <", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivLessThanOrEqualTo(String value) {
            addCriterion("Insert_priv <=", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivLike(String value) {
            addCriterion("Insert_priv like", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivNotLike(String value) {
            addCriterion("Insert_priv not like", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivIn(List<String> values) {
            addCriterion("Insert_priv in", values, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivNotIn(List<String> values) {
            addCriterion("Insert_priv not in", values, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivBetween(String value1, String value2) {
            addCriterion("Insert_priv between", value1, value2, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivNotBetween(String value1, String value2) {
            addCriterion("Insert_priv not between", value1, value2, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivIsNull() {
            addCriterion("Update_priv is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivIsNotNull() {
            addCriterion("Update_priv is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivEqualTo(String value) {
            addCriterion("Update_priv =", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivNotEqualTo(String value) {
            addCriterion("Update_priv <>", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivGreaterThan(String value) {
            addCriterion("Update_priv >", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Update_priv >=", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivLessThan(String value) {
            addCriterion("Update_priv <", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivLessThanOrEqualTo(String value) {
            addCriterion("Update_priv <=", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivLike(String value) {
            addCriterion("Update_priv like", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivNotLike(String value) {
            addCriterion("Update_priv not like", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivIn(List<String> values) {
            addCriterion("Update_priv in", values, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivNotIn(List<String> values) {
            addCriterion("Update_priv not in", values, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivBetween(String value1, String value2) {
            addCriterion("Update_priv between", value1, value2, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivNotBetween(String value1, String value2) {
            addCriterion("Update_priv not between", value1, value2, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivIsNull() {
            addCriterion("Delete_priv is null");
            return (Criteria) this;
        }

        public Criteria andDeletePrivIsNotNull() {
            addCriterion("Delete_priv is not null");
            return (Criteria) this;
        }

        public Criteria andDeletePrivEqualTo(String value) {
            addCriterion("Delete_priv =", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivNotEqualTo(String value) {
            addCriterion("Delete_priv <>", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivGreaterThan(String value) {
            addCriterion("Delete_priv >", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Delete_priv >=", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivLessThan(String value) {
            addCriterion("Delete_priv <", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivLessThanOrEqualTo(String value) {
            addCriterion("Delete_priv <=", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivLike(String value) {
            addCriterion("Delete_priv like", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivNotLike(String value) {
            addCriterion("Delete_priv not like", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivIn(List<String> values) {
            addCriterion("Delete_priv in", values, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivNotIn(List<String> values) {
            addCriterion("Delete_priv not in", values, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivBetween(String value1, String value2) {
            addCriterion("Delete_priv between", value1, value2, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivNotBetween(String value1, String value2) {
            addCriterion("Delete_priv not between", value1, value2, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivIsNull() {
            addCriterion("Create_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreatePrivIsNotNull() {
            addCriterion("Create_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePrivEqualTo(String value) {
            addCriterion("Create_priv =", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivNotEqualTo(String value) {
            addCriterion("Create_priv <>", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivGreaterThan(String value) {
            addCriterion("Create_priv >", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_priv >=", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivLessThan(String value) {
            addCriterion("Create_priv <", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivLessThanOrEqualTo(String value) {
            addCriterion("Create_priv <=", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivLike(String value) {
            addCriterion("Create_priv like", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivNotLike(String value) {
            addCriterion("Create_priv not like", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivIn(List<String> values) {
            addCriterion("Create_priv in", values, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivNotIn(List<String> values) {
            addCriterion("Create_priv not in", values, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivBetween(String value1, String value2) {
            addCriterion("Create_priv between", value1, value2, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivNotBetween(String value1, String value2) {
            addCriterion("Create_priv not between", value1, value2, "createPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivIsNull() {
            addCriterion("Drop_priv is null");
            return (Criteria) this;
        }

        public Criteria andDropPrivIsNotNull() {
            addCriterion("Drop_priv is not null");
            return (Criteria) this;
        }

        public Criteria andDropPrivEqualTo(String value) {
            addCriterion("Drop_priv =", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivNotEqualTo(String value) {
            addCriterion("Drop_priv <>", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivGreaterThan(String value) {
            addCriterion("Drop_priv >", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Drop_priv >=", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivLessThan(String value) {
            addCriterion("Drop_priv <", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivLessThanOrEqualTo(String value) {
            addCriterion("Drop_priv <=", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivLike(String value) {
            addCriterion("Drop_priv like", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivNotLike(String value) {
            addCriterion("Drop_priv not like", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivIn(List<String> values) {
            addCriterion("Drop_priv in", values, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivNotIn(List<String> values) {
            addCriterion("Drop_priv not in", values, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivBetween(String value1, String value2) {
            addCriterion("Drop_priv between", value1, value2, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivNotBetween(String value1, String value2) {
            addCriterion("Drop_priv not between", value1, value2, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivIsNull() {
            addCriterion("Grant_priv is null");
            return (Criteria) this;
        }

        public Criteria andGrantPrivIsNotNull() {
            addCriterion("Grant_priv is not null");
            return (Criteria) this;
        }

        public Criteria andGrantPrivEqualTo(String value) {
            addCriterion("Grant_priv =", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivNotEqualTo(String value) {
            addCriterion("Grant_priv <>", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivGreaterThan(String value) {
            addCriterion("Grant_priv >", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Grant_priv >=", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivLessThan(String value) {
            addCriterion("Grant_priv <", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivLessThanOrEqualTo(String value) {
            addCriterion("Grant_priv <=", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivLike(String value) {
            addCriterion("Grant_priv like", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivNotLike(String value) {
            addCriterion("Grant_priv not like", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivIn(List<String> values) {
            addCriterion("Grant_priv in", values, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivNotIn(List<String> values) {
            addCriterion("Grant_priv not in", values, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivBetween(String value1, String value2) {
            addCriterion("Grant_priv between", value1, value2, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivNotBetween(String value1, String value2) {
            addCriterion("Grant_priv not between", value1, value2, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivIsNull() {
            addCriterion("References_priv is null");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivIsNotNull() {
            addCriterion("References_priv is not null");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivEqualTo(String value) {
            addCriterion("References_priv =", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivNotEqualTo(String value) {
            addCriterion("References_priv <>", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivGreaterThan(String value) {
            addCriterion("References_priv >", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivGreaterThanOrEqualTo(String value) {
            addCriterion("References_priv >=", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivLessThan(String value) {
            addCriterion("References_priv <", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivLessThanOrEqualTo(String value) {
            addCriterion("References_priv <=", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivLike(String value) {
            addCriterion("References_priv like", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivNotLike(String value) {
            addCriterion("References_priv not like", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivIn(List<String> values) {
            addCriterion("References_priv in", values, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivNotIn(List<String> values) {
            addCriterion("References_priv not in", values, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivBetween(String value1, String value2) {
            addCriterion("References_priv between", value1, value2, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivNotBetween(String value1, String value2) {
            addCriterion("References_priv not between", value1, value2, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivIsNull() {
            addCriterion("Index_priv is null");
            return (Criteria) this;
        }

        public Criteria andIndexPrivIsNotNull() {
            addCriterion("Index_priv is not null");
            return (Criteria) this;
        }

        public Criteria andIndexPrivEqualTo(String value) {
            addCriterion("Index_priv =", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivNotEqualTo(String value) {
            addCriterion("Index_priv <>", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivGreaterThan(String value) {
            addCriterion("Index_priv >", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Index_priv >=", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivLessThan(String value) {
            addCriterion("Index_priv <", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivLessThanOrEqualTo(String value) {
            addCriterion("Index_priv <=", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivLike(String value) {
            addCriterion("Index_priv like", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivNotLike(String value) {
            addCriterion("Index_priv not like", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivIn(List<String> values) {
            addCriterion("Index_priv in", values, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivNotIn(List<String> values) {
            addCriterion("Index_priv not in", values, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivBetween(String value1, String value2) {
            addCriterion("Index_priv between", value1, value2, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivNotBetween(String value1, String value2) {
            addCriterion("Index_priv not between", value1, value2, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivIsNull() {
            addCriterion("Alter_priv is null");
            return (Criteria) this;
        }

        public Criteria andAlterPrivIsNotNull() {
            addCriterion("Alter_priv is not null");
            return (Criteria) this;
        }

        public Criteria andAlterPrivEqualTo(String value) {
            addCriterion("Alter_priv =", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivNotEqualTo(String value) {
            addCriterion("Alter_priv <>", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivGreaterThan(String value) {
            addCriterion("Alter_priv >", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Alter_priv >=", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivLessThan(String value) {
            addCriterion("Alter_priv <", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivLessThanOrEqualTo(String value) {
            addCriterion("Alter_priv <=", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivLike(String value) {
            addCriterion("Alter_priv like", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivNotLike(String value) {
            addCriterion("Alter_priv not like", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivIn(List<String> values) {
            addCriterion("Alter_priv in", values, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivNotIn(List<String> values) {
            addCriterion("Alter_priv not in", values, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivBetween(String value1, String value2) {
            addCriterion("Alter_priv between", value1, value2, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivNotBetween(String value1, String value2) {
            addCriterion("Alter_priv not between", value1, value2, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivIsNull() {
            addCriterion("Create_tmp_table_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivIsNotNull() {
            addCriterion("Create_tmp_table_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivEqualTo(String value) {
            addCriterion("Create_tmp_table_priv =", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivNotEqualTo(String value) {
            addCriterion("Create_tmp_table_priv <>", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivGreaterThan(String value) {
            addCriterion("Create_tmp_table_priv >", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_tmp_table_priv >=", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivLessThan(String value) {
            addCriterion("Create_tmp_table_priv <", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivLessThanOrEqualTo(String value) {
            addCriterion("Create_tmp_table_priv <=", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivLike(String value) {
            addCriterion("Create_tmp_table_priv like", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivNotLike(String value) {
            addCriterion("Create_tmp_table_priv not like", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivIn(List<String> values) {
            addCriterion("Create_tmp_table_priv in", values, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivNotIn(List<String> values) {
            addCriterion("Create_tmp_table_priv not in", values, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivBetween(String value1, String value2) {
            addCriterion("Create_tmp_table_priv between", value1, value2, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivNotBetween(String value1, String value2) {
            addCriterion("Create_tmp_table_priv not between", value1, value2, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivIsNull() {
            addCriterion("Lock_tables_priv is null");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivIsNotNull() {
            addCriterion("Lock_tables_priv is not null");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivEqualTo(String value) {
            addCriterion("Lock_tables_priv =", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivNotEqualTo(String value) {
            addCriterion("Lock_tables_priv <>", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivGreaterThan(String value) {
            addCriterion("Lock_tables_priv >", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Lock_tables_priv >=", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivLessThan(String value) {
            addCriterion("Lock_tables_priv <", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivLessThanOrEqualTo(String value) {
            addCriterion("Lock_tables_priv <=", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivLike(String value) {
            addCriterion("Lock_tables_priv like", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivNotLike(String value) {
            addCriterion("Lock_tables_priv not like", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivIn(List<String> values) {
            addCriterion("Lock_tables_priv in", values, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivNotIn(List<String> values) {
            addCriterion("Lock_tables_priv not in", values, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivBetween(String value1, String value2) {
            addCriterion("Lock_tables_priv between", value1, value2, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivNotBetween(String value1, String value2) {
            addCriterion("Lock_tables_priv not between", value1, value2, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivIsNull() {
            addCriterion("Create_view_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivIsNotNull() {
            addCriterion("Create_view_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivEqualTo(String value) {
            addCriterion("Create_view_priv =", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivNotEqualTo(String value) {
            addCriterion("Create_view_priv <>", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivGreaterThan(String value) {
            addCriterion("Create_view_priv >", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_view_priv >=", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivLessThan(String value) {
            addCriterion("Create_view_priv <", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivLessThanOrEqualTo(String value) {
            addCriterion("Create_view_priv <=", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivLike(String value) {
            addCriterion("Create_view_priv like", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivNotLike(String value) {
            addCriterion("Create_view_priv not like", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivIn(List<String> values) {
            addCriterion("Create_view_priv in", values, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivNotIn(List<String> values) {
            addCriterion("Create_view_priv not in", values, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivBetween(String value1, String value2) {
            addCriterion("Create_view_priv between", value1, value2, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivNotBetween(String value1, String value2) {
            addCriterion("Create_view_priv not between", value1, value2, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivIsNull() {
            addCriterion("Show_view_priv is null");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivIsNotNull() {
            addCriterion("Show_view_priv is not null");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivEqualTo(String value) {
            addCriterion("Show_view_priv =", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivNotEqualTo(String value) {
            addCriterion("Show_view_priv <>", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivGreaterThan(String value) {
            addCriterion("Show_view_priv >", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Show_view_priv >=", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivLessThan(String value) {
            addCriterion("Show_view_priv <", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivLessThanOrEqualTo(String value) {
            addCriterion("Show_view_priv <=", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivLike(String value) {
            addCriterion("Show_view_priv like", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivNotLike(String value) {
            addCriterion("Show_view_priv not like", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivIn(List<String> values) {
            addCriterion("Show_view_priv in", values, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivNotIn(List<String> values) {
            addCriterion("Show_view_priv not in", values, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivBetween(String value1, String value2) {
            addCriterion("Show_view_priv between", value1, value2, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivNotBetween(String value1, String value2) {
            addCriterion("Show_view_priv not between", value1, value2, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivIsNull() {
            addCriterion("Create_routine_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivIsNotNull() {
            addCriterion("Create_routine_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivEqualTo(String value) {
            addCriterion("Create_routine_priv =", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivNotEqualTo(String value) {
            addCriterion("Create_routine_priv <>", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivGreaterThan(String value) {
            addCriterion("Create_routine_priv >", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_routine_priv >=", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivLessThan(String value) {
            addCriterion("Create_routine_priv <", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivLessThanOrEqualTo(String value) {
            addCriterion("Create_routine_priv <=", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivLike(String value) {
            addCriterion("Create_routine_priv like", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivNotLike(String value) {
            addCriterion("Create_routine_priv not like", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivIn(List<String> values) {
            addCriterion("Create_routine_priv in", values, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivNotIn(List<String> values) {
            addCriterion("Create_routine_priv not in", values, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivBetween(String value1, String value2) {
            addCriterion("Create_routine_priv between", value1, value2, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivNotBetween(String value1, String value2) {
            addCriterion("Create_routine_priv not between", value1, value2, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivIsNull() {
            addCriterion("Alter_routine_priv is null");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivIsNotNull() {
            addCriterion("Alter_routine_priv is not null");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivEqualTo(String value) {
            addCriterion("Alter_routine_priv =", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivNotEqualTo(String value) {
            addCriterion("Alter_routine_priv <>", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivGreaterThan(String value) {
            addCriterion("Alter_routine_priv >", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Alter_routine_priv >=", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivLessThan(String value) {
            addCriterion("Alter_routine_priv <", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivLessThanOrEqualTo(String value) {
            addCriterion("Alter_routine_priv <=", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivLike(String value) {
            addCriterion("Alter_routine_priv like", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivNotLike(String value) {
            addCriterion("Alter_routine_priv not like", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivIn(List<String> values) {
            addCriterion("Alter_routine_priv in", values, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivNotIn(List<String> values) {
            addCriterion("Alter_routine_priv not in", values, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivBetween(String value1, String value2) {
            addCriterion("Alter_routine_priv between", value1, value2, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivNotBetween(String value1, String value2) {
            addCriterion("Alter_routine_priv not between", value1, value2, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivIsNull() {
            addCriterion("Execute_priv is null");
            return (Criteria) this;
        }

        public Criteria andExecutePrivIsNotNull() {
            addCriterion("Execute_priv is not null");
            return (Criteria) this;
        }

        public Criteria andExecutePrivEqualTo(String value) {
            addCriterion("Execute_priv =", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivNotEqualTo(String value) {
            addCriterion("Execute_priv <>", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivGreaterThan(String value) {
            addCriterion("Execute_priv >", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Execute_priv >=", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivLessThan(String value) {
            addCriterion("Execute_priv <", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivLessThanOrEqualTo(String value) {
            addCriterion("Execute_priv <=", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivLike(String value) {
            addCriterion("Execute_priv like", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivNotLike(String value) {
            addCriterion("Execute_priv not like", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivIn(List<String> values) {
            addCriterion("Execute_priv in", values, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivNotIn(List<String> values) {
            addCriterion("Execute_priv not in", values, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivBetween(String value1, String value2) {
            addCriterion("Execute_priv between", value1, value2, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivNotBetween(String value1, String value2) {
            addCriterion("Execute_priv not between", value1, value2, "executePriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivIsNull() {
            addCriterion("Event_priv is null");
            return (Criteria) this;
        }

        public Criteria andEventPrivIsNotNull() {
            addCriterion("Event_priv is not null");
            return (Criteria) this;
        }

        public Criteria andEventPrivEqualTo(String value) {
            addCriterion("Event_priv =", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivNotEqualTo(String value) {
            addCriterion("Event_priv <>", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivGreaterThan(String value) {
            addCriterion("Event_priv >", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Event_priv >=", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivLessThan(String value) {
            addCriterion("Event_priv <", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivLessThanOrEqualTo(String value) {
            addCriterion("Event_priv <=", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivLike(String value) {
            addCriterion("Event_priv like", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivNotLike(String value) {
            addCriterion("Event_priv not like", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivIn(List<String> values) {
            addCriterion("Event_priv in", values, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivNotIn(List<String> values) {
            addCriterion("Event_priv not in", values, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivBetween(String value1, String value2) {
            addCriterion("Event_priv between", value1, value2, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivNotBetween(String value1, String value2) {
            addCriterion("Event_priv not between", value1, value2, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivIsNull() {
            addCriterion("Trigger_priv is null");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivIsNotNull() {
            addCriterion("Trigger_priv is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivEqualTo(String value) {
            addCriterion("Trigger_priv =", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivNotEqualTo(String value) {
            addCriterion("Trigger_priv <>", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivGreaterThan(String value) {
            addCriterion("Trigger_priv >", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Trigger_priv >=", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivLessThan(String value) {
            addCriterion("Trigger_priv <", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivLessThanOrEqualTo(String value) {
            addCriterion("Trigger_priv <=", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivLike(String value) {
            addCriterion("Trigger_priv like", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivNotLike(String value) {
            addCriterion("Trigger_priv not like", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivIn(List<String> values) {
            addCriterion("Trigger_priv in", values, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivNotIn(List<String> values) {
            addCriterion("Trigger_priv not in", values, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivBetween(String value1, String value2) {
            addCriterion("Trigger_priv between", value1, value2, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivNotBetween(String value1, String value2) {
            addCriterion("Trigger_priv not between", value1, value2, "triggerPriv");
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