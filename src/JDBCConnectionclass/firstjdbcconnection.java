package JDBCConnectionclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class firstjdbcconnection {
	
	public void insertquery(Statement statement) {
		String query = "insert into swetha1(id,name) values (110,'Naveen')";
		String query1 = "insert into swetha1(id,name) values (112,'Ravi')";
		
		try {
			statement.execute(query1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void deletequery(Statement statement) {
		String query = "delete from swetha1 where id = 101 ";
		try {
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void updatequery(Statement statement) {
		
		String query = "delete from swetha1 where id = 101 ";
		
		
	}

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/swetha";
		try {
			// Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, "root", "Naveen@123");
			
			Statement statement = con.createStatement();
			
			firstjdbcconnection db = new firstjdbcconnection();
			
			// db.insertquery(statement);
			db.deletequery(statement);
			
			String query = "INSERT INTO swetha1 " + "VALUES (104, 'NAveen')";
			String  query1  = "select * from Student501";
			String query2 = "delete from swetha1 where name = 'john2'";
			String query3 = " create database Naveen";
			String query4 = "create table Student501( id int ,name varchar(30))";
			String query5 = "insert into Student501 values(103,'kalyan')"; 
			String query6 = "delete into Student501 where id=103";
			
			String query7 = "show tables";
			
			
		    // 	Object r =  statement.executeUpdate(query3);
	    	// 	System.out.println("Craeated database");
	    	// statement.executeUpdate(query6);
	    	 
		  
			//  statement.executeUpdate(query2)
			

		     ResultSet rs = statement.executeQuery(query7);
		     
           		System.out.println( rs.toString());     
		     
	
				/*
				 * while ( rs.next()) { System.out.println(rs.getInt(1) + " "+ rs.getString(2));
				 * }
				 */
		}  catch (SQLException e) {	
			e.printStackTrace();
		}
	}                     
}
