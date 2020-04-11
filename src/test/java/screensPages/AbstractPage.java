package screensPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AbstractPage {

    protected AppiumDriver<MobileElement> driver;

    public void setDriver(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public AbstractPage (AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void clickButton(By by, int time) {
        waitElement(by, time).click();
    }

    public void sendValue(By by, int time, String text) {
        WebElement element = waitElement(by, time);
        element.sendKeys(text);
        element.isDisplayed();
        String textField = getValue(by,5);
//        textField = textField.replaceAll("\\D", "");
        Assert.assertEquals(text, textField, "Введенное значние не равно отображаемому: " + text + " и " + textField);
    }

    public String getValue(By by, int time){
        return waitElement(by, time).getText();
    }

    public void clearField(By by, int time) {
        waitElement(by, time).clear();
    }

    public WebElement waitElement(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }
}