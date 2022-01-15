/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.majorproject.dao;

import com.mycompany.majorproject.db.MYSQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nikita
 */
public class UserDAO {

    public static boolean checkUser(String p) throws SQLException {
        Connection connection = MYSQLConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from user");
        ResultSet rs = ps.executeQuery();
          String password = null;
        while (rs.next()) {
            password = rs.getString(2);
        }
       if(password.equals(p)){
        return true;   
       }else{
           return false;
       }
    }
}


