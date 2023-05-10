package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckingAccountStepDefinitions {
	private CheckingAccount checkingAccount = new CheckingAccount(0);

	@Given("I have an empty checking account")
	public void emptyCheckingAccount() {
		checkingAccount = new CheckingAccount(0);
	}

	@When("I deposit ${double}")
	public void makeDepositOf(double depositAmount) {
		checkingAccount.deposit(depositAmount);
	}

	@When("I open a checking account with ${double}")
	public void openCheckingAccountWithBalanceOf(double initialDeposit) {
		checkingAccount = new CheckingAccount(initialDeposit);
	}

	@Then("my balance should be ${double}")
	public void balanceShouldBe(double expectedBalance) {
		assertThat(checkingAccount.balance()).isEqualTo(expectedBalance);
	}

	@Then("my account type should be {string}")
	public void myAccountTypeShouldBeAccountType(String accountType) {
		assertThat(checkingAccount.type()).isEqualTo(accountType);
	}
}
