package in.basics;

public class Naturalnum {
	static int sum = 0;
	public static int getSum(int n) {
		if(n>10) {
			return sum;
		}
		sum +=n;
		return getSum(n+1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(1));

	}

}
