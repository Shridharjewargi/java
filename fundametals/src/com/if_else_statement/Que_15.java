package com.if_else_statement;

public class Que_15 {
	public static int countDigit(int n) {
		int digit=0;
		while(n>0) {
			int r = n%10;
			digit++;
			n = n/10;
		}
		return digit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Que_15.countDigit(000));

	}

}
