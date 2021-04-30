package odevday3;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.id = 1;
		user.userName = "mfirtina";
		user.eMail ="murat@firtina.com";
		user.password = "123456";
		
		User user2 = new User();
		user2.id = 2;
		user2.userName = "efirtina";
		user2.eMail = "emel@firtina.com";
		user2.password = "456789";
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firsName = "Murat";
		instructor.lastName = "FIRTINA";
		instructor.userName = "mfirtina";
		instructor.eMail = "murat@firtina.com";
		instructor.password = "123456";
		instructor.certificate = "MCT, PMP, ITIL";
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.update(instructor);
		
		Student student = new Student();
		student.id = 2;
		student.firstName = "Emel";
		student.lastName = "FIRTINA";
		student.userName = "efirtina";
		student.eMail = "emel@firtina.com";
		student.password = user2.password;
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
			

	}

}
