

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalNumbers = 5; // The number of integers to be entered by the user
        int sum = 0;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter " + totalNumbers + " integers:");

        // Loop to read the five integers and calculate their sum
        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        // Close the Scanner after use
        scanner.close();

        // Display the sum to the user
        System.out.println("The sum of the five integers is: " + sum);
    }
}
