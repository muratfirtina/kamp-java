package odevday3;

public class Instructor extends User{
	String firsName;
	String lastName;
	String certificate;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String userName, String password, String eMail, String firsName, String lastName,
			String certificate) {
		super(id, userName, password, eMail);
		this.firsName = firsName;
		this.lastName = lastName;
		this.certificate = certificate;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	

}
