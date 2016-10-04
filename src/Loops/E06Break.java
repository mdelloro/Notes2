package Loops;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
public class E06Break {

	public static void main(String[] args) {

		String[] colors = { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet" };

		int position = 1;
		for (String color : colors) {
			System.out.println(color);
			if (color.equals("Green")) {
				break;
			}
			position++;
		}

		System.out.println("Green is number " + position);

	}

}