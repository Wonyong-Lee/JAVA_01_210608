package pk8;

public class DmbcellPhoneExample {

	public static void main(String[] args) {

		DmbcellPhone dmbCellPhone = new DmbcellPhone("JavaPhone", "���", 11);
		// CellPhone
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		// DmbcellPhone
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		// CellPhone���� ���� ��ӹ��� method ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.receVoice("�ȳ��ϼ��� ���� �̿����Դϴ�");
		dmbCellPhone.sendVoice("�� �ȳ�! ������ �ϼ���");
		dmbCellPhone.receVoice("�˰ڽ��ϴ�");
		dmbCellPhone.hangUp();
		
		// DmbcellPhone���κ��� method ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
