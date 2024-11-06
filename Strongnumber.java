package lab2;

import java.util.Scanner;

public class Strongnumber {

    // Function to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is a Strong number
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNumber = num;

        // Calculate the sum of factorial of digits
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += factorial(digit); // Add factorial of the digit to sum
            num /= 10; // Remove the last digit
        }

        // Check if sum of factorials equals the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        // Input number from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check and display result
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        sc.close();
    }
}
