package Lab12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the dividend (an integer): ");
			int dividend = scanner.nextInt();

			System.out.print("Enter the divisor (an integer): ");
			int divisor = scanner.nextInt();

			// Check for division by zero
			if (divisor == 0) {
				throw new ArithmeticException("Cannot divide by zero. Please enter a non-zero divisor.");
			}

			// Check if the result is a whole number
			if (dividend % divisor != 0) {
				throw new InputMismatchException("Invalid input. The result should be an integer.");
			}

			// Perform the division and display the result
			int result = dividend / divisor;
			System.out.println("Result: " + result);

		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter valid integers.");
			// Clear the scanner buffer to avoid infinite loop
			scanner.next();

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} finally {
			// Close the scanner
			scanner.close();
		}
	}
}