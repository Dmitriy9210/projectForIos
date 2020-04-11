package qaIOs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DotTestListener extends TestListenerAdapter {
    private int m_count = 0;

    private AppiumDriver<MobileElement> driver;

    @Override
    public void onTestFailure(ITestResult tr) {
        DriverManager driverManager =new DriverManager(driver);
                driverManager.takeScreenShot();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.print("dsdsds");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.print("kfkfkf");
    }

    private void log(String string) {
        System.out.print(string);
        if (++m_count % 40 == 0) {
            System.out.println("");
        }
    }
}
