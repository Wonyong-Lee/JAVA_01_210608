package pk9;

public class Person2Main {

	public static void main(String[] args) {

		Person2 ps1 = new Person2();
		
		// ±èÀ¯½Å 85.5 185.0
		ps1.name="±èÀ¯½Å";
		ps1.height=185.0f;
		ps1.weight=85.5f;
		
		System.out.println(ps1.name);
		System.out.println(ps1.height);
		System.out.println(ps1.weight);
		
		System.out.println();
		
		Person2 ps2 = new Person2("ÀÌ¿ø¿ë", 185.0f, 85.5f);
		System.out.println(ps2.name+ " " + ps2.height + " " + ps2.weight);
		
	}

}
