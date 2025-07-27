public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean x = true, y = false;

        // 1. Arithmetic Operators
        System.out.println("---- Arithmetic Operators ----");
        System.out.println("a + b = " + (a + b));   // Addition
        System.out.println("a - b = " + (a - b));   // Subtraction
        System.out.println("a * b = " + (a * b));   // Multiplication
        System.out.println("a / b = " + (a / b));   // Division (integer)
        System.out.println("a % b = " + (a % b));   // Modulo

        // 2. Assignment Operators
        System.out.println("\n---- Assignment Operators ----");
        int c = a;  // =
        System.out.println("c = " + c);
        c += 5;     // c = c + 5
        System.out.println("c += 5 -> " + c);
        c -= 2;     // c = c - 2
        System.out.println("c -= 2 -> " + c);
        c *= 2;     // c = c * 2
        System.out.println("c *= 2 -> " + c);
        c /= 3;     // c = c / 3
        System.out.println("c /= 3 -> " + c);
        c %= 4;     // c = c % 4
        System.out.println("c %= 4 -> " + c);

        // 3. Comparison Operators
        System.out.println("\n---- Comparison Operators ----");
        System.out.println("a == b -> " + (a == b));   // Equal to
        System.out.println("a != b -> " + (a != b));   // Not equal to
        System.out.println("a > b -> " + (a > b));     // Greater than
        System.out.println("a < b -> " + (a < b));     // Less than
        System.out.println("a >= b -> " + (a >= b));   // Greater or equal
        System.out.println("a <= b -> " + (a <= b));   // Less or equal

        // 4. Logical Operators
        System.out.println("\n---- Logical Operators ----");
        System.out.println("x && y -> " + (x && y));   // Logical AND
        System.out.println("x || y -> " + (x || y));   // Logical OR
        System.out.println("!x -> " + (!x));           // Logical NOT

        // 5. Bitwise Operators
        System.out.println("\n---- Bitwise Operators ----");
        int p = 5;  // Binary: 0101
        int q = 3;  // Binary: 0011
        System.out.println("p & q -> " + (p & q));  // AND -> 0001 -> 1
        System.out.println("p | q -> " + (p | q));  // OR  -> 0111 -> 7
        System.out.println("p ^ q -> " + (p ^ q));  // XOR -> 0110 -> 6
        System.out.println("~p -> " + (~p));        // NOT -> Invert bits -> -6
        System.out.println("p << 1 -> " + (p << 1)); // Left shift -> 1010 -> 10
        System.out.println("p >> 1 -> " + (p >> 1)); // Right shift -> 0010 -> 2
    }
}
