package assignment5;

import java.io.File;
import java.util.Scanner;



public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Directory address: ");
		String directoryName = sc.nextLine();
		
		File directory = new File(directoryName);
		String [] filesInDirectory = null;
		if(directory.exists() && directory.isDirectory()) {
			filesInDirectory = directory.list();
		}
		
		if(filesInDirectory != null && filesInDirectory.length>0) {
			System.out.println("Files Present in Directory");
			for(String file : filesInDirectory) {
				System.out.println(file);
			}
		}else {
			System.out.println("Directory Empty");
		}
		

		

	}

}
