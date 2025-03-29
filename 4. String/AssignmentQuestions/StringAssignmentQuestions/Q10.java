package assignment5;

import java.io.FileWriter;

public class Q10 {
	public static void main(String[]args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\student\\Desktop\\2341019043\\CSW II\\String and File IO\\Assignment/test.txt", true);
			myWriter.write("\nthis entry is not done through dairy writer\n\n");
			myWriter.close();
			
		}catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
