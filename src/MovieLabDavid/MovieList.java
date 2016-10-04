package MovieLabDavid;
import java.util.Scanner;
import java.util.ArrayList;

public class MovieList {
	
	private static MovieDao movieDao = new MovieDaoImpl();
	
	public static void main(String[] args) {
		String choice = "y";
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Movie List Application!");

		while (choice.equalsIgnoreCase("y")) {
			System.out
					.println("Movies are listed by category: scifi, horror, comedy, action");
			System.out.print("What category are you interested in? ");
			String cat = scan.nextLine();

			if (cat.equals("scifi") || cat.equals("comedy")
					|| cat.equals("horror") || cat.equals("action")) {
				int count = 0;
				for (Movie m : movies) {
					if (m.getCategory().equals(cat)) {
						System.out.println(m.getTitle());
						count++;
					}
				}
				System.out.println(count + " movies found in category " + cat);
				System.out.println();
			} else {
				System.out.println("Invalid category.");
			}

			System.out.print("Continue? (y/n) ");
			choice = scan.nextLine();
		}

		scan.close();
		System.out.println("Goodbye.");
	}

}

