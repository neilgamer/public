package com.zxh.job.pojo;

public class Enterprise {
    private Integer e_id;

    private String e_name;

    private String e_password;

    private String e_fullname;

    private String e_linkman;

    private String e_email;

    private String e_phone;

    private String e_address;

    private String e_registration;

    private Boolean e_review;

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name == null ? null : e_name.trim();
    }

    public String getE_password() {
        return e_password;
    }

    public void setE_password(String e_password) {
        this.e_password = e_password == null ? null : e_password.trim();
    }

    public String getE_fullname() {
        return e_fullname;
    }

    public void setE_fullname(String e_fullname) {
        this.e_fullname = e_fullname == null ? null : e_fullname.trim();
    }

    public String getE_linkman() {
        return e_linkman;
    }

    public void setE_linkman(String e_linkman) {
        this.e_linkman = e_linkman == null ? null : e_linkman.trim();
    }

    public String getE_email() {
        return e_email;
    }

    public void setE_email(String e_email) {
        this.e_email = e_email == null ? null : e_email.trim();
    }

    public String getE_phone() {
        return e_phone;
    }

    public void setE_phone(String e_phone) {
        this.e_phone = e_phone == null ? null : e_phone.trim();
    }

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address == null ? null : e_address.trim();
    }

    public String getE_registration() {
        return e_registration;
    }

    public void setE_registration(String e_registration) {
        this.e_registration = e_registration == null ? null : e_registration.trim();
    }

    public Boolean getE_review() {
        return e_review;
    }

    public void setE_review(Boolean e_review) {
        this.e_review = e_review;
    }
}