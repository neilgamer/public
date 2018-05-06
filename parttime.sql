DROP DATABASE IF EXISTS parttime;
CREATE DATABASE parttime DEFAULT CHARACTER SET utf8;
USE parttime;
CREATE TABLE admin (
	a_id int(11) NOT NULL AUTO_INCREMENT,
	a_name varchar(255) DEFAULT NULL,
	a_password varchar(255) DEFAULT NULL,
	PRIMARY KEY (a_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE person (
	p_id int(11) NOT NULL AUTO_INCREMENT,
	p_name varchar(255) DEFAULT NULL,
	p_password varchar(255) DEFAULT NULL,
	p_fullname varchar(255) DEFAULT NULL,
	p_email varchar(255) DEFAULT NULL,
	p_phone varchar(255) DEFAULT NULL,
	p_sex tinyint(1) DEFAULT NULL,
	p_birthday date DEFAULT NULL,
	p_school varchar(255) DEFAULT NULL,
	p_graduate tinyint(1) DEFAULT NULL,
	p_introduction varchar(4000) DEFAULT NULL,
	p_qualifications varchar(1000) DEFAULT NULL,
	PRIMARY KEY (p_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE enterprise (
	e_id int(11) NOT NULL AUTO_INCREMENT,
	e_name varchar(255) DEFAULT NULL,
	e_password varchar(255) DEFAULT NULL,
	e_fullname varchar(255) DEFAULT NULL,
	e_linkman varchar(255) DEFAULT NULL,
	e_email varchar(255) DEFAULT NULL,
	e_phone varchar(255) DEFAULT NULL,
	e_address varchar(255) DEFAULT NULL,
	e_registration varchar(255) DEFAULT NULL,
	e_review tinyint(1) DEFAULT NULL,
	PRIMARY KEY (e_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE parttime (
	pt_id int(11) NOT NULL AUTO_INCREMENT,
	e_id int(11) DEFAULT NULL,
	pt_name varchar(255) DEFAULT NULL,
	pt_money float DEFAULT NULL,
	pt_detail varchar(4000) DEFAULT NULL,
	pt_starttime date DEFAULT NULL,
	pt_stoptime date DEFAULT NULL,
	pt_province varchar(255) DEFAULT NULL,
	pt_city varchar(255) DEFAULT NULL,
	pt_area varchar(255) DEFAULT NULL,
	pt_address varchar(255) DEFAULT NULL,
	pt_review tinyint(1) DEFAULT NULL,
	pt_reviewtime date DEFAULT NULL,
	PRIMARY KEY (pt_id),
	CONSTRAINT fk_parttime_enterprise FOREIGN KEY (e_id) REFERENCES enterprise (e_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE application (
	id int(11) NOT NULL AUTO_INCREMENT,
	pt_id int(11) DEFAULT NULL,
	createtime datetime DEFAULT NULL,
	p_id int(11) DEFAULT NULL,
	PRIMARY KEY (id),
	CONSTRAINT fk_application_parttime FOREIGN KEY (pt_id) REFERENCES parttime (pt_id),
	CONSTRAINT fk_application_person FOREIGN KEY (p_id) REFERENCES person (p_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;