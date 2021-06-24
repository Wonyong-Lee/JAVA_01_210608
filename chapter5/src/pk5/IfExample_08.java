package pk5;

import java.util.Scanner;

public class IfExample_08 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in); // 스캐너란 클래스에 스캔이 들어갈 수 있는 공간 확보, 뉴는 새로운 메모리를 줌
		
		System.out.print("첫 번째  수 : ");
		double num1=Double.parseDouble(scan.nextLine());     // nextLine() 기본 타입은 string
		
		System.out.println(num1);

		
		System.out.print("두 번째 수 : ");
		double num2=Double.parseDouble(scan.nextLine());
		
		System.out.println(num2);
		
		
		if(num2 != 0.0) {
			System.out.println("결과 : " + (num1/num2));
		}else {
			System.out.println("결과 : 무한대");
		}
	}

}
