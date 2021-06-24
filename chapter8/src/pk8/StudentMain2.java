package pk8;

public class StudentMain2 {

	public static void main(String[] args) {

		Student st=new Student();
		
		// 필드이용
		st.studentName="솔데스크";
		st.address="서울시 종로구";
		System.out.println("--필드이용--");
		System.out.println(st.studentName + ", " + st.address);
		
		// method이용
		st.setStudentName("이원용");
		st.setAddress("경기도 구리시");
		System.out.println("--method이용--");
		System.out.println(st.getStudentName() + ", " + st.getAddress());
		
		
		
	}

}
