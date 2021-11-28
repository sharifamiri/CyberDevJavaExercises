package day23;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DRY PRINCIPLE
		//DO NOT REPET YOURSELF

		
//		for (int i = 1; i < 6; i++) {
//			System.out.print(i + " ");
//		}
//		
//		for (int i = 1; i < 6; i++) {
//			System.out.print(i + " ");
//		}

		for (int i = 0; i < 10; i++){
			System.out.println(i);
		}


		for (int i = 0; i < 5; i++){
			System.out.println("OUR i is: " + i);
			for (int j = 1; j < 3; j++){
				System.out.println("OUR j is: " + j);
			}
		}
		
		//NESTED LOOP
		
		for (int j = 0; j < 3; j++) {
			for (int i = 1; i < 5; i++) {
				System.out.println(i + " : " +j);
			}
			System.out.println();
	}
		
		
	}

}
