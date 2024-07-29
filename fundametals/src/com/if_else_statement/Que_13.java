package com.if_else_statement;

public class Que_13 {
	public static int totalAmt(int x,int y) {
		int money = 0;
		for(int i=1;i<=y;i++) {
			if(i>x) {
				money++;
			}
			money++;
		}
		return money;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Que_13.totalAmt(75, 85));

	}

}
