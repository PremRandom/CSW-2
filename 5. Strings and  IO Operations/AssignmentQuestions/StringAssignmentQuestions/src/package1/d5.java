package package1;
import java.util.*;
import java.io.*;

public class d5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter directory path:");
        String directoryPath= sc.nextLine();
        File directory= new File(directoryPath);
        
        
        if(directory.exists() && directory.isDirectory()) {
        	String[] fAs= directory.list();
        	if(fAs != null && fAs.length >0) {
        		System.out.println("files and subdirectories in the directory");
        		for(String fdr : fAs) {
        			System.out.println(fdr);
        		}
        	}
        	else {
        		System.out.println("empty");
        	}
        	
	}else {
		System.out.println("directory doesnot exists");
	}
        sc.close(); 

}
}
