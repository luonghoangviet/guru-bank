package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Before;

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
