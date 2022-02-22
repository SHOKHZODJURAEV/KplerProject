package kpler.pages;

import kpler.utility.DriverSingle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrialPage {

    public TrialPage(){

        PageFactory.initElements(DriverSingle.getDriver(),this);
    }

    @FindBy(xpath = "//body")
    public WebElement onlyBody;


}
