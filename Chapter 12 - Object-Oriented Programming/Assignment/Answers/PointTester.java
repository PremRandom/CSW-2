// Point.java
class Point {
    private int x;
    private int y;

    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter and Setter methods
    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    // Display method
    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

// Main Class
public class PointTester {
    public static void main(String[] args) {
        // Creating an original point
        Point p1 = new Point(3, 4);
        System.out.println("Original point:");
        p1.display();

        // Creating a copy of p1
        Point p2 = new Point(p1);
        System.out.println("\nCopied point:");
        p2.display();

        // Modifying the original point
        p1.setX(7);
        p1.setY(8);
        System.out.println("\nAfter modifying original point:");

        p1.display();
        p2.display(); // p2 remains unchanged
    }
}
