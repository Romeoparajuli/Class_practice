package assignment2;

public class Account {

	private String AccountNumber;
	private double balance;
	// Parameterized constructor with validation

	public Account(String AccountNumber, double balance) {
		
		if (AccountNumber == null || AccountNumber.isEmpty()) {
			System.err.println("Error: Account number cannot be null or empty.");
			this.AccountNumber = "";
			this.balance = balance;
		} 
		else if (balance <= 0) {
			System.err.println("Error: Balance cannot be negative.");
			this.AccountNumber = AccountNumber;
			this.balance = 0.0;

		} else {
			this.AccountNumber = AccountNumber;
			this.balance = balance;

		}

	}

	// Method to display account details
	public void displayDetails() {
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance: $" + balance);
	}

	public static void main(String[] args) {
		Account account = new Account("0000112002232012aw", 12120);
		account.displayDetails();
		System.out.println(".................................................. ");

		Account invalidAccount = new Account("", 1000000);
		invalidAccount.displayDetails();
		System.out.println("..............................................");
		Account invalidBalanceAccount = new Account("0000112002232012aw", 0);
		invalidBalanceAccount.displayDetails();
	}

}
