package pk10;


public class BankMain {

	public static void main(String[] args) {

		Bank bk1 = new Bank("종로", "12-345-6789");
		
		Bank.interest=0.2f;            // *고정으로 쓰고
		
		bk1.getBank();
		
		System.out.println("-------------------");
		
		Bank bk2 = new Bank("구리", "98-765-4321");
		
		bk2.getBank();                 // *따로 interest 설정하지말고 같이쓰자
		
		
		
	}

}
