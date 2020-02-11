package com.example.jdbcproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class JdbcprojectApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {

		System.out.println(dataSource.getClass());

		try {
			Connection connection = dataSource.getConnection();
			System.out.println(connection);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("there's exception from datasource connection");
		}
	}

}
