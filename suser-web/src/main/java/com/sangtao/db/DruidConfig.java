package com.sangtao.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DruidConfig {
    private Logger logger = LoggerFactory.getLogger(DruidConfig.class);
    @Value("${spring.datasource.master.jdbc-url}")
    private String jdbcUrl;

    @Value("${spring.datasource.master.username}")
    private String username;

    @Value("${spring.datasource.master.password}")
    private String password;

    @Value("${spring.datasource.master.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.master.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.master.minIdle}")
    private int minIdle;

    @Value("${spring.datasource.master.maxActive}")
    private int maxActive;

    @Value("${spring.datasource.master.maxWait}")
    private int maxWait;

    @Value("${spring.datasource.master.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.master.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.master.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.master.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.master.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.master.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.master.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${spring.datasource.master.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.master.filters}")
    private String filters;

    @Value("{spring.datasource.master.connectionProperties}")
    private String connectionProperties;

    @Bean
    public DataSource druidDataSource() {
        DruidDataSource dataSource =  new DruidDataSource();
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setInitialSize(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxActive(maxActive);
        dataSource.setMaxWait(maxWait);
//        dataSource.setRemoveAbandoned(removeAbandoned);
//        dataSource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
//        dataSource.setLogAbandoned(logAbandoned);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            dataSource.setFilters(filters);
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        dataSource.setConnectionProperties(connectionProperties);
        return dataSource;
    }

}
