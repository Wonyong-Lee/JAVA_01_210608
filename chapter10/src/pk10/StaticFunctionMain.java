package pk10;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		/* �Ϲ����� ���(��ü ����=> heap)
		StaticFunction sf = new StaticFunction();
		System.out.println(sf.str1);
		*/
		
		// Static method�� Ŭ������.method�� ������ �����ϴ� ('class ����'��� �θ����� �ִ�)
		String str;
		str=StaticFunction.getStatic();
		
		System.out.println("str = " + str);
		
	}

}
