package kpler.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kpler.pages.HomePage;
import kpler.pages.TrialPage;
import kpler.utility.BrowserUtil;
import kpler.utility.ConfigReader;
import kpler.utility.DriverSingle;
import org.junit.Assert;

public class TrialModuleStepsDef {

    HomePage homePage = new HomePage();

    @When("Click input box provide valid credential")
    public void click_input_box_provide_valid_credential() {

        homePage.inputEmail.sendKeys(ConfigReader.read("email"));
        BrowserUtil.waitFor(1);
        homePage.trialButton.click();
        BrowserUtil.waitFor(2);




    }
    @Then("Click Ask for a Trial button and verify ok body")
    public void click_ask_for_a_trial_button_and_verify_ok_body() {

        TrialPage trialPage = new TrialPage();

        Assert.assertTrue(trialPage.onlyBody.getText().equalsIgnoreCase("ok"));







    }





}
