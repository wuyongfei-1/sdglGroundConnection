package com.dyhc.sdglgroundconnection.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LinetemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinetemplateExample() {
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

        public Criteria andLineidIsNull() {
            addCriterion("lineId is null");
            return (Criteria) this;
        }

        public Criteria andLineidIsNotNull() {
            addCriterion("lineId is not null");
            return (Criteria) this;
        }

        public Criteria andLineidEqualTo(Integer value) {
            addCriterion("lineId =", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotEqualTo(Integer value) {
            addCriterion("lineId <>", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThan(Integer value) {
            addCriterion("lineId >", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lineId >=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThan(Integer value) {
            addCriterion("lineId <", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThanOrEqualTo(Integer value) {
            addCriterion("lineId <=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidIn(List<Integer> values) {
            addCriterion("lineId in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotIn(List<Integer> values) {
            addCriterion("lineId not in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidBetween(Integer value1, Integer value2) {
            addCriterion("lineId between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotBetween(Integer value1, Integer value2) {
            addCriterion("lineId not between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLinenameIsNull() {
            addCriterion("lineName is null");
            return (Criteria) this;
        }

        public Criteria andLinenameIsNotNull() {
            addCriterion("lineName is not null");
            return (Criteria) this;
        }

        public Criteria andLinenameEqualTo(String value) {
            addCriterion("lineName =", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotEqualTo(String value) {
            addCriterion("lineName <>", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameGreaterThan(String value) {
            addCriterion("lineName >", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameGreaterThanOrEqualTo(String value) {
            addCriterion("lineName >=", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLessThan(String value) {
            addCriterion("lineName <", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLessThanOrEqualTo(String value) {
            addCriterion("lineName <=", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameLike(String value) {
            addCriterion("lineName like", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotLike(String value) {
            addCriterion("lineName not like", value, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameIn(List<String> values) {
            addCriterion("lineName in", values, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotIn(List<String> values) {
            addCriterion("lineName not in", values, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameBetween(String value1, String value2) {
            addCriterion("lineName between", value1, value2, "linename");
            return (Criteria) this;
        }

        public Criteria andLinenameNotBetween(String value1, String value2) {
            addCriterion("lineName not between", value1, value2, "linename");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updateTime not between", value1, value2, "updatetime");
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