package step.definition;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import model.Deposit;
import model.NewAccount;
import pages.DepositPage;

import java.util.List;
import java.util.Map;

/**
 * Created by vietluong on 8/13/2018.
 */
public class DepositSteps extends TestBase {
    DepositPage depositPage = new DepositPage();

    @DataTableType
    public Deposit newDepositeEntry(Map<String, String> entry) {
        return new Deposit(entry.get("accountNo"), entry.get("amount"), entry.get("description"));
    }
    @When("^I deposit with infomation as following:$")
    public void deposit(List<Deposit> depositList) throws Exception {
        depositPage.deposit(depositList.get(0));
    }
}
