package pages;

import base.TestBase;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vietluong on 8/12/2018.
 */
public class HomePage extends TestBase {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void openPage(String page) throws Exception {
        switch (page.toUpperCase()) {
            case "NEW CUSTOMER":
                driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
                break;
            case "NEW ACCOUNT":
                driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
                break;
            case "DEPOSIT":
                driver.findElement(By.xpath("//a[contains(text(),'Deposit')]")).click();
                break;
        }
    }
}
