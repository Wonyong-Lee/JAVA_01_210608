package Exam;

import java.util.Random;

public class Example_13 {

	/*  
	 String[] strArr= {"CHANGE","LOVE","HOPE","VIEW","APPLE"};
	 WordScramble Ŭ������ ����� ���� ���� �迭�� �����ϰ�, �̸� �̿��Ͽ� WordScrambleMainŬ�������� �������� �� �Ʒ��� ����� ��µǰ� �غ���.
	 
	 ������:
	 ����: PEALP
	 �ܾ��? : ealpp
	 ealpp ����..
	 �ܾ��? apple
	 apple ����!!
	 */
	
	String [] strArr= {"CHANGE","LOVE","HOPE","VIEW","APPLE"};       // 
	String shake = "";
	
	// ���� ��ȯ �޼���
	
	public String getAnswer() {
		
		int idx=new Random().nextInt(strArr.length);
		return strArr[idx];
	}
	
	// ������ ��� ��ȯ�ϴ� method
	public String getScrambledWrd(String str) {
		
		// ���� �ܾ ���� ���� ��� ����
		// int �迭����
		int inArr[]=new int[str.length()];
		
		// ������� inArr�迭�� �� �濡 ��ġ�� �ʵ��� ó���� ������ �Է�
		for(int i=0; i<inArr.length; ) {
			inArr[i]=new Random().nextInt(str.length());
			boolean check=false;
			
			// �ߺ��� ����
			for(int j=0; j<i; j++) {
				if(inArr[i] == inArr[j]) {
					check=true;
					break;
				}
			}
			// �ߺ��� ���� ������ i����
			if(!check) {                     // �ߺ��� ������ check=false
				
				i++;                         // for ������ �������� �ܾ ���� ������ ������Ŵ
			}
		} // outer for
		
		for(int i=0; i<str.length(); i++) {
			// str�� ���ڴ����� �и�
			// ���� �ڵ忡���߻���Ų ������ ������� shake������ �߰�
			shake+=str.charAt(inArr[i]);
		}
		return shake;
	}
	
}
