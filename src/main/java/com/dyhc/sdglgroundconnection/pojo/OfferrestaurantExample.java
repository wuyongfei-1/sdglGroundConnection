package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfferrestaurantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfferrestaurantExample() {
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

        public Criteria andOfferrestaurantidIsNull() {
            addCriterion("offerRestaurantId is null");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidIsNotNull() {
            addCriterion("offerRestaurantId is not null");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidEqualTo(Integer value) {
            addCriterion("offerRestaurantId =", value, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidNotEqualTo(Integer value) {
            addCriterion("offerRestaurantId <>", value, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidGreaterThan(Integer value) {
            addCriterion("offerRestaurantId >", value, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("offerRestaurantId >=", value, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidLessThan(Integer value) {
            addCriterion("offerRestaurantId <", value, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidLessThanOrEqualTo(Integer value) {
            addCriterion("offerRestaurantId <=", value, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidIn(List<Integer> values) {
            addCriterion("offerRestaurantId in", values, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidNotIn(List<Integer> values) {
            addCriterion("offerRestaurantId not in", values, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidBetween(Integer value1, Integer value2) {
            addCriterion("offerRestaurantId between", value1, value2, "offerrestaurantid");
            return (Criteria) this;
        }

        public Criteria andOfferrestaurantidNotBetween(Integer value1, Integer value2) {
            addCriterion("offerRestaurantId not between", value1, value2, "offerrestaurantid");
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

        public Criteria andTypecodeIsNull() {
            addCriterion("typeCode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(Integer value) {
            addCriterion("typeCode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(Integer value) {
            addCriterion("typeCode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(Integer value) {
            addCriterion("typeCode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeCode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(Integer value) {
            addCriterion("typeCode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(Integer value) {
            addCriterion("typeCode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<Integer> values) {
            addCriterion("typeCode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<Integer> values) {
            addCriterion("typeCode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(Integer value1, Integer value2) {
            addCriterion("typeCode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("typeCode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andDictionariesidIsNull() {
            addCriterion("dictionariesId is null");
            return (Criteria) this;
        }

        public Criteria andDictionariesidIsNotNull() {
            addCriterion("dictionariesId is not null");
            return (Criteria) this;
        }

        public Criteria andDictionariesidEqualTo(Integer value) {
            addCriterion("dictionariesId =", value, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidNotEqualTo(Integer value) {
            addCriterion("dictionariesId <>", value, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidGreaterThan(Integer value) {
            addCriterion("dictionariesId >", value, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dictionariesId >=", value, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidLessThan(Integer value) {
            addCriterion("dictionariesId <", value, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidLessThanOrEqualTo(Integer value) {
            addCriterion("dictionariesId <=", value, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidIn(List<Integer> values) {
            addCriterion("dictionariesId in", values, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidNotIn(List<Integer> values) {
            addCriterion("dictionariesId not in", values, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidBetween(Integer value1, Integer value2) {
            addCriterion("dictionariesId between", value1, value2, "dictionariesid");
            return (Criteria) this;
        }

        public Criteria andDictionariesidNotBetween(Integer value1, Integer value2) {
            addCriterion("dictionariesId not between", value1, value2, "dictionariesid");
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

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateIsNull() {
            addCriterion("havemealsdate is null");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateIsNotNull() {
            addCriterion("havemealsdate is not null");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateEqualTo(Integer value) {
            addCriterion("havemealsdate =", value, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateNotEqualTo(Integer value) {
            addCriterion("havemealsdate <>", value, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateGreaterThan(Integer value) {
            addCriterion("havemealsdate >", value, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("havemealsdate >=", value, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateLessThan(Integer value) {
            addCriterion("havemealsdate <", value, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateLessThanOrEqualTo(Integer value) {
            addCriterion("havemealsdate <=", value, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateIn(List<Integer> values) {
            addCriterion("havemealsdate in", values, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateNotIn(List<Integer> values) {
            addCriterion("havemealsdate not in", values, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateBetween(Integer value1, Integer value2) {
            addCriterion("havemealsdate between", value1, value2, "havemealsdate");
            return (Criteria) this;
        }

        public Criteria andHavemealsdateNotBetween(Integer value1, Integer value2) {
            addCriterion("havemealsdate not between", value1, value2, "havemealsdate");
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