package kpler.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kpler.pages.HomePage;
import kpler.utility.BrowserUtil;
import kpler.utility.ConfigReader;
import kpler.utility.DriverSingle;
import org.junit.Assert;

import java.util.List;

public class VerifyModulesStepDefs {

    @Given("User go to the home page")
    public void user_go_to_the_home_page() {
        DriverSingle.getDriver().get(ConfigReader.read("urlHomePage"));

        BrowserUtil.waitFor(2);
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModules) {

        HomePage homePage = new HomePage();

        List<String> actualMadules = BrowserUtil.getAllText(homePage.listOfModules);

        Assert.assertEquals(expectedModules, actualMadules);
    }



}
