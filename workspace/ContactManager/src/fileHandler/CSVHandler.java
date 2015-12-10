package fileHandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
	public ArrayList<String[]> ReadFile(String path)
	{
		String csvFilePath = path;
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
			List list = new ArrayList<String[]>();
			while((line = br.readLine()) != null)
			{
				row = line.split(",");
				list.add(row);
			}
		} catch (IOException e)
		{ 
			e.printStackTrace();
		}
	}
}
