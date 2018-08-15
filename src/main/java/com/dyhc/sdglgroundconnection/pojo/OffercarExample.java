package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OffercarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OffercarExample() {
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

        public Criteria andOffercaridIsNull() {
            addCriterion("offerCarId is null");
            return (Criteria) this;
        }

        public Criteria andOffercaridIsNotNull() {
            addCriterion("offerCarId is not null");
            return (Criteria) this;
        }

        public Criteria andOffercaridEqualTo(Integer value) {
            addCriterion("offerCarId =", value, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridNotEqualTo(Integer value) {
            addCriterion("offerCarId <>", value, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridGreaterThan(Integer value) {
            addCriterion("offerCarId >", value, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("offerCarId >=", value, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridLessThan(Integer value) {
            addCriterion("offerCarId <", value, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridLessThanOrEqualTo(Integer value) {
            addCriterion("offerCarId <=", value, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridIn(List<Integer> values) {
            addCriterion("offerCarId in", values, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridNotIn(List<Integer> values) {
            addCriterion("offerCarId not in", values, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridBetween(Integer value1, Integer value2) {
            addCriterion("offerCarId between", value1, value2, "offercarid");
            return (Criteria) this;
        }

        public Criteria andOffercaridNotBetween(Integer value1, Integer value2) {
            addCriterion("offerCarId not between", value1, value2, "offercarid");
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

        public Criteria andCostpriceIsNull() {
            addCriterion("costPrice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("costPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(Double value) {
            addCriterion("costPrice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(Double value) {
            addCriterion("costPrice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(Double value) {
            addCriterion("costPrice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("costPrice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(Double value) {
            addCriterion("costPrice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(Double value) {
            addCriterion("costPrice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<Double> values) {
            addCriterion("costPrice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<Double> values) {
            addCriterion("costPrice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(Double value1, Double value2) {
            addCriterion("costPrice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(Double value1, Double value2) {
            addCriterion("costPrice not between", value1, value2, "costprice");
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