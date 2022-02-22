package kpler.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kpler.pages.HomePage;
import kpler.utility.BrowserUtil;
import org.junit.Assert;

public class VerifyContactInfoSteps {

    HomePage homePage = new HomePage();

    @When("Click Contacts module")
    public void click_contacts_module() {

        homePage.contactModule.click();
        BrowserUtil.waitFor(2);

    }
    @Then("Verify contact information displayed on the page")
    public void verify_contact_information_displayed_on_the_page() {

        Assert.assertTrue(homePage.verifyScrolldownStage.isDisplayed());

    }





}
