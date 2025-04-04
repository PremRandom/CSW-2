package package1;
import java.util.*;
import java.io.*;

class d6 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file to delete:");
		String fN=sc.nextLine();
		
		File file=new File(fN);
		if(file.delete()){
			System.out.println("file deleted successfully");
			
			
		}else {
			System.out.println("not found doesnt exist");
		}
		sc.close();
	}

}
