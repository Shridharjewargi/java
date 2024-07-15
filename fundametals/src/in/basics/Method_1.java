package in.basics;

public class Method_1 {
	public void m1() {
		System.out.println("hello m1()");
	}
	public static void m2() {
		System.out.println("m2()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_1 obj = new Method_1();
		obj.m1();
		Method_1.m2();
		System.out.println("hello");

	}

}
