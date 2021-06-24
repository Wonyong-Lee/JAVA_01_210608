package pk11;

import java.util.ArrayList;

public class AnimalTest_02 {

	ArrayList<Animal> aniList = new ArrayList<Animal>();        // Animal aniList = new Animal();
	
	public void addAnimal() {
		aniList.add(new Human());                 // Animal������ ����ȯ�� �ؼ� �߰�
		aniList.add(new Tiger());
		aniList.add(new Eagle());	
		// �ڵ�����ȯ Animal ani1 = new Human();
		for(Animal a : aniList) {                 // �迭�� ��ҵ��� ������ moveȣ��
			a.move();                             // overriding�� method�� ȣ���� ��, �θ�Ÿ���̹Ƿ� �ڽ��� method�� �Ⱥ���
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
					System.out.println("�������� ���� Ÿ���Դϴ�.");
				}			
		}
	}
		
	public static void main(String[] args) {

		AnimalTest_02 atest = new AnimalTest_02();
		// �ڵ�����ȯ(�ٿ� ĳ����)
		System.out.println("--- �� ĳ���� ---");
		atest.addAnimal();
		System.out.println("--- �ٿ�ĳ���� ---");
		atest.testCasting();

	}

}
