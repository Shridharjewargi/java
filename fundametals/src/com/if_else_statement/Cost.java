package com.if_else_statement;

import java.util.Scanner;

public class Cost {
	public static int discount(int q) {
		int totalCost = q*100;
		if(totalCost>1000) {
			totalCost = (int)(totalCost -(totalCost*0.1));
			return totalCost;
		}
		return totalCost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the quantity");
		int q = sc.nextInt();
		int cost = discount(q);
		System.out.println("cost to user :"+cost);

	}

}
