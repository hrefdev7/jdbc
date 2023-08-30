package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dataBaseCon.DatabaseConnection;
import entity.Customers;



public class DAO {  
	
	//************************************************getAllPCustomers*********************************************************//

	
	public static ArrayList<Customers> getAllPCustomers() {
		
		String sql = "select * from customers";

	    ArrayList<Customers> allCustomers = new ArrayList<Customers>();
	    
	    try (
	    		            PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
	    		
	            ResultSet rs = preparedStatement.executeQuery()) {
	        while (rs.next()) {
	        	Customers customers2 = new Customers();
	        	customers2.setId(rs.getInt(1));
	        	
				customers2.setCustomerName(rs.getString(2));
				customers2.setCustomerNumber(rs.getString(3));
				customers2.setCustomerEmail(rs.getString(4));
				customers2.setIt(rs.getString(5));
	            
				allCustomers.add(customers2);
	        }
	    } catch (SQLException ex) {
	    	 ex.printStackTrace();
	    }
	    return allCustomers;

	}
	
	//************************************************searchCustomers*********************************************************//

public static Customers searchCustomers(String name) {
	
	
    try {
        String sql = "SELECT id, customerName FROM Customers WHERE customerName = ?";
        PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String customerName = resultSet.getString("customerName");
            
        }
    } catch (SQLException ex) {    ex.printStackTrace();

    	
     }
	return null;
    
}
//************************************************UPDATE CUSTUMERS*********************************************************//

public static boolean updateCustomer(Customers customers) {
    try {
        String sql = "UPDATE Customers SET customerName = ?, customerNumber = ?, customerEmail = ?, it = ? WHERE id = ?";
        PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, customers.getCustomerName());
        preparedStatement.setString(2, customers.getCustomerNumber());
        preparedStatement.setString(3, customers.getCustomerEmail());
        preparedStatement.setString(4, customers.getIt());
        preparedStatement.setInt(5, customers.getId());
        preparedStatement.execute();
        return true;
    } catch (SQLException ex) {ex.printStackTrace();
     }
    return false;
}
//****************************************DELETE CUSTUMERS*****************************************************************//


public static boolean deleteCustomer(Integer id) {
    try {
        String sql = "DELETE FROM Customers WHERE id = ?";
        PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
         
        return true;
    } catch (SQLException ex) {            

     }
    return false;
}

//****************************************INSERT CUSTUMERS*****************************************************************//




public static boolean insertNewCustomerd( )     {
    try {
        String sql = "INSERT INTO Customers (customerName, customerNumber, customerEmail, it) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, "er");
        preparedStatement.setString(2, "dde");
        preparedStatement.setString(3, "eghvgh");
        preparedStatement.setString(4,"ffffffffff");
        preparedStatement.execute();
   System.out.println("Coustmers Ajouter avec succes");
        return true;
    } catch (SQLException ex) {ex.printStackTrace();
     }
    return false;
}


public static boolean insertNewCustomer(Customers customers) {
    try {
        String sql = "INSERT INTO Customers (customerName, customerNumber, customerEmail, it) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setString(1, customers.getCustomerName());
        preparedStatement.setString(2, customers.getCustomerNumber());
        preparedStatement.setString(3, customers.getCustomerEmail());
        preparedStatement.setString(4, customers.getIt()); 
        preparedStatement.execute();
   System.out.println("Coustmers Ajouter avec succes"+customers.toString());
        return true;
    } catch (SQLException ex) {ex.printStackTrace();
     }
    return false;
}
//**************************************************************************************************************************//
public void createTable() throws SQLException {
	    final String createTableSQL = "CREATE DATABASE MYDB;USE MYDB;CREATE TABLE Customers (id INT NOT NULL AUTO_INCREMENT,customerName VARCHAR(150) "
			+ "NOT NULL, customerNumber VARCHAR(50) NOT NULL, customerEmail VARCHAR(150) NOT NULL,it VARCHAR(50) NOT NULL,PRIMARY KEY (id));";
	
    System.out.println(createTableSQL);
    // Step 1: Establishing a Connection
   
    try {
         
    		   java.sql.Statement preparedStatement = DatabaseConnection.getInstance().getConnection().createStatement(); {

    
    			   preparedStatement.execute(createTableSQL);
    		   }
    }catch (SQLException ex) {           ex.printStackTrace();

    		     }

    // Step 4: try-with-resource statement will auto close the connection.
}

}
