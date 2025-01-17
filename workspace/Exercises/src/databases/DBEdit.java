package databases;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DBEdit {
	private static List<Record> records = new ArrayList<Record>();
	public static void init() {
		String csvFilePath = "c:\\Users\\CompUser\\Documents\\records.csv";
		File csvFile = null;
		try {
			csvFile = new File(csvFilePath);
			if(csvFile.createNewFile())
			{
				System.out.println("New CSV File Created");
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			br.readLine();
			String line;
			String[] row;
			while((line = br.readLine()) != null)
			{
				row = line.split(",");
				Record r = new Record(row[0], row[1], row[2], row[3]);
				records.add(r);
			}
		} catch (IOException e)
		{ 
			e.printStackTrace();
		}
	}
	public static void displayRecords()
	{
		for (Iterator iterator = records.iterator(); iterator.hasNext();) {
			Record record = (Record) iterator.next();
			record.displayRecord();
			System.out.println("");
		}
	}
	
}
