package com.example.jdbcproject.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: solar
 * @Date: 2020-02-11 19:24
 * @Version: 1.00
 */
@Configuration
public class DruidConfig {

	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource druidDataSource(){
		return new DruidDataSource();
	}

	//后台监控
	@Bean
	public ServletRegistrationBean statViewServlet(){
		ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");

		//后台登陆账号密码配置
		HashMap<String, String> initParametes = new HashMap<>();
		initParametes.put("loginUsername","admin");
		initParametes.put("loginPassword","123456");

		initParametes.put("allow","");//允许谁可以访问
		//initParametes.put("solar","193.167.11.123");	//禁止访问Ip
		bean.setInitParameters(initParametes);
		return bean;
	}

	@Bean
	public FilterRegistrationBean webStartFilter(){
		FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
		bean.setFilter(new WebStatFilter());

		Map<String,String> initParameters = new HashMap<>();
		initParameters.put("exclusions","*.js,*.css,/druid/*");
		bean.setInitParameters(initParameters);
		return bean;
	}



}
