package pk7;

public class TryCatchThorws {

	public static void fun() throws Exception{
		
		try {
			System.out.println("fun()method");
			throw new Exception();                     // Exception : ����ó��
		} catch (RuntimeException e) {                 // �����߿� �߻��Ǵ� ����
			System.out.println("���ܹ߻�");
		} finally {                                      // ������ ���� ���ϴ��� ������ ����
			System.out.println("finally ����");
		}
		
	}
	
	public static void main(String[] args) {
		
		//fun();
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()�� catch�� ����");
		}
	}
}
