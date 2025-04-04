package GEnericsAndCollections;


class Box <T extends Comparable<T>> implements Comparable<Box<T>>{
	private T value;
	public Box(T value) {
		this.value = value;
	}
	
	public int compareTo(Box<T> other) {
		return this.value.compareTo(other.value);
	}
	
	public String toString() {
		return "Box("+this.value+")";
	}
}



public class OverrideCompareTo {
	
	public static void main(String[]args) {
		Box<Integer> b1 = new Box<Integer>(50);
		Box<Integer> b1 = new Box<Integer>(50);
		Box<Integer> b1 = new Box<Integer>(50);
		
	}

}
