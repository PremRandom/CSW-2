// Car.java
class Car {
    // Private fields (Encapsulation)
    private String make;
    private String model;

    // Parameterized Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Display method
    public void displayCarDetails() {
        System.out.println("Car Make: " + make + ", Model: " + model);
    }
}

// CarTester.java
public class CarTester {
    public static void main(String[] args) {
        // Creating car objects
        Car myCar1 = new Car("Toyota", "Camry");
        Car myCar2 = new Car(null, null); // Initially null values

        // Printing initial details
        System.out.println("Before updating:");
        myCar1.displayCarDetails();
        myCar2.displayCarDetails();

        // Updating myCar2 details using setters
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        // Printing updated details
        System.out.println("\nAfter updating:");
        myCar2.displayCarDetails();
    }
}
