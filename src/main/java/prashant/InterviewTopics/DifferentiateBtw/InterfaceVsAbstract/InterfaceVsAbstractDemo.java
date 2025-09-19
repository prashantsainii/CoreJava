package prashant.InterviewTopics.DifferentiateBtw.InterfaceVsAbstract;

// Interface with abstract, default, and static methods
interface Vehicle {
    // Declared (abstract) method
    void start();

    // Default method
    default void fuelType() {
        System.out.println("Fuel type: Petrol");
    }

    // Static method
    static void serviceGuidelines() {
        System.out.println("Service every 6 months or 10,000 km");
    }
}

// Abstract class
abstract class Engine {
    // Abstract method (must be implemented)
    abstract void engineCapacity();

    // Non-abstract (concrete) method
    void coolingSystem() {
        System.out.println("Cooling system: Liquid cooling");
    }
}

// Concrete class: extends abstract class and implements interface
class Car extends Engine implements Vehicle {

    @Override
    public void start() {                   // From Interface
        System.out.println("Car is starting with key ignition...");
    }

    // Overriding default method (optional)
    @Override
    public void fuelType() {                // From Interface
        System.out.println("Fuel type: Diesel");
    }

    @Override
    void engineCapacity() {                   // From Abstract Class
        System.out.println("Engine capacity: 1500cc");
    }

}

public class InterfaceVsAbstractDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Interface methods
        myCar.start();          // Abstract method from interface
        myCar.fuelType();       // Default method (overridden in Car)
        Vehicle.serviceGuidelines();  // Static method from interface (called using interface name)

        // Abstract class methods
        myCar.engineCapacity(); // Abstract method from abstract class
        myCar.coolingSystem();  // Concrete method from abstract class

    }
}
