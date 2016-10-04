
public class Assessment {

	public static void main(String[] args) {
	
		String result = reverse("hello");
		System.out.println(result);
		
	}
		
	public static String reverse(String inputedWord) {
		String reversedWord = "";
		int length = inputedWord.length();
		for (int i = length - 1; i >= 0; i--) {
			reversedWord = reversedWord + inputedWord.charAt(i);
		}

		return reversedWord;
	}

}
