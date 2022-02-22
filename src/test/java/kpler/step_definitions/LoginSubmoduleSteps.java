package kpler.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kpler.pages.HomePage;
import kpler.utility.BrowserUtil;
import kpler.utility.DriverSingle;
import org.junit.Assert;

import java.util.List;

public class LoginSubmoduleSteps {

    HomePage homePage = new HomePage();

    @When("User click on login module")
    public void user_click_on_login_module() {

        homePage.loginModule.click();

    }
    @Then("Verify user should able to see sub-modules below")
    public void verify_user_should_able_to_see_sub_modules_below(List<String> expectedSubmodules) {

        List<String> actualSubmodules = BrowserUtil.getAllText(homePage.listOfLoginSubmodules);

        Assert.assertEquals(expectedSubmodules,actualSubmodules);


    }


    @When("User click on each {string}")
    public void user_click_on_each(String moduleName) {

        homePage.clickEachSubmodule(moduleName);
        BrowserUtil.waitFor(2);




    }
    @Then("Verify user land on login page")
    public void verify_user_land_on_login_page() {


        Assert.assertTrue(DriverSingle.getDriver().getTitle().toLowerCase().contains("login") );



    }




}
