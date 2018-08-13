package base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by vietluong on 8/11/2018.
 */
public class Hooks extends TestBase {
    @Before
    public void setUp() {
        init();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
