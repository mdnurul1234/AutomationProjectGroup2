import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClient {

    WebDriver driver = null;
    String url = null;

    public void setup(){
        System.setProperty("webdriver.chrome.driver","../common/Driver/chromedriver");
        this.driver= new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void cleanup(){
    this.driver.quit();
    }

}
