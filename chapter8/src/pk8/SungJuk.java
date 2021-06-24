package pk8;

import javax.swing.JOptionPane;

public class SungJuk {
	
	// 멤버변수=필드
	private String Std_num;
	private String Std_name;
	private int Java, Python, BigData;

	// 생성자
	
	// method
	public void Sum() {
		System.out.println("합계 : " + (Java + Python + BigData));
	}
	
	public void Avg() {
		System.out.println("평균 : " + (Java + Python + BigData)/3);
	}
	
	public static void main(String[] args) {

		// rec 객체
		SungJuk rec = new SungJuk();
		
		// AccessEx객체
		/*
		AccessEx rec2=new AccessEx();
		rec2.SetA(100);
		rec2.bb=200;
		rec2.cc=300;
		
		rec2.Disp();
		*/
		
		rec.Std_num=JOptionPane.showInputDialog("학번");
		rec.Std_name=JOptionPane.showInputDialog("성명");
		
		rec.Java = Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
		rec.Python = Integer.parseInt(JOptionPane.showInputDialog("Python 점수"));
		rec.BigData = Integer.parseInt(JOptionPane.showInputDialog("BigData 점수"));
		
		
		System.out.println(rec.Std_num + ", " + rec.Std_name + "의 성적 입니다.");
		rec.Sum();
		rec.Avg();
		
	}

}
