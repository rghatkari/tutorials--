package com.rghatkari.config;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author rghatkari
 * Spring Boot Java Configuration:
 *  -- @Bean annotation tells to spring in spring boot that the return value of this method that is DataSource
 *  needs to be setup and stored as spring bean in spring context.
 *
 *  -- @ConfigurationProperties annotation tells to DataSourceBuilder to use connection and pooling properties
 *  located in application.properties file where the properties begin with the spring.datasource prefix.
 */

@Configuration
public class PersistenceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "datasource.flyway")
    @FlywayDataSource
    public DataSource flywayDataSource(){
        return DataSourceBuilder.create().build();
    }
}
