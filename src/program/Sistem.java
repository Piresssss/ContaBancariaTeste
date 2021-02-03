package program;

import java.util.Locale;
import java.util.Scanner;

import account.Conta;

public class Sistem {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			Conta Conta = new Conta(number, holder, initialDeposit);
		}
		else {
			Conta Conta = new Conta(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(Conta);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositDouble = sc.nextDouble();
		Conta.deposit(depositDouble);
		System.out.println("Updated account data: ");
		System.out.println(Conta);
	}

}
