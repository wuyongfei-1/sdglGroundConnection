package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportticketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportticketExample() {
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

        public Criteria andReportticketidIsNull() {
            addCriterion("reportTicketId is null");
            return (Criteria) this;
        }

        public Criteria andReportticketidIsNotNull() {
            addCriterion("reportTicketId is not null");
            return (Criteria) this;
        }

        public Criteria andReportticketidEqualTo(Integer value) {
            addCriterion("reportTicketId =", value, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidNotEqualTo(Integer value) {
            addCriterion("reportTicketId <>", value, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidGreaterThan(Integer value) {
            addCriterion("reportTicketId >", value, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportTicketId >=", value, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidLessThan(Integer value) {
            addCriterion("reportTicketId <", value, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidLessThanOrEqualTo(Integer value) {
            addCriterion("reportTicketId <=", value, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidIn(List<Integer> values) {
            addCriterion("reportTicketId in", values, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidNotIn(List<Integer> values) {
            addCriterion("reportTicketId not in", values, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidBetween(Integer value1, Integer value2) {
            addCriterion("reportTicketId between", value1, value2, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andReportticketidNotBetween(Integer value1, Integer value2) {
            addCriterion("reportTicketId not between", value1, value2, "reportticketid");
            return (Criteria) this;
        }

        public Criteria andAttrnameIsNull() {
            addCriterion("attrName is null");
            return (Criteria) this;
        }

        public Criteria andAttrnameIsNotNull() {
            addCriterion("attrName is not null");
            return (Criteria) this;
        }

        public Criteria andAttrnameEqualTo(String value) {
            addCriterion("attrName =", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameNotEqualTo(String value) {
            addCriterion("attrName <>", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameGreaterThan(String value) {
            addCriterion("attrName >", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameGreaterThanOrEqualTo(String value) {
            addCriterion("attrName >=", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameLessThan(String value) {
            addCriterion("attrName <", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameLessThanOrEqualTo(String value) {
            addCriterion("attrName <=", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameLike(String value) {
            addCriterion("attrName like", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameNotLike(String value) {
            addCriterion("attrName not like", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameIn(List<String> values) {
            addCriterion("attrName in", values, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameNotIn(List<String> values) {
            addCriterion("attrName not in", values, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameBetween(String value1, String value2) {
            addCriterion("attrName between", value1, value2, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameNotBetween(String value1, String value2) {
            addCriterion("attrName not between", value1, value2, "attrname");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumsIsNull() {
            addCriterion("nums is null");
            return (Criteria) this;
        }

        public Criteria andNumsIsNotNull() {
            addCriterion("nums is not null");
            return (Criteria) this;
        }

        public Criteria andNumsEqualTo(Integer value) {
            addCriterion("nums =", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsNotEqualTo(Integer value) {
            addCriterion("nums <>", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsGreaterThan(Integer value) {
            addCriterion("nums >", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("nums >=", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsLessThan(Integer value) {
            addCriterion("nums <", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsLessThanOrEqualTo(Integer value) {
            addCriterion("nums <=", value, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsIn(List<Integer> values) {
            addCriterion("nums in", values, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsNotIn(List<Integer> values) {
            addCriterion("nums not in", values, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsBetween(Integer value1, Integer value2) {
            addCriterion("nums between", value1, value2, "nums");
            return (Criteria) this;
        }

        public Criteria andNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("nums not between", value1, value2, "nums");
            return (Criteria) this;
        }

        public Criteria andPaymethodsIsNull() {
            addCriterion("payMethods is null");
            return (Criteria) this;
        }

        public Criteria andPaymethodsIsNotNull() {
            addCriterion("payMethods is not null");
            return (Criteria) this;
        }

        public Criteria andPaymethodsEqualTo(String value) {
            addCriterion("payMethods =", value, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsNotEqualTo(String value) {
            addCriterion("payMethods <>", value, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsGreaterThan(String value) {
            addCriterion("payMethods >", value, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsGreaterThanOrEqualTo(String value) {
            addCriterion("payMethods >=", value, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsLessThan(String value) {
            addCriterion("payMethods <", value, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsLessThanOrEqualTo(String value) {
            addCriterion("payMethods <=", value, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsLike(String value) {
            addCriterion("payMethods like", value, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsNotLike(String value) {
            addCriterion("payMethods not like", value, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsIn(List<String> values) {
            addCriterion("payMethods in", values, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsNotIn(List<String> values) {
            addCriterion("payMethods not in", values, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsBetween(String value1, String value2) {
            addCriterion("payMethods between", value1, value2, "paymethods");
            return (Criteria) this;
        }

        public Criteria andPaymethodsNotBetween(String value1, String value2) {
            addCriterion("payMethods not between", value1, value2, "paymethods");
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