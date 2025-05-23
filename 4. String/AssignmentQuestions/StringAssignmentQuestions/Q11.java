
package assignment5;

import java.io.*;
import java.util.*;
import java.text.*;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File file = new File("C:\\Users\\student\\Desktop\\2341019043\\CSW II\\String and File IO\\Assignment/test.txt"); 
		
		if(file.exists()) {
			System.out.println("File 'test.txt' already exists, entries will be appended");
		}
		else {
			System.out.println("File 'test.txt' does not exists, Creating new file");
		}
		System.out.println("Enter your diary entry");
		String entry = scanner.nextLine();
		String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		
		try(FileWriter writer = new FileWriter(file, true)){
			writer.write("Date : "+currentDate+"\n");
			writer.write("Entry: "+ entry+"\n");
			writer.write("--------------------------\n");
			System.out.println("Your diary Entry has been recoreded");
			System.out.println("Current date: "+ currentDate);
			
		}catch(IOException e) {
			System.out.println("An error Occured while writing the file");
			e.printStackTrace();
		}finally {
			scanner.close();
		}

	}

}
