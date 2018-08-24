package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DispatchtourgroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DispatchtourgroupExample() {
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

        public Criteria andDispatchtourgroupidIsNull() {
            addCriterion("dispatchtourgroupId is null");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidIsNotNull() {
            addCriterion("dispatchtourgroupId is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidEqualTo(Integer value) {
            addCriterion("dispatchtourgroupId =", value, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidNotEqualTo(Integer value) {
            addCriterion("dispatchtourgroupId <>", value, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidGreaterThan(Integer value) {
            addCriterion("dispatchtourgroupId >", value, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatchtourgroupId >=", value, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidLessThan(Integer value) {
            addCriterion("dispatchtourgroupId <", value, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("dispatchtourgroupId <=", value, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidIn(List<Integer> values) {
            addCriterion("dispatchtourgroupId in", values, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidNotIn(List<Integer> values) {
            addCriterion("dispatchtourgroupId not in", values, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidBetween(Integer value1, Integer value2) {
            addCriterion("dispatchtourgroupId between", value1, value2, "dispatchtourgroupid");
            return (Criteria) this;
        }

        public Criteria andDispatchtourgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatchtourgroupId not between", value1, value2, "dispatchtourgroupid");
            return (Criteria) this;
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

        public Criteria andClustertimeIsNull() {
            addCriterion("clusterTime is null");
            return (Criteria) this;
        }

        public Criteria andClustertimeIsNotNull() {
            addCriterion("clusterTime is not null");
            return (Criteria) this;
        }

        public Criteria andClustertimeEqualTo(Date value) {
            addCriterion("clusterTime =", value, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeNotEqualTo(Date value) {
            addCriterion("clusterTime <>", value, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeGreaterThan(Date value) {
            addCriterion("clusterTime >", value, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clusterTime >=", value, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeLessThan(Date value) {
            addCriterion("clusterTime <", value, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeLessThanOrEqualTo(Date value) {
            addCriterion("clusterTime <=", value, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeIn(List<Date> values) {
            addCriterion("clusterTime in", values, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeNotIn(List<Date> values) {
            addCriterion("clusterTime not in", values, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeBetween(Date value1, Date value2) {
            addCriterion("clusterTime between", value1, value2, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClustertimeNotBetween(Date value1, Date value2) {
            addCriterion("clusterTime not between", value1, value2, "clustertime");
            return (Criteria) this;
        }

        public Criteria andClusteraddressIsNull() {
            addCriterion("clusterAddress is null");
            return (Criteria) this;
        }

        public Criteria andClusteraddressIsNotNull() {
            addCriterion("clusterAddress is not null");
            return (Criteria) this;
        }

        public Criteria andClusteraddressEqualTo(String value) {
            addCriterion("clusterAddress =", value, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressNotEqualTo(String value) {
            addCriterion("clusterAddress <>", value, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressGreaterThan(String value) {
            addCriterion("clusterAddress >", value, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressGreaterThanOrEqualTo(String value) {
            addCriterion("clusterAddress >=", value, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressLessThan(String value) {
            addCriterion("clusterAddress <", value, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressLessThanOrEqualTo(String value) {
            addCriterion("clusterAddress <=", value, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressLike(String value) {
            addCriterion("clusterAddress like", value, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressNotLike(String value) {
            addCriterion("clusterAddress not like", value, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressIn(List<String> values) {
            addCriterion("clusterAddress in", values, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressNotIn(List<String> values) {
            addCriterion("clusterAddress not in", values, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressBetween(String value1, String value2) {
            addCriterion("clusterAddress between", value1, value2, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andClusteraddressNotBetween(String value1, String value2) {
            addCriterion("clusterAddress not between", value1, value2, "clusteraddress");
            return (Criteria) this;
        }

        public Criteria andFlightidIsNull() {
            addCriterion("flightId is null");
            return (Criteria) this;
        }

        public Criteria andFlightidIsNotNull() {
            addCriterion("flightId is not null");
            return (Criteria) this;
        }

        public Criteria andFlightidEqualTo(String value) {
            addCriterion("flightId =", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotEqualTo(String value) {
            addCriterion("flightId <>", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThan(String value) {
            addCriterion("flightId >", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThanOrEqualTo(String value) {
            addCriterion("flightId >=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThan(String value) {
            addCriterion("flightId <", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThanOrEqualTo(String value) {
            addCriterion("flightId <=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLike(String value) {
            addCriterion("flightId like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotLike(String value) {
            addCriterion("flightId not like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidIn(List<String> values) {
            addCriterion("flightId in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotIn(List<String> values) {
            addCriterion("flightId not in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidBetween(String value1, String value2) {
            addCriterion("flightId between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotBetween(String value1, String value2) {
            addCriterion("flightId not between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameIsNull() {
            addCriterion("teamContactsName is null");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameIsNotNull() {
            addCriterion("teamContactsName is not null");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameEqualTo(String value) {
            addCriterion("teamContactsName =", value, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameNotEqualTo(String value) {
            addCriterion("teamContactsName <>", value, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameGreaterThan(String value) {
            addCriterion("teamContactsName >", value, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameGreaterThanOrEqualTo(String value) {
            addCriterion("teamContactsName >=", value, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameLessThan(String value) {
            addCriterion("teamContactsName <", value, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameLessThanOrEqualTo(String value) {
            addCriterion("teamContactsName <=", value, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameLike(String value) {
            addCriterion("teamContactsName like", value, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameNotLike(String value) {
            addCriterion("teamContactsName not like", value, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameIn(List<String> values) {
            addCriterion("teamContactsName in", values, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameNotIn(List<String> values) {
            addCriterion("teamContactsName not in", values, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameBetween(String value1, String value2) {
            addCriterion("teamContactsName between", value1, value2, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andTeamcontactsnameNotBetween(String value1, String value2) {
            addCriterion("teamContactsName not between", value1, value2, "teamcontactsname");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("contactNumber is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("contactNumber is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(String value) {
            addCriterion("contactNumber =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(String value) {
            addCriterion("contactNumber <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(String value) {
            addCriterion("contactNumber >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("contactNumber >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(String value) {
            addCriterion("contactNumber <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(String value) {
            addCriterion("contactNumber <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLike(String value) {
            addCriterion("contactNumber like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotLike(String value) {
            addCriterion("contactNumber not like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<String> values) {
            addCriterion("contactNumber in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<String> values) {
            addCriterion("contactNumber not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(String value1, String value2) {
            addCriterion("contactNumber between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(String value1, String value2) {
            addCriterion("contactNumber not between", value1, value2, "contactnumber");
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