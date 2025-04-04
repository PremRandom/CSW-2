package package1;
import java.io.*;
import java.util.*;

class d3 {
	public static void main(String[]args) {
		try {
			File myobject=new File("abc.txt");
			Scanner sc=new Scanner(myobject);
			while(sc.hasNextLine()) {
				String data=sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
