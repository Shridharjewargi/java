package com.if_else_statement;
class DB{
	int username = 123;
	int password = 567;
	DB(int usr,int psw){
		this.username = usr;
		this.password = psw;
	}
}

public class Test5 {
	public static void login(int usr,int psw) {
		if(Username==usr) {
			if(psw==psw) {
				System.out.println("login");
			}else {
				System.out.println("invalide password");
			}
		}else {
			System.out.println("invalide username");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
