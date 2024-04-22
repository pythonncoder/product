package learn;

public class Privateclass {

	private String Ename;
	private String Email;
	private int Eid;
	public Privateclass(String ename, String email, int eid) {
		super();
		Ename = ename;
		Email = email;
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}

	
}
