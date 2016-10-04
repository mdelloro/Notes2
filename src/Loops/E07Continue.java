package Loops;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
public class E07Continue {

	public static void main(String[] args) {

		for (int i = 0 ; i < 6 ; i++) {
			if (i == 2 || i == 4) {
				continue;
			}

			System.out.println(i);
		}

	}

}