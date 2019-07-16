package com.springflux.springflux.respoitry;

import com.springflux.springflux.bean.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class UserDao {

   // @Resource(name = "masterDataSource")
    private DataSource dataSource;

    public UserDao( DataSource dataSource) {
        this.dataSource = dataSource;
    }




    public User insertUser(String userName) throws SQLException {
    /*    System.out.println("datasource--------------->"+dataSource);
        Connection connection=dataSource.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("select * from qyy_email_send_record");
        preparedStatement.execute();
        ResultSet resultSet=preparedStatement.getResultSet();

        System.out.println(resultSet);
        if (null!=connection)
        connection.close();*/
        User user=new User();
        user.setName(userName);
        user.setId(1);
        return user;
    }
}
