package pk12;

import test.Customer;
import test.VIPCustomer;

public class OverridingTest_02 {

	public static void main(String[] args) {

		Customer vc = new VIPCustomer(10012, "�ڼ���", 2000);
		vc.bonusPoint=1000; // CustomerŸ���̹Ƿ� Customer������ ���
		
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPirce(10000) + "�Դϴ�.");
		
				
	}

}
