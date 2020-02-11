package com.example.jdbcproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Description:通过jdebTemplate实现对数据库的操作
 * @Author: solar
 * @Date: 2020-02-09 21:01
 * @Version: 1.00
 */
@RestController
@Controller
public class JDBCController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/*查询*/
	@GetMapping("/queryList")
	public List<Map<String, Object>> userList(){

		String sql = "select * from user";
		List<Map<String, Object>> lists = jdbcTemplate.queryForList(sql);
		for (Map user:lists) {
			System.out.println(user.values());
		}
		return lists;
	}

	/*新增*/
	@GetMapping("/addUser")
	public String addUser(){
		String sql = "insert into user.user (id,name,tel,email) values(4,'solo','1335254822','1836452767@qq.com')";
		int update = jdbcTemplate.update(sql);
		return "add ok";
	}

	/*更新*/
	@GetMapping("/updateUser/{id}")
	public String updateUser(@PathVariable("id") int id){
		String sql = "update user.user set name='haha',tel='1111' where id =" + id;
		jdbcTemplate.update(sql);
		return "update ok";
	}

	/*删除*/
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id){
		String sql = "delete from user.user where id = " + id;
		jdbcTemplate.update(sql);
		return "delete ok";
	}
}
