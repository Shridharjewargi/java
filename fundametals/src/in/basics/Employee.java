package in.basics;
class EmpInfo {
	int EmpId;
	String EmpName;
	
	EmpInfo(int id,String name){
		EmpId = id;
		EmpName = name;
	}
	public void show() {
		System.out.println("empid"+this.EmpId+"empname"+this.EmpName);
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpInfo a = new EmpInfo(101,"aman");
		a.show();

	}

}
