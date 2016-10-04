package MovieLabDavid;

import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements MovieDao{

	@Override
	public List<Movie> getAllMovies() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Alien", "scifi"));
		movies.add(new Movie("Aliens", "scifi"));
		movies.add(new Movie("Prometheus", "scifi"));
		movies.add(new Movie("Airplane", "comedy"));
		movies.add(new Movie("Planes, Trains, and Automobiles", "comedy"));
		movies.add(new Movie("Nightmare on Elm Street", "horror"));
		movies.add(new Movie("Friday the 13th", "horror"));
		movies.add(new Movie("Child's Play", "horror"));
		movies.add(new Movie("Avengers", "action"));
		movies.add(new Movie("Captain America", "action"));
		return movies;
	}

	
	
}
