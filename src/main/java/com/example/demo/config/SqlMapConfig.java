package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.ibatis.SqlMapClientFactoryBean;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class SqlMapConfig {

//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource dataSource() {
//		return new DruidDataSource();
//	}

	@Bean(name = "sqlMapClient")
	public SqlMapClientFactoryBean sqlMapClientFactoryBean(JdbcTemplate template) {
		SqlMapClientFactoryBean factoryBean = new SqlMapClientFactoryBean();
		factoryBean.setDataSource(template.getDataSource());
		factoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("ibatis-config.xml"));
		return factoryBean;
	}
}
