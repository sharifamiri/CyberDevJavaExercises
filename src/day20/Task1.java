package day20;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DO WHILE:
		String name = "Sharif";
		int count = name.length();
		int x =0;
		do {
			System.out.print(name.charAt(x) + " ");
			x++;

		} while (x<count);
		
		System.out.println();
		System.out.println("END");


		Scanner sn = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = sn.next();
		System.out.println(word.substring(2));
		System.out.println(word.substring(word.length()/2));

//		for(int i=4; i < word.length(); i++){
//			String name1 = word.substring(2);
//			System.out.println(name1);
//		}
		for(int i = 0; i < word.length()/2; i++){
			System.out.print(word.charAt(i));
		}
		System.out.println();
		//reverse
		String str = "";
		for(int i = word.length()-1; i >=0; i--){
			word += word.charAt(i);
		}
		System.out.println();
		for(int i = word.length()/2; i < word.length(); i++){
			System.out.print(word.charAt(i));
		}

		System.out.println();
		System.out.println(word);
		
	}

}
