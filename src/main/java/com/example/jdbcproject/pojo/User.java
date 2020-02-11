package com.example.jdbcproject.pojo;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-11 22:54
 * @Version: 1.00
 */

public class User {

	private Integer id;

	private String name;

	private String tel;

	private String email;

	public User() {
	}

	public User(Integer id, String name, String tel, String email) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
