// College class
class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() { return collegeName; }
    public String getCollegeLoc() { return collegeLoc; }

    @Override
    public String toString() {
        return "College: " + collegeName + " (Location: " + collegeLoc + ")";
    }
}

// Student class with a reference to a College object
class Student {
    private int studentId;
    private String studentName;
    private College college; // Association with College

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println(college);
        System.out.println("----------------------------");
    }
}

// Main class
public class A1Q6 {
    public static void main(String[] args) {
        // Creating College objects
        College c1 = new College("ABC University", "New York");
        College c2 = new College("XYZ College", "California");

        // Creating Student objects
        Student s1 = new Student(101, "Alice", c1);
        Student s2 = new Student(102, "Bob", c2);
        Student s3 = new Student(103, "Charlie", c1); // Multiple students in one college

        // Displaying student and college details
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}
