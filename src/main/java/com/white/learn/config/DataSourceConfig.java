package com.white.learn.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

public class DataSourceConfig {

//	@Configuration
//	@MapperScan(basePackages = "com.white.learn.mapper.primary", sqlSessionTemplateRef = "primarySqlSessionTemplate")
//	static class PrimaryDataSourceConfig {
//		@Primary
//		@Bean("primaryDataSource")
//		@ConfigurationProperties(prefix = "spring.datasource.primary")
//		public DataSource primaryDataSource() {
//			return DataSourceBuilder.create().build();
//		}
//
//		@Primary
//		@Bean("primarySqlSessionFactory")
//		public SqlSessionFactory primarySqlSessionFactory(@Qualifier("primaryDataSource") DataSource dataSource) throws Exception {
//			SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//			bean.setDataSource(dataSource);
//			return bean.getObject();
//		}
//
//		@Primary
//		@Bean("primaryTransactionManager")
//		public DataSourceTransactionManager primaryTransactionManager(@Qualifier("primaryDataSource") DataSource dataSource) {
//			return new DataSourceTransactionManager(dataSource);
//		}
//
//		@Primary
//		@Bean("primarySqlSessionTemplate")
//		public SqlSessionTemplate primarySqlSessionTemplate(@Qualifier("primarySqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//			return new SqlSessionTemplate(sqlSessionFactory);
//		}
//	}



}
