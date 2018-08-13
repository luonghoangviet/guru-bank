package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.StringUtils;

/**
 * Created by vietluong on 8/12/2018.
 */
public class ManagerPage extends TestBase {
    private final static String XPATH_HEADER = ".//p[@class='heading3']";
    private final static String XPATH_CELL_BY_NAME = ".//td[contains(text(),'%s')]/following-sibling::td";
    @FindBy(id = "customer")
    public WebElement customerInfoTable;
    @FindBy(id = "account")
    public WebElement accountInfoTable;
    @FindBy(id = "deposit")
    public WebElement depositInfoTable;

    public ManagerPage() {
        PageFactory.initElements(driver, this);
    }

    public String getNewCustomerMessage() {
        return customerInfoTable.findElement(By.xpath(XPATH_HEADER)).getText();
    }

    public String getNewAccountMessage() {
        return accountInfoTable.findElement(By.xpath(XPATH_HEADER)).getText();
    }

    public String getDepositMessage() {
        return depositInfoTable.findElement(By.xpath(XPATH_HEADER)).getText();
    }


    public String getAmountCredited() {
        return depositInfoTable.findElement(By.xpath(String.format(XPATH_CELL_BY_NAME, "Amount Credited"))).getText();
    }

    public String getCurrentBalance() {
        return depositInfoTable.findElement(By.xpath(String.format(XPATH_CELL_BY_NAME, "Current Balance"))).getText();
    }
    public String getCustomerId() {
        return customerInfoTable.findElement(By.xpath(String.format(XPATH_CELL_BY_NAME, "Customer ID"))).getText();
    }

    public String getAccountId() {
        return accountInfoTable.findElement(By.xpath(String.format(XPATH_CELL_BY_NAME, "Account ID"))).getText();
    }

    public String getCurrentAmount() {
        return accountInfoTable.findElement(By.xpath(String.format(XPATH_CELL_BY_NAME, "Current Amount"))).getText();
    }
}
