package day15;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num1 = 3;
		int num2 = 5;
		int temp1 = num1;
		num1 = num2;
		num2 = temp1;
		System.out.println(num1 + " : " + num2);

		//x = 3;
		//y = 5;
		int x = 3;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + " : " + y);
		System.out.println("------------------------");















		int x1=10, y1=20;
		int temp;
		
		temp =x1; //10
		x1=y1;   //20
		y1=temp; //10
		
		//Task 2
		
		String first = "Sharif", last = "Amiri";
		
		char first1 = first.charAt(0);
		
		int countLast = last.length();
		char last1 = last.charAt(countLast-1);
		
		
		int firstNum = first1;
		System.out.println(firstNum);
		
		int lastNum = last1;
		System.out.println(lastNum);
		
		System.out.println(first1+last1);
		System.out.println(""+first1+last1);
		//System.out.print(first1);
		//System.out.print(last1);
		
		char character0 = '0';
		int zeroAsciiNumber = character0;
		System.out.println(zeroAsciiNumber);
		
		char characterA = 'A';
		System.out.println((int)characterA);
		
	}

}
