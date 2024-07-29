package com.if_else_statement;

public class Test {
	public static boolean isEven(int num) {
		boolean flag = false;
		if(num%2==0) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		boolean resu = Test.isEven(num);
		System.out.println("Is "+num+" even : "+resu);

	}

}
