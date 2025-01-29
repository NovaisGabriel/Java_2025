package dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filereadertryresources {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Windows 11\\Desktop\\Projetos\\Java_2025\\data\\titanic.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
           String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
		
	}

}
