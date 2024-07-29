package in.basics;
//object class :parent
class CarInfo{
	CarInfo(){
		System.out.println("current value of this ---->"+this.hashCode());
	}
}

public class This_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarInfo obj = new CarInfo();
		System.out.println("obj"+obj.hashCode());
		
		System.out.println("____________");
		CarInfo obj2 = new CarInfo();
		System.out.println("obj2"+obj2.hashCode());

	}

}
