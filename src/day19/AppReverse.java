package day19;

import java.util.Scanner;

public class AppReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER:");
		String name = sc.next();//"java";
		int length = name.length();
		char ch1 = name.charAt(length-1);
		char ch2 = name.charAt(length-2);
		char ch3 = name.charAt(length-3);
		char ch4 = name.charAt(length-4);

		System.out.print(""+ch1 + ch2 + ch3 + ch4);
		System.out.println();

		//Better way. efficient way..preferred way
		int size = name.length()-1;
		String reverseWord = "";
		while (size >= 0){
			reverseWord += name.charAt(size);
			//System.out.print(name.charAt(size));
			size--;
		}
		System.out.println(reverseWord);





		String app = "app";
		String reversedApp = "";
		
		reversedApp = reversedApp + app.charAt(2);
		
		System.out.println(reversedApp);
		
		reversedApp = reversedApp + app.charAt(1);
		
		System.out.println(reversedApp);
		
		//we can use this way:
		reversedApp += app.charAt(0);
		
		System.out.println(reversedApp);
		
		int x=2;
		while(x>=0) {
			
			reversedApp += app.charAt(x);
			System.out.print(reversedApp);
			//System.out.println(x);
			x--;
		}
		
		System.out.println("Reversed: " + reversedApp);
	}

}
