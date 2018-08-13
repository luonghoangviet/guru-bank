package step.definition;

import base.TestBase;
import cucumber.api.java.en.Given;
import pages.LoginPage;

/**
 * Created by vietluong on 8/12/2018.
 */
public class LoginSteps extends TestBase{
    LoginPage loginPage = new LoginPage();
    @Given("^I login to Guru99 page$")
    public void loginToPage(){
        driver.get(prop.getProperty("base.url"));
        loginPage.login();
    }


}
