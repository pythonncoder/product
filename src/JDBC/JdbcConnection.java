package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JdbcConnection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Studentid:");
		int StudentId1 = sc.nextInt();
		
		System.out.println("Enter the StudentName:");
		String StudentName1 = sc.next();
		
		System.out.println("Enter the StudentAge:");
		int StudentAge1 = sc.nextInt();
		
		
		
		

		String url = "jdbc:mysql://localhost:3306/naveen023";
		String username = "root";
		String password = "Parthu023@";
//		String testTable = "select * from test";
		
		 String insertTable = "insert into test + values(StudentId1,StudentName1,StudentAge1) ";
		
		
		

		try {
			Connection cn = DriverManager.getConnection(url, username, password);
			Statement st = cn.createStatement();
			
//			ResultSet i1 = (ResultSet) ((Connection) st).prepareStatement(insertTable);
//			
//			System.out.println("data inserted"+i1);
			
			st.executeUpdate(insertTable);
			
//			ResultSet i = st.executeQuery(testTable);
			
			
			
			/*
			while (i.next()) {
				String StudentName = i.getString("StudentName");
				int Studentid = i.getInt("StudentId");
				int StudentAge = i.getInt("StudentAge");
				
				System.out.println(Studentid +" "+StudentName+" "+StudentAge);
				
//				System.out.println(StudentName);
//				
//				System.out.print(StudentAge);
				
			} */
			System.out.println();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
