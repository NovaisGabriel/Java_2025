package curso_programacao;

import java.util.Scanner;

public class conditionals {

	public static void main(String[] args) {

		// normal if else
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x > 9) {
			System.out.println("bigger than 9");
		} else if (x > 6) {
			System.out.println("less than 9, but bigger than 6");
		} else {
			System.out.println("less than 6");
		};

		sc.close();
		
		
		// switch case
		int y = 100;
		int dia;
		
		switch(y) {
		case 10:
			dia = 10;
			break;
		case 80:
			dia = 80;
			break;
		case 100:
			dia = 100;
			break;
		default:
			dia = 90;
			break;
		}
		System.out.println(dia);
			
		// if ternario
		int z = 100;
			
		String a = (z>90)? "yes":"no";
		System.out.println(a);
	}

}
