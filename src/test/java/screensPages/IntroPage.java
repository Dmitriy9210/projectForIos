package screensPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;

public class IntroPage extends AbstractPage {

//    private MenuPage menuPage = new MenuPage(driver);

    private By mainPage = id("Главный экран");
    
    private By fieldNumberPhone = id("phoneTextField");
    private By fieldPassword = id("passwordTextField");
    private By btnEanter = id("signInButton");


    private By number1 = id("Один");
    private By number2 = id("Два");
    private By number3 = id("Три");
    private By number4 = id("Четыре");
    private By number5 = id("Пять");

    private By btnBack = id("backButton");

    public IntroPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }



    public void waitPictures() {
        waitElement(mainPage, 10);
    }

    public void inputPhone(String text) {
        waitPictures();
        sendValue(fieldNumberPhone, 20, text);
    }

    public void inputPassword(String text) {
        waitPictures();
        sendValue(fieldPassword, 20, text);
    }

    public void clickBtnEanter() {
        clickButton(btnEanter, 10);
    }

    private void goTo2Page() {
        waitPictures();
        clickBtnEanter();
        waitElement(number1, 10);
        waitElement(number2, 10);
        waitElement(number3, 10);
        waitElement(number4, 10);
        waitElement(number5, 10);
    }

    public void goTo3page(String text) { //Заполняем УИН
        clickButton(number2, 10);
        goTo2Page();
        clickButton(btnBack, 10);
        waitPictures();
    }
}
