package com.zxh.job.pojo;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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

        public Criteria andE_nameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andE_nameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andE_nameEqualTo(String value) {
            addCriterion("e_name =", value, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameGreaterThan(String value) {
            addCriterion("e_name >", value, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameLessThan(String value) {
            addCriterion("e_name <", value, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameLike(String value) {
            addCriterion("e_name like", value, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameNotLike(String value) {
            addCriterion("e_name not like", value, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameIn(List<String> values) {
            addCriterion("e_name in", values, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_nameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "e_name");
            return (Criteria) this;
        }

        public Criteria andE_passwordIsNull() {
            addCriterion("e_password is null");
            return (Criteria) this;
        }

        public Criteria andE_passwordIsNotNull() {
            addCriterion("e_password is not null");
            return (Criteria) this;
        }

        public Criteria andE_passwordEqualTo(String value) {
            addCriterion("e_password =", value, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordNotEqualTo(String value) {
            addCriterion("e_password <>", value, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordGreaterThan(String value) {
            addCriterion("e_password >", value, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("e_password >=", value, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordLessThan(String value) {
            addCriterion("e_password <", value, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordLessThanOrEqualTo(String value) {
            addCriterion("e_password <=", value, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordLike(String value) {
            addCriterion("e_password like", value, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordNotLike(String value) {
            addCriterion("e_password not like", value, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordIn(List<String> values) {
            addCriterion("e_password in", values, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordNotIn(List<String> values) {
            addCriterion("e_password not in", values, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordBetween(String value1, String value2) {
            addCriterion("e_password between", value1, value2, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_passwordNotBetween(String value1, String value2) {
            addCriterion("e_password not between", value1, value2, "e_password");
            return (Criteria) this;
        }

        public Criteria andE_fullnameIsNull() {
            addCriterion("e_fullname is null");
            return (Criteria) this;
        }

        public Criteria andE_fullnameIsNotNull() {
            addCriterion("e_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andE_fullnameEqualTo(String value) {
            addCriterion("e_fullname =", value, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameNotEqualTo(String value) {
            addCriterion("e_fullname <>", value, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameGreaterThan(String value) {
            addCriterion("e_fullname >", value, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameGreaterThanOrEqualTo(String value) {
            addCriterion("e_fullname >=", value, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameLessThan(String value) {
            addCriterion("e_fullname <", value, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameLessThanOrEqualTo(String value) {
            addCriterion("e_fullname <=", value, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameLike(String value) {
            addCriterion("e_fullname like", value, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameNotLike(String value) {
            addCriterion("e_fullname not like", value, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameIn(List<String> values) {
            addCriterion("e_fullname in", values, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameNotIn(List<String> values) {
            addCriterion("e_fullname not in", values, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameBetween(String value1, String value2) {
            addCriterion("e_fullname between", value1, value2, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_fullnameNotBetween(String value1, String value2) {
            addCriterion("e_fullname not between", value1, value2, "e_fullname");
            return (Criteria) this;
        }

        public Criteria andE_linkmanIsNull() {
            addCriterion("e_linkman is null");
            return (Criteria) this;
        }

        public Criteria andE_linkmanIsNotNull() {
            addCriterion("e_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andE_linkmanEqualTo(String value) {
            addCriterion("e_linkman =", value, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanNotEqualTo(String value) {
            addCriterion("e_linkman <>", value, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanGreaterThan(String value) {
            addCriterion("e_linkman >", value, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanGreaterThanOrEqualTo(String value) {
            addCriterion("e_linkman >=", value, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanLessThan(String value) {
            addCriterion("e_linkman <", value, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanLessThanOrEqualTo(String value) {
            addCriterion("e_linkman <=", value, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanLike(String value) {
            addCriterion("e_linkman like", value, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanNotLike(String value) {
            addCriterion("e_linkman not like", value, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanIn(List<String> values) {
            addCriterion("e_linkman in", values, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanNotIn(List<String> values) {
            addCriterion("e_linkman not in", values, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanBetween(String value1, String value2) {
            addCriterion("e_linkman between", value1, value2, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_linkmanNotBetween(String value1, String value2) {
            addCriterion("e_linkman not between", value1, value2, "e_linkman");
            return (Criteria) this;
        }

        public Criteria andE_emailIsNull() {
            addCriterion("e_email is null");
            return (Criteria) this;
        }

        public Criteria andE_emailIsNotNull() {
            addCriterion("e_email is not null");
            return (Criteria) this;
        }

        public Criteria andE_emailEqualTo(String value) {
            addCriterion("e_email =", value, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailNotEqualTo(String value) {
            addCriterion("e_email <>", value, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailGreaterThan(String value) {
            addCriterion("e_email >", value, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailGreaterThanOrEqualTo(String value) {
            addCriterion("e_email >=", value, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailLessThan(String value) {
            addCriterion("e_email <", value, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailLessThanOrEqualTo(String value) {
            addCriterion("e_email <=", value, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailLike(String value) {
            addCriterion("e_email like", value, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailNotLike(String value) {
            addCriterion("e_email not like", value, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailIn(List<String> values) {
            addCriterion("e_email in", values, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailNotIn(List<String> values) {
            addCriterion("e_email not in", values, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailBetween(String value1, String value2) {
            addCriterion("e_email between", value1, value2, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_emailNotBetween(String value1, String value2) {
            addCriterion("e_email not between", value1, value2, "e_email");
            return (Criteria) this;
        }

        public Criteria andE_phoneIsNull() {
            addCriterion("e_phone is null");
            return (Criteria) this;
        }

        public Criteria andE_phoneIsNotNull() {
            addCriterion("e_phone is not null");
            return (Criteria) this;
        }

        public Criteria andE_phoneEqualTo(String value) {
            addCriterion("e_phone =", value, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneNotEqualTo(String value) {
            addCriterion("e_phone <>", value, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneGreaterThan(String value) {
            addCriterion("e_phone >", value, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("e_phone >=", value, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneLessThan(String value) {
            addCriterion("e_phone <", value, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneLessThanOrEqualTo(String value) {
            addCriterion("e_phone <=", value, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneLike(String value) {
            addCriterion("e_phone like", value, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneNotLike(String value) {
            addCriterion("e_phone not like", value, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneIn(List<String> values) {
            addCriterion("e_phone in", values, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneNotIn(List<String> values) {
            addCriterion("e_phone not in", values, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneBetween(String value1, String value2) {
            addCriterion("e_phone between", value1, value2, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_phoneNotBetween(String value1, String value2) {
            addCriterion("e_phone not between", value1, value2, "e_phone");
            return (Criteria) this;
        }

        public Criteria andE_addressIsNull() {
            addCriterion("e_address is null");
            return (Criteria) this;
        }

        public Criteria andE_addressIsNotNull() {
            addCriterion("e_address is not null");
            return (Criteria) this;
        }

        public Criteria andE_addressEqualTo(String value) {
            addCriterion("e_address =", value, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressNotEqualTo(String value) {
            addCriterion("e_address <>", value, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressGreaterThan(String value) {
            addCriterion("e_address >", value, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressGreaterThanOrEqualTo(String value) {
            addCriterion("e_address >=", value, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressLessThan(String value) {
            addCriterion("e_address <", value, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressLessThanOrEqualTo(String value) {
            addCriterion("e_address <=", value, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressLike(String value) {
            addCriterion("e_address like", value, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressNotLike(String value) {
            addCriterion("e_address not like", value, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressIn(List<String> values) {
            addCriterion("e_address in", values, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressNotIn(List<String> values) {
            addCriterion("e_address not in", values, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressBetween(String value1, String value2) {
            addCriterion("e_address between", value1, value2, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_addressNotBetween(String value1, String value2) {
            addCriterion("e_address not between", value1, value2, "e_address");
            return (Criteria) this;
        }

        public Criteria andE_registrationIsNull() {
            addCriterion("e_registration is null");
            return (Criteria) this;
        }

        public Criteria andE_registrationIsNotNull() {
            addCriterion("e_registration is not null");
            return (Criteria) this;
        }

        public Criteria andE_registrationEqualTo(String value) {
            addCriterion("e_registration =", value, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationNotEqualTo(String value) {
            addCriterion("e_registration <>", value, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationGreaterThan(String value) {
            addCriterion("e_registration >", value, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationGreaterThanOrEqualTo(String value) {
            addCriterion("e_registration >=", value, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationLessThan(String value) {
            addCriterion("e_registration <", value, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationLessThanOrEqualTo(String value) {
            addCriterion("e_registration <=", value, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationLike(String value) {
            addCriterion("e_registration like", value, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationNotLike(String value) {
            addCriterion("e_registration not like", value, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationIn(List<String> values) {
            addCriterion("e_registration in", values, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationNotIn(List<String> values) {
            addCriterion("e_registration not in", values, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationBetween(String value1, String value2) {
            addCriterion("e_registration between", value1, value2, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_registrationNotBetween(String value1, String value2) {
            addCriterion("e_registration not between", value1, value2, "e_registration");
            return (Criteria) this;
        }

        public Criteria andE_reviewIsNull() {
            addCriterion("e_review is null");
            return (Criteria) this;
        }

        public Criteria andE_reviewIsNotNull() {
            addCriterion("e_review is not null");
            return (Criteria) this;
        }

        public Criteria andE_reviewEqualTo(Boolean value) {
            addCriterion("e_review =", value, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewNotEqualTo(Boolean value) {
            addCriterion("e_review <>", value, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewGreaterThan(Boolean value) {
            addCriterion("e_review >", value, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("e_review >=", value, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewLessThan(Boolean value) {
            addCriterion("e_review <", value, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewLessThanOrEqualTo(Boolean value) {
            addCriterion("e_review <=", value, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewIn(List<Boolean> values) {
            addCriterion("e_review in", values, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewNotIn(List<Boolean> values) {
            addCriterion("e_review not in", values, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewBetween(Boolean value1, Boolean value2) {
            addCriterion("e_review between", value1, value2, "e_review");
            return (Criteria) this;
        }

        public Criteria andE_reviewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("e_review not between", value1, value2, "e_review");
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