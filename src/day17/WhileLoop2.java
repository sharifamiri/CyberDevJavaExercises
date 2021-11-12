package day17;

public class WhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 0;
//		while (x<10) {
//			
//			System.out.println("value of x is: " + ++x);
//		}
		int num = 0;
		while (num < 10){
			System.out.println("x is : " + num++);
		}
		
		System.out.println("jasdajk" + "\nsjkf");
		int x = 0;
		while (x++<10) {
			
			System.out.println("value of x is: " + x);
		}
		
		int y =50;
		while (y<100 && y%2==0) { 
		System.out.println(y); 
		y ++; 	
		}
		
		int a1=25;
		int i = 0;
        while (50>a1) {
        	i++;
        System.out.println(i +" : i am even: "+ (a1 + ++a1));}
        
        
	}

}
