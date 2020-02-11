package com.example.jdbcproject.mapper;

import com.example.jdbcproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:  @Mapper注解表示这是一个maybatis的mapper类
 * @Author: solar
 * @Date: 2020-02-11 22:56
 * @Version: 1.00
 */
@Mapper
@Repository
public interface UserMapper {

	/*查询*/
	List<User> queryUserList();

	/*根据Id查询*/
	User queryUserById(int id);

	/*新增*/
	int addUser(User user);

	/*更新*/
	int updateUser(User user);

	/*删除*/
	int deleteUser(int id);
}
