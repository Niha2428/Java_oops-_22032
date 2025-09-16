// Base Class (Parent)
class VehicleInheritance {
    protected String registrationNumber;
    protected String brand;
    protected double fuel;

    VehicleInheritance(String registrationNumber, String brand, double fuel) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.fuel = fuel;
    }

    void drive(double distance) {
        double consumption = distance * 0.1; // default consumption
        if (fuel >= consumption) {
            fuel -= consumption;
            System.out.println(brand + " Vehicle drove " + distance + " km. Fuel left: " + fuel);
        } else {
            System.out.println("Not enough fuel to drive!");
        }
    }

    void showDetails() {
        System.out.println("Vehicle: " + brand + " (" + registrationNumber + "), Fuel: " + fuel);
    }
}

// Single Inheritance - Car extends Vehicle
class SingleInheritanceCar extends VehicleInheritance {
    private int seats;

    SingleInheritanceCar(String registrationNumber, String brand, double fuel, int seats) {
        super(registrationNumber, brand, fuel);
        this.seats = seats;
    }

    @Override
    void drive(double distance) {
        double consumption = distance * 0.15; // Cars consume more
        if (fuel >= consumption) {
            fuel -= consumption;
            System.out.println(brand + " Car drove " + distance + " km with " + seats + " seats. Fuel left: " + fuel);
        } else {
            System.out.println("Car doesn't have enough fuel!");
        }
    }
}

// Multilevel Inheritance - ElectricCar extends Car
class MultilevelInheritanceElectricCar extends SingleInheritanceCar {
    private double batteryLevel;

    MultilevelInheritanceElectricCar(String registrationNumber, String brand, double fuel, int seats, double batteryLevel) {
        super(registrationNumber, brand, fuel, seats);
        this.batteryLevel = batteryLevel;
    }

    void chargeBattery(double percent) {
        batteryLevel = Math.min(100, batteryLevel + percent);
        System.out.println("Battery charged. Current battery: " + batteryLevel + "%");
    }

    @Override
    void drive(double distance) {
        if (batteryLevel >= distance * 0.5) {
            batteryLevel -= distance * 0.5;
            System.out.println(brand + " Electric Car drove " + distance + " km on battery. Battery left: " + batteryLevel + "%");
        } else {
            System.out.println("Not enough battery to drive!");
        }
    }
}

// Hierarchical Inheritance - Truck also extends Vehicle
class HierarchicalInheritanceTruck extends VehicleInheritance {
    private double loadCapacity;

    HierarchicalInheritanceTruck(String registrationNumber, String brand, double fuel, double loadCapacity) {
        super(registrationNumber, brand, fuel);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void drive(double distance) {
        double consumption = distance * 0.3; // Trucks consume more
        if (fuel >= consumption) {
            fuel -= consumption;
            System.out.println(brand + " Truck drove " + distance + " km with load " + loadCapacity + " tons. Fuel left: " + fuel);
        } else {
            System.out.println("Truck doesn't have enough fuel!");
        }
    }
}

// Main Class
public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("\n--- Single Inheritance Example ---");
        SingleInheritanceCar car = new SingleInheritanceCar("CAR123", "Toyota", 50, 5);
        car.drive(100);
        car.showDetails();

        System.out.println("\n--- Multilevel Inheritance Example ---");
        MultilevelInheritanceElectricCar ecar = new MultilevelInheritanceElectricCar("E123", "Tesla", 0, 4, 80);
        ecar.drive(100);
        ecar.chargeBattery(15);

        System.out.println("\n--- Hierarchical Inheritance Example ---");
        HierarchicalInheritanceTruck truck = new HierarchicalInheritanceTruck("TRK456", "Volvo", 100, 15);
        truck.drive(200);
        truck.showDetails();
    }
}
