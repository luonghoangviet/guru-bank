package step.definition;

import base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import model.Deposit;
import model.NewAccount;
import pages.DepositPage;

import java.util.List;

/**
 * Created by vietluong on 8/13/2018.
 */
public class DepositSteps extends TestBase {
    DepositPage depositPage = new DepositPage();

    @When("^I deposit with infomation as following:$")
    public void deposit(DataTable dataTable) throws Exception {
        List<Deposit> depositList = dataTable.asList(Deposit.class);
        depositPage.deposit(depositList.get(0));
    }
}
