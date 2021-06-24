package pk5;

import javax.swing.JOptionPane;

public class IfExample_04 {

	public static void main(String[] args) {

		int age;
		age=Integer.parseInt(JOptionPane.showInputDialog("나이"));
		int charge;
		
		if(age<8) {
			charge=1000;
			System.out.println("어린이 입니다.");
		}else if(age<14){
			charge=2000;
			System.out.println("초등학생 입니다.");
		}else if(age<20) {
			charge=3000;
			System.out.println("중·고등학생 입니다.");
		}else {
			charge=4000;
			System.out.println("성인 입니다.");
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}
