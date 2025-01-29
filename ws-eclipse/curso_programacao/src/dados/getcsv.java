package dados;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class getcsv {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Windows 11\\Desktop\\Projetos\\Java_2025\\data\\titanic.csv");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
