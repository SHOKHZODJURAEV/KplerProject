package kpler.pages;

import kpler.utility.DriverSingle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(DriverSingle.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Company']")
    public WebElement companyModule;

    @FindBy(xpath = "//li[@class='link active']")
    public WebElement contactModule;

    @FindBy(xpath = "//li[@class='nav-platform-links']")
    public WebElement loginModule;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement trialButton;

    @FindBy(className = "nav[class='navbar navbar-fixed-top affix-top']")
    public WebElement scrollUp;

    @FindBy( css = "[class='navbar navbar-fixed-top affix']")
    public WebElement verifyScrolldownStage;


    @FindBy(xpath = "//ul[@class='nav navbar-nav']//li[@class]")
    public List<WebElement> listOfModules;

    @FindBy(xpath = "//ul[@class='nav-dropdown open']//li")
    public List<WebElement> listOfLoginSubmodules;



    public void clickEachSubmodule(String submoduleName) {

        DriverSingle.getDriver().findElement(By.xpath("//ul[@class='nav-dropdown open']//li[.='" + submoduleName + "']")).click();


    }





}
