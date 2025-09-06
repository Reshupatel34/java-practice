// File: Quotient.java
import java.util.Scanner;

public class Quotient {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Division result
        int remainder = number % divisor;  // Modulus result
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number (dividend): ");
        int number = sc.nextInt();

        System.out.print("Enter second number (divisor): ");
        int divisor = sc.nextInt();

        // Condition check
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero!");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        sc.close();
    }
}
