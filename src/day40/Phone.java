package day40;

public class Phone {
	//these parameters will be accessed only through the object
	//if you are outside the class
	//these are instance variables 
	String brand;
	String model;
	String OS;
	int storageSize;
	double screenSize;
	int ram;
	int camera;
	double price;
	String color;
	boolean isWaterResistant;
	boolean supports5G;
	String cpu;
	long imei;
	
	
	public void call() {
		System.out.println("Phone is calling");
	}
	
	public void ring() {
		System.out.println("Phone is ringing");
	}
	
	public void dial(long phoneNumber) {
		System.out.println("Dialing..."+phoneNumber);
	}
	
	public void sendSMS(String sms, long phoneNumber) {
		System.out.println("Sending sms: "+sms+", to: "+phoneNumber);
	}
	
	public void printInfo() {
		System.out.println(brand +" : "+model);
	}

	@Override
	public String toString() {
		return "Phone{" +
				"brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", OS='" + OS + '\'' +
				", storageSize=" + storageSize +
				", screenSize=" + screenSize +
				", ram=" + ram +
				", camera=" + camera +
				", price=" + price +
				", color='" + color + '\'' +
				", isWaterResistant=" + isWaterResistant +
				", supports5G=" + supports5G +
				", cpu='" + cpu + '\'' +
				", imei=" + imei +
				'}';
	}
}
