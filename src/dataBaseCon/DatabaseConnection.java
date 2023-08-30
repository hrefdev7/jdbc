package dataBaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


	public class DatabaseConnection {

	    private Connection connection;
	    private static DatabaseConnection instance;
	    private static final String DATABASE = "MYDB";
	    private static final String TIME_ZONE = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    private static final String URL = "jdbc:mysql://localhost:3306/" + DATABASE + TIME_ZONE;
	    private static final String USER = "root";
	    private static final String PASSWORD = "href77**";
	    public static final String MESSAGEMYSQL = "An error occurred when connecting to MySQL.\nCheck your connection to MySQL";
	    

	    private DatabaseConnection() {
	        try {
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("succes connection");
	        } catch (SQLException ex) {
	        	
	            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
	             
	        }
	    }

	    /*
	     * return une instance de la connection
	     */
	    
	       public static DatabaseConnection getInstance() {
	               if (instance == null) {
	                instance = new DatabaseConnection();
	        }
	               
	        return instance;
	    
	    }

	       
	       
	    public Connection getConnection() {
	        return connection;
	    }
}