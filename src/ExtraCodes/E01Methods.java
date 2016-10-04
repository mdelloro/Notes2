package ExtraCodes;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class E01Methods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		printHello();

		System.out.println("The square of 3 is " + square(3));
		System.out.println("The square of 5 is " + square(5));
		System.out.println("Area of circle with radius 20 is " + getAreaOfACircle(20));


		System.out.println("May I ask you a question?");
		boolean mayAskQuestion = doesUserAnswerYes(scanner);
		if (mayAskQuestion) {
			System.out.println("Do you live in Detroit?");
			boolean isDetroiter = doesUserAnswerYes(scanner);

			if (isDetroiter) {
				System.out.println("Welcome home.");
			} else {
				System.out.println("Welcome to our city.");
			}
		}

		System.out.println("How happy are you? (1-10)");
		int happiness = scanner.nextInt();
		printNTimes("Happy!", happiness);


		System.out.println("Goodbye.");
		scanner.close();
	}

	public static void printHello() {
		System.out.println("Hello");
	}

	public static boolean doesUserAnswerYes(Scanner scanner) {
		String yesOrNo = scanner.next();
		return yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes");
	}

	public static int square(int number) {
		return number * number;
	}

	public static double getAreaOfACircle(int radius) {
		final double pi = 3.14;
		return pi * square(radius);
	}

	public static void printNTimes(String message, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(message);
		}
	}


}