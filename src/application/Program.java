package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter accoun data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.println("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.println("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			Account acc1 = new Account(number, holder, balance, withdrawLimit);

			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();

			acc1.withdraw(amount);

			System.out.println("New balance: " + acc1.getBalance());
		}

		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();

	}

}
