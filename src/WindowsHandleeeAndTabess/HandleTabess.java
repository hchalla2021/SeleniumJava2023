package WindowsHandleeeAndTabess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class HandleTabess {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();

        ArrayList<String> gettabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println("Number of tabs opened " + gettabs.size());

       // driver.switchTo().window(gettabs.get(0));

        driver.switchTo().window(gettabs.get(1));

        System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());





    }
}
