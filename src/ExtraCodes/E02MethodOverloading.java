package ExtraCodes;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
import java.util.Scanner;

public class E02MethodOverloading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int total = add(1, 3);
		System.out.println(total);

		total = add(5, 3, 7);
		System.out.println(total);

		String fullName = add("David", "Wolverton");
		System.out.println(fullName);

		System.out.println("Goodbye.");
		scanner.close();
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static String add(String a, String b) {
		return a + " " + b;
	}
}