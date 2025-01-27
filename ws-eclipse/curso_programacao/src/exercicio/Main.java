package exercicio;

import java.util.Scanner;
import exercicio.Bank;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int accountNumber = sc.nextInt();
		String name = sc.next();
		
		// Instance class:
		
		Bank conta = new Bank(name, 1000, accountNumber);
		System.out.println("Account data:");
		System.out.println(conta);
		
		// Procedures:
		System.out.println("Wnat deposit and withdraw?");
		char wantDeposit = sc.next().charAt(0);
		
		if (wantDeposit == 'y') {
			
			System.out.println("Enter deposit value:");
			double dep = sc.nextDouble();
			conta.depositValue(dep);

			System.out.println("Updated data:");
			System.out.println(conta);
			
			System.out.println("Enter withdraw value:");
			double wit = sc.nextDouble();
			conta.withdrawValue(wit);
			
			System.out.println("Updated data:");
			System.out.println(conta);
			sc.close();
			
		}
		else {
			System.out.println("Closing program");
			sc.close();
		}

	}

}
