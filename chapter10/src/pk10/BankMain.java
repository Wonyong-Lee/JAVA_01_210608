package pk10;


public class BankMain {

	public static void main(String[] args) {

		Bank bk1 = new Bank("����", "12-345-6789");
		
		Bank.interest=0.2f;            // *�������� ����
		
		bk1.getBank();
		
		System.out.println("-------------------");
		
		Bank bk2 = new Bank("����", "98-765-4321");
		
		bk2.getBank();                 // *���� interest ������������ ���̾���
		
		
		
	}

}
