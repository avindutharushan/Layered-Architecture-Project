package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException ;
    void deleteItem(String code) throws SQLException, ClassNotFoundException;
    void saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException ;

    boolean updateItem(String description, BigDecimal unitPrice, int qtyOnHand, String code) throws SQLException, ClassNotFoundException;
    boolean existItem(String code) throws SQLException, ClassNotFoundException ;
    ResultSet generateNewId() throws SQLException, ClassNotFoundException ;
    ResultSet findItem(String s) throws SQLException, ClassNotFoundException ;

}
