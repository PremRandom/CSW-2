package package1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		
		System.out.println("Enter a character to search: ");
		char c = sc.next().charAt(0);
		
		char [] charArr = s.toCharArray();
		
		int fIndex = -1;
		int lIndex = -1;
		
		for(int i = 0; i<charArr.length; i++) {
			if(charArr[i]== c) {
				lIndex = i;
				if(fIndex == -1) {
					fIndex = i;
				}
			}	
		}
		if(fIndex != -1) {
			System.out.println("length = "+s.length()+", first = "+fIndex+", last = "+ lIndex);
		}
		else {
			System.out.println("Character Not Found");
		}
		
	}

}
