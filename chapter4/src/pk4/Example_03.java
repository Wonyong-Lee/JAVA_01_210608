package pk4;

public class Example_03 {

	public static void main(String[] args) {

		// ���׿����ڸ� �̿��Ͽ� score�� 90���� ũ�� 'A'�̰�, score�� 80���� ũ�� 'B'
		
		int score=70;
		
		char R;
		R = (score>90) ? 'A' : 'B';
		System.out.println(R);
		
		
		// ���׿����ڸ� �̿��Ͽ� score�� 90���� ũ�� 'A'�̰�, score�� 80���� ũ�� 'B'�� �� ���ϴ� ��� 'C'�� ����
		
		R = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(R);
	}

}
