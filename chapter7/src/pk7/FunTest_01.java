package pk7;

import javax.swing.JOptionPane;

public class FunTest_01 {

	
	public static void sum(int a, int b) {                  // server
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	
	public static void main(String[] args) {                // client
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("ù ��° ��"));   // 2
		num2=Integer.parseInt(JOptionPane.showInputDialog("�� ��° ��"));   // 5
		sum(num1,num2);

		
	}

}
