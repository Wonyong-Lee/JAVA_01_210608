package pk7;

public class Ex_01_OverloadingMain {

	public static void main(String[] args) {
		
		// Ex_01_Overloading�� ��ü => ex		
		Ex_01_Overloading ex = new Ex_01_Overloading();
		
		ex.getResult('A');
		ex.getResult(10);
		ex.getResult("���ɽð�");
		ex.getResult(20, "����Ŀ�");

	}

}
