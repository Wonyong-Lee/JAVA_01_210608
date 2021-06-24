package pk12;

import test.Customer;
import test.VIPCustomer;

public class OverridingTest_02 {

	public static void main(String[] args) {

		Customer vc = new VIPCustomer(10012, "박순신", 2000);
		vc.bonusPoint=1000; // Customer타입이므로 Customer변수방 사용
		
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calcPirce(10000) + "입니다.");
		
				
	}

}
