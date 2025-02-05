// Vehicle interface
interface Vehicle {
    void accelerate();
    void brake();
}

// Car class implementing Vehicle interface
class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is slowing down.");
    }

    // Method overloading: different versions of accelerate()
    public void accelerate(int speed) {
        System.out.println("Car accelerates to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car accelerates to " + speed + " km/h in " + duration + " seconds.");
    }
}

// Bicycle class implementing Vehicle interface
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is speeding up.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is stopping.");
    }

    // Method overloading: different versions of accelerate()
    public void accelerate(double effort) {
        System.out.println("Bicycle speeds up with " + effort + " effort level.");
    }
}

// Main class
public class A1Q9 {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bicycle myBicycle = new Bicycle();

        // Testing overridden methods
        myCar.accelerate();
        myCar.brake();
        myBicycle.accelerate();
        myBicycle.brake();

        System.out.println();

        // Testing method overloading
        myCar.accelerate(100);
        myCar.accelerate(120, 5);
        myBicycle.accelerate(3.5);
    }
}
