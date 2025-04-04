package OOPS;

class Tutor {
	 String designate = "Tutor";
	 String academyName = "NewAcademy";
	 void performs() {
	 System.out.println("Tutoring");
	 }
	}
	public class st extends Tutor {
	 String subject = "Science";
	 public static void main(String args[]) {
	 st obj = new st();
	 System.out.println(obj.academyName);
	 System.out.println(obj.designate);
	 System.out.println(obj.subject);
	 obj.performs();
	 }
	}