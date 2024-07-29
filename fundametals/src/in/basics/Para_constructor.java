package in.basics;

class Employee_i{
	int empId = 101;
	String empName = "aman";
	Employee_i(int id,String name){
		empId = id;
		empName = name;
	}
	
	public void showInfo() {
		System.out.println("EmpId :" + empId + "EmpName :" + empName);
	}
}

public class Para_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_i a = new Employee_i(103,"kdjd");
		Employee_i b = new Employee_i(108,"fdds");
		
		a.showInfo();
		b.showInfo();

	}

}
