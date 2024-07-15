package in.basics;

public class Variables_2 {
	static int data = 200;

	public static void main(String[] args) {
		// static variables
		System.out.println(Variables_2.data);
		
		Variables_2 a = new Variables_2();
		Variables_2 b = new Variables_2();
		Variables_2 c = new Variables_2();
		
		System.out.println("_______________");
		System.out.println("before");
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("__________________________________");
		a.data = 2;
		System.out.println(a);
		System.out.println(b);

	}

}
