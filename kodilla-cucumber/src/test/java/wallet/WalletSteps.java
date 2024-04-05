package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletSteps {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private int dispensedAmount;

    private int balanceAfterWithdrawal;

    @Given("I have deposited {int} in my wallet")
    public void i_have_deposited_in_my_wallet(Integer balance) {
        wallet.deposit(balance);
        assertEquals(balance, wallet.getBalance());
    }

    @When("I request {int}")
    public void i_request(Integer withdrawalAmount) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, withdrawalAmount);
        balanceAfterWithdrawal = wallet.getBalance() - withdrawalAmount;
    }

    @Then("{int} should be dispensed")
    public void should_be_dispensed(Integer withdrawalMoney) {
        dispensedAmount = cashSlot.getContents();
        assertEquals(withdrawalMoney, dispensedAmount);
    }
    @Then("the balance of my wallet should be {int}")
    public void the_balance_of_my_wallet_should_be(Integer balanceAfterWithdrawal) {
        assertEquals(balanceAfterWithdrawal, wallet.getBalance());
    }
}