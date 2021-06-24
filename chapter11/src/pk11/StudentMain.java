package pk11;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("ÀÌ¿ø¿ë", "123456-1234567", 1);
		
		System.out.println("name : " + student.name);           // people
		System.out.println("ssn : " + student.ssn);             // people
		System.out.println("studentNo : " + student.studentNo); // student
	}

}
