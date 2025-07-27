import java.util.Scanner;

public class ControlStructures{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. if-else: Check voting eligibility
        System.out.println("1. if-else: Check voting eligibility");
        int age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        // 2. if-else if-else: Grade assignment
        System.out.println("\n2. if-else-if: Grade assignment");
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // 3. switch-case: Day of the week
        System.out.println("\n3. switch-case: Day of the week");
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }

        // 4. for loop: Print even numbers
        System.out.println("\n4. for loop: Even numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }

        // 5. while loop: Countdown
        System.out.println("\n5. while loop: Countdown from 5");
        int count = 5;
        while (count > 0) {
            System.out.println("Count: " + count);
            count--;
        }

        // 6. do-while loop: Simulate menu (run at least once)
        System.out.println("\n6. do-while loop: Simulated menu (run once even if false)");
        int option = 0;
        do {
            System.out.println("Showing menu option: " + option);
            option++;
        } while (option < 1);

        // 7. for-each loop: Print list of fruits
        System.out.println("\n7. for-each loop: Fruit list");
        String[] fruits = {"Apple", "Banana", "Mango"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 8. Nested loops: Multiplication table from 1 to 3
        System.out.println("\n8. Nested loops: Multiplication table (1 to 3)");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        scanner.close();
    }
}
