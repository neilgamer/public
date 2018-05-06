package com.zxh.job.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
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

        public Criteria andP_idIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andP_idIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andP_idEqualTo(Integer value) {
            addCriterion("p_id =", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idGreaterThan(Integer value) {
            addCriterion("p_id >", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idLessThan(Integer value) {
            addCriterion("p_id <", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idIn(List<Integer> values) {
            addCriterion("p_id in", values, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_nameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andP_nameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andP_nameEqualTo(String value) {
            addCriterion("p_name =", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameGreaterThan(String value) {
            addCriterion("p_name >", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameLessThan(String value) {
            addCriterion("p_name <", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameLike(String value) {
            addCriterion("p_name like", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameNotLike(String value) {
            addCriterion("p_name not like", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameIn(List<String> values) {
            addCriterion("p_name in", values, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_passwordIsNull() {
            addCriterion("p_password is null");
            return (Criteria) this;
        }

        public Criteria andP_passwordIsNotNull() {
            addCriterion("p_password is not null");
            return (Criteria) this;
        }

        public Criteria andP_passwordEqualTo(String value) {
            addCriterion("p_password =", value, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordNotEqualTo(String value) {
            addCriterion("p_password <>", value, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordGreaterThan(String value) {
            addCriterion("p_password >", value, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("p_password >=", value, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordLessThan(String value) {
            addCriterion("p_password <", value, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordLessThanOrEqualTo(String value) {
            addCriterion("p_password <=", value, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordLike(String value) {
            addCriterion("p_password like", value, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordNotLike(String value) {
            addCriterion("p_password not like", value, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordIn(List<String> values) {
            addCriterion("p_password in", values, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordNotIn(List<String> values) {
            addCriterion("p_password not in", values, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordBetween(String value1, String value2) {
            addCriterion("p_password between", value1, value2, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_passwordNotBetween(String value1, String value2) {
            addCriterion("p_password not between", value1, value2, "p_password");
            return (Criteria) this;
        }

        public Criteria andP_fullnameIsNull() {
            addCriterion("p_fullname is null");
            return (Criteria) this;
        }

        public Criteria andP_fullnameIsNotNull() {
            addCriterion("p_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andP_fullnameEqualTo(String value) {
            addCriterion("p_fullname =", value, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameNotEqualTo(String value) {
            addCriterion("p_fullname <>", value, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameGreaterThan(String value) {
            addCriterion("p_fullname >", value, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameGreaterThanOrEqualTo(String value) {
            addCriterion("p_fullname >=", value, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameLessThan(String value) {
            addCriterion("p_fullname <", value, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameLessThanOrEqualTo(String value) {
            addCriterion("p_fullname <=", value, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameLike(String value) {
            addCriterion("p_fullname like", value, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameNotLike(String value) {
            addCriterion("p_fullname not like", value, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameIn(List<String> values) {
            addCriterion("p_fullname in", values, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameNotIn(List<String> values) {
            addCriterion("p_fullname not in", values, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameBetween(String value1, String value2) {
            addCriterion("p_fullname between", value1, value2, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_fullnameNotBetween(String value1, String value2) {
            addCriterion("p_fullname not between", value1, value2, "p_fullname");
            return (Criteria) this;
        }

        public Criteria andP_emailIsNull() {
            addCriterion("p_email is null");
            return (Criteria) this;
        }

        public Criteria andP_emailIsNotNull() {
            addCriterion("p_email is not null");
            return (Criteria) this;
        }

        public Criteria andP_emailEqualTo(String value) {
            addCriterion("p_email =", value, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailNotEqualTo(String value) {
            addCriterion("p_email <>", value, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailGreaterThan(String value) {
            addCriterion("p_email >", value, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailGreaterThanOrEqualTo(String value) {
            addCriterion("p_email >=", value, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailLessThan(String value) {
            addCriterion("p_email <", value, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailLessThanOrEqualTo(String value) {
            addCriterion("p_email <=", value, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailLike(String value) {
            addCriterion("p_email like", value, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailNotLike(String value) {
            addCriterion("p_email not like", value, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailIn(List<String> values) {
            addCriterion("p_email in", values, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailNotIn(List<String> values) {
            addCriterion("p_email not in", values, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailBetween(String value1, String value2) {
            addCriterion("p_email between", value1, value2, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_emailNotBetween(String value1, String value2) {
            addCriterion("p_email not between", value1, value2, "p_email");
            return (Criteria) this;
        }

        public Criteria andP_phoneIsNull() {
            addCriterion("p_phone is null");
            return (Criteria) this;
        }

        public Criteria andP_phoneIsNotNull() {
            addCriterion("p_phone is not null");
            return (Criteria) this;
        }

        public Criteria andP_phoneEqualTo(String value) {
            addCriterion("p_phone =", value, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneNotEqualTo(String value) {
            addCriterion("p_phone <>", value, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneGreaterThan(String value) {
            addCriterion("p_phone >", value, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("p_phone >=", value, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneLessThan(String value) {
            addCriterion("p_phone <", value, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneLessThanOrEqualTo(String value) {
            addCriterion("p_phone <=", value, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneLike(String value) {
            addCriterion("p_phone like", value, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneNotLike(String value) {
            addCriterion("p_phone not like", value, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneIn(List<String> values) {
            addCriterion("p_phone in", values, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneNotIn(List<String> values) {
            addCriterion("p_phone not in", values, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneBetween(String value1, String value2) {
            addCriterion("p_phone between", value1, value2, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_phoneNotBetween(String value1, String value2) {
            addCriterion("p_phone not between", value1, value2, "p_phone");
            return (Criteria) this;
        }

        public Criteria andP_sexIsNull() {
            addCriterion("p_sex is null");
            return (Criteria) this;
        }

        public Criteria andP_sexIsNotNull() {
            addCriterion("p_sex is not null");
            return (Criteria) this;
        }

        public Criteria andP_sexEqualTo(Boolean value) {
            addCriterion("p_sex =", value, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexNotEqualTo(Boolean value) {
            addCriterion("p_sex <>", value, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexGreaterThan(Boolean value) {
            addCriterion("p_sex >", value, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("p_sex >=", value, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexLessThan(Boolean value) {
            addCriterion("p_sex <", value, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexLessThanOrEqualTo(Boolean value) {
            addCriterion("p_sex <=", value, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexIn(List<Boolean> values) {
            addCriterion("p_sex in", values, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexNotIn(List<Boolean> values) {
            addCriterion("p_sex not in", values, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexBetween(Boolean value1, Boolean value2) {
            addCriterion("p_sex between", value1, value2, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_sexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("p_sex not between", value1, value2, "p_sex");
            return (Criteria) this;
        }

        public Criteria andP_birthdayIsNull() {
            addCriterion("p_birthday is null");
            return (Criteria) this;
        }

        public Criteria andP_birthdayIsNotNull() {
            addCriterion("p_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andP_birthdayEqualTo(Date value) {
            addCriterionForJDBCDate("p_birthday =", value, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("p_birthday <>", value, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("p_birthday >", value, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_birthday >=", value, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayLessThan(Date value) {
            addCriterionForJDBCDate("p_birthday <", value, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_birthday <=", value, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayIn(List<Date> values) {
            addCriterionForJDBCDate("p_birthday in", values, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("p_birthday not in", values, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_birthday between", value1, value2, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_birthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_birthday not between", value1, value2, "p_birthday");
            return (Criteria) this;
        }

        public Criteria andP_schoolIsNull() {
            addCriterion("p_school is null");
            return (Criteria) this;
        }

        public Criteria andP_schoolIsNotNull() {
            addCriterion("p_school is not null");
            return (Criteria) this;
        }

        public Criteria andP_schoolEqualTo(String value) {
            addCriterion("p_school =", value, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolNotEqualTo(String value) {
            addCriterion("p_school <>", value, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolGreaterThan(String value) {
            addCriterion("p_school >", value, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolGreaterThanOrEqualTo(String value) {
            addCriterion("p_school >=", value, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolLessThan(String value) {
            addCriterion("p_school <", value, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolLessThanOrEqualTo(String value) {
            addCriterion("p_school <=", value, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolLike(String value) {
            addCriterion("p_school like", value, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolNotLike(String value) {
            addCriterion("p_school not like", value, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolIn(List<String> values) {
            addCriterion("p_school in", values, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolNotIn(List<String> values) {
            addCriterion("p_school not in", values, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolBetween(String value1, String value2) {
            addCriterion("p_school between", value1, value2, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_schoolNotBetween(String value1, String value2) {
            addCriterion("p_school not between", value1, value2, "p_school");
            return (Criteria) this;
        }

        public Criteria andP_graduateIsNull() {
            addCriterion("p_graduate is null");
            return (Criteria) this;
        }

        public Criteria andP_graduateIsNotNull() {
            addCriterion("p_graduate is not null");
            return (Criteria) this;
        }

        public Criteria andP_graduateEqualTo(Boolean value) {
            addCriterion("p_graduate =", value, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateNotEqualTo(Boolean value) {
            addCriterion("p_graduate <>", value, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateGreaterThan(Boolean value) {
            addCriterion("p_graduate >", value, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("p_graduate >=", value, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateLessThan(Boolean value) {
            addCriterion("p_graduate <", value, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateLessThanOrEqualTo(Boolean value) {
            addCriterion("p_graduate <=", value, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateIn(List<Boolean> values) {
            addCriterion("p_graduate in", values, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateNotIn(List<Boolean> values) {
            addCriterion("p_graduate not in", values, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateBetween(Boolean value1, Boolean value2) {
            addCriterion("p_graduate between", value1, value2, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_graduateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("p_graduate not between", value1, value2, "p_graduate");
            return (Criteria) this;
        }

        public Criteria andP_introductionIsNull() {
            addCriterion("p_introduction is null");
            return (Criteria) this;
        }

        public Criteria andP_introductionIsNotNull() {
            addCriterion("p_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andP_introductionEqualTo(String value) {
            addCriterion("p_introduction =", value, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionNotEqualTo(String value) {
            addCriterion("p_introduction <>", value, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionGreaterThan(String value) {
            addCriterion("p_introduction >", value, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionGreaterThanOrEqualTo(String value) {
            addCriterion("p_introduction >=", value, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionLessThan(String value) {
            addCriterion("p_introduction <", value, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionLessThanOrEqualTo(String value) {
            addCriterion("p_introduction <=", value, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionLike(String value) {
            addCriterion("p_introduction like", value, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionNotLike(String value) {
            addCriterion("p_introduction not like", value, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionIn(List<String> values) {
            addCriterion("p_introduction in", values, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionNotIn(List<String> values) {
            addCriterion("p_introduction not in", values, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionBetween(String value1, String value2) {
            addCriterion("p_introduction between", value1, value2, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_introductionNotBetween(String value1, String value2) {
            addCriterion("p_introduction not between", value1, value2, "p_introduction");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsIsNull() {
            addCriterion("p_qualifications is null");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsIsNotNull() {
            addCriterion("p_qualifications is not null");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsEqualTo(String value) {
            addCriterion("p_qualifications =", value, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsNotEqualTo(String value) {
            addCriterion("p_qualifications <>", value, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsGreaterThan(String value) {
            addCriterion("p_qualifications >", value, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsGreaterThanOrEqualTo(String value) {
            addCriterion("p_qualifications >=", value, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsLessThan(String value) {
            addCriterion("p_qualifications <", value, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsLessThanOrEqualTo(String value) {
            addCriterion("p_qualifications <=", value, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsLike(String value) {
            addCriterion("p_qualifications like", value, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsNotLike(String value) {
            addCriterion("p_qualifications not like", value, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsIn(List<String> values) {
            addCriterion("p_qualifications in", values, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsNotIn(List<String> values) {
            addCriterion("p_qualifications not in", values, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsBetween(String value1, String value2) {
            addCriterion("p_qualifications between", value1, value2, "p_qualifications");
            return (Criteria) this;
        }

        public Criteria andP_qualificationsNotBetween(String value1, String value2) {
            addCriterion("p_qualifications not between", value1, value2, "p_qualifications");
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