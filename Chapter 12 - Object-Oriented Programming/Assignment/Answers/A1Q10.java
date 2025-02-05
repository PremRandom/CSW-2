import java.util.ArrayList;
import java.util.List;

// Interface for Enrollment System (Loose Coupling)
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollments();
}

// Student Class
class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName;
    }
}

// Course Class
class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Name: " + courseName;
    }
}

// Enrollment Class (Handles Enrollment Operations) - High Cohesion
class Enrollment implements EnrollmentSystem {
    private List<String> enrollments = new ArrayList<>();

    @Override
    public void enrollStudent(Student student, Course course) {
        String record = student.getStudentName() + " enrolled in " + course.getCourseName();
        enrollments.add(record);
        System.out.println(record);
    }

    @Override
    public void dropStudent(Student student, Course course) {
        String record = student.getStudentName() + " enrolled in " + course.getCourseName();
        if (enrollments.contains(record)) {
            enrollments.remove(record);
            System.out.println(student.getStudentName() + " dropped " + course.getCourseName());
        } else {
            System.out.println(student.getStudentName() + " is not enrolled in " + course.getCourseName());
        }
    }

    @Override
    public void displayEnrollments() {
        if (enrollments.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            System.out.println("Enrollment Details:");
            for (String record : enrollments) {
                System.out.println(record);
            }
        }
    }
}

// Main Class
public class A1Q10 {
    public static void main(String[] args) {
        Enrollment enrollmentSystem = new Enrollment();

        // Creating students
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");

        // Creating courses
        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("CS102", "Operating Systems");

        // Enrolling students
        enrollmentSystem.enrollStudent(s1, c1);
        enrollmentSystem.enrollStudent(s2, c2);
        enrollmentSystem.enrollStudent(s1, c2);

        // Display enrollments
        System.out.println();
        enrollmentSystem.displayEnrollments();

        // Dropping a student
        System.out.println();
        enrollmentSystem.dropStudent(s1, c1);

        // Display enrollments after dropping
        System.out.println();
        enrollmentSystem.displayEnrollments();
    }
}
