package pk7;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("num1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("num2"));
		
		/*int res=num1/num2;
		System.out.println(res);*/
		
		
		try {
			System.out.println(num1/num2);                               // �ش� �۾��� ����
		} catch (ArithmeticException e) {                                // ������ ����
			System.out.println("���� 0�� �Է��Ͻø� �ȵ˴ϴ�.");                 // ������ ����� ����
		}
		
		System.out.println("Error �� ������ => ���α׷� ���� ��");
	}
	
}
