package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.ibatis.SqlMapClientFactoryBean;

@Configuration
public class SqlMapConfig {

	@Bean(name = "sqlMapClient")
	public SqlMapClientFactoryBean sqlMapClientFactoryBean(JdbcTemplate template) {
		SqlMapClientFactoryBean factoryBean = new SqlMapClientFactoryBean();
		factoryBean.setDataSource(template.getDataSource());
		factoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("ibatis-config.xml"));
		return factoryBean;
	}
}
