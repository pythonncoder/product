package JDBCConnectionclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBclass implements dbinterface {
	

	@Override
	public void db1() {
		System.out.println("db1 method called...");
		
		String url = "jdbc:mysql://localhost:3306/bd1";
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				 Connection con = DriverManager.getConnection(url, "root", "Naveen@123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

	@Override
	public void db2() {
		System.out.println("db2 method called...");
		String url = "jdbc:mysql://localhost:3306/bd2";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection(url, "root", "Naveen@123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void db3() {
		System.out.println("db3 method called...");
		String url = "jdbc:mysql://localhost:3306/bd3";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection(url, "root", "Naveen@123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
