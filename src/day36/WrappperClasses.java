package day36;

import java.util.ArrayList;

public class WrappperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// boolean , char , byte, short , int , long 
	    // float , double
	    
	    /*
	     * Wrapper class --> 
	     * specifically designed to 
	     * store primitive value as object 
	     * 
	     * */
		
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("false");
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = Boolean.valueOf("true");
		
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Integer i = new Integer(123);
		Integer i1 = new Integer("123");
		Integer i2 = Integer.valueOf(123);
		Integer i3 = Integer.valueOf("123");
		
		System.out.println("Equal?: "+i.equals(123));
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		Character c1 = new Character('c');
		Character c2 = Character.valueOf('c');
		
		System.out.println(c1);
		System.out.println(c2.toString());

		int num = 2;
		System.out.println(num);
		Integer integer = 3;

		int [] arr = new int[2];
		arr[0] = num;
		arr[1] = integer;

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(num);
		nums.add(integer);
		
		
		
	
		
	}

}
