package pk11;

public class CustomerTest {

	public static void main(String[] args) {

		// 일반고객 정보(Customer)
		System.out.println("-------------일반고객-------------");
		Customer customerLee = new Customer();            // 고객등급과 포인트적용율(customergrade, bonusratio)
		customerLee.setCustomerName("이원용");              // CustomerName
		
		int price = 10000;
		int leePrice = customerLee.calcPirce(price);      // bonusPoint
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.getCustomerName() + "님이 " + leePrice + "원을 지불했습니다.");
		System.out.println("--------------VIP---------------");
		
		VIPCustomer vipKim = new VIPCustomer(10004, "김원용", 104); 
		// Customer customerKim = new VIPCustomer(1004, "김원용" 10004); 이렇게 업캐스팅으로 사용해도된다.
		int vipPrice = vipKim.calcPirce(price);
		
		System.out.println(vipKim.showCustomerInfo());
		System.out.println(vipKim.getCustomerName() + "님이 지불하실 금액은 " + vipPrice + "원입니다.");
		
	}

}
