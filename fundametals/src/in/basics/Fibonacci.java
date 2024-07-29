package in.basics;

public class Fibonacci {
	public static int Fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return Fib(n-1)+Fib(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<10;i++) {
			System.out.println(Fib(i));
		}

	}
}
