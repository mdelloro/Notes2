package ExtraCodes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Responsible for reading and writing food trucks to a file.
 */
public class FoodTruckPersistence {
	
	/**
	 * The path of the file where trucks are stored.
	 */
	private Path filePath;
	
	/**
	 * Constructor that lets you choose a file path.
	 * 
	 * @param filePathString path of the file where trucks are stored.
	 */
	public FoodTruckPersistence(String filePathString) {
		this.filePath = Paths.get(filePathString);
	}
	
	/**
	 * Constructor that uses the default file path to store trucks.
	 */
	public FoodTruckPersistence() {
		this("src/co/grandcircus/fileio/foodtrucks2.txt");
	}
	
	/**
	 * Read the file and returns all the trucks listed in the file.
	 * 
	 * @return A List of trucks. If not file exists, it returns an empty list.
	 * @throws RuntimeException if something goes wrong while accessing the file.
	 */
	public List<String> readFoodTrucks() {
		List<String> trucks = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return trucks;
		}
		
		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
		 
			String line = reader.readLine();
			while (line != null) {
				trucks.add(line);
				line = reader.readLine();
			}
			
			reader.close();
			return trucks;
		} catch (IOException ex) {
			throw new RuntimeException("Unable to read food trucks.", ex);
		}
	}
	
	/**
	 * Writes a list of trucks to the file.
	 * 
	 * @param foodTrucks The list of trucks to write.
	 * @throws RuntimeException if something goes wrong while accessing the file
	 */
	public void saveFoodTrucks(List<String> foodTrucks) {
		try {
			if (!Files.exists(filePath)) {
				Files.createFile(filePath);
			}
			
			File file = filePath.toFile();
			PrintWriter writer = new PrintWriter(file);
			
			for (String truck : foodTrucks) {
				writer.println(truck);
			}
			
			writer.close();
		} catch (IOException ex) { // IOException is a checked exception (I have to handle it)
			// RuntimeException is an unchecked exception (I don't have to handle it)
			throw new RuntimeException("Unable to save food trucks.", ex);
		}
	}

}