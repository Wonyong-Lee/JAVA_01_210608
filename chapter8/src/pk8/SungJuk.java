package pk8;

import javax.swing.JOptionPane;

public class SungJuk {
	
	// �������=�ʵ�
	private String Std_num;
	private String Std_name;
	private int Java, Python, BigData;

	// ������
	
	// method
	public void Sum() {
		System.out.println("�հ� : " + (Java + Python + BigData));
	}
	
	public void Avg() {
		System.out.println("��� : " + (Java + Python + BigData)/3);
	}
	
	public static void main(String[] args) {

		// rec ��ü
		SungJuk rec = new SungJuk();
		
		// AccessEx��ü
		/*
		AccessEx rec2=new AccessEx();
		rec2.SetA(100);
		rec2.bb=200;
		rec2.cc=300;
		
		rec2.Disp();
		*/
		
		rec.Std_num=JOptionPane.showInputDialog("�й�");
		rec.Std_name=JOptionPane.showInputDialog("����");
		
		rec.Java = Integer.parseInt(JOptionPane.showInputDialog("Java ����"));
		rec.Python = Integer.parseInt(JOptionPane.showInputDialog("Python ����"));
		rec.BigData = Integer.parseInt(JOptionPane.showInputDialog("BigData ����"));
		
		
		System.out.println(rec.Std_num + ", " + rec.Std_name + "�� ���� �Դϴ�.");
		rec.Sum();
		rec.Avg();
		
	}

}
