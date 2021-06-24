package pk7;

public class FunTest_07 {

	public static int Recur(int a) {  // 3*2*1
		
		int gop;
		System.out.println(a); // 3 2 1
		if(a==1)
			return (1);        // return 1 : 정상종료지만 실제로 값을 넘겨주지 않음
		else gop=a*Recur(a-1); // 3 * 2 * 1 = 6 
		
		return (gop);
		
		// return 0; // 정상 리턴 : 리턴할 값이 없을경우 return 0
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int res, x =3;
		
		System.out.println("여기는 main() 입니다.");
		System.out.println("method를 호출합니다.");
		
		res= Recur(x); // 재귀함수로 구현하시오
		
		System.out.println("main()으로 다시 돌아왔습니다.");
		System.out.println("1 ~ 3 까지의 수를 곱한 값 : " + res + "\n");
		
	}

}
