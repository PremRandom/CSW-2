import java.util.ArrayList;

// Image class from Q4
class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image(int width, int height, String color) {
        this.imageWidth = width;
        this.imageHeight = height;
        this.colorCode = color;
    }

    public int getImageWidth() { return imageWidth; }
    public int getImageHeight() { return imageHeight; }
    public String getColorCode() { return colorCode; }

    @Override
    public String toString() {
        return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ", Color: " + colorCode + "]";
    }
}

// ImageLibrary class to manage Image objects
class ImageLibrary {
    private ArrayList<Image> images;

    public ImageLibrary() {
        this.images = new ArrayList<>();
    }

    // Method to add an image
    public void addImage(Image image) {
        images.add(image);
        System.out.println("Image added: " + image);
    }

    // Method to search an image by color
    public Image searchImage(String colorCode) {
        for (Image img : images) {
            if (img.getColorCode().equalsIgnoreCase(colorCode)) {
                return img;
            }
        }
        return null;
    }

    // Method to get all images
    public void displayImages() {
        if (images.isEmpty()) {
            System.out.println("No images in the library.");
        } else {
            System.out.println("Image Library Contents:");
            for (Image img : images) {
                System.out.println(img);
            }
        }
    }
}

// Main class
public class A1Q5 {
    public static void main(String[] args) {
        ImageLibrary imgLibrary = new ImageLibrary();

        // Adding images
        imgLibrary.addImage(new Image(1920, 1080, "Blue"));
        imgLibrary.addImage(new Image(1280, 720, "Red"));
        imgLibrary.addImage(new Image(800, 600, "Green"));

        // Displaying all images
        imgLibrary.displayImages();

        // Searching for an image
        String searchColor = "Red";
        Image foundImage = imgLibrary.searchImage(searchColor);

        if (foundImage != null) {
            System.out.println("\nFound image with color " + searchColor + ": " + foundImage);
        } else {
            System.out.println("\nNo image found with color " + searchColor);
        }
    }
}
