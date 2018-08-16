package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DispatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DispatchExample() {
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

        public Criteria andDispatchidIsNull() {
            addCriterion("dispatchId is null");
            return (Criteria) this;
        }

        public Criteria andDispatchidIsNotNull() {
            addCriterion("dispatchId is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchidEqualTo(Integer value) {
            addCriterion("dispatchId =", value, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidNotEqualTo(Integer value) {
            addCriterion("dispatchId <>", value, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidGreaterThan(Integer value) {
            addCriterion("dispatchId >", value, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatchId >=", value, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidLessThan(Integer value) {
            addCriterion("dispatchId <", value, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidLessThanOrEqualTo(Integer value) {
            addCriterion("dispatchId <=", value, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidIn(List<Integer> values) {
            addCriterion("dispatchId in", values, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidNotIn(List<Integer> values) {
            addCriterion("dispatchId not in", values, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidBetween(Integer value1, Integer value2) {
            addCriterion("dispatchId between", value1, value2, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andDispatchidNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatchId not between", value1, value2, "dispatchid");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberIsNull() {
            addCriterion("groundConnectionNumber is null");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberIsNotNull() {
            addCriterion("groundConnectionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberEqualTo(String value) {
            addCriterion("groundConnectionNumber =", value, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberNotEqualTo(String value) {
            addCriterion("groundConnectionNumber <>", value, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberGreaterThan(String value) {
            addCriterion("groundConnectionNumber >", value, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberGreaterThanOrEqualTo(String value) {
            addCriterion("groundConnectionNumber >=", value, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberLessThan(String value) {
            addCriterion("groundConnectionNumber <", value, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberLessThanOrEqualTo(String value) {
            addCriterion("groundConnectionNumber <=", value, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberLike(String value) {
            addCriterion("groundConnectionNumber like", value, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberNotLike(String value) {
            addCriterion("groundConnectionNumber not like", value, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberIn(List<String> values) {
            addCriterion("groundConnectionNumber in", values, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberNotIn(List<String> values) {
            addCriterion("groundConnectionNumber not in", values, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberBetween(String value1, String value2) {
            addCriterion("groundConnectionNumber between", value1, value2, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroundconnectionnumberNotBetween(String value1, String value2) {
            addCriterion("groundConnectionNumber not between", value1, value2, "groundconnectionnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberIsNull() {
            addCriterion("groupNumber is null");
            return (Criteria) this;
        }

        public Criteria andGroupnumberIsNotNull() {
            addCriterion("groupNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnumberEqualTo(String value) {
            addCriterion("groupNumber =", value, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberNotEqualTo(String value) {
            addCriterion("groupNumber <>", value, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberGreaterThan(String value) {
            addCriterion("groupNumber >", value, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberGreaterThanOrEqualTo(String value) {
            addCriterion("groupNumber >=", value, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberLessThan(String value) {
            addCriterion("groupNumber <", value, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberLessThanOrEqualTo(String value) {
            addCriterion("groupNumber <=", value, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberLike(String value) {
            addCriterion("groupNumber like", value, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberNotLike(String value) {
            addCriterion("groupNumber not like", value, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberIn(List<String> values) {
            addCriterion("groupNumber in", values, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberNotIn(List<String> values) {
            addCriterion("groupNumber not in", values, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberBetween(String value1, String value2) {
            addCriterion("groupNumber between", value1, value2, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andGroupnumberNotBetween(String value1, String value2) {
            addCriterion("groupNumber not between", value1, value2, "groupnumber");
            return (Criteria) this;
        }

        public Criteria andSendlineIsNull() {
            addCriterion("sendLine is null");
            return (Criteria) this;
        }

        public Criteria andSendlineIsNotNull() {
            addCriterion("sendLine is not null");
            return (Criteria) this;
        }

        public Criteria andSendlineEqualTo(String value) {
            addCriterion("sendLine =", value, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineNotEqualTo(String value) {
            addCriterion("sendLine <>", value, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineGreaterThan(String value) {
            addCriterion("sendLine >", value, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineGreaterThanOrEqualTo(String value) {
            addCriterion("sendLine >=", value, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineLessThan(String value) {
            addCriterion("sendLine <", value, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineLessThanOrEqualTo(String value) {
            addCriterion("sendLine <=", value, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineLike(String value) {
            addCriterion("sendLine like", value, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineNotLike(String value) {
            addCriterion("sendLine not like", value, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineIn(List<String> values) {
            addCriterion("sendLine in", values, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineNotIn(List<String> values) {
            addCriterion("sendLine not in", values, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineBetween(String value1, String value2) {
            addCriterion("sendLine between", value1, value2, "sendline");
            return (Criteria) this;
        }

        public Criteria andSendlineNotBetween(String value1, String value2) {
            addCriterion("sendLine not between", value1, value2, "sendline");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeIsNull() {
            addCriterion("travelStartTime is null");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeIsNotNull() {
            addCriterion("travelStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("travelStartTime =", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("travelStartTime <>", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("travelStartTime >", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelStartTime >=", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeLessThan(Date value) {
            addCriterionForJDBCDate("travelStartTime <", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelStartTime <=", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("travelStartTime in", values, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("travelStartTime not in", values, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelStartTime between", value1, value2, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelStartTime not between", value1, value2, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeIsNull() {
            addCriterion("travelEndTime is null");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeIsNotNull() {
            addCriterion("travelEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("travelEndTime =", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("travelEndTime <>", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("travelEndTime >", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelEndTime >=", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeLessThan(Date value) {
            addCriterionForJDBCDate("travelEndTime <", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelEndTime <=", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("travelEndTime in", values, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("travelEndTime not in", values, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelEndTime between", value1, value2, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelEndTime not between", value1, value2, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTouristIsNull() {
            addCriterion("tourist is null");
            return (Criteria) this;
        }

        public Criteria andTouristIsNotNull() {
            addCriterion("tourist is not null");
            return (Criteria) this;
        }

        public Criteria andTouristEqualTo(String value) {
            addCriterion("tourist =", value, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristNotEqualTo(String value) {
            addCriterion("tourist <>", value, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristGreaterThan(String value) {
            addCriterion("tourist >", value, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristGreaterThanOrEqualTo(String value) {
            addCriterion("tourist >=", value, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristLessThan(String value) {
            addCriterion("tourist <", value, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristLessThanOrEqualTo(String value) {
            addCriterion("tourist <=", value, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristLike(String value) {
            addCriterion("tourist like", value, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristNotLike(String value) {
            addCriterion("tourist not like", value, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristIn(List<String> values) {
            addCriterion("tourist in", values, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristNotIn(List<String> values) {
            addCriterion("tourist not in", values, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristBetween(String value1, String value2) {
            addCriterion("tourist between", value1, value2, "tourist");
            return (Criteria) this;
        }

        public Criteria andTouristNotBetween(String value1, String value2) {
            addCriterion("tourist not between", value1, value2, "tourist");
            return (Criteria) this;
        }

        public Criteria andTripIsNull() {
            addCriterion("trip is null");
            return (Criteria) this;
        }

        public Criteria andTripIsNotNull() {
            addCriterion("trip is not null");
            return (Criteria) this;
        }

        public Criteria andTripEqualTo(String value) {
            addCriterion("trip =", value, "trip");
            return (Criteria) this;
        }

        public Criteria andTripNotEqualTo(String value) {
            addCriterion("trip <>", value, "trip");
            return (Criteria) this;
        }

        public Criteria andTripGreaterThan(String value) {
            addCriterion("trip >", value, "trip");
            return (Criteria) this;
        }

        public Criteria andTripGreaterThanOrEqualTo(String value) {
            addCriterion("trip >=", value, "trip");
            return (Criteria) this;
        }

        public Criteria andTripLessThan(String value) {
            addCriterion("trip <", value, "trip");
            return (Criteria) this;
        }

        public Criteria andTripLessThanOrEqualTo(String value) {
            addCriterion("trip <=", value, "trip");
            return (Criteria) this;
        }

        public Criteria andTripLike(String value) {
            addCriterion("trip like", value, "trip");
            return (Criteria) this;
        }

        public Criteria andTripNotLike(String value) {
            addCriterion("trip not like", value, "trip");
            return (Criteria) this;
        }

        public Criteria andTripIn(List<String> values) {
            addCriterion("trip in", values, "trip");
            return (Criteria) this;
        }

        public Criteria andTripNotIn(List<String> values) {
            addCriterion("trip not in", values, "trip");
            return (Criteria) this;
        }

        public Criteria andTripBetween(String value1, String value2) {
            addCriterion("trip between", value1, value2, "trip");
            return (Criteria) this;
        }

        public Criteria andTripNotBetween(String value1, String value2) {
            addCriterion("trip not between", value1, value2, "trip");
            return (Criteria) this;
        }

        public Criteria andOfferIsNull() {
            addCriterion("offer is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsNotNull() {
            addCriterion("offer is not null");
            return (Criteria) this;
        }

        public Criteria andOfferEqualTo(Double value) {
            addCriterion("offer =", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotEqualTo(Double value) {
            addCriterion("offer <>", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThan(Double value) {
            addCriterion("offer >", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThanOrEqualTo(Double value) {
            addCriterion("offer >=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThan(Double value) {
            addCriterion("offer <", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThanOrEqualTo(Double value) {
            addCriterion("offer <=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferIn(List<Double> values) {
            addCriterion("offer in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotIn(List<Double> values) {
            addCriterion("offer not in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferBetween(Double value1, Double value2) {
            addCriterion("offer between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotBetween(Double value1, Double value2) {
            addCriterion("offer not between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andAvarianceIsNull() {
            addCriterion("aVariance is null");
            return (Criteria) this;
        }

        public Criteria andAvarianceIsNotNull() {
            addCriterion("aVariance is not null");
            return (Criteria) this;
        }

        public Criteria andAvarianceEqualTo(Double value) {
            addCriterion("aVariance =", value, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceNotEqualTo(Double value) {
            addCriterion("aVariance <>", value, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceGreaterThan(Double value) {
            addCriterion("aVariance >", value, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceGreaterThanOrEqualTo(Double value) {
            addCriterion("aVariance >=", value, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceLessThan(Double value) {
            addCriterion("aVariance <", value, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceLessThanOrEqualTo(Double value) {
            addCriterion("aVariance <=", value, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceIn(List<Double> values) {
            addCriterion("aVariance in", values, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceNotIn(List<Double> values) {
            addCriterion("aVariance not in", values, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceBetween(Double value1, Double value2) {
            addCriterion("aVariance between", value1, value2, "avariance");
            return (Criteria) this;
        }

        public Criteria andAvarianceNotBetween(Double value1, Double value2) {
            addCriterion("aVariance not between", value1, value2, "avariance");
            return (Criteria) this;
        }

        public Criteria andFareIsNull() {
            addCriterion("fare is null");
            return (Criteria) this;
        }

        public Criteria andFareIsNotNull() {
            addCriterion("fare is not null");
            return (Criteria) this;
        }

        public Criteria andFareEqualTo(Double value) {
            addCriterion("fare =", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotEqualTo(Double value) {
            addCriterion("fare <>", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThan(Double value) {
            addCriterion("fare >", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThanOrEqualTo(Double value) {
            addCriterion("fare >=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThan(Double value) {
            addCriterion("fare <", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThanOrEqualTo(Double value) {
            addCriterion("fare <=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareIn(List<Double> values) {
            addCriterion("fare in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotIn(List<Double> values) {
            addCriterion("fare not in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareBetween(Double value1, Double value2) {
            addCriterion("fare between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotBetween(Double value1, Double value2) {
            addCriterion("fare not between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andWinefeeIsNull() {
            addCriterion("wineFee is null");
            return (Criteria) this;
        }

        public Criteria andWinefeeIsNotNull() {
            addCriterion("wineFee is not null");
            return (Criteria) this;
        }

        public Criteria andWinefeeEqualTo(Double value) {
            addCriterion("wineFee =", value, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeNotEqualTo(Double value) {
            addCriterion("wineFee <>", value, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeGreaterThan(Double value) {
            addCriterion("wineFee >", value, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeGreaterThanOrEqualTo(Double value) {
            addCriterion("wineFee >=", value, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeLessThan(Double value) {
            addCriterion("wineFee <", value, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeLessThanOrEqualTo(Double value) {
            addCriterion("wineFee <=", value, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeIn(List<Double> values) {
            addCriterion("wineFee in", values, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeNotIn(List<Double> values) {
            addCriterion("wineFee not in", values, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeBetween(Double value1, Double value2) {
            addCriterion("wineFee between", value1, value2, "winefee");
            return (Criteria) this;
        }

        public Criteria andWinefeeNotBetween(Double value1, Double value2) {
            addCriterion("wineFee not between", value1, value2, "winefee");
            return (Criteria) this;
        }

        public Criteria andNotIsNull() {
            addCriterion("not is null");
            return (Criteria) this;
        }

        public Criteria andNotIsNotNull() {
            addCriterion("not is not null");
            return (Criteria) this;
        }

        public Criteria andNotEqualTo(String value) {
            addCriterion("not =", value, "not");
            return (Criteria) this;
        }

        public Criteria andNotNotEqualTo(String value) {
            addCriterion("not <>", value, "not");
            return (Criteria) this;
        }

        public Criteria andNotGreaterThan(String value) {
            addCriterion("not >", value, "not");
            return (Criteria) this;
        }

        public Criteria andNotGreaterThanOrEqualTo(String value) {
            addCriterion("not >=", value, "not");
            return (Criteria) this;
        }

        public Criteria andNotLessThan(String value) {
            addCriterion("not <", value, "not");
            return (Criteria) this;
        }

        public Criteria andNotLessThanOrEqualTo(String value) {
            addCriterion("not <=", value, "not");
            return (Criteria) this;
        }

        public Criteria andNotLike(String value) {
            addCriterion("not like", value, "not");
            return (Criteria) this;
        }

        public Criteria andNotNotLike(String value) {
            addCriterion("not not like", value, "not");
            return (Criteria) this;
        }

        public Criteria andNotIn(List<String> values) {
            addCriterion("not in", values, "not");
            return (Criteria) this;
        }

        public Criteria andNotNotIn(List<String> values) {
            addCriterion("not not in", values, "not");
            return (Criteria) this;
        }

        public Criteria andNotBetween(String value1, String value2) {
            addCriterion("not between", value1, value2, "not");
            return (Criteria) this;
        }

        public Criteria andNotNotBetween(String value1, String value2) {
            addCriterion("not not between", value1, value2, "not");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andSupervisionIsNull() {
            addCriterion("supervision is null");
            return (Criteria) this;
        }

        public Criteria andSupervisionIsNotNull() {
            addCriterion("supervision is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisionEqualTo(String value) {
            addCriterion("supervision =", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionNotEqualTo(String value) {
            addCriterion("supervision <>", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionGreaterThan(String value) {
            addCriterion("supervision >", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionGreaterThanOrEqualTo(String value) {
            addCriterion("supervision >=", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionLessThan(String value) {
            addCriterion("supervision <", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionLessThanOrEqualTo(String value) {
            addCriterion("supervision <=", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionLike(String value) {
            addCriterion("supervision like", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionNotLike(String value) {
            addCriterion("supervision not like", value, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionIn(List<String> values) {
            addCriterion("supervision in", values, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionNotIn(List<String> values) {
            addCriterion("supervision not in", values, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionBetween(String value1, String value2) {
            addCriterion("supervision between", value1, value2, "supervision");
            return (Criteria) this;
        }

        public Criteria andSupervisionNotBetween(String value1, String value2) {
            addCriterion("supervision not between", value1, value2, "supervision");
            return (Criteria) this;
        }

        public Criteria andReceptionIsNull() {
            addCriterion("reception is null");
            return (Criteria) this;
        }

        public Criteria andReceptionIsNotNull() {
            addCriterion("reception is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionEqualTo(String value) {
            addCriterion("reception =", value, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionNotEqualTo(String value) {
            addCriterion("reception <>", value, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionGreaterThan(String value) {
            addCriterion("reception >", value, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionGreaterThanOrEqualTo(String value) {
            addCriterion("reception >=", value, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionLessThan(String value) {
            addCriterion("reception <", value, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionLessThanOrEqualTo(String value) {
            addCriterion("reception <=", value, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionLike(String value) {
            addCriterion("reception like", value, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionNotLike(String value) {
            addCriterion("reception not like", value, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionIn(List<String> values) {
            addCriterion("reception in", values, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionNotIn(List<String> values) {
            addCriterion("reception not in", values, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionBetween(String value1, String value2) {
            addCriterion("reception between", value1, value2, "reception");
            return (Criteria) this;
        }

        public Criteria andReceptionNotBetween(String value1, String value2) {
            addCriterion("reception not between", value1, value2, "reception");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andLoanIsNull() {
            addCriterion("loan is null");
            return (Criteria) this;
        }

        public Criteria andLoanIsNotNull() {
            addCriterion("loan is not null");
            return (Criteria) this;
        }

        public Criteria andLoanEqualTo(Double value) {
            addCriterion("loan =", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanNotEqualTo(Double value) {
            addCriterion("loan <>", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanGreaterThan(Double value) {
            addCriterion("loan >", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanGreaterThanOrEqualTo(Double value) {
            addCriterion("loan >=", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanLessThan(Double value) {
            addCriterion("loan <", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanLessThanOrEqualTo(Double value) {
            addCriterion("loan <=", value, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanIn(List<Double> values) {
            addCriterion("loan in", values, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanNotIn(List<Double> values) {
            addCriterion("loan not in", values, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanBetween(Double value1, Double value2) {
            addCriterion("loan between", value1, value2, "loan");
            return (Criteria) this;
        }

        public Criteria andLoanNotBetween(Double value1, Double value2) {
            addCriterion("loan not between", value1, value2, "loan");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andWhetherdelIsNull() {
            addCriterion("whetherDel is null");
            return (Criteria) this;
        }

        public Criteria andWhetherdelIsNotNull() {
            addCriterion("whetherDel is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherdelEqualTo(Integer value) {
            addCriterion("whetherDel =", value, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelNotEqualTo(Integer value) {
            addCriterion("whetherDel <>", value, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelGreaterThan(Integer value) {
            addCriterion("whetherDel >", value, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("whetherDel >=", value, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelLessThan(Integer value) {
            addCriterion("whetherDel <", value, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelLessThanOrEqualTo(Integer value) {
            addCriterion("whetherDel <=", value, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelIn(List<Integer> values) {
            addCriterion("whetherDel in", values, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelNotIn(List<Integer> values) {
            addCriterion("whetherDel not in", values, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelBetween(Integer value1, Integer value2) {
            addCriterion("whetherDel between", value1, value2, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andWhetherdelNotBetween(Integer value1, Integer value2) {
            addCriterion("whetherDel not between", value1, value2, "whetherdel");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(Integer value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(Integer value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(Integer value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(Integer value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(Integer value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<Integer> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<Integer> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(Integer value1, Integer value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(Integer value1, Integer value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Integer value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Integer value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Integer value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Integer value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Integer value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Integer> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Integer> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Integer value1, Integer value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Integer value1, Integer value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifieddataIsNull() {
            addCriterion("modifiedData is null");
            return (Criteria) this;
        }

        public Criteria andModifieddataIsNotNull() {
            addCriterion("modifiedData is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddataEqualTo(Date value) {
            addCriterionForJDBCDate("modifiedData =", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataNotEqualTo(Date value) {
            addCriterionForJDBCDate("modifiedData <>", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataGreaterThan(Date value) {
            addCriterionForJDBCDate("modifiedData >", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modifiedData >=", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataLessThan(Date value) {
            addCriterionForJDBCDate("modifiedData <", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modifiedData <=", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataIn(List<Date> values) {
            addCriterionForJDBCDate("modifiedData in", values, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataNotIn(List<Date> values) {
            addCriterionForJDBCDate("modifiedData not in", values, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modifiedData between", value1, value2, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modifiedData not between", value1, value2, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterionForJDBCDate("creationDate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("creationDate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("creationDate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creationDate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterionForJDBCDate("creationDate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creationDate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterionForJDBCDate("creationDate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("creationDate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creationDate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creationDate not between", value1, value2, "creationdate");
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