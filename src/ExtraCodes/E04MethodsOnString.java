package ExtraCodes;
/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
public class E04MethodsOnString {

	public static void main(String[] args) {

		String phrase = "Kickstart your career";

		System.out.println("length - " + phrase.length());
		System.out.println("startsWith - " + phrase.startsWith("Kick"));
		System.out.println("contains - " + phrase.contains("your"));
		System.out.println("replace - " + phrase.replace('r', 'R'));
		System.out.println("replaceAll - " + phrase.replaceAll("your", "everyone's"));
		System.out.println("substring - " + phrase.substring(4, 9));

	}


}