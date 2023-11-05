package Project;


import Forms.PageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Item {
    private WebDriver driver;
    private String baseurl;

    @BeforeMethod
    public void setup() {
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        baseurl = "https://accmate.datamateinc.com/1";
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void Item() throws InterruptedException {
        driver.get(baseurl);

    }


    @AfterMethod
    public void close() {

        driver.quit();

    }
}


