package kpler.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kpler.pages.HomePage;
import kpler.utility.BrowserUtil;
import kpler.utility.ConfigReader;
import kpler.utility.DriverSingle;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class VerifyDifferentIcons {


    HomePage homepage = new HomePage();
    String kplerHomePage;
    Set<String> allWindows = new LinkedHashSet<>();
    List<String> actualTitles = new ArrayList<>();



    @Given("User navigates to home page")
    public void user_navigates_to_home_page() {
        DriverSingle.getDriver().get(ConfigReader.read("urlHomePage"));

    }
    @When("user scrolls down on the bottom of the page")
    public void user_scrolls_down_on_the_bottom_of_the_page() {
        BrowserUtil.scrollToElement(homepage.stageSocialStore);
        BrowserUtil.waitFor(2);
    }
    @When("user is able to click each element to open new window")
    public void user_is_able_to_click_each_element_to_open_new_window() {


        kplerHomePage = DriverSingle.getDriver().getWindowHandle();
        BrowserUtil.clickingMultipleLinks(homepage.listofsocialLinks);
        BrowserUtil.clickingMultipleLinks(homepage.listofStores);
        BrowserUtil.waitFor(2);

        allWindows = DriverSingle.getDriver().getWindowHandles();




    }
    @Then("user should able to switch windows and get title of each window")
    public void user_should_able_to_switch_windows_and_get_title_of_each_window(List<String> expectedTitles) {

        BrowserUtil.waitFor(2);
        actualTitles = BrowserUtil.switchingWindows(allWindows);
        for (int i = 0, j = 0; i < actualTitles.size(); i++, j++) {
            Assert.assertTrue(actualTitles.get(i).contains(expectedTitles.get(j)));
        }
        BrowserUtil.waitFor(2);
    }
}
