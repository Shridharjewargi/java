package com.if_else_statement;

public class VowelsOrConsonant {
	public static void check(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("vowels");
		}else {
			System.out.println("consonant");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelsOrConsonant.check('a');

	}

}
