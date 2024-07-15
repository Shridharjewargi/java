package in.basics;
class StudentData{
	int stuId;
	String StuName;
	StudentData(int id, String name){
		stuId = id;
		StuName = name;
	}
	StudentData(StudentData obj){
		stuId = obj.stuId;
		StuName = obj.StuName;
	}
	public void show() {
		System.out.println(stuId+" "+StuName);
	}
}

public class Copy_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData s1 = new StudentData(101,"harsh");
		s1.show();
		StudentData s2 = new StudentData(s1);

	}

}
