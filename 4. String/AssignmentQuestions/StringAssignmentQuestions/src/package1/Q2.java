package package1;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = str1.concat("World");
		
		System.out.println("String Immutability");
		System.out.println("Original String: "+ str1);
		System.out.println("Concatenated String: "+ str2);
		System.out.println("str1 after concatenation: " + str1);
		
		CharSequence sc = str1;
		System.out.println("CharSequence Interface in Java");
		System.out.println("Sequence Length : "+ sc.length());
		System.out.println("Character at 2nd index : " + sc.charAt(2));
		System.out.println("subSequence from index 1 to 4 : " + sc.subSequence(1, 4));
		System.out.println("Reversed Sequence : " + reverse(sc));
		
		
		
		
		

	}
	private static CharSequence reverse(CharSequence sc1) {
		StringBuffer reversed = new StringBuffer(sc1);
		return reversed.reverse().toString();
	}

}
