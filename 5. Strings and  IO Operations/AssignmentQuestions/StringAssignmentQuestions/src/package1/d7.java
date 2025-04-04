package package1;
import java.io.*;

class d7 {
	public static void main(String[]args) {
		try {
			
		
		String sFile="abc.txt";
		String dFile="xyz.txt";
		FileReader reader=new FileReader(sFile);
		FileWriter writer=new FileWriter(dFile);
		int c;
		while((c=reader.read())!=-1){
			writer.write((char)c);
		}
		System.out.println("copied successful");
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
