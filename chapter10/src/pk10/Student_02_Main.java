package pk10;

public class Student_02_Main {

	public static void main(String[] args) {

		Student_02 st1 = new Student_02();

		st1.setStudentName("이원용");
		
		System.out.println("이름 : " + st1.StudentName + " | 학번 : " + st1.studentID);
		
		Student_02 st2 = new Student_02();

		st2.setStudentName("원용이");
		
		System.out.println("이름 : " + st2.StudentName + " | 학번 : " + st2.studentID);
		
		Student_02 st3 = new Student_02();

		st3.setStudentName("용이원");
		
		System.out.println("이름 : " + st3.StudentName + " | 학번 : " + st3.studentID);

		
	}

}
