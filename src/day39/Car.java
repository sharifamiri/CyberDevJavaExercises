package day39;

public class Car {

	//instance variable / field
	String make;
	static String model;
	int year;
	double price;
	short horsePower;
	boolean isConvertable;
	Car car = new Car();
	
	public static void main(String[] args) {

		int num = 2;
	    // default values for fields
	    // if it's not defined 
	    /*
	     * Any reference type field --> null 
	     * Any whole numbers type ---> 0 
	     * Any fractional numbers type --> 0.0
	     * char ----> empty char acii 0
	     * boolean --> false  
	     * */
//	    int i ; 
//	    System.out.println(i);
	//    
	    
	    Car c1=new Car();
	    model     = "Toros";
	    c1.make      = "Toyota";
	    c1.year      = 2019;
	    c1.price     = 60000;
	    c1.horsePower = 200;
	    
	    System.out.println(c1.model );
	    System.out.println(c1.make );
	    System.out.println(c1.year );
	    System.out.println(c1.price );
	    System.out.println(c1.horsePower );
	    System.out.println(c1.isConvertable );
	}

	public static void test(int var){
		model = "Toyota";
		Car car = new Car();
		car.make = "Camry";
	}

	public static void test2(int var){
		String model = "Toyota";
	}

}
