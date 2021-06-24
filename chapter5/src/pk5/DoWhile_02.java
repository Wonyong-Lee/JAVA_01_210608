package pk5;

import javax.swing.JOptionPane;

public class DoWhile_02 {

	public static void main(String[] args) {
		
		// do~while : 무조건 한번 실행하고 반복시작됨
		int Num1, Num2;
		
		do {
			Num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
			Num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
			if(Num1 == Num2) {
				System.out.println("Same!!!!!");
				break;
			}
			System.out.println("Different!!!!!");
		}while(Num1 != Num2);
	}

}
