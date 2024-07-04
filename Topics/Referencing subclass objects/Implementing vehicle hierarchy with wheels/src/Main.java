import java.util.Scanner;

// Base class for vehicles
class Vehicle {
    protected int numWheels;

    public Vehicle(int wheels) {

        numWheels = wheels;
    }

    public void printWheels() {
        System.out.println("This vehicle has " + numWheels + " wheels.");
    }
}

// TODO: Create the Bicycle class that extends Vehicle

class Bicycle extends Vehicle {
    public Bicycle() {
        super(2);
    }

    @Override
    public void printWheels() {
        System.out.println("A bicycle has " + numWheels + " wheels.");
    }
}

// TODO: Create the Motorcycle class that extends Vehicle

class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(2);
    }

    @Override
    public void printWheels() {
        System.out.println("A motorcycle has " + numWheels + " wheels.");
    }
}

// TODO: Create the Car class that extends

class Car extends Vehicle {
    public Car() {
        super(4);
    }

    @Override
    public void printWheels() {
        System.out.println("A car has " + numWheels + " wheels.");

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();

        // TODO: Create an instance of the appropriate vehicle class based on vehicleType
        // TODO: Call the printWheels() method on the vehicle instance
        Vehicle vehicle;

        switch (vehicleType) {
            case "bicycle":
                vehicle = new Bicycle();
                break;
            case "motorcycle":
                vehicle = new Motorcycle();
                break;
            case "car":
                vehicle = new Car();
                break;
            default:
                vehicle = null;
                System.out.println("Invalid vehicle type");
                break;
        }

        if (vehicle != null) {
            vehicle.printWheels();
        }
    }
}