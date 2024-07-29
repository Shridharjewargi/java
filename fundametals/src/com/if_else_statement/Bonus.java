package com.if_else_statement;

import java.util.Scanner;

public class Bonus {
	public static int salary(int sal,int year) {
		if(year>5) {
			sal = (int) (sal+(sal*0.5));
			return sal;
		}
		return sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(Bonus.salary(a, b));

	}

}
