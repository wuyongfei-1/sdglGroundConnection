package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportaccommodationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportaccommodationExample() {
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

        public Criteria andReportaccommodationidIsNull() {
            addCriterion("reportAccommodationId is null");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidIsNotNull() {
            addCriterion("reportAccommodationId is not null");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidEqualTo(Integer value) {
            addCriterion("reportAccommodationId =", value, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidNotEqualTo(Integer value) {
            addCriterion("reportAccommodationId <>", value, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidGreaterThan(Integer value) {
            addCriterion("reportAccommodationId >", value, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportAccommodationId >=", value, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidLessThan(Integer value) {
            addCriterion("reportAccommodationId <", value, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidLessThanOrEqualTo(Integer value) {
            addCriterion("reportAccommodationId <=", value, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidIn(List<Integer> values) {
            addCriterion("reportAccommodationId in", values, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidNotIn(List<Integer> values) {
            addCriterion("reportAccommodationId not in", values, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidBetween(Integer value1, Integer value2) {
            addCriterion("reportAccommodationId between", value1, value2, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andReportaccommodationidNotBetween(Integer value1, Integer value2) {
            addCriterion("reportAccommodationId not between", value1, value2, "reportaccommodationid");
            return (Criteria) this;
        }

        public Criteria andLivedateIsNull() {
            addCriterion("liveDate is null");
            return (Criteria) this;
        }

        public Criteria andLivedateIsNotNull() {
            addCriterion("liveDate is not null");
            return (Criteria) this;
        }

        public Criteria andLivedateEqualTo(Date value) {
            addCriterionForJDBCDate("liveDate =", value, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("liveDate <>", value, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateGreaterThan(Date value) {
            addCriterionForJDBCDate("liveDate >", value, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("liveDate >=", value, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateLessThan(Date value) {
            addCriterionForJDBCDate("liveDate <", value, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("liveDate <=", value, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateIn(List<Date> values) {
            addCriterionForJDBCDate("liveDate in", values, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("liveDate not in", values, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("liveDate between", value1, value2, "livedate");
            return (Criteria) this;
        }

        public Criteria andLivedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("liveDate not between", value1, value2, "livedate");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNull() {
            addCriterion("hotelName is null");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNotNull() {
            addCriterion("hotelName is not null");
            return (Criteria) this;
        }

        public Criteria andHotelnameEqualTo(String value) {
            addCriterion("hotelName =", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotEqualTo(String value) {
            addCriterion("hotelName <>", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThan(String value) {
            addCriterion("hotelName >", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThanOrEqualTo(String value) {
            addCriterion("hotelName >=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThan(String value) {
            addCriterion("hotelName <", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThanOrEqualTo(String value) {
            addCriterion("hotelName <=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLike(String value) {
            addCriterion("hotelName like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotLike(String value) {
            addCriterion("hotelName not like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameIn(List<String> values) {
            addCriterion("hotelName in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotIn(List<String> values) {
            addCriterion("hotelName not in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameBetween(String value1, String value2) {
            addCriterion("hotelName between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotBetween(String value1, String value2) {
            addCriterion("hotelName not between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andHousepriceIsNull() {
            addCriterion("housePrice is null");
            return (Criteria) this;
        }

        public Criteria andHousepriceIsNotNull() {
            addCriterion("housePrice is not null");
            return (Criteria) this;
        }

        public Criteria andHousepriceEqualTo(Double value) {
            addCriterion("housePrice =", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotEqualTo(Double value) {
            addCriterion("housePrice <>", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceGreaterThan(Double value) {
            addCriterion("housePrice >", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("housePrice >=", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceLessThan(Double value) {
            addCriterion("housePrice <", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceLessThanOrEqualTo(Double value) {
            addCriterion("housePrice <=", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceIn(List<Double> values) {
            addCriterion("housePrice in", values, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotIn(List<Double> values) {
            addCriterion("housePrice not in", values, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceBetween(Double value1, Double value2) {
            addCriterion("housePrice between", value1, value2, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotBetween(Double value1, Double value2) {
            addCriterion("housePrice not between", value1, value2, "houseprice");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNull() {
            addCriterion("roomNum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("roomNum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(Integer value) {
            addCriterion("roomNum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(Integer value) {
            addCriterion("roomNum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(Integer value) {
            addCriterion("roomNum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomNum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(Integer value) {
            addCriterion("roomNum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(Integer value) {
            addCriterion("roomNum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<Integer> values) {
            addCriterion("roomNum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<Integer> values) {
            addCriterion("roomNum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(Integer value1, Integer value2) {
            addCriterion("roomNum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(Integer value1, Integer value2) {
            addCriterion("roomNum not between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedIsNull() {
            addCriterion("accompanyingBed is null");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedIsNotNull() {
            addCriterion("accompanyingBed is not null");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedEqualTo(Integer value) {
            addCriterion("accompanyingBed =", value, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedNotEqualTo(Integer value) {
            addCriterion("accompanyingBed <>", value, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedGreaterThan(Integer value) {
            addCriterion("accompanyingBed >", value, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedGreaterThanOrEqualTo(Integer value) {
            addCriterion("accompanyingBed >=", value, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedLessThan(Integer value) {
            addCriterion("accompanyingBed <", value, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedLessThanOrEqualTo(Integer value) {
            addCriterion("accompanyingBed <=", value, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedIn(List<Integer> values) {
            addCriterion("accompanyingBed in", values, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedNotIn(List<Integer> values) {
            addCriterion("accompanyingBed not in", values, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedBetween(Integer value1, Integer value2) {
            addCriterion("accompanyingBed between", value1, value2, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingbedNotBetween(Integer value1, Integer value2) {
            addCriterion("accompanyingBed not between", value1, value2, "accompanyingbed");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceIsNull() {
            addCriterion("accompanyingPrice is null");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceIsNotNull() {
            addCriterion("accompanyingPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceEqualTo(Double value) {
            addCriterion("accompanyingPrice =", value, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceNotEqualTo(Double value) {
            addCriterion("accompanyingPrice <>", value, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceGreaterThan(Double value) {
            addCriterion("accompanyingPrice >", value, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("accompanyingPrice >=", value, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceLessThan(Double value) {
            addCriterion("accompanyingPrice <", value, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceLessThanOrEqualTo(Double value) {
            addCriterion("accompanyingPrice <=", value, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceIn(List<Double> values) {
            addCriterion("accompanyingPrice in", values, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceNotIn(List<Double> values) {
            addCriterion("accompanyingPrice not in", values, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceBetween(Double value1, Double value2) {
            addCriterion("accompanyingPrice between", value1, value2, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andAccompanyingpriceNotBetween(Double value1, Double value2) {
            addCriterion("accompanyingPrice not between", value1, value2, "accompanyingprice");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNull() {
            addCriterion("subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(Double value) {
            addCriterion("subtotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(Double value) {
            addCriterion("subtotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(Double value) {
            addCriterion("subtotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("subtotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(Double value) {
            addCriterion("subtotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(Double value) {
            addCriterion("subtotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<Double> values) {
            addCriterion("subtotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<Double> values) {
            addCriterion("subtotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(Double value1, Double value2) {
            addCriterion("subtotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(Double value1, Double value2) {
            addCriterion("subtotal not between", value1, value2, "subtotal");
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