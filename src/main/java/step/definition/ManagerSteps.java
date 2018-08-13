package step.definition;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ManagerPage;
import org.testng.Assert;
import utils.Var;

import java.io.IOException;

/**
 * Created by vietluong on 8/12/2018.
 */
public class ManagerSteps extends TestBase {
    private final String MESSAGE_CREATE_NEW_CUSTOMSER_SUCCESS = "Customer Registered Successfully!!!";
    private final String MESSAGE_CREATE_NEW_ACCOUNT_SUCCESS = "Account Generated Successfully!!!";
    private final String MESSAGE_DEPOSIT_SUCCESS = "Transaction details of Deposit for Account %s";
    ManagerPage managerPage = new ManagerPage();

    @Then("^I should see the new customer is created successfully$")
    public void verifyCreateNewCustomer() throws IOException {
        Assert.assertEquals(managerPage.getNewCustomerMessage(), MESSAGE_CREATE_NEW_CUSTOMSER_SUCCESS);
        Var.storeVariable("newCustomerId", managerPage.getCustomerId());
    }

    @Then("^I should see the new account is created successfully$")
    public void verifyCreateNewAccount() throws Exception {
        Assert.assertEquals(managerPage.getNewAccountMessage(), MESSAGE_CREATE_NEW_ACCOUNT_SUCCESS, "Verify create account message");
        Assert.assertEquals(managerPage.getCurrentAmount(), Var.getVariable("initialDeposit").toString(), "Verify current amount after create account");
        Var.storeVariable("newAccountId", managerPage.getAccountId());
    }

    @Then("^I should see deposit work fine$")
    public void verifyDeposit() throws Exception {
        Assert.assertEquals(managerPage.getDepositMessage(), String.format(MESSAGE_DEPOSIT_SUCCESS, Var.getVariable("newAccountId").toString()), "Verify deposit message");
        Assert.assertEquals((Integer.valueOf(Var.getVariable("amount").toString())), Integer.valueOf(managerPage.getAmountCredited()), "Verify Amount credited");
        int actualCurrentBlance = Integer.valueOf(managerPage.getCurrentBalance());
        int expectedCurrentBlance = Integer.valueOf(Var.getVariable("initialDeposit").toString()) + (Integer.valueOf(Var.getVariable("amount").toString()));
        Assert.assertEquals(actualCurrentBlance, expectedCurrentBlance, "Verify current balance after deposit");

    }

    @When("^I store new customer id as \"([^\"]*)\"$")
    public void storeNewCustomerId(String key) throws IOException {
        Var.storeVariable(key, managerPage.getCustomerId());
    }
}
