package pk12;

public class AnimalMain{

	public static void main(String[] args) {
		
		Bear bear = new Bear();     // Animal bear = new Bear(); 이렇게하면 타입이 부모꺼라 Bear안에 있는 String woong이 보이지않음
		
		bear.getEye();
		bear.getLeg();
		System.out.println("---곰---");
		System.out.println("눈 : " + bear.getEye());
		System.out.println("다리 : " + bear.getLeg());
		bear.woong="";
		
		Lion lion = new Lion();
		
		lion.getEye();
		lion.getLeg();
		System.out.println("---사자---");
		System.out.println("눈 : " + lion.getEye());
		System.out.println("다리 : " + lion.getLeg());
		lion.galgi="";
		
		Spider spider = new Spider();
		
		spider.getEye();
		spider.getLeg();
		System.out.println("---거미---");
		System.out.println("눈 : " + spider.getEye());
		System.out.println("다리 : " + spider.getLeg());
		
		
		
	}

}
