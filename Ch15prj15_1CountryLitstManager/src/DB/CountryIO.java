package DB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountryIO {
	
	//This class represents I/O (input/output) to and from our
	// countries.txt file.
	// We will store the countries in an ArrayList
	// named countries inside this class and will write that list 
	// to countries.txt whenever we change the list
	
	// Reference Page 481 -ProductTextFile for an example.
	private List<String> countries = null;
	private Path countriesPath = null;
	private File countriesFile = null;
	// no need for a field separator as this list only contains Strings
	public CountryIO() {
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		getCountries();
	}
	
	public List<String> getCountries() {
		// only read the countries.txt file if countries is null
		if (countries == null) {
			countries = new ArrayList<>();
			if (Files.exists(countriesPath)) {
				try (BufferedReader in = new BufferedReader(
						                 new FileReader(countriesFile))) {
					
					//read countries from file into array list
					String line = in.readLine();
					while (line != null) {
					    countries.add(line);
					    line = in.readLine();
					}
				}  catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					Files.createFile(countriesPath);
					System.out.println("**  countries file create!");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return countries;
	}
	
public boolean saveCountries() {
	boolean success = false;
	try (PrintWriter out = new PrintWriter(
			               new BufferedWriter(
			               new FileWriter(countriesFile)))) {
		// write all countries from our list to the file
		for (String country: countries) {
			out.println(country);
		}
		success = true;
	} catch (IOException e) {
		e.printStackTrace();
	}
	return success;
}

public void addCountry(String country) {
	countries.add(country);
	saveCountries();
}
}
