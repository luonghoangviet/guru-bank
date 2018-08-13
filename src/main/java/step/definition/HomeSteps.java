package step.definition;

import base.TestBase;
import cucumber.api.java.en.Given;
import pages.HomePage;

/**
 * Created by vietluong on 8/12/2018.
 */
public class HomeSteps extends TestBase {
    private HomePage homePage = new HomePage();
    @Given("^On Homepage, I open \"([^\"]*)\" page$")
    public void openPage(String page) throws Exception {
        homePage.openPage(page);
    }
}
