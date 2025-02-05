// Image.java
class Image {
    // Attributes
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    // Default Constructor
    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "Undefined";
    }

    // Parameterized Constructor
    public Image(int width, int height, String color) {
        this.imageWidth = width;
        this.imageHeight = height;
        this.colorCode = color;
    }

    // Getter and Setter Methods
    public int getImageWidth() { return imageWidth; }
    public int getImageHeight() { return imageHeight; }
    public String getColorCode() { return colorCode; }

    public void setImageWidth(int width) { this.imageWidth = width; }
    public void setImageHeight(int height) { this.imageHeight = height; }
    public void setColorCode(String color) { this.colorCode = color; }

    // Overriding toString() to display object details
    @Override
    public String toString() {
        return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ", Color: " + colorCode + "]";
    }
}

// Main Class
public class ImageTester {
    public static void main(String[] args) {
        // Creating objects using constructors
        Image defaultImage = new Image(); // Using default constructor
        Image customImage = new Image(1920, 1080, "Blue"); // Using parameterized constructor

        // Displaying details
        System.out.println("Default Image: " + defaultImage);
        System.out.println("Custom Image: " + customImage);

        // Modifying attributes using setters
        defaultImage.setImageWidth(1280);
        defaultImage.setImageHeight(720);
        defaultImage.setColorCode("Red");

        System.out.println("\nAfter modifying default image:");
        System.out.println(defaultImage);
    }
}
