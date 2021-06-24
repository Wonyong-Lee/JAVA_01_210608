package pk10;

public class Student_01_Main {

	public static void main(String[] args) {

		Student_01 st01 = new Student_01();
		st01.setStudentName("이원용");
		System.out.println(st01.serialNum);
		Student_01.serialNum++;
		
		Student_01 st02 = new Student_01();
		st02.setStudentName("원용이");
		System.out.println(st01.serialNum);
		

		
		
		
		
		
		
	}

}
