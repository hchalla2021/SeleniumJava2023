package KeyboardMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement s = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[1]"));

        Actions action = new Actions(driver);
         action.moveToElement(s).build().perform();

        driver.findElement(By.xpath("(//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div/a[2])[1]")).click();

    }
}
