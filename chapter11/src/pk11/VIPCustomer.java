package pk11;

public class VIPCustomer extends Customer{

	// 전문상담원 agentID(정수)
	// 10%세일 saleRatio;
	private int agentID;
	double saleRatio;
	
	// 생성자 이용(고객의 아이디, 고객의 이름, 등급, 상담원아이디)
	// 생성자 이용(등급=VIP, bonusRatio=0.05, saleRatio)
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID=agentID;
		customergrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	// calcPrice => overriding
	// return 5000-(5000*0.1) saleRatio활용
	
	@Override
	public int calcPirce(int price) {
		bonusPoint+=bonusRatio*price;
		return super.calcPirce(price)-(int)(price*saleRatio);         // calcPirce는 int형 saleRatio는 double형
	}
	
	// showCustomerInfo > Overriding 
	
	@Override
	public String showCustomerInfo() {
		// 부모클래스의 method를 사용하고 상담원아이디 추가
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다." ; // 상담원의 아이디는 ???입니다.;
	}
	
	
	// 상담원 아이디
	public int getAgentID() {
		return agentID;
	}
	

	@Override
	public int getCustomerID() {
		// TODO Auto-generated method stub
		return super.getCustomerID();
	}

	@Override
	public void setCustomerID(int customerID) {
		// TODO Auto-generated method stub
		super.setCustomerID(customerID);
	}

	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return super.getCustomerName();
	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		super.setCustomerName(customerName);
	}

	@Override
	public String getCustomergrade() {
		// TODO Auto-generated method stub
		return super.getCustomergrade();
	}

	@Override
	public void setCustomergrade(String customergrade) {
		// TODO Auto-generated method stub
		super.setCustomergrade(customergrade);
	}


}
