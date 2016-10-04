package ExtraCodes;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
public class E03PassByValue {

	public static void main(String[] args) {

		int number = 5;
		String word = "hello";

		System.out.println("Before method call " + number);
		System.out.println("Before method call " + word);

		doSomething(number, word);

		System.out.println("After method call " + number);
		System.out.println("After method call " + word);

	}

	public static void doSomething(int number, String word) {
		number++;
		word = "different";

		System.out.println("In method " + number);
		System.out.println("In method " + word);
	}


}