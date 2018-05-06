package com.zxh.job.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Parttime {
    private Integer pt_id;

    private Integer e_id;

    private String pt_name;

    private Float pt_money;

    private String pt_detail;

    private Date pt_starttime;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date pt_stoptime;

    private String pt_province;

    private String pt_city;

    private String pt_area;

    private String pt_address;

    private Boolean pt_review;

    private Date pt_reviewtime;
    
    //非数据库字段
    private Enterprise enterprise;

    public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public Integer getPt_id() {
        return pt_id;
    }

    public void setPt_id(Integer pt_id) {
        this.pt_id = pt_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getPt_name() {
        return pt_name;
    }

    public void setPt_name(String pt_name) {
        this.pt_name = pt_name == null ? null : pt_name.trim();
    }

    public Float getPt_money() {
        return pt_money;
    }

    public void setPt_money(Float pt_money) {
        this.pt_money = pt_money;
    }

    public String getPt_detail() {
        return pt_detail;
    }

    public void setPt_detail(String pt_detail) {
        this.pt_detail = pt_detail == null ? null : pt_detail.trim();
    }

    public Date getPt_starttime() {
        return pt_starttime;
    }

    public void setPt_starttime(Date pt_starttime) {
        this.pt_starttime = pt_starttime;
    }

    public Date getPt_stoptime() {
        return pt_stoptime;
    }

    public void setPt_stoptime(Date pt_stoptime) {
        this.pt_stoptime = pt_stoptime;
    }

    public String getPt_province() {
        return pt_province;
    }

    public void setPt_province(String pt_province) {
        this.pt_province = pt_province == null ? null : pt_province.trim();
    }

    public String getPt_city() {
        return pt_city;
    }

    public void setPt_city(String pt_city) {
        this.pt_city = pt_city == null ? null : pt_city.trim();
    }

    public String getPt_area() {
        return pt_area;
    }

    public void setPt_area(String pt_area) {
        this.pt_area = pt_area == null ? null : pt_area.trim();
    }

    public String getPt_address() {
        return pt_address;
    }

    public void setPt_address(String pt_address) {
        this.pt_address = pt_address == null ? null : pt_address.trim();
    }

    public Boolean getPt_review() {
        return pt_review;
    }

    public void setPt_review(Boolean pt_review) {
        this.pt_review = pt_review;
    }

    public Date getPt_reviewtime() {
        return pt_reviewtime;
    }

    public void setPt_reviewtime(Date pt_reviewtime) {
        this.pt_reviewtime = pt_reviewtime;
    }
}