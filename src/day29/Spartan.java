package day29;

public class Spartan {

	//method is created inside class
	//it should not be inside any method (like man method)
	
	
	//method is an action --> always named like do something
	//method name just like variable name always start with 
	//lowercase by convention, use camelCase for multiple words
	
	
	public static void releaseTheHorse() {
		System.out.println("RELEASE IT NOW !!!");
		System.out.println("GOO !!!");
		
	}
	
	public static void holdYourHorse() {
		String owner1 = "Anar";
		
		System.out.println(owner1+ ": hold your horse");
	}
	
	public static void main(String[] args) {
		releaseTheHorse();
		Spartan.releaseTheHorse();
		Spartan.releaseTheHorse();
		//if you are in same class where the method is defined
		//className is optional
		
		releaseTheHorse();
		
		holdYourHorse();
		

		//release the horse
		
			//we will start with
		/*
		 * method that does not take external data
		 * method that does not return any value
		 * method that does not need an object to be called
		 
		 Arrays.toString(arr);
		 
		 Spartan.releaseTheHorse();
		 
		 *public --- access modifier -- to define where it can be used
		 *static --- non-access modifier
		 				if defined it means no object needed to call this
		 *Void --- it means this method only take action 
		 				and does not return any value

		 */
		
		
	}

}
