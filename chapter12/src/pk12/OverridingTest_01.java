package pk12;

// ���̺귯��
import test.Customer;
import test.VIPCustomer;

public class OverridingTest_01 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("--------------------VIP--------------------");		
		VIPCustomer customerKim = new VIPCustomer(10011,"�����", 10101);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int price=10000;
		System.out.println(customerLee.getCustomerName() + "���� �����ϼž��� �ݾ��� " + customerLee.calcPirce(price) + "�Դϴ�.");
		System.out.println(customerKim.getCustomerName() + "���� �����ϼž��� �ݾ��� " + customerKim.calcPirce(price) + "�Դϴ�.");
	}

}
