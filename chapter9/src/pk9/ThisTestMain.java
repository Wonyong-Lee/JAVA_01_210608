package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		System.out.println("=========객체1=========");
		// 기본 생성자로 객체를 만들되객체의 이름은 R1(Move2번, RAge)
		ThisTest R1 = new ThisTest();
		R1.Move();
		R1.Move();
		R1.RAge();
		
		
		System.out.println("=========객체2=========");
		// swing으로 입력 받아서 로봇이 속도와 나이, 이름, 로봇번호를 출력
		// ThisTest의 모든 method 사용
		
		int R_speed;
		int R_age;
		String R_name;
		String R_num;
		
		R_speed=Integer.parseInt(JOptionPane.showInputDialog("로봇속도"));
		R_age=Integer.parseInt(JOptionPane.showInputDialog("로봇나이"));
		R_name=JOptionPane.showInputDialog("로봇이름");
		R_num=JOptionPane.showInputDialog("로봇번호");
		
		ThisTest R2 = new ThisTest(R_speed, R_age, R_name, R_num);
		System.out.println("속도 : " + R_speed);
		System.out.println("나이 : " + R_age);
		System.out.println("이름 : " + R_name);
		System.out.println("번호 : " + R_num);
		
		R2.Move();
		R2.RAge();
		R2.RName();
		R2.RNum();
		System.out.println();
		R2.Move();
		R2.Stop();
		
	}

}
