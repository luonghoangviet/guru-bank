package pages;

import base.TestBase;
import model.Deposit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Var;

/**
 * Created by vietluong on 8/13/2018.
 */
public class DepositPage extends TestBase {
    @FindBy(xpath = "//input[@name='accountno']")
    WebElement txtAccountNo;
    @FindBy(name = "ammount")
    WebElement txtAmount;
    @FindBy(name = "desc")
    WebElement txtDescription;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement btnSubmit;
    @FindBy(xpath = "//input[@value='Reset']")
    public WebElement btnReset;

    public DepositPage() {
        PageFactory.initElements(driver, this);
    }

    public void deposit(Deposit deposit) throws Exception {
        if (deposit.getAccountNo().equals("%new%")) {
            inputTextToElement(txtAccountNo, Var.getVariable("newAccountId").toString());
        } else {
            inputTextToElement(txtAccountNo, deposit.getAccountNo());
        }
        inputTextToElement(txtAmount, deposit.getAmount());
        Var.storeVariable("amount", deposit.getAmount());
        inputTextToElement(txtDescription, deposit.getDescription());
        btnSubmit.click();
    }
}
