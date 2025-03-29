package assignment5;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myFile = new File("C:\\Users\\student\\Desktop\\2341019043\\CSW II\\String and File IO\\Assignment/test.txt");
			Scanner sc = new Scanner(myFile);
			String data;
			 while(sc.hasNextLine()) {
				 data = sc.nextLine();
				 System.out.println(data);
				 
			 }
			 sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
