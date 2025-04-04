package package1;
import java.io.*;
public class d2 {
	public static void main(String[]args) {
		try {
			FileWriter myWriter= new FileWriter("filename.txt");
			myWriter.write("hello");
			myWriter.close();
			System.out.println("success.....");
			
		
	}catch(Exception e) {System.out.println("an error ocurred");
	e.printStackTrace();
	}
	
		
	}

}
