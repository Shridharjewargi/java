package com.if_else_statement;

import java.util.Scanner;

public class Temperature {
	public static void temp(int n) {
		if(n>30) {
			System.out.println("hot");
		}else if(n>20 && n<30) {
			System.out.println("warm");
		}else {
			System.out.println("cold");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Temperature.temp(a);

	}

}
