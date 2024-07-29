package com.if_else_statement;

public class PrimeNo {
	public static void checkPrime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println("not prime");
			}
		}
		System.out.println("prime");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo.checkPrime(7);

	}

}
