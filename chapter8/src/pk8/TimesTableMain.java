package pk8;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {

		int num;
		
		TimesTable tt =new TimesTable();
		
		System.out.print("출력할 구구단을 입력 하세요 : ");
		
		Scanner scan=new Scanner(System.in);
		
		num=scan.nextInt();
		tt.showTable(num);	
		
		
	}

}
