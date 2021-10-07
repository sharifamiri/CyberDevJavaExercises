package day9;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String username = "cyberla";
		String password = "cybertek";
		
		
		System.out.println("Enter username");
		username = s.next();
		if(username.equals("admin")) {
			System.out.println("This is not the right place");
		}else {
			System.out.println("Enter password");
			password = s.next();
			boolean userExists = username.equals("saloh");
			boolean passwordCorrect = password.equals("saloh92");
			if (userExists && passwordCorrect){
				//if (userExists==true && passwordCorrect==true){
				//if(!true) --> Always false...never use
				System.out.println("login successful");
			}else {
				System.out.println("username or password is incorrect");
			}
		}

		

		
		//if(username.equals("cyberla") && password.equals("cybertek")) {

	
		s.close(); //it closes the 
	}

}
