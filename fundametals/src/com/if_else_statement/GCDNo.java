package com.if_else_statement;

public class GCDNo {
	public static int checkGCD(int a,int b) {
		while(a>0 && b>0 && a!=b) {
			if(a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCDNo.checkGCD(16,14));
	}

}
