package pk8;

public class StudentMain {

	public static void main(String[] args) {

		StudentInfo si=new StudentInfo();
		
		si.address="��⵵";
		si.grade=100;
		si.studentID=1004;
		si.setStudentName("����");                     // �����ͼ� �����ؾ���
		
		System.out.println(si.getStudentName());      // ���õ� ���� ������
	}

}
