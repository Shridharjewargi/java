package in.basics;

public class This_II {
	int data;//instance variables
	This_II(int val){
		data = val;
	}
	public void m1() {
		System.out.println(this.data);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		obj.m1(obj);
		This_II obj = new This_II(10);
		obj.m1();

	}

}
