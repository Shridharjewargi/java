package in.basics;

public class Fac_num {
	public static int fac(int n) {
		if(n==0 || n==1 ) {
			return n;
		}
		return n*(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fac(5));

	}

}
