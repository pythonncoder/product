package JDBCConnectionclass;

public class DBdepenciesclass {
	
	private dbinterface dbinterface;
	

	public DBdepenciesclass(JDBCConnectionclass.dbinterface dbinterface) {
		super();
		this.dbinterface = dbinterface;
	}
	
	

	public void dbselection(dbid) {
		
		System.out.println("dbselection method called........");
		switch(dbid) {
		case 1:
			dbinterface.db1();
		System.out.println(" dbsmethods.db1();called in case...");
		break;
		case 2:
			dbinterface.db2();
		System.out.println(" dbsmethods.db2();called in case...");
		break;
		case 3:
			dbinterface.db3();
		System.out.println(" dbsmethods.db3();called in case...");
		break;
		}
		
	}

	
	
}
