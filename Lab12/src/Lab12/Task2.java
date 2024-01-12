package Lab12;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Dividend: ");
		int a = sc.nextInt();
		System.out.println("Enter The Divisor: ");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("Result of division = " + c);
		} catch (ArithmeticException e) {
			System.out.println("The Number can't be divided by 0");
		}
	}
}