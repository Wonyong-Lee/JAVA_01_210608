package pk8;

import java.util.Random;


public class Start {

	// ������
	private int random = new Random().nextInt(50)+1;    // computer���� ������ up ũ�� down
	private int count;
	private String result="FAIL";
	
	public String check(int n) {         // ����ڰ� �Է��� ����
		
		count++;
		
		// if������ 'UP' / 'DOWN' ����
		if(n<random) {
			System.out.println("UP!!");
		}else if(n>random) {
			System.out.println("DOWN!!");
		}else {
			System.out.println(count + "ȸ ���� ����!!!");
			result = "SUCCESS";
		}	
		return result;
	}
		
}

