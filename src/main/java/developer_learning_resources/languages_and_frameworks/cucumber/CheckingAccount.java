package developer_learning_resources.languages_and_frameworks.cucumber;

public class CheckingAccount {
	private double balance;

	public CheckingAccount(double initialDepositAmount) {
		this.balance = initialDepositAmount;
	}

	public double balance() {
		return balance;
	}

	public void deposit(double amount) {
//		balance += amount;
	}

	public String type() {
		return "Silver";
	}
}
