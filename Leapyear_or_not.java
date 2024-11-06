package lab2;

import java.util.Scanner;

public class Leapyear_or_not {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input: take the year as input from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year using if-else
        if (year % 400 == 0) {
            // If the year is divisible by 400, it's a leap year
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            // If the year is divisible by 100 but not 400, it's not a leap year
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            // If the year is divisible by 4 but not by 100, it's a leap year
            System.out.println(year + " is a leap year.");
        } else {
            // If the year is not divisible by 4, it's not a leap year
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner object
        sc.close();
    }
}

