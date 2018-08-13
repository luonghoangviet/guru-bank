package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vietluong on 8/12/2018.
 */
public class LoginPage extends TestBase {
    @FindBy(name = "uid")
    WebElement txtUserId;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(name = "btnLogin")
    WebElement btnLogin;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login() {
        inputTextToElement(this.txtUserId, prop.get("user.id").toString());
        inputTextToElement(this.txtPassword, prop.getProperty("user.password").toString());
        btnLogin.click();
    }
}
