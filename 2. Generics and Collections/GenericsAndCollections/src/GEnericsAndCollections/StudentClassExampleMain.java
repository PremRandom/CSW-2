package GEnericsAndCollections;


class Student<T>{
	private String name;
	private T rollNo;
	private int age;
	public Student(String name, T rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	void printDetails() {
		System.out.println("Name = "+this.name+"\nRollNo = "+this.rollNo+"\nAge = "+this.age+"\n");
	}
	
	String getName() {
		return this.name;
	}
	T getRollNo() {
		return this.rollNo;
	}
	int getAge() {
		return this.age;
	}
}



public class StudentClassExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student<Integer> S1 = new Student<Integer>("Pramathesh", 9043, 20);
		Student<String> S2 = new Student<String>("Prem", "abc181", 20);
		S1.printDetails();
		S2.printDetails();
		
		

	}

}
