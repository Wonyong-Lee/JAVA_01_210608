package pk11;

public class CustomerTest {

	public static void main(String[] args) {

		// �Ϲݰ� ����(Customer)
		System.out.println("-------------�Ϲݰ�-------------");
		Customer customerLee = new Customer();            // ����ް� ����Ʈ������(customergrade, bonusratio)
		customerLee.setCustomerName("�̿���");              // CustomerName
		
		int price = 10000;
		int leePrice = customerLee.calcPirce(price);      // bonusPoint
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.getCustomerName() + "���� " + leePrice + "���� �����߽��ϴ�.");
		System.out.println("--------------VIP---------------");
		
		VIPCustomer vipKim = new VIPCustomer(10004, "�����", 104); 
		// Customer customerKim = new VIPCustomer(1004, "�����" 10004); �̷��� ��ĳ�������� ����ص��ȴ�.
		int vipPrice = vipKim.calcPirce(price);
		
		System.out.println(vipKim.showCustomerInfo());
		System.out.println(vipKim.getCustomerName() + "���� �����Ͻ� �ݾ��� " + vipPrice + "���Դϴ�.");
		
	}

}
