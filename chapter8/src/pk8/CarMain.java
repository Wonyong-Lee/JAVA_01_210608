package pk8;

public class CarMain {

	public static void main(String[] args) {

		Car info =new Car();
		
		info.color="검정색";
		info.company="현대자동차";
		info.maxSpeed=350;
		info.model="그랜져";
		info.speed=0;
		
		System.out.println("제작회사: " + info.company);
		System.out.println("모델명: " + info.model);
		System.out.println("색상: " + info.color);
		System.out.println("최고속도: " + info.maxSpeed);
		System.out.println("현재속도: " + info.speed);
		System.out.println("===============	======");
		
		info.speed=60;
		System.out.println("수정된 속도: " + info.speed);
		
	}

}
