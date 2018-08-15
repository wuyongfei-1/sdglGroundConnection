package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportrestaurantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportrestaurantExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andReportrestaurantidIsNull() {
            addCriterion("reportRestaurantId is null");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidIsNotNull() {
            addCriterion("reportRestaurantId is not null");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidEqualTo(Integer value) {
            addCriterion("reportRestaurantId =", value, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidNotEqualTo(Integer value) {
            addCriterion("reportRestaurantId <>", value, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidGreaterThan(Integer value) {
            addCriterion("reportRestaurantId >", value, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportRestaurantId >=", value, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidLessThan(Integer value) {
            addCriterion("reportRestaurantId <", value, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidLessThanOrEqualTo(Integer value) {
            addCriterion("reportRestaurantId <=", value, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidIn(List<Integer> values) {
            addCriterion("reportRestaurantId in", values, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidNotIn(List<Integer> values) {
            addCriterion("reportRestaurantId not in", values, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidBetween(Integer value1, Integer value2) {
            addCriterion("reportRestaurantId between", value1, value2, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andReportrestaurantidNotBetween(Integer value1, Integer value2) {
            addCriterion("reportRestaurantId not between", value1, value2, "reportrestaurantid");
            return (Criteria) this;
        }

        public Criteria andLunchdateIsNull() {
            addCriterion("lunchDate is null");
            return (Criteria) this;
        }

        public Criteria andLunchdateIsNotNull() {
            addCriterion("lunchDate is not null");
            return (Criteria) this;
        }

        public Criteria andLunchdateEqualTo(Date value) {
            addCriterionForJDBCDate("lunchDate =", value, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lunchDate <>", value, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateGreaterThan(Date value) {
            addCriterionForJDBCDate("lunchDate >", value, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lunchDate >=", value, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateLessThan(Date value) {
            addCriterionForJDBCDate("lunchDate <", value, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lunchDate <=", value, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateIn(List<Date> values) {
            addCriterionForJDBCDate("lunchDate in", values, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lunchDate not in", values, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lunchDate between", value1, value2, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLunchdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lunchDate not between", value1, value2, "lunchdate");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameIsNull() {
            addCriterion("LuncheonName is null");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameIsNotNull() {
            addCriterion("LuncheonName is not null");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameEqualTo(String value) {
            addCriterion("LuncheonName =", value, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameNotEqualTo(String value) {
            addCriterion("LuncheonName <>", value, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameGreaterThan(String value) {
            addCriterion("LuncheonName >", value, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameGreaterThanOrEqualTo(String value) {
            addCriterion("LuncheonName >=", value, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameLessThan(String value) {
            addCriterion("LuncheonName <", value, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameLessThanOrEqualTo(String value) {
            addCriterion("LuncheonName <=", value, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameLike(String value) {
            addCriterion("LuncheonName like", value, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameNotLike(String value) {
            addCriterion("LuncheonName not like", value, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameIn(List<String> values) {
            addCriterion("LuncheonName in", values, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameNotIn(List<String> values) {
            addCriterion("LuncheonName not in", values, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameBetween(String value1, String value2) {
            addCriterion("LuncheonName between", value1, value2, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLuncheonnameNotBetween(String value1, String value2) {
            addCriterion("LuncheonName not between", value1, value2, "luncheonname");
            return (Criteria) this;
        }

        public Criteria andLunchmealIsNull() {
            addCriterion("lunchMeal is null");
            return (Criteria) this;
        }

        public Criteria andLunchmealIsNotNull() {
            addCriterion("lunchMeal is not null");
            return (Criteria) this;
        }

        public Criteria andLunchmealEqualTo(Double value) {
            addCriterion("lunchMeal =", value, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealNotEqualTo(Double value) {
            addCriterion("lunchMeal <>", value, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealGreaterThan(Double value) {
            addCriterion("lunchMeal >", value, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealGreaterThanOrEqualTo(Double value) {
            addCriterion("lunchMeal >=", value, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealLessThan(Double value) {
            addCriterion("lunchMeal <", value, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealLessThanOrEqualTo(Double value) {
            addCriterion("lunchMeal <=", value, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealIn(List<Double> values) {
            addCriterion("lunchMeal in", values, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealNotIn(List<Double> values) {
            addCriterion("lunchMeal not in", values, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealBetween(Double value1, Double value2) {
            addCriterion("lunchMeal between", value1, value2, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLunchmealNotBetween(Double value1, Double value2) {
            addCriterion("lunchMeal not between", value1, value2, "lunchmeal");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumIsNull() {
            addCriterion("lunchEatNum is null");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumIsNotNull() {
            addCriterion("lunchEatNum is not null");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumEqualTo(Integer value) {
            addCriterion("lunchEatNum =", value, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumNotEqualTo(Integer value) {
            addCriterion("lunchEatNum <>", value, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumGreaterThan(Integer value) {
            addCriterion("lunchEatNum >", value, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lunchEatNum >=", value, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumLessThan(Integer value) {
            addCriterion("lunchEatNum <", value, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumLessThanOrEqualTo(Integer value) {
            addCriterion("lunchEatNum <=", value, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumIn(List<Integer> values) {
            addCriterion("lunchEatNum in", values, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumNotIn(List<Integer> values) {
            addCriterion("lunchEatNum not in", values, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumBetween(Integer value1, Integer value2) {
            addCriterion("lunchEatNum between", value1, value2, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLuncheatnumNotBetween(Integer value1, Integer value2) {
            addCriterion("lunchEatNum not between", value1, value2, "luncheatnum");
            return (Criteria) this;
        }

        public Criteria andLunchotherIsNull() {
            addCriterion("lunchother is null");
            return (Criteria) this;
        }

        public Criteria andLunchotherIsNotNull() {
            addCriterion("lunchother is not null");
            return (Criteria) this;
        }

        public Criteria andLunchotherEqualTo(Double value) {
            addCriterion("lunchother =", value, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherNotEqualTo(Double value) {
            addCriterion("lunchother <>", value, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherGreaterThan(Double value) {
            addCriterion("lunchother >", value, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherGreaterThanOrEqualTo(Double value) {
            addCriterion("lunchother >=", value, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherLessThan(Double value) {
            addCriterion("lunchother <", value, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherLessThanOrEqualTo(Double value) {
            addCriterion("lunchother <=", value, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherIn(List<Double> values) {
            addCriterion("lunchother in", values, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherNotIn(List<Double> values) {
            addCriterion("lunchother not in", values, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherBetween(Double value1, Double value2) {
            addCriterion("lunchother between", value1, value2, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchotherNotBetween(Double value1, Double value2) {
            addCriterion("lunchother not between", value1, value2, "lunchother");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsIsNull() {
            addCriterion("lunchPayMethods is null");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsIsNotNull() {
            addCriterion("lunchPayMethods is not null");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsEqualTo(String value) {
            addCriterion("lunchPayMethods =", value, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsNotEqualTo(String value) {
            addCriterion("lunchPayMethods <>", value, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsGreaterThan(String value) {
            addCriterion("lunchPayMethods >", value, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsGreaterThanOrEqualTo(String value) {
            addCriterion("lunchPayMethods >=", value, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsLessThan(String value) {
            addCriterion("lunchPayMethods <", value, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsLessThanOrEqualTo(String value) {
            addCriterion("lunchPayMethods <=", value, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsLike(String value) {
            addCriterion("lunchPayMethods like", value, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsNotLike(String value) {
            addCriterion("lunchPayMethods not like", value, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsIn(List<String> values) {
            addCriterion("lunchPayMethods in", values, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsNotIn(List<String> values) {
            addCriterion("lunchPayMethods not in", values, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsBetween(String value1, String value2) {
            addCriterion("lunchPayMethods between", value1, value2, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andLunchpaymethodsNotBetween(String value1, String value2) {
            addCriterion("lunchPayMethods not between", value1, value2, "lunchpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerdateIsNull() {
            addCriterion("dinnerDate is null");
            return (Criteria) this;
        }

        public Criteria andDinnerdateIsNotNull() {
            addCriterion("dinnerDate is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerdateEqualTo(Date value) {
            addCriterionForJDBCDate("dinnerDate =", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dinnerDate <>", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateGreaterThan(Date value) {
            addCriterionForJDBCDate("dinnerDate >", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dinnerDate >=", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateLessThan(Date value) {
            addCriterionForJDBCDate("dinnerDate <", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dinnerDate <=", value, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateIn(List<Date> values) {
            addCriterionForJDBCDate("dinnerDate in", values, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dinnerDate not in", values, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dinnerDate between", value1, value2, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnerdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dinnerDate not between", value1, value2, "dinnerdate");
            return (Criteria) this;
        }

        public Criteria andDinnernameIsNull() {
            addCriterion("dinnerName is null");
            return (Criteria) this;
        }

        public Criteria andDinnernameIsNotNull() {
            addCriterion("dinnerName is not null");
            return (Criteria) this;
        }

        public Criteria andDinnernameEqualTo(String value) {
            addCriterion("dinnerName =", value, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameNotEqualTo(String value) {
            addCriterion("dinnerName <>", value, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameGreaterThan(String value) {
            addCriterion("dinnerName >", value, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameGreaterThanOrEqualTo(String value) {
            addCriterion("dinnerName >=", value, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameLessThan(String value) {
            addCriterion("dinnerName <", value, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameLessThanOrEqualTo(String value) {
            addCriterion("dinnerName <=", value, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameLike(String value) {
            addCriterion("dinnerName like", value, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameNotLike(String value) {
            addCriterion("dinnerName not like", value, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameIn(List<String> values) {
            addCriterion("dinnerName in", values, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameNotIn(List<String> values) {
            addCriterion("dinnerName not in", values, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameBetween(String value1, String value2) {
            addCriterion("dinnerName between", value1, value2, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnernameNotBetween(String value1, String value2) {
            addCriterion("dinnerName not between", value1, value2, "dinnername");
            return (Criteria) this;
        }

        public Criteria andDinnermealIsNull() {
            addCriterion("dinnerMeal is null");
            return (Criteria) this;
        }

        public Criteria andDinnermealIsNotNull() {
            addCriterion("dinnerMeal is not null");
            return (Criteria) this;
        }

        public Criteria andDinnermealEqualTo(Double value) {
            addCriterion("dinnerMeal =", value, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealNotEqualTo(Double value) {
            addCriterion("dinnerMeal <>", value, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealGreaterThan(Double value) {
            addCriterion("dinnerMeal >", value, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealGreaterThanOrEqualTo(Double value) {
            addCriterion("dinnerMeal >=", value, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealLessThan(Double value) {
            addCriterion("dinnerMeal <", value, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealLessThanOrEqualTo(Double value) {
            addCriterion("dinnerMeal <=", value, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealIn(List<Double> values) {
            addCriterion("dinnerMeal in", values, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealNotIn(List<Double> values) {
            addCriterion("dinnerMeal not in", values, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealBetween(Double value1, Double value2) {
            addCriterion("dinnerMeal between", value1, value2, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnermealNotBetween(Double value1, Double value2) {
            addCriterion("dinnerMeal not between", value1, value2, "dinnermeal");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumIsNull() {
            addCriterion("dinnerEatNum is null");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumIsNotNull() {
            addCriterion("dinnerEatNum is not null");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumEqualTo(Integer value) {
            addCriterion("dinnerEatNum =", value, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumNotEqualTo(Integer value) {
            addCriterion("dinnerEatNum <>", value, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumGreaterThan(Integer value) {
            addCriterion("dinnerEatNum >", value, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dinnerEatNum >=", value, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumLessThan(Integer value) {
            addCriterion("dinnerEatNum <", value, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumLessThanOrEqualTo(Integer value) {
            addCriterion("dinnerEatNum <=", value, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumIn(List<Integer> values) {
            addCriterion("dinnerEatNum in", values, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumNotIn(List<Integer> values) {
            addCriterion("dinnerEatNum not in", values, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumBetween(Integer value1, Integer value2) {
            addCriterion("dinnerEatNum between", value1, value2, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnereatnumNotBetween(Integer value1, Integer value2) {
            addCriterion("dinnerEatNum not between", value1, value2, "dinnereatnum");
            return (Criteria) this;
        }

        public Criteria andDinnerotherIsNull() {
            addCriterion("dinnerother is null");
            return (Criteria) this;
        }

        public Criteria andDinnerotherIsNotNull() {
            addCriterion("dinnerother is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerotherEqualTo(Double value) {
            addCriterion("dinnerother =", value, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherNotEqualTo(Double value) {
            addCriterion("dinnerother <>", value, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherGreaterThan(Double value) {
            addCriterion("dinnerother >", value, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherGreaterThanOrEqualTo(Double value) {
            addCriterion("dinnerother >=", value, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherLessThan(Double value) {
            addCriterion("dinnerother <", value, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherLessThanOrEqualTo(Double value) {
            addCriterion("dinnerother <=", value, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherIn(List<Double> values) {
            addCriterion("dinnerother in", values, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherNotIn(List<Double> values) {
            addCriterion("dinnerother not in", values, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherBetween(Double value1, Double value2) {
            addCriterion("dinnerother between", value1, value2, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerotherNotBetween(Double value1, Double value2) {
            addCriterion("dinnerother not between", value1, value2, "dinnerother");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsIsNull() {
            addCriterion("dinnerPayMethods is null");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsIsNotNull() {
            addCriterion("dinnerPayMethods is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsEqualTo(String value) {
            addCriterion("dinnerPayMethods =", value, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsNotEqualTo(String value) {
            addCriterion("dinnerPayMethods <>", value, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsGreaterThan(String value) {
            addCriterion("dinnerPayMethods >", value, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsGreaterThanOrEqualTo(String value) {
            addCriterion("dinnerPayMethods >=", value, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsLessThan(String value) {
            addCriterion("dinnerPayMethods <", value, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsLessThanOrEqualTo(String value) {
            addCriterion("dinnerPayMethods <=", value, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsLike(String value) {
            addCriterion("dinnerPayMethods like", value, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsNotLike(String value) {
            addCriterion("dinnerPayMethods not like", value, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsIn(List<String> values) {
            addCriterion("dinnerPayMethods in", values, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsNotIn(List<String> values) {
            addCriterion("dinnerPayMethods not in", values, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsBetween(String value1, String value2) {
            addCriterion("dinnerPayMethods between", value1, value2, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andDinnerpaymethodsNotBetween(String value1, String value2) {
            addCriterion("dinnerPayMethods not between", value1, value2, "dinnerpaymethods");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(Integer value) {
            addCriterion("createBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(Integer value) {
            addCriterion("createBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(Integer value) {
            addCriterion("createBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(Integer value) {
            addCriterion("createBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(Integer value) {
            addCriterion("createBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(Integer value) {
            addCriterion("createBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<Integer> values) {
            addCriterion("createBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<Integer> values) {
            addCriterion("createBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(Integer value1, Integer value2) {
            addCriterion("createBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(Integer value1, Integer value2) {
            addCriterion("createBy not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("updateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("updateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(Integer value) {
            addCriterion("updateBy =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(Integer value) {
            addCriterion("updateBy <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(Integer value) {
            addCriterion("updateBy >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateBy >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(Integer value) {
            addCriterion("updateBy <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(Integer value) {
            addCriterion("updateBy <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<Integer> values) {
            addCriterion("updateBy in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<Integer> values) {
            addCriterion("updateBy not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(Integer value1, Integer value2) {
            addCriterion("updateBy between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(Integer value1, Integer value2) {
            addCriterion("updateBy not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdateIsNull() {
            addCriterion("upDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIsNotNull() {
            addCriterion("upDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEqualTo(Date value) {
            addCriterionForJDBCDate("upDate =", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("upDate <>", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("upDate >", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upDate >=", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLessThan(Date value) {
            addCriterionForJDBCDate("upDate <", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("upDate <=", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateIn(List<Date> values) {
            addCriterionForJDBCDate("upDate in", values, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("upDate not in", values, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upDate between", value1, value2, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("upDate not between", value1, value2, "update");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andValue1IsNull() {
            addCriterion("value1 is null");
            return (Criteria) this;
        }

        public Criteria andValue1IsNotNull() {
            addCriterion("value1 is not null");
            return (Criteria) this;
        }

        public Criteria andValue1EqualTo(String value) {
            addCriterion("value1 =", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotEqualTo(String value) {
            addCriterion("value1 <>", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThan(String value) {
            addCriterion("value1 >", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThanOrEqualTo(String value) {
            addCriterion("value1 >=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThan(String value) {
            addCriterion("value1 <", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThanOrEqualTo(String value) {
            addCriterion("value1 <=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Like(String value) {
            addCriterion("value1 like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotLike(String value) {
            addCriterion("value1 not like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1In(List<String> values) {
            addCriterion("value1 in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotIn(List<String> values) {
            addCriterion("value1 not in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Between(String value1, String value2) {
            addCriterion("value1 between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotBetween(String value1, String value2) {
            addCriterion("value1 not between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue2IsNull() {
            addCriterion("value2 is null");
            return (Criteria) this;
        }

        public Criteria andValue2IsNotNull() {
            addCriterion("value2 is not null");
            return (Criteria) this;
        }

        public Criteria andValue2EqualTo(String value) {
            addCriterion("value2 =", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotEqualTo(String value) {
            addCriterion("value2 <>", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThan(String value) {
            addCriterion("value2 >", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThanOrEqualTo(String value) {
            addCriterion("value2 >=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThan(String value) {
            addCriterion("value2 <", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThanOrEqualTo(String value) {
            addCriterion("value2 <=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Like(String value) {
            addCriterion("value2 like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotLike(String value) {
            addCriterion("value2 not like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2In(List<String> values) {
            addCriterion("value2 in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotIn(List<String> values) {
            addCriterion("value2 not in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Between(String value1, String value2) {
            addCriterion("value2 between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotBetween(String value1, String value2) {
            addCriterion("value2 not between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue3IsNull() {
            addCriterion("value3 is null");
            return (Criteria) this;
        }

        public Criteria andValue3IsNotNull() {
            addCriterion("value3 is not null");
            return (Criteria) this;
        }

        public Criteria andValue3EqualTo(String value) {
            addCriterion("value3 =", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotEqualTo(String value) {
            addCriterion("value3 <>", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3GreaterThan(String value) {
            addCriterion("value3 >", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3GreaterThanOrEqualTo(String value) {
            addCriterion("value3 >=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3LessThan(String value) {
            addCriterion("value3 <", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3LessThanOrEqualTo(String value) {
            addCriterion("value3 <=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3Like(String value) {
            addCriterion("value3 like", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotLike(String value) {
            addCriterion("value3 not like", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3In(List<String> values) {
            addCriterion("value3 in", values, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotIn(List<String> values) {
            addCriterion("value3 not in", values, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3Between(String value1, String value2) {
            addCriterion("value3 between", value1, value2, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotBetween(String value1, String value2) {
            addCriterion("value3 not between", value1, value2, "value3");
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