import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BaseTest {
    RemoteWebDriver driver;
    @Before
    public void openBasePage() throws Exception {
        final DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability("enableVideo", true);
        desiredCapabilities.setCapability("videoName",  "myVideo");
        desiredCapabilities.setCapability("enableLog ", true);
        desiredCapabilities.setCapability("logName ", "MyLog.log");
        driver = new RemoteWebDriver(new URL("http://10.6.194.55:4444/wd/hub"), desiredCapabilities);
        driver.manage().window().maximize();
    }

    @After
    public void chutDown(){
        driver.close();
    }

}
