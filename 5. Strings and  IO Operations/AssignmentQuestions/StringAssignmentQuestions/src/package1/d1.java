package package1;
import java.io.*;
import java.util.*;
import java.text.*;

class d1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		File file=new File("abc.txt");
		if(file.exists()) {
			System.out.println("file exists");
			
		}
		else {
			System.out.println("file doesnot exist");
		}
		System.out.println("entry diary entry");
		String entry=sc.nextLine();
		String CurrentDate=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date());
		try (FileWriter writer=new FileWriter(file,true)){
			writer.write("date:"+CurrentDate+"\n");
			writer.write("entry:"+entry+"\n");
			writer.write("------\n");
			System.out.println("your diary entry is saved successfully");
			System.out.println("date"+CurrentDate);
			
		}catch(IOException e) {
			System.out.println("error occurred");
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
