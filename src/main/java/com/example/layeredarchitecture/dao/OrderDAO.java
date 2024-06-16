package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    ResultSet generateNewId() throws SQLException, ClassNotFoundException ;

    ResultSet existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    boolean addOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException ;
    void ordersaved() throws SQLException, ClassNotFoundException ;
}
