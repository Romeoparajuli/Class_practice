package assignment3;

//4.Write a Java program to create a class called "BankAccount" 
//with instance variables 'accountNumber' and balance, 
//and static variables 'bankName' and 'interestRate'. 
//Provide static methods to get and set the static variables. 
//Create several 'BankAccount'
//objects and print their details along with the static variables.
public class BankAccount {
	String accountNumber;
	double balance;
	static String bankName;
	static double interestRate;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	static String getBankName() {
		return bankName;

	}

	public static void setBankName(String bankName) {
		BankAccount.bankName = bankName;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		BankAccount.interestRate = interestRate;
	}

	void displayAccountDetails() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: $" + balance);
		System.out.println("Interest Rate: " + interestRate + "%");
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount("000001000001", 1212);
		BankAccount account2 = new BankAccount("0000011000001", 1212000);
		System.out.println("Account 1 Details:");
		System.err.println(":::::::::::::::::::::::::::");

		BankAccount.setBankName("National Bank");
		BankAccount.setInterestRate(3.0);
		account.displayAccountDetails();
		System.err.println(":::::::::::::::::::::::::::");
		System.out.println("Account 2 Details:");
		System.err.println(":::::::::::::::::::::::::::");

		BankAccount.setBankName("National Bank");
		BankAccount.setInterestRate(3.0);
		account2.displayAccountDetails();
		System.err.println(":::::::::::::::::::::::::::");

	}

}
