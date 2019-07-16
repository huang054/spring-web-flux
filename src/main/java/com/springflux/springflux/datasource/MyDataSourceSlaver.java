package com.springflux.springflux.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
@ConfigurationProperties(prefix = "spring.datasource.slave")
public class MyDataSourceSlaver {

    private String url;
    private String username;
    private String driverClassName;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  /*  @Bean
    public HikariDataSource slaveDataSource(){
        DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
        DataSource dataSource=  dataSourceBuilder.driverClassName(driverClassName)
                .url(url)
                .username(username)
                .password(password)
                .build();
        HikariDataSource hikariDataSource=new HikariDataSource();
        hikariDataSource.setDataSource(dataSource);
        return hikariDataSource;
    }*/
}
