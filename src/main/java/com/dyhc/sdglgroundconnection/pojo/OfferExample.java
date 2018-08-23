package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfferExample() {
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

        public Criteria andOfferidIsNull() {
            addCriterion("offerId is null");
            return (Criteria) this;
        }

        public Criteria andOfferidIsNotNull() {
            addCriterion("offerId is not null");
            return (Criteria) this;
        }

        public Criteria andOfferidEqualTo(Integer value) {
            addCriterion("offerId =", value, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidNotEqualTo(Integer value) {
            addCriterion("offerId <>", value, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidGreaterThan(Integer value) {
            addCriterion("offerId >", value, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidGreaterThanOrEqualTo(Integer value) {
            addCriterion("offerId >=", value, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidLessThan(Integer value) {
            addCriterion("offerId <", value, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidLessThanOrEqualTo(Integer value) {
            addCriterion("offerId <=", value, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidIn(List<Integer> values) {
            addCriterion("offerId in", values, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidNotIn(List<Integer> values) {
            addCriterion("offerId not in", values, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidBetween(Integer value1, Integer value2) {
            addCriterion("offerId between", value1, value2, "offerid");
            return (Criteria) this;
        }

        public Criteria andOfferidNotBetween(Integer value1, Integer value2) {
            addCriterion("offerId not between", value1, value2, "offerid");
            return (Criteria) this;
        }

        public Criteria andTravelidIsNull() {
            addCriterion("travelId is null");
            return (Criteria) this;
        }

        public Criteria andTravelidIsNotNull() {
            addCriterion("travelId is not null");
            return (Criteria) this;
        }

        public Criteria andTravelidEqualTo(Integer value) {
            addCriterion("travelId =", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidNotEqualTo(Integer value) {
            addCriterion("travelId <>", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidGreaterThan(Integer value) {
            addCriterion("travelId >", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("travelId >=", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidLessThan(Integer value) {
            addCriterion("travelId <", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidLessThanOrEqualTo(Integer value) {
            addCriterion("travelId <=", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidIn(List<Integer> values) {
            addCriterion("travelId in", values, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidNotIn(List<Integer> values) {
            addCriterion("travelId not in", values, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidBetween(Integer value1, Integer value2) {
            addCriterion("travelId between", value1, value2, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidNotBetween(Integer value1, Integer value2) {
            addCriterion("travelId not between", value1, value2, "travelid");
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
            addCriterion("travelStartTime =", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeNotEqualTo(Date value) {
            addCriterion("travelStartTime <>", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeGreaterThan(Date value) {
            addCriterion("travelStartTime >", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("travelStartTime >=", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeLessThan(Date value) {
            addCriterion("travelStartTime <", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("travelStartTime <=", value, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeIn(List<Date> values) {
            addCriterion("travelStartTime in", values, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeNotIn(List<Date> values) {
            addCriterion("travelStartTime not in", values, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeBetween(Date value1, Date value2) {
            addCriterion("travelStartTime between", value1, value2, "travelstarttime");
            return (Criteria) this;
        }

        public Criteria andTravelstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("travelStartTime not between", value1, value2, "travelstarttime");
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
            addCriterion("travelEndTime =", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeNotEqualTo(Date value) {
            addCriterion("travelEndTime <>", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeGreaterThan(Date value) {
            addCriterion("travelEndTime >", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("travelEndTime >=", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeLessThan(Date value) {
            addCriterion("travelEndTime <", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeLessThanOrEqualTo(Date value) {
            addCriterion("travelEndTime <=", value, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeIn(List<Date> values) {
            addCriterion("travelEndTime in", values, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeNotIn(List<Date> values) {
            addCriterion("travelEndTime not in", values, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeBetween(Date value1, Date value2) {
            addCriterion("travelEndTime between", value1, value2, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andTravelendtimeNotBetween(Date value1, Date value2) {
            addCriterion("travelEndTime not between", value1, value2, "travelendtime");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andShoppingIsNull() {
            addCriterion("shopping is null");
            return (Criteria) this;
        }

        public Criteria andShoppingIsNotNull() {
            addCriterion("shopping is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingEqualTo(String value) {
            addCriterion("shopping =", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotEqualTo(String value) {
            addCriterion("shopping <>", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingGreaterThan(String value) {
            addCriterion("shopping >", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingGreaterThanOrEqualTo(String value) {
            addCriterion("shopping >=", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLessThan(String value) {
            addCriterion("shopping <", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLessThanOrEqualTo(String value) {
            addCriterion("shopping <=", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingLike(String value) {
            addCriterion("shopping like", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotLike(String value) {
            addCriterion("shopping not like", value, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingIn(List<String> values) {
            addCriterion("shopping in", values, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotIn(List<String> values) {
            addCriterion("shopping not in", values, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingBetween(String value1, String value2) {
            addCriterion("shopping between", value1, value2, "shopping");
            return (Criteria) this;
        }

        public Criteria andShoppingNotBetween(String value1, String value2) {
            addCriterion("shopping not between", value1, value2, "shopping");
            return (Criteria) this;
        }

        public Criteria andNotexcludeIsNull() {
            addCriterion("notExclude is null");
            return (Criteria) this;
        }

        public Criteria andNotexcludeIsNotNull() {
            addCriterion("notExclude is not null");
            return (Criteria) this;
        }

        public Criteria andNotexcludeEqualTo(String value) {
            addCriterion("notExclude =", value, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeNotEqualTo(String value) {
            addCriterion("notExclude <>", value, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeGreaterThan(String value) {
            addCriterion("notExclude >", value, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeGreaterThanOrEqualTo(String value) {
            addCriterion("notExclude >=", value, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeLessThan(String value) {
            addCriterion("notExclude <", value, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeLessThanOrEqualTo(String value) {
            addCriterion("notExclude <=", value, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeLike(String value) {
            addCriterion("notExclude like", value, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeNotLike(String value) {
            addCriterion("notExclude not like", value, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeIn(List<String> values) {
            addCriterion("notExclude in", values, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeNotIn(List<String> values) {
            addCriterion("notExclude not in", values, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeBetween(String value1, String value2) {
            addCriterion("notExclude between", value1, value2, "notexclude");
            return (Criteria) this;
        }

        public Criteria andNotexcludeNotBetween(String value1, String value2) {
            addCriterion("notExclude not between", value1, value2, "notexclude");
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
            addCriterion("modifiedData =", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataNotEqualTo(Date value) {
            addCriterion("modifiedData <>", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataGreaterThan(Date value) {
            addCriterion("modifiedData >", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataGreaterThanOrEqualTo(Date value) {
            addCriterion("modifiedData >=", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataLessThan(Date value) {
            addCriterion("modifiedData <", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataLessThanOrEqualTo(Date value) {
            addCriterion("modifiedData <=", value, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataIn(List<Date> values) {
            addCriterion("modifiedData in", values, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataNotIn(List<Date> values) {
            addCriterion("modifiedData not in", values, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataBetween(Date value1, Date value2) {
            addCriterion("modifiedData between", value1, value2, "modifieddata");
            return (Criteria) this;
        }

        public Criteria andModifieddataNotBetween(Date value1, Date value2) {
            addCriterion("modifiedData not between", value1, value2, "modifieddata");
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
            addCriterion("creationDate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("creationDate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("creationDate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("creationDate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("creationDate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("creationDate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("creationDate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("creationDate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("creationDate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("creationDate not between", value1, value2, "creationdate");
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