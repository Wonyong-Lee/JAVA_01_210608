package pk4;

public class Condition_03 {

	public static void main(String[] args) {

		int a=10;
		int b=15;
		boolean result;
		
		result = ++a >= b ? true :  false ;
		System.out.println(result);
		
		
		int n1=10;
		int n2=20;
		char n3;
		
		// n1�� 1�� ���ϸ� n2�� ������ ���� ? ������ 'o' �ٸ��� 'x'
		
		n3 = (++n1 == n2) ? 'o' : 'x';
		System.out.println(n3);
		
	}

}
