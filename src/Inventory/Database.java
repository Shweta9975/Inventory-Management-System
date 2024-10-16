package Inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	 Statement stmt;
     Connection conn;
	public Database() {
		// TODO Auto-generated constructor stub
		try {
	    	   // Class.forName("con.mysql.jdbc.Driver");
	    	    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagentsystem","root","Shweta@123");
	    	    stmt=conn.createStatement();
	       }
	       catch(SQLException ex){
	    	   
	       }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Database();
	}

}
