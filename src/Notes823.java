import java.util.Scanner;

public class Notes823 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you live in Michigan? (y/n)");
		String yesOrNo = scanner.next();
		
		if (yesOrNo.equals("y")){
			System.out.println("Excellent!");
			
			System.out.println("Do you live in Detroit? (y/n)");
			yesOrNo = scanner.next();
			if (yesOrNo.equalsIgnoreCase("y")) {
				System.out.println("Come visit Grand Circus!");
			} else {
				System.out.println("You should move.");
			}
			scanner.close(); // close your scanner!
			}
		
		/*
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("What's the temp?");
		int temperature = scanner.nextInt();
		
		if (temperature <= 32) {
			System.out.println("It's freezing!");
		}
			System.out.println("More than one:");	
		} else {
			System.out.println("Its not freezing :p)");
					
			*/
		}
	}


