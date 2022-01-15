/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.majorproject.dao;

import com.mycompany.majorproject.db.MYSQLConnection;
import com.mycompany.majorproject.pojo.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nikita
 */
public class ProductDAO {

    public static Product findProductByProdId(String prodId) throws SQLException {
        Connection connection = MYSQLConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM PRODUCTS WHERE PROD_ID =?");
        ps.setString(1, prodId);
        ResultSet rs = ps.executeQuery();
        Product product = null;
        while (rs.next()) {
            product = new Product(rs.getString(3), rs.getDouble(4));
        }
        return product;
    }

}
