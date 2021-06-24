package pk11;

import java.util.ArrayList;

public class AnimalTest_02 {

	ArrayList<Animal> aniList = new ArrayList<Animal>();        // Animal aniList = new Animal();
	
	public void addAnimal() {
		aniList.add(new Human());                 // Animal형으로 형변환을 해서 추가
		aniList.add(new Tiger());
		aniList.add(new Eagle());	
		// 자동형변환 Animal ani1 = new Human();
		for(Animal a : aniList) {                 // 배열의 요소들을 꺼내서 move호출
			a.move();                             // overriding된 method만 호출이 됨, 부모타입이므로 자식의 method는 안보임
		}
	}
	
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal a = aniList.get(i);
				if(a instanceof Human) {
					Human h = (Human)a;
					h.readBook();
				}else if(a instanceof Tiger) {
					Tiger t = (Tiger)a;
					t.hunting();
				}else if(a instanceof Eagle) {
					Eagle e = (Eagle)a;
					e.flying();
				}else {
					System.out.println("지정되지 않은 타입입니다.");
				}			
		}
	}
		
	public static void main(String[] args) {

		AnimalTest_02 atest = new AnimalTest_02();
		// 자동형변환(다운 캐스팅)
		System.out.println("--- 업 캐스팅 ---");
		atest.addAnimal();
		System.out.println("--- 다운캐스팅 ---");
		atest.testCasting();

	}

}
