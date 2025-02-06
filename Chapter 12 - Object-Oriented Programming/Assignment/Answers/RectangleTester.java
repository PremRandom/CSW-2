// Rectangle.java
class Rectangle {
    // Private attributes
    private double length;
    private double width;

    // Constructor to initialize attributes
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Rectangle: Length = " + length + ", Width = " + width);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }
}

// Main Class
public class RectangleTester {
    public static void main(String[] args) {
        // Creating a rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Displaying details
        rect.displayDetails();

        // Modifying attributes
        rect.setLength(7.5);
        rect.setWidth(4.2);

        System.out.println("\nAfter modifying dimensions:");
        rect.displayDetails();
    }
}
