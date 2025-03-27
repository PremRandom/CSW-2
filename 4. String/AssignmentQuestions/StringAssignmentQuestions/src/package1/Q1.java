package package1;


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println("using string literals");
		System.out.println("str1==str2 => "+(str1==str2));
		
		System.out.println();
		
		System.out.println("using new keyword");
		System.out.println("str3==str4 => "+(str3==str4));
		System.out.println("str3.equals(str4) => "+(str3.equals(str4)));
		
		System.out.println();
		
		System.out.println("Comparision between new keyword and String ");
		System.out.println("str1==str3 => "+(str1==str4));
		
		System.out.println();
		
		System.out.println("Comparision between new keyword and String using equals");
		System.out.println("str1.equals(str3) => "+(str1.equals(str3)));
		
		System.out.println();
		
		System.out.println("Memory Usage");
		System.out.println("Memory used by str1 and str2 => "+ memoryUsage(str1));
		System.out.println("Memory used by str3 and str4 => "+ memoryUsage(str3));
		
	
		

	}
	
	static long memoryUsage(String str) {
		return 2*(str.length()) + 24;
	}

}
