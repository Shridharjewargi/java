package in.basics;
class Pen{
	Pen(){
//		this(10);
		System.out.println("no-arg called");
	}
	Pen(int a){
		this();
		System.out.println("one-arg called");
	}
}

public class This_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Pen();

	}

}
