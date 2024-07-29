package com.if_else_statement;

public class PorNorZ {
	public static void pos(int num) {
		if(num>0) {
			System.out.println("positive");
		}else if(num<0) {
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PorNorZ.pos(-2);

	}

}
