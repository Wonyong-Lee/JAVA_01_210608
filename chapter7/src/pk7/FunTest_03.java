package pk7;

import javax.swing.JOptionPane;

public class FunTest_03 {


	// void�� return���� ���� �� ����.
	public void sum(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	
	
	public static void main(String[] args) {
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("num1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("num2"));
		
		// static���� ȣ����� �ʾ����Ƿ� �������� �� ����
		// sum(num1,num2); // Error
		
		// ��ü�� ���� ������ ȣ��
		FunTest_03 Obj=new FunTest_03();
		Obj.sum(num1, num2);
				
	}

}
