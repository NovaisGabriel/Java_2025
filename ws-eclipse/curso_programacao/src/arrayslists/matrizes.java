package arrayslists;

import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		Integer[][] mat = new Integer[n][n];
		
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		sc.close();
		
		System.out.println(mat);

	}

}
