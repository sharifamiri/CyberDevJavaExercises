package day19;

import java.util.Locale;

public class IgnoreCaseVsContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "While Loop";
		
		  System.out.println(  str.equalsIgnoreCase("while loop") );
		  System.out.println(  str.equalsIgnoreCase("while") );
		  System.out.println(  str.contains("While") );
		  System.out.println(  str.contains("while") );
		  
		  System.out.println(  str.toLowerCase().contains("while") );

		  String name = "Idris";
		  System.out.println(name.equalsIgnoreCase("idris"));
		  
		    
		
	}

}
