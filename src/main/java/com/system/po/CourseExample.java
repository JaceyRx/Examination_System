package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Integer value) {
            addCriterion("teacherID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Integer value) {
            addCriterion("teacherID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Integer value) {
            addCriterion("teacherID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Integer value) {
            addCriterion("teacherID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("teacherID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Integer> values) {
            addCriterion("teacherID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Integer> values) {
            addCriterion("teacherID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("teacherID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIsNull() {
            addCriterion("courseTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIsNotNull() {
            addCriterion("courseTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetimeEqualTo(String value) {
            addCriterion("courseTime =", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotEqualTo(String value) {
            addCriterion("courseTime <>", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeGreaterThan(String value) {
            addCriterion("courseTime >", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeGreaterThanOrEqualTo(String value) {
            addCriterion("courseTime >=", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLessThan(String value) {
            addCriterion("courseTime <", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLessThanOrEqualTo(String value) {
            addCriterion("courseTime <=", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLike(String value) {
            addCriterion("courseTime like", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotLike(String value) {
            addCriterion("courseTime not like", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIn(List<String> values) {
            addCriterion("courseTime in", values, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotIn(List<String> values) {
            addCriterion("courseTime not in", values, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeBetween(String value1, String value2) {
            addCriterion("courseTime between", value1, value2, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotBetween(String value1, String value2) {
            addCriterion("courseTime not between", value1, value2, "coursetime");
            return (Criteria) this;
        }

        public Criteria andClassroomIsNull() {
            addCriterion("classRoom is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIsNotNull() {
            addCriterion("classRoom is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomEqualTo(String value) {
            addCriterion("classRoom =", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotEqualTo(String value) {
            addCriterion("classRoom <>", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomGreaterThan(String value) {
            addCriterion("classRoom >", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomGreaterThanOrEqualTo(String value) {
            addCriterion("classRoom >=", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLessThan(String value) {
            addCriterion("classRoom <", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLessThanOrEqualTo(String value) {
            addCriterion("classRoom <=", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLike(String value) {
            addCriterion("classRoom like", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotLike(String value) {
            addCriterion("classRoom not like", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomIn(List<String> values) {
            addCriterion("classRoom in", values, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotIn(List<String> values) {
            addCriterion("classRoom not in", values, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomBetween(String value1, String value2) {
            addCriterion("classRoom between", value1, value2, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotBetween(String value1, String value2) {
            addCriterion("classRoom not between", value1, value2, "classroom");
            return (Criteria) this;
        }

        public Criteria andCourseweekIsNull() {
            addCriterion("courseWeek is null");
            return (Criteria) this;
        }

        public Criteria andCourseweekIsNotNull() {
            addCriterion("courseWeek is not null");
            return (Criteria) this;
        }

        public Criteria andCourseweekEqualTo(Integer value) {
            addCriterion("courseWeek =", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekNotEqualTo(Integer value) {
            addCriterion("courseWeek <>", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekGreaterThan(Integer value) {
            addCriterion("courseWeek >", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseWeek >=", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekLessThan(Integer value) {
            addCriterion("courseWeek <", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekLessThanOrEqualTo(Integer value) {
            addCriterion("courseWeek <=", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekIn(List<Integer> values) {
            addCriterion("courseWeek in", values, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekNotIn(List<Integer> values) {
            addCriterion("courseWeek not in", values, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekBetween(Integer value1, Integer value2) {
            addCriterion("courseWeek between", value1, value2, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekNotBetween(Integer value1, Integer value2) {
            addCriterion("courseWeek not between", value1, value2, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("courseType is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("courseType is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("courseType =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("courseType <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("courseType >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("courseType >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("courseType <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("courseType <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("courseType like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("courseType not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("courseType in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("courseType not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("courseType between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("courseType not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNull() {
            addCriterion("collegeID is null");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNotNull() {
            addCriterion("collegeID is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeidEqualTo(Integer value) {
            addCriterion("collegeID =", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotEqualTo(Integer value) {
            addCriterion("collegeID <>", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThan(Integer value) {
            addCriterion("collegeID >", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collegeID >=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThan(Integer value) {
            addCriterion("collegeID <", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThanOrEqualTo(Integer value) {
            addCriterion("collegeID <=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidIn(List<Integer> values) {
            addCriterion("collegeID in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotIn(List<Integer> values) {
            addCriterion("collegeID not in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidBetween(Integer value1, Integer value2) {
            addCriterion("collegeID between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotBetween(Integer value1, Integer value2) {
            addCriterion("collegeID not between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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