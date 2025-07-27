public class DataTypes {

    public static void main(String[] args) {

        // === Primitive Data Types ===

        // byte: Age of a child (small number)
        byte childAge = 8;

        // short: Number of pages in a book
        short bookPages = 450;

        // int: Population of a city
        int cityPopulation = 1200000;

        // long: Distance from Earth to the Sun in meters
        long distanceToSun = 149600000000L;

        // float: Price of a product
        float itemPrice = 99.99f;

        // double: Bank account balance
        double bankBalance = 12345678.90;

        // char: Grade in an exam
        char grade = 'A';

        // boolean: Whether a customer is a premium member
        boolean isPremiumMember = true;


        // === Reference Data Types ===

        // String: Customer name
        String customerName = "Alice Johnson";

        // Array: List of product IDs in an order
        int[] productIDs = {101, 102, 105, 110};

        // Object: Creating a generic object (usually replaced with classes)
        Object sampleObject = new Object();

        // Custom Object: Real-world example using a class
        Car myCar = new Car("Tesla", "Model 3", 2023);

        // === Output Section ===

        System.out.println("=== Primitive Data Types (Real-Life Examples) ===");
        System.out.println("Child's Age: " + childAge);
        System.out.println("Book Pages: " + bookPages);
        System.out.println("City Population: " + cityPopulation);
        System.out.println("Distance to Sun (m): " + distanceToSun);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Bank Balance: $" + bankBalance);
        System.out.println("Exam Grade: " + grade);
        System.out.println("Is Premium Member? " + isPremiumMember);

        System.out.println("\n=== Reference Data Types ===");
        System.out.println("Customer Name: " + customerName);
        System.out.print("Product IDs in Cart: ");
        for (int id : productIDs) {
            System.out.print(id + " ");
        }

        System.out.println("\nSample Object: " + sampleObject);
        System.out.println("Car Details: " + myCar);
    }
}

// Custom Class (used as a reference type)
class Car {
    String brand;
    String model;
    int year;

    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}
