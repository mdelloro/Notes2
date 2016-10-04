

public class Scratch_paper {
	
	public static String reverseMethod (String giraffe){
		String reverseWord = "";
		int monkey = giraffe.length();
		for (int i = monkey - 1; i>=0 ; i--) {
		
		reverseWord = reverseWord + giraffe.charAt(i);
	
	}
		return reverseWord;
}
	
	
}