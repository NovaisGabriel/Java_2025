package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.345678;
		
		double z = x+y;
		
		int a = 5;
		int b = 10;
		
		double resultado = (double) a/b;
		
		System.out.println(y);
		System.out.println("Hello World!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n",x);
		System.out.println("Result = "+ z +" m");
		System.out.println(resultado);
		
		
		Scanner sc = new Scanner(System.in);
		
		int e;
		System.out.println("Write:");
		e = sc.nextInt();
		System.out.println("you write:" + e);
		sc.close();

	}

}
