package in.basics;

public class PowerNumber {
	public static int Pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		return Pow(a,b-1)*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pow(2,3));

	}

}
