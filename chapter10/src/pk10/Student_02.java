package pk10;

public class Student_02 {

	public static int serialNum = 1000;
	int studentID;
	String StudentName;
	int grade;
	String addres;
	
	
	// �����ڸ� Ȱ���Ͽ� serialNum�� �ϳ��� �����ϴ� ������
	public Student_02() {
		serialNum++;
		this.studentID=serialNum;
	}
	
	
	public static int getSereialNum() {
		return serialNum;
	}
	public static void setSereialNum(int sereialNum) {
		Student_02.serialNum = sereialNum;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	
	
}
