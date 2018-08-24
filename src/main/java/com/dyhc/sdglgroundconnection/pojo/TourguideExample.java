package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TourguideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TourguideExample() {
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

        public Criteria andTourguideidIsNull() {
            addCriterion("tourguideId is null");
            return (Criteria) this;
        }

        public Criteria andTourguideidIsNotNull() {
            addCriterion("tourguideId is not null");
            return (Criteria) this;
        }

        public Criteria andTourguideidEqualTo(Integer value) {
            addCriterion("tourguideId =", value, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidNotEqualTo(Integer value) {
            addCriterion("tourguideId <>", value, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidGreaterThan(Integer value) {
            addCriterion("tourguideId >", value, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tourguideId >=", value, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidLessThan(Integer value) {
            addCriterion("tourguideId <", value, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidLessThanOrEqualTo(Integer value) {
            addCriterion("tourguideId <=", value, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidIn(List<Integer> values) {
            addCriterion("tourguideId in", values, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidNotIn(List<Integer> values) {
            addCriterion("tourguideId not in", values, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidBetween(Integer value1, Integer value2) {
            addCriterion("tourguideId between", value1, value2, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andTourguideidNotBetween(Integer value1, Integer value2) {
            addCriterion("tourguideId not between", value1, value2, "tourguideid");
            return (Criteria) this;
        }

        public Criteria andGuideidIsNull() {
            addCriterion("guideId is null");
            return (Criteria) this;
        }

        public Criteria andGuideidIsNotNull() {
            addCriterion("guideId is not null");
            return (Criteria) this;
        }

        public Criteria andGuideidEqualTo(Integer value) {
            addCriterion("guideId =", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidNotEqualTo(Integer value) {
            addCriterion("guideId <>", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidGreaterThan(Integer value) {
            addCriterion("guideId >", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidGreaterThanOrEqualTo(Integer value) {
            addCriterion("guideId >=", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidLessThan(Integer value) {
            addCriterion("guideId <", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidLessThanOrEqualTo(Integer value) {
            addCriterion("guideId <=", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidIn(List<Integer> values) {
            addCriterion("guideId in", values, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidNotIn(List<Integer> values) {
            addCriterion("guideId not in", values, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidBetween(Integer value1, Integer value2) {
            addCriterion("guideId between", value1, value2, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidNotBetween(Integer value1, Integer value2) {
            addCriterion("guideId not between", value1, value2, "guideid");
            return (Criteria) this;
        }

        public Criteria andOffidIsNull() {
            addCriterion("offId is null");
            return (Criteria) this;
        }

        public Criteria andOffidIsNotNull() {
            addCriterion("offId is not null");
            return (Criteria) this;
        }

        public Criteria andOffidEqualTo(Integer value) {
            addCriterion("offId =", value, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidNotEqualTo(Integer value) {
            addCriterion("offId <>", value, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidGreaterThan(Integer value) {
            addCriterion("offId >", value, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("offId >=", value, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidLessThan(Integer value) {
            addCriterion("offId <", value, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidLessThanOrEqualTo(Integer value) {
            addCriterion("offId <=", value, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidIn(List<Integer> values) {
            addCriterion("offId in", values, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidNotIn(List<Integer> values) {
            addCriterion("offId not in", values, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidBetween(Integer value1, Integer value2) {
            addCriterion("offId between", value1, value2, "offid");
            return (Criteria) this;
        }

        public Criteria andOffidNotBetween(Integer value1, Integer value2) {
            addCriterion("offId not between", value1, value2, "offid");
            return (Criteria) this;
        }

        public Criteria andLogcontentIsNull() {
            addCriterion("logContent is null");
            return (Criteria) this;
        }

        public Criteria andLogcontentIsNotNull() {
            addCriterion("logContent is not null");
            return (Criteria) this;
        }

        public Criteria andLogcontentEqualTo(String value) {
            addCriterion("logContent =", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentNotEqualTo(String value) {
            addCriterion("logContent <>", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentGreaterThan(String value) {
            addCriterion("logContent >", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentGreaterThanOrEqualTo(String value) {
            addCriterion("logContent >=", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentLessThan(String value) {
            addCriterion("logContent <", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentLessThanOrEqualTo(String value) {
            addCriterion("logContent <=", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentLike(String value) {
            addCriterion("logContent like", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentNotLike(String value) {
            addCriterion("logContent not like", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentIn(List<String> values) {
            addCriterion("logContent in", values, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentNotIn(List<String> values) {
            addCriterion("logContent not in", values, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentBetween(String value1, String value2) {
            addCriterion("logContent between", value1, value2, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentNotBetween(String value1, String value2) {
            addCriterion("logContent not between", value1, value2, "logcontent");
            return (Criteria) this;
        }

        public Criteria andHousestandardIsNull() {
            addCriterion("houseStandard is null");
            return (Criteria) this;
        }

        public Criteria andHousestandardIsNotNull() {
            addCriterion("houseStandard is not null");
            return (Criteria) this;
        }

        public Criteria andHousestandardEqualTo(String value) {
            addCriterion("houseStandard =", value, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardNotEqualTo(String value) {
            addCriterion("houseStandard <>", value, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardGreaterThan(String value) {
            addCriterion("houseStandard >", value, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardGreaterThanOrEqualTo(String value) {
            addCriterion("houseStandard >=", value, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardLessThan(String value) {
            addCriterion("houseStandard <", value, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardLessThanOrEqualTo(String value) {
            addCriterion("houseStandard <=", value, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardLike(String value) {
            addCriterion("houseStandard like", value, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardNotLike(String value) {
            addCriterion("houseStandard not like", value, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardIn(List<String> values) {
            addCriterion("houseStandard in", values, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardNotIn(List<String> values) {
            addCriterion("houseStandard not in", values, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardBetween(String value1, String value2) {
            addCriterion("houseStandard between", value1, value2, "housestandard");
            return (Criteria) this;
        }

        public Criteria andHousestandardNotBetween(String value1, String value2) {
            addCriterion("houseStandard not between", value1, value2, "housestandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardIsNull() {
            addCriterion("foodStandard is null");
            return (Criteria) this;
        }

        public Criteria andFoodstandardIsNotNull() {
            addCriterion("foodStandard is not null");
            return (Criteria) this;
        }

        public Criteria andFoodstandardEqualTo(String value) {
            addCriterion("foodStandard =", value, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardNotEqualTo(String value) {
            addCriterion("foodStandard <>", value, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardGreaterThan(String value) {
            addCriterion("foodStandard >", value, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardGreaterThanOrEqualTo(String value) {
            addCriterion("foodStandard >=", value, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardLessThan(String value) {
            addCriterion("foodStandard <", value, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardLessThanOrEqualTo(String value) {
            addCriterion("foodStandard <=", value, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardLike(String value) {
            addCriterion("foodStandard like", value, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardNotLike(String value) {
            addCriterion("foodStandard not like", value, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardIn(List<String> values) {
            addCriterion("foodStandard in", values, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardNotIn(List<String> values) {
            addCriterion("foodStandard not in", values, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardBetween(String value1, String value2) {
            addCriterion("foodStandard between", value1, value2, "foodstandard");
            return (Criteria) this;
        }

        public Criteria andFoodstandardNotBetween(String value1, String value2) {
            addCriterion("foodStandard not between", value1, value2, "foodstandard");
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
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
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