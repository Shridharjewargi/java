package in.basics;

class Employee{
	int empId = 101;
	String empName = "aman";
	Employee(int id,String name){
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
		Employee a = new Employee(103,"kdjd");
		Employee b = new Employee(108,"fdds");
		
		a.showInfo();
		b.showInfo();

	}

}
