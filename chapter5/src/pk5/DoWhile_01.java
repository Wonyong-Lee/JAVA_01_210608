package pk5;

public class DoWhile_01 {

	public static void main(String[] args) {

		int num=1;      // index ���� �ʱ�ȭ
		int sum=0;
		
		do {            // do~while���� header
			sum += num; // 1�̶�� ���� ����
			num++;      // 2�� index ���� ����
		}while(num<=10);// do~while�� ���Ǻ��ؼ� �ݱ�
		
		// do~while�� ������ ����
		System.out.println("1���� 10������ �� : " + sum + "�Դϴ�.");
	}

}
