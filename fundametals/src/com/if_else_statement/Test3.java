package com.if_else_statement;

public class Test3 {
	public static void gradeSystem(int marks) {
		if(marks>80) {
			System.out.println("Distinction");
		}else if(marks>=60 && marks<80) {
			System.out.println("1st division");
		}else if(marks>=40 && marks<60) {
			System.out.println("2nd division");
		}else {
			System.out.println("try again");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gradeSystem(64);

	}

}
