package day17;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TASK 2
		//How many iterations do we have? -->6
		//create a while loop where x is 0. As long as x is smaller or equal to 10 print "happy birthday"
		//plus x and increment x by 2; increment x+2;
		int x =0;
		while(x<=10) {
			System.out.println("Happy Birthday! " + (x+=2));
			//x += 2;
//			x = x +2;
//			x++;
		}
		
		
		//2nd Way:
		//How many iterations do we have? -->11
		//You have to stop it otherwise, it will print forever
			int y =0;
			while(y<=10) {
			    if(y%2==0)
				System.out.println("Happy Birthday! " + y);
				y++;
		}
			
		
//		//Task 3
//		
			int j =0;
			while(j<=100) {
			    if(j>=50 && j<=100 && j%2==1)
				System.out.println("Number is " + j);
				j++;
		}
				
		//Task 3
		
		int k = 100;
		while(k>=50 && k<=100 && k%2==0) {
			System.out.println("NUMBER is " + k);
			k++;
	}	
		
		
	}

}
