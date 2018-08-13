package home.credit;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * Created by vietluong on 8/13/2018.
 */
@CucumberOptions(
        features = {"src/test/java/home/credit/feature/DemoBankingFunction.feature"},
        glue = {"base","step.definition"},
        plugin = {"html:target/result","pretty","json:target/test-classes/reports/result.json"})
public class runner extends AbstractTestNGCucumberTests {
}
