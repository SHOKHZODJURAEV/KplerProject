package kpler.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kpler.pages.HomePage;
import kpler.utility.BrowserUtil;
import org.junit.Assert;

public class VerifyCompanyInfoStep {

    HomePage homePage = new HomePage();
    @When("As a user, I should click Company module")
    public void as_a_user_i_should_click_company_module() {

        homePage.companyModule.click();
        BrowserUtil.waitFor(5);


    }
    @Then("Verify company information displayed on the page")
    public void verify_company_information_displayed_on_the_page() {

        Assert.assertTrue(homePage.companyInformationScrolldown.isDisplayed());


    }





}
