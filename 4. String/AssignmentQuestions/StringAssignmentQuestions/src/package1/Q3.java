package package1;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Initial String");
		
		StringBuffer sb = new StringBuffer(sc.nextLine());
		
		
		
		
		while (true) {
			System.out.println("Current String : "+ sb);
			System.out.println("1. Add substring at a specific location");
			System.out.println("2. Remove a range of character");
			System.out.println("3. Modify a Character at a Specific location");
			System.out.println("4. Concatenate with another String");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1: 
				System.out.println("Enter a Substring to add");
				String subString = sc.nextLine();
				System.out.println("Enter the Position");
				int pos = sc.nextInt();
				if(pos>=0 && pos< sb.length()) {
					sb.insert(pos, subString);
				}
				else {
					System.out.println("Invalid");
				}
				break;
				
				
			case 2:
				System.out.println("Enter the Starting index to remove");
				int start = sc.nextInt();
				System.out.println("Enter the Ending index to remove");
				int end = sc.nextInt();
				if(start>=0 && end<= sb.length() && start<end) {
					sb.delete(start, end);
				}
				else {
					System.out.println("Invalid");
				}
				break;
				
				
			case 3:
				System.out.println("Enter the index to replace");
				int position = sc.nextInt();
				if (position >= 0 && position < sb.length()) {
					System.out.println("Enter character to replace");
					char temp = sc.next().charAt(0);
					sb.setCharAt(position, temp);
				}
				else {
					System.out.println("Invalid");
				}
				break;
	
				
			case 4:
				System.out.println("Enter a String to Concatenate");
				String str = sc.nextLine();
				sb.append(str);
				break;
			
				
			case 5:
				System.out.println("Exiting...");
				sc.close();
				break;
				
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}				
		}
	}
}
