package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GuideScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuideScheduleExample() {
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

        public Criteria andGuidescheduleidIsNull() {
            addCriterion("guideScheduleId is null");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidIsNotNull() {
            addCriterion("guideScheduleId is not null");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidEqualTo(Integer value) {
            addCriterion("guideScheduleId =", value, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidNotEqualTo(Integer value) {
            addCriterion("guideScheduleId <>", value, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidGreaterThan(Integer value) {
            addCriterion("guideScheduleId >", value, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("guideScheduleId >=", value, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidLessThan(Integer value) {
            addCriterion("guideScheduleId <", value, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidLessThanOrEqualTo(Integer value) {
            addCriterion("guideScheduleId <=", value, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidIn(List<Integer> values) {
            addCriterion("guideScheduleId in", values, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidNotIn(List<Integer> values) {
            addCriterion("guideScheduleId not in", values, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidBetween(Integer value1, Integer value2) {
            addCriterion("guideScheduleId between", value1, value2, "guidescheduleid");
            return (Criteria) this;
        }

        public Criteria andGuidescheduleidNotBetween(Integer value1, Integer value2) {
            addCriterion("guideScheduleId not between", value1, value2, "guidescheduleid");
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

        public Criteria andSchedulestateIsNull() {
            addCriterion("scheduleState is null");
            return (Criteria) this;
        }

        public Criteria andSchedulestateIsNotNull() {
            addCriterion("scheduleState is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulestateEqualTo(Integer value) {
            addCriterion("scheduleState =", value, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateNotEqualTo(Integer value) {
            addCriterion("scheduleState <>", value, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateGreaterThan(Integer value) {
            addCriterion("scheduleState >", value, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduleState >=", value, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateLessThan(Integer value) {
            addCriterion("scheduleState <", value, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateLessThanOrEqualTo(Integer value) {
            addCriterion("scheduleState <=", value, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateIn(List<Integer> values) {
            addCriterion("scheduleState in", values, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateNotIn(List<Integer> values) {
            addCriterion("scheduleState not in", values, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateBetween(Integer value1, Integer value2) {
            addCriterion("scheduleState between", value1, value2, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulestateNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduleState not between", value1, value2, "schedulestate");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeIsNull() {
            addCriterion("scheduleBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeIsNotNull() {
            addCriterion("scheduleBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeEqualTo(Date value) {
            addCriterionForJDBCDate("scheduleBeginTime =", value, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("scheduleBeginTime <>", value, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("scheduleBeginTime >", value, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scheduleBeginTime >=", value, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeLessThan(Date value) {
            addCriterionForJDBCDate("scheduleBeginTime <", value, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scheduleBeginTime <=", value, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeIn(List<Date> values) {
            addCriterionForJDBCDate("scheduleBeginTime in", values, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("scheduleBeginTime not in", values, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scheduleBeginTime between", value1, value2, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andSchedulebegintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scheduleBeginTime not between", value1, value2, "schedulebegintime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeIsNull() {
            addCriterion("scheduleEndTime is null");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeIsNotNull() {
            addCriterion("scheduleEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("scheduleEndTime =", value, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("scheduleEndTime <>", value, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("scheduleEndTime >", value, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scheduleEndTime >=", value, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeLessThan(Date value) {
            addCriterionForJDBCDate("scheduleEndTime <", value, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scheduleEndTime <=", value, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("scheduleEndTime in", values, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("scheduleEndTime not in", values, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scheduleEndTime between", value1, value2, "scheduleendtime");
            return (Criteria) this;
        }

        public Criteria andScheduleendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scheduleEndTime not between", value1, value2, "scheduleendtime");
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