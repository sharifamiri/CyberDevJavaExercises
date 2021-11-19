package day19;



		import java.util.Scanner;

		public class BreakingOutOfWhileLoop {

		  public static void main(String[] args) {
		    
		    // ask user to enter a word
		    // keep asking if its not correct 
		    // but stop asking if user try 3 times 


			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter:");
			  String str = sc.next();

			  int cnt = 0;
			  while (!str.equals("yes")){
				  if(cnt == 3){
					  break;
				  }
				  System.out.println("Enter2");
				  str = sc.next();
				  cnt++;
			  }





		    Scanner scan = new Scanner(System.in); 
		    String word = "java";
		    
		    int count = 0 ;

		    boolean bln = word.equalsIgnoreCase("java");
		    
		    while(bln == false ) {
		    
		      System.out.println("Enter the magic word");
		      
		      word = scan.next();
		      count ++ ; 
		      if(count==3) {
		        System.out.println("NEXT TIME Try harder");
		        break ; 
		      }
		      
		    }
		    
		    // break; 
//		    int x = 10 ;
//		    while (x<100) {
//		      
//		      System.out.println(x++);
//		      //if(x==15) {
//		        break; 
//		      //}
//		      
//		    }
		    System.out.println("END");
		    

	}

	
		
	}


