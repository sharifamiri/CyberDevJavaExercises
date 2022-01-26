package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		Scanner scan = new Scanner(System.in);
		Double d = new Double("2.14");
		float f = 1.4f;
		
		//an ArrayList variable list1 is created
		//an ArrayList object is created and assigned to list1
		//it did not specifically what we can store in this arrayList
		//so we can store any type
		
		//1ST WAY

		int [] num = new int[3];
		num[0] = 2;
		num[2] = 3;
		num[1] = 6;
		System.out.println(Arrays.toString(num));

		ArrayList<String> listString = new ArrayList();
		listString.add("aaa");
		listString.add("bb");
		listString.add("cc");
		listString.add("aaa");
		listString.add("aaa");
		listString.add("aaa");
		listString.add("aaa");
		listString.add("aaa");

		ArrayList<Integer> listInt = new ArrayList();
		listInt.add(1);
		listInt.add(3);
		System.out.println("listInt: " + listInt.get(0));
		System.out.println("listInt: " + listInt);

		ArrayList<Character> listChar = new ArrayList();
		ArrayList<Boolean> listBln = new ArrayList();
		ArrayList<Double> listDbl = new ArrayList();






		ArrayList list1 = new ArrayList ();
		
		list1.add("abc");
		list1.add("efg");
		list1.add(new Integer(10));
		list1.add(Character.valueOf('A'));
		
		System.out.println(list1.get(0));
		
		
		
		//2ND WAY
		ArrayList <String> list2 = new ArrayList ();
		
		//list1 = <"java", "abc">;
		
		
		
		
	}

}
