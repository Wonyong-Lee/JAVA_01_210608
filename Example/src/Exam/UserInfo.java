package Exam;

public class UserInfo {

	

		/*
		UserInfoŬ������ ���� ��, �ݾ��� ������ money��� ������ �����.
		deposit(int money)�޼��带 ����� ������ ���� �Ա����� ��츦 ó��.
		withdraw(int money)�޼��带 ����� ������ ���� ������� ��츦 ó��.
		�� �� �޼��忡�� ����ϰ��� �ϴ� �� ���� �ܾ��� ������� �ܾ��� �����ϴٴ� �޽����� ��µǵ��� �Ѵ�.
		showMoney()�޼��带 ����� ���� �ܾ��� ��ȯ�ϵ��� �Ѵ�.

		UserInfoŬ������ �������. 
		MainŬ������ ���� ����� UserInfo�� ��ü�� ������ �� �Ʒ��� ����� �������� �غ���.
		
		1. �Ա�
		2. ���
		3. �ܾ�Ȯ��
		4. ����
		----�Ա�----
		�Ա��� �ݾ��� �Է�:1000
		�ԱݿϷ�
		--------------
		----���----
		����� �ݾ��� �Է�:1000
		��ݼ���
		�ܾ׺��� ����� Ŭ���
		�ܾ׺���!!
		*/
		
		// �ʵ�
		private int money;   // �ܾ�
		
		// �Ա�
		public void deposit(int money) {
			this.money+=money;
			System.out.println("�ԱݵǾ����ϴ�.");
		}
		
		// ���
		public void withdraw(int money) {
			if(this.money-money<0) {
				System.out.println("�ܾ��� �����մϴ�.");
			}else {
				this.money-=money;
				System.out.println("��ݵǾ����ϴ�.");
			}
		}
		
		// return method
		public int showMoney() {
			return money;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
