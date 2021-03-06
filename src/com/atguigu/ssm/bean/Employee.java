package com.atguigu.ssm.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {

	private Integer id;
	
	private String lastName;

	private String email;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createTime;
	
	private Department dept;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
