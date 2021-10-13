package day15;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "apple";
		word.toUpperCase();
		
		System.out.println(word); //APPLE
		System.out.println(word.toUpperCase()); //APPLE
		
		
		//System.out.println(""+word.charAt(4)+word.charAt(3));

		String name = "idris"; //sirdi
		int length = name.length();
		System.out.println(""+name.charAt(length-1)+name.charAt(length-2)+name.charAt(length-3)+name.charAt(length-4)+name.charAt(length-5));

		StringBuilder sb = new StringBuilder(name);
		StringBuilder sb2 = new StringBuilder("idris");
		sb.reverse();

		System.out.println(sb);
		
	}

}
