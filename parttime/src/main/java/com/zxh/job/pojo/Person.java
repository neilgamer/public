package com.zxh.job.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Person {
    private Integer p_id;

    private String p_name;

    private String p_password;

    private String p_fullname;

    private String p_email;

    private String p_phone;

    private Boolean p_sex;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date p_birthday;

    private String p_school;

    private Boolean p_graduate;

    private String p_introduction;

    private String p_qualifications;

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name == null ? null : p_name.trim();
    }

    public String getP_password() {
        return p_password;
    }

    public void setP_password(String p_password) {
        this.p_password = p_password == null ? null : p_password.trim();
    }

    public String getP_fullname() {
        return p_fullname;
    }

    public void setP_fullname(String p_fullname) {
        this.p_fullname = p_fullname == null ? null : p_fullname.trim();
    }

    public String getP_email() {
        return p_email;
    }

    public void setP_email(String p_email) {
        this.p_email = p_email == null ? null : p_email.trim();
    }

    public String getP_phone() {
        return p_phone;
    }

    public void setP_phone(String p_phone) {
        this.p_phone = p_phone == null ? null : p_phone.trim();
    }

    public Boolean getP_sex() {
        return p_sex;
    }

    public void setP_sex(Boolean p_sex) {
        this.p_sex = p_sex;
    }

    public Date getP_birthday() {
        return p_birthday;
    }

    public void setP_birthday(Date p_birthday) {
        this.p_birthday = p_birthday;
    }

    public String getP_school() {
        return p_school;
    }

    public void setP_school(String p_school) {
        this.p_school = p_school == null ? null : p_school.trim();
    }

    public Boolean getP_graduate() {
        return p_graduate;
    }

    public void setP_graduate(Boolean p_graduate) {
        this.p_graduate = p_graduate;
    }

    public String getP_introduction() {
        return p_introduction;
    }

    public void setP_introduction(String p_introduction) {
        this.p_introduction = p_introduction == null ? null : p_introduction.trim();
    }

    public String getP_qualifications() {
        return p_qualifications;
    }

    public void setP_qualifications(String p_qualifications) {
        this.p_qualifications = p_qualifications == null ? null : p_qualifications.trim();
    }
}