package pk7;

public class FunTest_05 {

	int value; // �������      a=10, b=20
	
	// �����ε��� �����ڴ� ����Ʈ �����ڰ� �ݵ�� ��� �Ǿ�� �Ѵ�; �����ε�:���� �޼ҵ带 ������ ����ϴ°�
	public FunTest_05(){}  // ����Ʈ ������
	
	// ������ : Ŭ������ �ʱ�ȭ
	// this�� Ŭ������ �ִ� 
	FunTest_05(int value){                          // ()�Ű������� �ٸ��� �տ� Ÿ���� ���Ƶ� ��밡��
		this.value=value;
	}
	
	public static void swap(FunTest_05 x, FunTest_05 y) {
		
		int temp=x.value;
		x.value=y.value;
		y.value=temp;
		
		System.out.println("swap() ��� �� : x = " + x.value + " y = " + y.value);
		
	}	
	
	public static void main(String[] args) {

		FunTest_05 a = new FunTest_05(10);
		
		System.out.println(a);
		
		FunTest_05 b = new FunTest_05(20);
				
		System.out.println(b);
		System.out.println("=====================================");
		
		
		System.out.println("swap() ȣ�� �� : a= "+ a.value + " b= " + b.value);
		System.out.println("=====================================");
		// ��ü�� �����Ͽ� ȣ��
		swap(a,b);
		System.out.println("=====================================");
		// heap�޸� ������ ���̹Ƿ� �ٲ�
		System.out.println("swap() ȣ�� �� : a= "+ a.value + " b= " + b.value);
		
	}

}
