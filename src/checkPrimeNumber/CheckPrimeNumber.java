package checkPrimeNumber;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");

        int number;
        try {
            number = sc.nextInt();
            if (number < 2) {
                System.out.println("Number must be 2 or greater!");
                sc.close();
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
            sc.close();
            return;
        }

        // Check if the number is prime
        boolean isPrime = checkPrime(number);

        // Use ternary operator to print result
        System.out.println("The number " + number + " is " + (isPrime ? "Prime" : "Not Prime"));

        sc.close();
    }

    public static boolean checkPrime(int num) {
        // Early checks for 2 and even numbers
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        // Loop to check odd divisors up to sqrt(num)
        outerLoop: for (int i = 3; i <= Math.sqrt(num); i += 2) {
            // Skip this iteration if i is not a potential factor (optimization)
            if (num % i != 0) {
                continue;
            }

            // If i divides num evenly, num is not prime
            if (num % i == 0) {
                System.out.println(num + " is divisible by " + i + ", so it's not prime.");
                break outerLoop; // Exit the loop early
            }
        }

        // If we exit the loop naturally, no divisors were found
        return true;
    }
}