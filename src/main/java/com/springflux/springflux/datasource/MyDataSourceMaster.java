/*
package com.springflux.springflux.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@Configuration
@ConfigurationProperties(prefix = "spring.datasource.master")
public class MyDataSourceMaster {

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

    @Bean
    //@Primary
    public DataSource masterDataSource(){

        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driverClassName);
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

    */
/*    DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
      DataSource dataSource=  dataSourceBuilder.driverClassName(driverClassName)
                .url(url)
                .username(username)
                .password(password)
                .build();*//*

        HikariDataSource hikariDataSource=new HikariDataSource(config);

      return hikariDataSource;
    }


}
*/
