// Abstract class Vehicle
abstract class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void startEngine();
}

// Interface FuelType
interface FuelType {
    void fuelEfficiency();
}

// Car class implementing Vehicle and FuelType
class Car extends Vehicle implements FuelType {
    Car(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " engine started: Vroom Vroom!");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println(name + " fuel efficiency: 15 km/l");
    }
}

// Bike class implementing Vehicle and FuelType
class Bike extends Vehicle implements FuelType {
    Bike(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " engine started: Zoom Zoom!");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println(name + " fuel efficiency: 40 km/l");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create Car object
        Car car = new Car("Honda City");
        car.startEngine();
        car.fuelEfficiency();

        System.out.println();

        // Create Bike object
        Bike bike = new Bike("Royal Enfield");
        bike.startEngine();
        bike.fuelEfficiency();
    }
}
