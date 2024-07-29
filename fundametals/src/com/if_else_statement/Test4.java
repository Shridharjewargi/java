package com.if_else_statement;

public class Test4 {
	public static void positiveEven(int num) {
		if(num>0) {
			if(num%2==0) {
				System.out.println("positive even");
			}else {
				System.out.println("positive odd");
			}
		}else {
			System.out.println("negative number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		positiveEven(5);

	}

}
