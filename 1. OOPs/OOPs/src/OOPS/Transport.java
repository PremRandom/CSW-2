package OOPS;

public class Transport {
	 void run() {
	 System.out.println("We use transport vehicles for movement.");
	 }
	 public static void main(String[] args) {
	 Truck obj = new Truck();
	 obj.run();
	 }
	}
	class Truck extends Transport {
	 void run() {
	 System.out.println("We use trucks for transporting loads.");
	 }
	}
