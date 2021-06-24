package pk10;

public class Company {
	
	// ��ü�� �� �ϳ��� ����
	private static Company instance = new Company();
	
	private Company() {		
	}
	
	public static Company getInstance() {
		if(instance == null) {   // ��ü�� ������ ���� ���ٸ�
			instance = new Company();
		}
		return instance;
	}

}
