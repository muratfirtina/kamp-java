package odevday3;

public class User {
	int id;
	String userName;
	String password;
	String eMail;
	
	public User() {
		
	}
	
	public User(int id, String userName, String password, String eMail) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	

	
	
}
