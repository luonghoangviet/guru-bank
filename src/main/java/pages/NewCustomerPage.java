package pages;

import base.TestBase;
import model.NewCustomer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.StringUtils;

/**
 * Created by vietluong on 8/12/2018.
 */
public class NewCustomerPage extends TestBase {
    @FindBy(name = "name")
    public WebElement txtCustomerName;
    @FindBy(xpath = "//input[@type='radio' and @value='m']")
    public WebElement rdbMale;
    @FindBy(xpath = "//input[@type='radio' and @value='f']")
    public WebElement rdbFemale;
    @FindBy(id = "dob")
    public WebElement txtDob;
    @FindBy(name = "addr")
    public WebElement txaAddress;
    @FindBy(name = "city")
    public WebElement txtCity;
    @FindBy(name = "state")
    public WebElement txtState;
    @FindBy(name = "pinno")
    public WebElement txtPin;
    @FindBy(name = "telephoneno")
    public WebElement txtMobileNumber;
    @FindBy(name = "emailid")
    public WebElement txtEmail;
    @FindBy(name = "password")
    public WebElement txtPassword;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement btnSubmit;
    @FindBy(xpath = "//input[@value='Reset']")
    public WebElement btnReset;


    public NewCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    public void createNewCustommer(NewCustomer newCustomer) {
        inputTextToElement(txtCustomerName, newCustomer.getCustomerName());
        if (newCustomer.getGender().equals("M")) {
            rdbMale.click();
        } else {
            rdbFemale.click();
        }
        inputTextToElement(txtDob, newCustomer.getDob());
        inputTextToElement(txaAddress, newCustomer.getAddress());
        inputTextToElement(txtCity, newCustomer.getCity());
        inputTextToElement(txtState, newCustomer.getState());
        inputTextToElement(txtPin, newCustomer.getPin());
        inputTextToElement(txtMobileNumber, newCustomer.getMobileNumber());
        if (newCustomer.getEmail().equals("AUTO")) {
            inputTextToElement(txtEmail, StringUtils.getRandomEmail());

        } else {
            inputTextToElement(txtEmail, newCustomer.getEmail());
        }
        inputTextToElement(txtPassword, newCustomer.getPassword());

        btnSubmit.click();
    }
}
