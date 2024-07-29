package in.basics;

public class Blocks {
	static int count =0;
	{
		count++;
	}
	public static void getCount() {
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blocks b1 = new Blocks();
		Blocks b2 = new Blocks();
		Blocks b3 = new Blocks();
		Blocks.getCount();

	}

}
