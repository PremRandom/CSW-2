package GEnericsAndCollections;

class Box<T>{
	private T value;
	public Box(T value) {
		this.value = value;
	}
	
	
	public String toString() {
		return "Box contains : "+ value;
	}
	
}



public class OverrideToString {
	public static void main(String[]args) {
		Box<Integer> intBox = new Box<>(100);
		System.out.println(intBox);
		Box<Double> dblBox = new Box<>(1000.11);
		System.out.println(dblBox);
	}

}
