package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletSteps {

    private final Wallet wallet= new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private int requestedAmount;
    private int dispensedAmount;
    @Given("I have deposited {int} in my wallet")
    public void i_have_deposited_in_my_wallet(Integer balance) {

            wallet.deposit(balance);

        assertEquals(balance, wallet.getBalance());
    }

    @When("I request {int}")
    public void i_request(Integer withdrawalAmount) {
    Cashier cashier=new Cashier(cashSlot);
    cashier.withdraw(wallet,withdrawalAmount);
        requestedAmount=withdrawalAmount;
    }

    @Then("{int} should be dispensed")
    public void should_be_dispensed(Integer withdrawalMoney) {
       dispensedAmount = cashSlot.getContents();
       assertEquals(withdrawalMoney, dispensedAmount);
    }

    @Given("I have deposited N\\/A in my wallet")
    public void i_have_deposited_n_a_in_my_wallet(Integer balance) {
        if (balance != null) {
            wallet.deposit(balance);
        }
        assertEquals(balance, wallet.getBalance());
    }

}