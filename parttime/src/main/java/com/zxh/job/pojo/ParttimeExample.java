package com.zxh.job.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ParttimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParttimeExample() {
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

        public Criteria andPt_idIsNull() {
            addCriterion("pt_id is null");
            return (Criteria) this;
        }

        public Criteria andPt_idIsNotNull() {
            addCriterion("pt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPt_idEqualTo(Integer value) {
            addCriterion("pt_id =", value, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idNotEqualTo(Integer value) {
            addCriterion("pt_id <>", value, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idGreaterThan(Integer value) {
            addCriterion("pt_id >", value, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_id >=", value, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idLessThan(Integer value) {
            addCriterion("pt_id <", value, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idLessThanOrEqualTo(Integer value) {
            addCriterion("pt_id <=", value, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idIn(List<Integer> values) {
            addCriterion("pt_id in", values, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idNotIn(List<Integer> values) {
            addCriterion("pt_id not in", values, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idBetween(Integer value1, Integer value2) {
            addCriterion("pt_id between", value1, value2, "pt_id");
            return (Criteria) this;
        }

        public Criteria andPt_idNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_id not between", value1, value2, "pt_id");
            return (Criteria) this;
        }

        public Criteria andE_idIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andE_idIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andE_idEqualTo(Integer value) {
            addCriterion("e_id =", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idNotEqualTo(Integer value) {
            addCriterion("e_id <>", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idGreaterThan(Integer value) {
            addCriterion("e_id >", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_id >=", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idLessThan(Integer value) {
            addCriterion("e_id <", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idLessThanOrEqualTo(Integer value) {
            addCriterion("e_id <=", value, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idIn(List<Integer> values) {
            addCriterion("e_id in", values, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idNotIn(List<Integer> values) {
            addCriterion("e_id not in", values, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idBetween(Integer value1, Integer value2) {
            addCriterion("e_id between", value1, value2, "e_id");
            return (Criteria) this;
        }

        public Criteria andE_idNotBetween(Integer value1, Integer value2) {
            addCriterion("e_id not between", value1, value2, "e_id");
            return (Criteria) this;
        }

        public Criteria andPt_nameIsNull() {
            addCriterion("pt_name is null");
            return (Criteria) this;
        }

        public Criteria andPt_nameIsNotNull() {
            addCriterion("pt_name is not null");
            return (Criteria) this;
        }

        public Criteria andPt_nameEqualTo(String value) {
            addCriterion("pt_name =", value, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameNotEqualTo(String value) {
            addCriterion("pt_name <>", value, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameGreaterThan(String value) {
            addCriterion("pt_name >", value, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameGreaterThanOrEqualTo(String value) {
            addCriterion("pt_name >=", value, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameLessThan(String value) {
            addCriterion("pt_name <", value, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameLessThanOrEqualTo(String value) {
            addCriterion("pt_name <=", value, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameLike(String value) {
            addCriterion("pt_name like", value, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameNotLike(String value) {
            addCriterion("pt_name not like", value, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameIn(List<String> values) {
            addCriterion("pt_name in", values, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameNotIn(List<String> values) {
            addCriterion("pt_name not in", values, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameBetween(String value1, String value2) {
            addCriterion("pt_name between", value1, value2, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_nameNotBetween(String value1, String value2) {
            addCriterion("pt_name not between", value1, value2, "pt_name");
            return (Criteria) this;
        }

        public Criteria andPt_moneyIsNull() {
            addCriterion("pt_money is null");
            return (Criteria) this;
        }

        public Criteria andPt_moneyIsNotNull() {
            addCriterion("pt_money is not null");
            return (Criteria) this;
        }

        public Criteria andPt_moneyEqualTo(Float value) {
            addCriterion("pt_money =", value, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyNotEqualTo(Float value) {
            addCriterion("pt_money <>", value, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyGreaterThan(Float value) {
            addCriterion("pt_money >", value, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pt_money >=", value, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyLessThan(Float value) {
            addCriterion("pt_money <", value, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyLessThanOrEqualTo(Float value) {
            addCriterion("pt_money <=", value, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyIn(List<Float> values) {
            addCriterion("pt_money in", values, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyNotIn(List<Float> values) {
            addCriterion("pt_money not in", values, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyBetween(Float value1, Float value2) {
            addCriterion("pt_money between", value1, value2, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_moneyNotBetween(Float value1, Float value2) {
            addCriterion("pt_money not between", value1, value2, "pt_money");
            return (Criteria) this;
        }

        public Criteria andPt_detailIsNull() {
            addCriterion("pt_detail is null");
            return (Criteria) this;
        }

        public Criteria andPt_detailIsNotNull() {
            addCriterion("pt_detail is not null");
            return (Criteria) this;
        }

        public Criteria andPt_detailEqualTo(String value) {
            addCriterion("pt_detail =", value, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailNotEqualTo(String value) {
            addCriterion("pt_detail <>", value, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailGreaterThan(String value) {
            addCriterion("pt_detail >", value, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailGreaterThanOrEqualTo(String value) {
            addCriterion("pt_detail >=", value, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailLessThan(String value) {
            addCriterion("pt_detail <", value, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailLessThanOrEqualTo(String value) {
            addCriterion("pt_detail <=", value, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailLike(String value) {
            addCriterion("pt_detail like", value, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailNotLike(String value) {
            addCriterion("pt_detail not like", value, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailIn(List<String> values) {
            addCriterion("pt_detail in", values, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailNotIn(List<String> values) {
            addCriterion("pt_detail not in", values, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailBetween(String value1, String value2) {
            addCriterion("pt_detail between", value1, value2, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_detailNotBetween(String value1, String value2) {
            addCriterion("pt_detail not between", value1, value2, "pt_detail");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeIsNull() {
            addCriterion("pt_starttime is null");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeIsNotNull() {
            addCriterion("pt_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeEqualTo(Date value) {
            addCriterionForJDBCDate("pt_starttime =", value, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pt_starttime <>", value, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pt_starttime >", value, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pt_starttime >=", value, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeLessThan(Date value) {
            addCriterionForJDBCDate("pt_starttime <", value, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pt_starttime <=", value, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeIn(List<Date> values) {
            addCriterionForJDBCDate("pt_starttime in", values, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pt_starttime not in", values, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pt_starttime between", value1, value2, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_starttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pt_starttime not between", value1, value2, "pt_starttime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeIsNull() {
            addCriterion("pt_stoptime is null");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeIsNotNull() {
            addCriterion("pt_stoptime is not null");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeEqualTo(Date value) {
            addCriterionForJDBCDate("pt_stoptime =", value, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pt_stoptime <>", value, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pt_stoptime >", value, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pt_stoptime >=", value, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeLessThan(Date value) {
            addCriterionForJDBCDate("pt_stoptime <", value, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pt_stoptime <=", value, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeIn(List<Date> values) {
            addCriterionForJDBCDate("pt_stoptime in", values, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pt_stoptime not in", values, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pt_stoptime between", value1, value2, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_stoptimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pt_stoptime not between", value1, value2, "pt_stoptime");
            return (Criteria) this;
        }

        public Criteria andPt_provinceIsNull() {
            addCriterion("pt_province is null");
            return (Criteria) this;
        }

        public Criteria andPt_provinceIsNotNull() {
            addCriterion("pt_province is not null");
            return (Criteria) this;
        }

        public Criteria andPt_provinceEqualTo(String value) {
            addCriterion("pt_province =", value, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceNotEqualTo(String value) {
            addCriterion("pt_province <>", value, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceGreaterThan(String value) {
            addCriterion("pt_province >", value, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceGreaterThanOrEqualTo(String value) {
            addCriterion("pt_province >=", value, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceLessThan(String value) {
            addCriterion("pt_province <", value, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceLessThanOrEqualTo(String value) {
            addCriterion("pt_province <=", value, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceLike(String value) {
            addCriterion("pt_province like", value, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceNotLike(String value) {
            addCriterion("pt_province not like", value, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceIn(List<String> values) {
            addCriterion("pt_province in", values, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceNotIn(List<String> values) {
            addCriterion("pt_province not in", values, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceBetween(String value1, String value2) {
            addCriterion("pt_province between", value1, value2, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_provinceNotBetween(String value1, String value2) {
            addCriterion("pt_province not between", value1, value2, "pt_province");
            return (Criteria) this;
        }

        public Criteria andPt_cityIsNull() {
            addCriterion("pt_city is null");
            return (Criteria) this;
        }

        public Criteria andPt_cityIsNotNull() {
            addCriterion("pt_city is not null");
            return (Criteria) this;
        }

        public Criteria andPt_cityEqualTo(String value) {
            addCriterion("pt_city =", value, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityNotEqualTo(String value) {
            addCriterion("pt_city <>", value, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityGreaterThan(String value) {
            addCriterion("pt_city >", value, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityGreaterThanOrEqualTo(String value) {
            addCriterion("pt_city >=", value, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityLessThan(String value) {
            addCriterion("pt_city <", value, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityLessThanOrEqualTo(String value) {
            addCriterion("pt_city <=", value, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityLike(String value) {
            addCriterion("pt_city like", value, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityNotLike(String value) {
            addCriterion("pt_city not like", value, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityIn(List<String> values) {
            addCriterion("pt_city in", values, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityNotIn(List<String> values) {
            addCriterion("pt_city not in", values, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityBetween(String value1, String value2) {
            addCriterion("pt_city between", value1, value2, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_cityNotBetween(String value1, String value2) {
            addCriterion("pt_city not between", value1, value2, "pt_city");
            return (Criteria) this;
        }

        public Criteria andPt_areaIsNull() {
            addCriterion("pt_area is null");
            return (Criteria) this;
        }

        public Criteria andPt_areaIsNotNull() {
            addCriterion("pt_area is not null");
            return (Criteria) this;
        }

        public Criteria andPt_areaEqualTo(String value) {
            addCriterion("pt_area =", value, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaNotEqualTo(String value) {
            addCriterion("pt_area <>", value, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaGreaterThan(String value) {
            addCriterion("pt_area >", value, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaGreaterThanOrEqualTo(String value) {
            addCriterion("pt_area >=", value, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaLessThan(String value) {
            addCriterion("pt_area <", value, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaLessThanOrEqualTo(String value) {
            addCriterion("pt_area <=", value, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaLike(String value) {
            addCriterion("pt_area like", value, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaNotLike(String value) {
            addCriterion("pt_area not like", value, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaIn(List<String> values) {
            addCriterion("pt_area in", values, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaNotIn(List<String> values) {
            addCriterion("pt_area not in", values, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaBetween(String value1, String value2) {
            addCriterion("pt_area between", value1, value2, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_areaNotBetween(String value1, String value2) {
            addCriterion("pt_area not between", value1, value2, "pt_area");
            return (Criteria) this;
        }

        public Criteria andPt_addressIsNull() {
            addCriterion("pt_address is null");
            return (Criteria) this;
        }

        public Criteria andPt_addressIsNotNull() {
            addCriterion("pt_address is not null");
            return (Criteria) this;
        }

        public Criteria andPt_addressEqualTo(String value) {
            addCriterion("pt_address =", value, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressNotEqualTo(String value) {
            addCriterion("pt_address <>", value, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressGreaterThan(String value) {
            addCriterion("pt_address >", value, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressGreaterThanOrEqualTo(String value) {
            addCriterion("pt_address >=", value, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressLessThan(String value) {
            addCriterion("pt_address <", value, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressLessThanOrEqualTo(String value) {
            addCriterion("pt_address <=", value, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressLike(String value) {
            addCriterion("pt_address like", value, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressNotLike(String value) {
            addCriterion("pt_address not like", value, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressIn(List<String> values) {
            addCriterion("pt_address in", values, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressNotIn(List<String> values) {
            addCriterion("pt_address not in", values, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressBetween(String value1, String value2) {
            addCriterion("pt_address between", value1, value2, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_addressNotBetween(String value1, String value2) {
            addCriterion("pt_address not between", value1, value2, "pt_address");
            return (Criteria) this;
        }

        public Criteria andPt_reviewIsNull() {
            addCriterion("pt_review is null");
            return (Criteria) this;
        }

        public Criteria andPt_reviewIsNotNull() {
            addCriterion("pt_review is not null");
            return (Criteria) this;
        }

        public Criteria andPt_reviewEqualTo(Boolean value) {
            addCriterion("pt_review =", value, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewNotEqualTo(Boolean value) {
            addCriterion("pt_review <>", value, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewGreaterThan(Boolean value) {
            addCriterion("pt_review >", value, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pt_review >=", value, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewLessThan(Boolean value) {
            addCriterion("pt_review <", value, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewLessThanOrEqualTo(Boolean value) {
            addCriterion("pt_review <=", value, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewIn(List<Boolean> values) {
            addCriterion("pt_review in", values, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewNotIn(List<Boolean> values) {
            addCriterion("pt_review not in", values, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewBetween(Boolean value1, Boolean value2) {
            addCriterion("pt_review between", value1, value2, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pt_review not between", value1, value2, "pt_review");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeIsNull() {
            addCriterion("pt_reviewtime is null");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeIsNotNull() {
            addCriterion("pt_reviewtime is not null");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeEqualTo(Date value) {
            addCriterionForJDBCDate("pt_reviewtime =", value, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pt_reviewtime <>", value, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pt_reviewtime >", value, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pt_reviewtime >=", value, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeLessThan(Date value) {
            addCriterionForJDBCDate("pt_reviewtime <", value, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pt_reviewtime <=", value, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeIn(List<Date> values) {
            addCriterionForJDBCDate("pt_reviewtime in", values, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pt_reviewtime not in", values, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pt_reviewtime between", value1, value2, "pt_reviewtime");
            return (Criteria) this;
        }

        public Criteria andPt_reviewtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pt_reviewtime not between", value1, value2, "pt_reviewtime");
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