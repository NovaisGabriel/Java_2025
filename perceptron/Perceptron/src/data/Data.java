package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {

	private String path;

	public Data() {

	}

	public Data(String path) {
		this.path = path;
	}

	public String[][] getData() {

		// Creating matrix for storage

		List<String[]> rowList = new ArrayList<String[]>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] lineItems = line.split(";");
				rowList.add(lineItems);
				System.out.println(rowList);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		String[][] matrix = new String[rowList.size()][];
		for (int i = 0; i < rowList.size(); i++) {
			String[] row = rowList.get(i);
			matrix[i] = row;
		}

		return matrix;

	}

}
