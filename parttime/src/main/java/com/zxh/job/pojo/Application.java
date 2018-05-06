package com.zxh.job.pojo;

import java.util.Date;

public class Application {
    private Integer id;

    private Integer pt_id;

    private Date createtime;

    private Integer p_id;
    
  //非数据库字段
    private Parttime parttime;
    
    private Person person;
    
    

    public Parttime getParttime() {
		return parttime;
	}

	public void setParttime(Parttime parttime) {
		this.parttime = parttime;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPt_id() {
        return pt_id;
    }

    public void setPt_id(Integer pt_id) {
        this.pt_id = pt_id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }
}