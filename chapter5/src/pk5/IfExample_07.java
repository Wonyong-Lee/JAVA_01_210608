package pk5;

import javax.swing.JOptionPane;

public class IfExample_07 {

	public static void main(String[] args) {

		int Num1, Num2;
		
		
		Num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		Num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		// Num1�� Num2���� ũ�� Num1�� �� Ů�ϴ�
		// Num2�� Num1���� ũ�� Num2�� �� Ů�ϴ�
		// �� ���� �����ϴ�
		
		if(Num1>Num2) {
			System.out.println(Num1 + "�� �� Ů�ϴ�.");
		}else if(Num2>Num1){
			System.out.println(Num2 + "�� �� Ů�ϴ�.");
		}else {
			System.out.println("�� ���� �����ϴ�.");
		}
	}

}
