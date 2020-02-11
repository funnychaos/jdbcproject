package com.example.jdbcproject.controller;

import com.example.jdbcproject.mapper.UserMapper;
import com.example.jdbcproject.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-11 23:27
 * @Version: 1.00
 */
@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;

	/*查询*/
	@GetMapping("/queryUserList")
	public List<User> queryUserList(){
		List<User> users = userMapper.queryUserList();
		return users;
	}


	/*根据Id查询*/
	/*User queryUserById(int id);*/

	/*新增*/
	/*int addUser(User user);*/

	/*更新*/
	/*int updateUser(User user);*/

	/*删除*/
	/*int deleteUser(int id);*/
}
