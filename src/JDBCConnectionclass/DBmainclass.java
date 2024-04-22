package JDBCConnectionclass;

import java.util.Scanner;


public class DBmainclass {

	public static void main(String[] args) {

		dbinterface dbinter = new dbinterface();

		DBdepenciesclass db = new DBdepenciesclass(dbinter);

		DBclass dbclass = new DBclass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the DBid:");
		int DBid = sc.nextInt();

		System.out.println(DBid);

	

	}

}
