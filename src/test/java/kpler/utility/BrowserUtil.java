package kpler.utility;


import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtil {


    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getAttribute("innerHTML").trim());
        }
        return elemTexts;
    }

    public static List<String> getAllText(List<WebElement> lstOfWebElements) {

        List<String> allTextLst = new ArrayList<>();
        for (WebElement eachElement : lstOfWebElements) {
            allTextLst.add(eachElement.getText());
        }

        return allTextLst;

    }


    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Scrolls down to an element using JavaScript
     *
     * @param element
     */
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) DriverSingle.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Selects with visibleText
     *
     * @param elementDropdown
     * @param visibleText
     */
    public static void selectByVisibleText(WebElement elementDropdown, String visibleText) {
        Select dropdown = new Select(elementDropdown);
        dropdown.selectByVisibleText(visibleText);

    }

    /**
     * returns random number between a to b
     *
     * @param a
     * @param b
     * @return
     */
    public static int randomNumber(int a, int b) {
        return new Faker().number().numberBetween(a, b);
    }


    public static void hoverOver(WebElement element) {
        new Actions(DriverSingle.getDriver()).moveToElement(element).pause(2000).perform();
    }


    public static boolean isAllSelected(List<WebElement> allFiles) {

        for (WebElement file : allFiles) {

            if (!file.isSelected()) {
                return false;
            }
        }
        return true;
    }

    public static void clickingMultipleLinks(List<WebElement> links) {

        for (WebElement eachLink : links) {
            eachLink.click();
            BrowserUtil.waitFor(2);
        }


    }

    public static List<String> switchingWindows(Set<String> windows){

        List<String> allTitles = new ArrayList<>();

        for(String eachWindow: windows){

            DriverSingle.getDriver().switchTo().window(eachWindow);

            BrowserUtil.waitFor(3);
            allTitles.add(DriverSingle.getDriver().getTitle());
        }

        return allTitles;

    }
}
