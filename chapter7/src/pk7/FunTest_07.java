package pk7;

public class FunTest_07 {

	public static int Recur(int a) {  // 3*2*1
		
		int gop;
		System.out.println(a); // 3 2 1
		if(a==1)
			return (1);        // return 1 : ������������ ������ ���� �Ѱ����� ����
		else gop=a*Recur(a-1); // 3 * 2 * 1 = 6 
		
		return (gop);
		
		// return 0; // ���� ���� : ������ ���� ������� return 0
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int res, x =3;
		
		System.out.println("����� main() �Դϴ�.");
		System.out.println("method�� ȣ���մϴ�.");
		
		res= Recur(x); // ����Լ��� �����Ͻÿ�
		
		System.out.println("main()���� �ٽ� ���ƿԽ��ϴ�.");
		System.out.println("1 ~ 3 ������ ���� ���� �� : " + res + "\n");
		
	}

}
