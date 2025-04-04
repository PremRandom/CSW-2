package OOPS;
class OverloadMethods {
	 public void displaying(char a) {
	 System.out.println(a);
	 }
	 public void displaying(char a, int num) {
	 System.out.println(a + " and " + num);
	 }
	}
	public class OE {
	 public static void main(String[] args) {
	 OverloadMethods obj = new OverloadMethods();
	 obj.displaying('A');
	 obj.displaying('A', 100);
	 }
	}