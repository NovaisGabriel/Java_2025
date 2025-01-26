package curso_programacao;

import java.util.Scanner;

public class FunctionExample {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int higher = max(a, b);
		
		showResult(higher);
		
		sc.close();
		

	};
	
	public static int max(int a, int b) {
		int aux;
		
		if (a>b) {
			aux = a;
		}
		else {
			aux = b;
		}
		
		return aux;
	};
	
	public static void showResult(int x) {
		System.out.println("Maximum value is: "+ x);
	};

}
