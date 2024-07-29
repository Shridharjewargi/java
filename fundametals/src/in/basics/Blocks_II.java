package in.basics;

public class Blocks_II {
	static {
		System.out.println("static block");
	}
	public Blocks_II(){
		System.out.println("constructor");
	}
	{
		System.out.println("iib ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blocks_II a = new Blocks_II();
	}

}
