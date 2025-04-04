package package1;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter second String : ");
		String str2 = sc.nextLine();
		
		String str1LC = str1.toLowerCase();
		String str1UC = str1.toUpperCase();
		
		String str2LC = str2.toLowerCase();
		String str2UC = str2.toUpperCase();
		
		boolean isEqual = str1LC.equals(str2UC);
		
		System.out.println("\nConverted Strings");
		System.out.println("First String(lower case): "+str1LC);
		System.out.println("First String(upper case): "+str1UC);
		System.out.println("First String(lower case): "+str2LC);
		System.out.println("First String(upper case): "+str2UC);
		
		System.out.println("Results of case insensitiveness");
		
		if(isEqual) {
			System.out.println("Strings are not Case sensitive");
		}
		else {
			System.out.println("Strings are Case sensitive");
		}
	
		
		
		
		
		
		
	}

}
