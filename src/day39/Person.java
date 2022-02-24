package day39;



	import java.util.Random;
	import java.util.Scanner;

	public class Person {

	  // properties/attributes of the object are defined
	  // by instance variable/field
	  String name;
	  int age;
	  char gender;
	  
	  //public static void eat() {
	  //any non-static method is called instance method
	  public void eat() {
		  System.out.println("eating");
	  }
	  
	  public void tellMeYourName() {
		  System.out.println("My name: " + name);
	  }
	  
	  public void printPersonInfo() {
		    System.out.println("My Name is :  " + name  
		            + "| my age is : " + age 
		            + "| my gender is " + gender ) ; 
		        
	  }

		public static void main(String[] args) {
			Person p1 = new Person();
			p1.eat();
			p1.name = "saloh";
			p1.tellMeYourName();
		}
	  
	}


