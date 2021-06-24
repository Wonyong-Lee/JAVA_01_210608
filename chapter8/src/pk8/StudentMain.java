package pk8;

public class StudentMain {

	public static void main(String[] args) {

		StudentInfo si=new StudentInfo();
		
		si.address="경기도";
		si.grade=100;
		si.studentID=1004;
		si.setStudentName("원용");                     // 가져와서 세팅해야함
		
		System.out.println(si.getStudentName());      // 세팅된 값을 가져옴
	}

}
