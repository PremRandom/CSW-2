package package1;

import java.io.File;

class d8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File f1=new File("input.txt");
			File f2=new File("int.txt");
			boolean flag=f1.renameTo(f2);
			if(flag==true) {
				System.out.println("succesfully renamed");
			}else {
				System.out.println("try again");
			}
	}

}
