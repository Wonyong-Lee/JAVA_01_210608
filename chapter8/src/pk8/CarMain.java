package pk8;

public class CarMain {

	public static void main(String[] args) {

		Car info =new Car();
		
		info.color="������";
		info.company="�����ڵ���";
		info.maxSpeed=350;
		info.model="�׷���";
		info.speed=0;
		
		System.out.println("����ȸ��: " + info.company);
		System.out.println("�𵨸�: " + info.model);
		System.out.println("����: " + info.color);
		System.out.println("�ְ�ӵ�: " + info.maxSpeed);
		System.out.println("����ӵ�: " + info.speed);
		System.out.println("===============	======");
		
		info.speed=60;
		System.out.println("������ �ӵ�: " + info.speed);
		
	}

}
