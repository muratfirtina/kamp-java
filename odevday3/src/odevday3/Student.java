package odevday3;

public class Student extends User{
	String firstName;
	String lastName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String userName, String password, String eMail, String firstName, String lastName) {
		super(id, userName, password, eMail);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
