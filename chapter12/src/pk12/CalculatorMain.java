package pk12;

public class CalculatorMain {

	public static void main(String[] args) {

		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(20, 10));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(20, 5));
		
	}

}
