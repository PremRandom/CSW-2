package GEnericsAndCollections;

class Test<T>{
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	

	public boolean equals(Object Q) {
		if(this==Q) {
			return true;
		}
		if(Q==null || getClass()!= Q.getClass()) {
			return false;
		}
		Test<?> other = (Test<?>) Q;
		return obj.equals(other.obj);
	}
}


public class OverrideEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> obj1 = new Test<>(10);
		Test<Integer> obj2 = new Test<>(20);
		Test<Integer> obj3 = obj1;
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1.equals(obj2));
		
		
		
	}
	

}
