package pk5;

import javax.swing.JOptionPane;

public class DoWhile_02 {

	public static void main(String[] args) {
		
		// do~while : ������ �ѹ� �����ϰ� �ݺ����۵�
		int Num1, Num2;
		
		do {
			Num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
			Num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
			if(Num1 == Num2) {
				System.out.println("Same!!!!!");
				break;
			}
			System.out.println("Different!!!!!");
		}while(Num1 != Num2);
	}

}
