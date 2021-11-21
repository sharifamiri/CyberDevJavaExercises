package day20;

public class ForLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<5; i++) {
			System.out.println("Okan Happy Birthday");
		}

		int j = 0;
		while (j < 5){
			System.out.println("Happy birthday");
			j++;
		}
		//if you have one statement, curly braces are optional
		
		//count 1 to 10
		//count from 10 to 1
		
		for(int x=1; x<=10; x++) {
			System.out.print(x+ " ");
		}
		
		System.out.println();
		for(int y=10; y>=1; y--) {
			System.out.print(y+ " ");
		}

		System.out.println();
		String name = "saloh";
		for (int i = 0; i < name.length(); i++){
			System.out.print(name.charAt(i) + " ");
		}
	}

}
