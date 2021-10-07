package day11;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String username = s.next();//"saloh";
		String password = s.next();//"saloh92";

		String usernameFromDatabase = "";

		
		if(username.equals(usernameFromDatabase) && password.equals("saloh92")) {
			
			System.out.println("\" login successful \"");
		}else {
			if(! username.equals("saloh")) {
				System.out.println("Username not found");
			}else {
				System.out.println("Password not Correct");
			}
		}

	}

}
