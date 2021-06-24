package pk11;

import java.util.ArrayList;

class Shape{
	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("�� ����Դϴ�");
	}
	
}

class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void rectangle() {
		System.out.println("�簢�� ����Դϴ�");
	}
}

class Triangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void triangle() {
		System.out.println("�ﰢ�� ����Դϴ�");
	}
}

public class ShapeTest {
	// Shape�� �������� ShapeŬ������ Shape�� ��ӹ��� ��� Ŭ����
	// Circle ???;
	ArrayList<Shape> sList = new ArrayList<Shape>();
		
	public void addShape() {
		sList.add(new Circle());       // Circle s = new Circle()
		sList.add(new Rectangle());    // Rectangle s = new Rectangle()
		sList.add(new Triangle());     // Triangle s = new Triangle()
		
		// �� ĳ����
		// Overriding �� method�̹Ƿ� �ڽ�Ŭ������ draw�� �����ϵ�
		for(Shape s : sList) {
			s.draw();
		}
	}
	
	public void testCasting() {
		
		for(int i=0; i<sList.size(); i++) {
			Shape s = sList.get(i);      // �ϴ� Shape Ÿ������ ������
			
			if(s instanceof Circle) {
				Circle c = (Circle)s;          // �ٿ�ĳ����; �θ��� ShapeŸ���� �ڽ� Circle�� ����ȯ
				c.circle();
			}else if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;    // �ٿ�ĳ����; �θ��� ShapeŸ���� �ڽ� Rectangle�� ����ȯ
				r.rectangle();
			}else if(s instanceof Triangle) {
				Triangle t = (Triangle)s;      // �ٿ�ĳ����; �θ��� ShapeŸ���� �ڽ� Triangle�� ����ȯ
				t.triangle();
			}else {
				System.out.println("�������� �ʴ� Ÿ���Դϴ�");
			}				
		}
	}	
	
	public static void main(String[] args) {
		ShapeTest sTest = new ShapeTest();
		System.out.println("--- �� ĳ���� ---");
		sTest.addShape();
		System.out.println("--- �ٿ�ĳ���� ---");
		sTest.testCasting();
	}
}
