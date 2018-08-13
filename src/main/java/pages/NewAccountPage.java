package pages;

import base.TestBase;
import model.NewAccount;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Var;

/**
 * Created by vietluong on 8/13/2018.
 */
public class NewAccountPage extends TestBase {
    @FindBy(name = "cusid")
    public WebElement txtCustomerId;
    @FindBy(name = "selaccount")
    public WebElement dropdownAccountType;
    @FindBy(name = "inideposit")
    public WebElement txtInitDeposit;
    @FindBy(xpath = "//input[@value='submit']")
    public WebElement btnSubmit;
    @FindBy(xpath = "//input[@value='reset']")
    public WebElement btnReset;

    public NewAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectAccountType(String option) {
        Select select = new Select(dropdownAccountType);
        select.selectByVisibleText(option);
    }

    public void createNewAccount(NewAccount newAccount) throws Exception {
        if (newAccount.getCustomerId().equals("%new%")) {
            inputTextToElement(txtCustomerId, Var.getVariable("newCustomerId").toString());

        } else {
            inputTextToElement(txtCustomerId, newAccount.getCustomerId());
        }
        selectAccountType(newAccount.getAccountType());
        inputTextToElement(txtInitDeposit, newAccount.getInitialDeposit());
        Var.storeVariable("initialDeposit", newAccount.getInitialDeposit());
        btnSubmit.click();
    }
}
