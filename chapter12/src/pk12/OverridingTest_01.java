package pk12;

// 라이브러리
import test.Customer;
import test.VIPCustomer;

public class OverridingTest_01 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("--------------------VIP--------------------");		
		VIPCustomer customerKim = new VIPCustomer(10011,"김순신", 10101);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int price=10000;
		System.out.println(customerLee.getCustomerName() + "님이 지불하셔야할 금액은 " + customerLee.calcPirce(price) + "입니다.");
		System.out.println(customerKim.getCustomerName() + "님이 지불하셔야할 금액은 " + customerKim.calcPirce(price) + "입니다.");
	}

}
