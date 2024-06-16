package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.view.tdm.CustomerTM;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface CustomerDAO {
     ArrayList<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException ;
     void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;
     void updateCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException;
     boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;
     void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;
     ResultSet generateNewId() throws SQLException, ClassNotFoundException;
     ResultSet searchCustomer(String s) throws SQLException, ClassNotFoundException ;

}
