package databases;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DBEdit {
	String csvFile = "/Users/CompUser/Documents/records.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	br = new BufferedReader(new FileReader(csvFile));
	try {
		while ((line = br.readLine()) != null) {
	
		        // use comma as separator
			String[] recordStr = line.split(cvsSplitBy);
			Record record = new Record(recordStr[0], recordStr[1], recordStr[2], recordStr[3]);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException b) {
		b.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
