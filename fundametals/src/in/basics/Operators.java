package in.basics;

public class Operators {
	public static void m1() {
		int a =10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("__________________________________");
	}
	public static void relational() {
		int x =20;
		int y =40;
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x!=y);
		System.out.println("_________________________________");
	}
	public static void logical() {
		int x = 25;
		int y = 40;
		boolean res = !(!(x>y)||(x==y)&&(x!=y));
		System.out.println(res);
		System.out.println("_________________________________");
	}
	public static void ternary() {
//		cond ? exp1 : exp2
		int x = 21;
		int y =20;
		int res = (x>y)? 1:0;
		System.out.println(res);
		System.out.println("__________________________________");
	}
	public static void unary() {
		int a=10;
		int b=++a;
		System.out.println(a+" "+b);
		System.out.println("__________________________________");
		
		int c =21;
		int d =c++;
		System.out.println(c);
		System.out.println(d);
		
		int x = -12;
		int res1 = ~x;  //~x = -(x+1)
		System.out.println(res1);
		System.out.println("__________________________________");
		
	}
	public static void bitwise() {
		int a=10;
		int b=14;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
	}
	public static void shift() {
		int num = 10;
		System.out.println(num<<5);  //num*2^m
		
		int num1 = 200;
		System.out.println(num1>>5);  //num/2^m
	}
	public static void assignmentOperation() {
		int a =10;
		a +=20;
		System.out.println(a);
	}
	public static void instanceofOperation() {
		String str = "java";
		if(str instanceof String) {
			System.out.println(str.length());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operators.m1();
		Operators.relational();
		Operators.logical();
		Operators.ternary();
		Operators.unary();
		Operators.bitwise();
		Operators.shift();
		Operators.assignmentOperation();
		Operators.instanceofOperation();
		

	}

}
