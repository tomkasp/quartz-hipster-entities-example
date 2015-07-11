package com.example.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class YourDataSourceConfiguration {

    @Bean
    public DataSource dataSource()  {
        BasicDataSource dataSource = new BasicDataSource();
        //TODO - update to RPDDs
        dataSource.setDriverClassName("org.postgresql.ds.PGSimpleDataSource");
        dataSource.setUsername("quartzui");
        dataSource.setPassword("builder");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/quartzui");
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource());
    }

}
