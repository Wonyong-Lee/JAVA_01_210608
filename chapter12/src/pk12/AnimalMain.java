package pk12;

public class AnimalMain{

	public static void main(String[] args) {
		
		Bear bear = new Bear();     // Animal bear = new Bear(); �̷����ϸ� Ÿ���� �θ𲨶� Bear�ȿ� �ִ� String woong�� ����������
		
		bear.getEye();
		bear.getLeg();
		System.out.println("---��---");
		System.out.println("�� : " + bear.getEye());
		System.out.println("�ٸ� : " + bear.getLeg());
		bear.woong="";
		
		Lion lion = new Lion();
		
		lion.getEye();
		lion.getLeg();
		System.out.println("---����---");
		System.out.println("�� : " + lion.getEye());
		System.out.println("�ٸ� : " + lion.getLeg());
		lion.galgi="";
		
		Spider spider = new Spider();
		
		spider.getEye();
		spider.getLeg();
		System.out.println("---�Ź�---");
		System.out.println("�� : " + spider.getEye());
		System.out.println("�ٸ� : " + spider.getLeg());
		
		
		
	}

}
