package com.if_else_statement;

import java.util.Scanner;

public class Rectangle {
	public static void area(int l,int b) {
		if(l==b) {
			System.out.println("square");
		}else {
			System.out.println("Not");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int breadth = s.nextInt();
		Rectangle.area(length,breadth);

	}

}
