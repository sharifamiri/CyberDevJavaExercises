package day26;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    /*
	     *  3 ways to create an array 
	     * */
	    String names[] = new String[5] ; // --> default value is null for each items
	       names[0] = "abc" ; 
	       names[1] = "ef" ; 
	       names[2] = "gh" ; 
	     
	     System.out.println(Arrays.toString(names) );    
	     
	     String[] names2 = new String[] {"aaa","bbb", "" , "ccc"} ; 
	     
	     int x = 0 ; 
	     while(x< names2.length) {
	       
	       System.out.println(  names2[x] );
	       x++ ; 
	     }
	     
	     // This must happen in one statenment 
	     String[] names3  =  {"asdads","ssss0"} ;

	     String str = "Idris Salohiddin Sharif";
	     String [] strArr = str.split(" ");
		System.out.println(Arrays.toString(strArr));
		//idris-5,sal..-10, sharif-6
		System.out.println(strArr[0] +" - " +strArr[0].length() +"\n" + strArr[1] +" - " +strArr[1].length() +
				"\n" + strArr[2] +" - " +strArr[2].length());
		
	}

}
