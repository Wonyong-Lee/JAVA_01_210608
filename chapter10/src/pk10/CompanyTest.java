package pk10;

public class CompanyTest {

	public static void main(String[] args) {
		
		
		// �Ϲ����� ��ü����
		/*
		Company cp1 = new Company();
		Company cp2 = new Company();
		
		System.out.println(cp1);
		System.out.println(cp2);
		*/
		System.out.println("=======================================");
		
		// ��ü�� �ϳ��� ������ �� �ִ� singleton
		Company mycompany1 = Company.getInstance();
		Company mycompany2 = Company.getInstance();
		System.out.println(mycompany1);
		System.out.println(mycompany2);
		System.out.println(mycompany1 == mycompany2);
		
	}

}
