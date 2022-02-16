package constructors;

import java.util.Scanner;

public class MainAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account account1 = new Account("Neeru", 5678, 1000.43);
		
		System.out.println("Enter username");
		String userName = sc.next();
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		
		if (account1.isValidCredentials(userName, pin)){	//calling method to validate
			System.out.println("Welcome " + account1.getUserName());
			System.out.println("Do you want to deposit money");
			String choice =  sc.next();
			if (choice.equals("yes")) {
				System.out.println("Enter the amount to deposit");
				double amountToDeposit = sc.nextDouble();
				account1.depositMoney(amountToDeposit);
			}
		}

	}

}
