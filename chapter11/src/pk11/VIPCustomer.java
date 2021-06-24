package pk11;

public class VIPCustomer extends Customer{

	// �������� agentID(����)
	// 10%���� saleRatio;
	private int agentID;
	double saleRatio;
	
	// ������ �̿�(���� ���̵�, ���� �̸�, ���, �������̵�)
	// ������ �̿�(���=VIP, bonusRatio=0.05, saleRatio)
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID=agentID;
		customergrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	// calcPrice => overriding
	// return 5000-(5000*0.1) saleRatioȰ��
	
	@Override
	public int calcPirce(int price) {
		bonusPoint+=bonusRatio*price;
		return super.calcPirce(price)-(int)(price*saleRatio);         // calcPirce�� int�� saleRatio�� double��
	}
	
	// showCustomerInfo > Overriding 
	
	@Override
	public String showCustomerInfo() {
		// �θ�Ŭ������ method�� ����ϰ� �������̵� �߰�
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�." ; // ������ ���̵�� ???�Դϴ�.;
	}
	
	
	// ���� ���̵�
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
