package screensAction;

import com.sun.org.apache.xml.internal.utils.URI;
import qaIOs.DotTestListener;
import qaIOs.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.*;
import screensPages.IntroPage;

import java.net.MalformedURLException;

@Listeners({DotTestListener.class})

public class IntroAct {
    private AppiumDriver<MobileElement> driver;


    private DriverManager driverManager = new DriverManager(driver);
//    private IntroPage introPage = new IntroPage(driver);

    @BeforeMethod()
    public void setUp() throws URI.MalformedURIException, MalformedURLException, InterruptedException {
        driverManager.setUp();
        this.driver = driverManager.getDriver();
        new IntroPage(driver).waitPictures();
    }

    @AfterMethod()
    public void nextTest() {
        driverManager.nextTest();
    }

    @AfterTest()
    public void closeApp() {
        driverManager.closeApp();
    }


    @Test()
    public void open1Page() {
        new IntroPage(driver).waitPictures();
    }

    @Test()
    public void open2Page() {
        IntroPage introPage = new IntroPage(driver);
        introPage.inputPhone("89111882221");
        introPage.inputPassword("djsdsnjsdnj");
        introPage.clickBtnEanter();

    }

    @Test()
    public void open3page() {
        IntroPage introPage = new IntroPage(driver);
        introPage.goTo3page("891188811333");

    }
}