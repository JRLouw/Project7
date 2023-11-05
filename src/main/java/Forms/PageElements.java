package Forms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PageElements {

        private static WebElement element = null;

//TxtRegName
//TxtRegLastName
//TxtRegDesg

        public static WebElement RegName(WebDriver driver) {

            element = driver.findElement(By.name("Items"));
            return element;

        }

       // public static WebElement RegLastName(WebDriver driver) {

           // element = driver.findElement(By.name("TxtRegLastName"));
           // return element;
      //  }

      //  public static WebElement RegDesg(WebDriver driver) {
         //   element = driver.findElement(By.name("TxtRegDesg"));
         //   return element;
       // }
    }


