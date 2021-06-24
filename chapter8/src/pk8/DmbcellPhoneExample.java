package pk8;

public class DmbcellPhoneExample {

	public static void main(String[] args) {

		DmbcellPhone dmbCellPhone = new DmbcellPhone("JavaPhone", "흰색", 11);
		// CellPhone
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		// DmbcellPhone
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		// CellPhone으로 부터 상속받은 method 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receVoice("안녕하세요 저는 이원용입니다");
		dmbCellPhone.sendVoice("아 안녕! 공부좀 하세오");
		dmbCellPhone.receVoice("알겠습니다");
		dmbCellPhone.hangUp();
		
		// DmbcellPhone으로부터 method 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
