package pk8;

public class StudentMain2 {

	public static void main(String[] args) {

		Student st=new Student();
		
		// �ʵ��̿�
		st.studentName="�ֵ���ũ";
		st.address="����� ���α�";
		System.out.println("--�ʵ��̿�--");
		System.out.println(st.studentName + ", " + st.address);
		
		// method�̿�
		st.setStudentName("�̿���");
		st.setAddress("��⵵ ������");
		System.out.println("--method�̿�--");
		System.out.println(st.getStudentName() + ", " + st.getAddress());
		
		
		
	}

}
