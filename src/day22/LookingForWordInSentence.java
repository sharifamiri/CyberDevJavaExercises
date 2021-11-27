package day22;

public class LookingForWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java kava ava";
		
		String target = "ava";
		
		//int firstIndex = str.indexOf(target);
		int lastIndex = str.lastIndexOf(target); //10
		
		int index = 0;
		      //0 <= 10
		while(index<=lastIndex) {
			index = str.indexOf(target, index); //1
			System.out.println("Found at index: " + index);
			//index = index+1;
			index = index+target.length(); //4
			System.out.println("Second index: " + index);
		}
		
		
		
	}

}
