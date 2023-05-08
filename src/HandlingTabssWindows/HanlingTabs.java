package HandlingTabssWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class HanlingTabs {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
        ArrayList<String>tabss = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(tabss.size());
        driver.switchTo().window(tabss.get(1));
        String gettextnewtab = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
        System.out.println(gettextnewtab);
        //driver.close();
        driver.switchTo().window(tabss.get(0));
        driver.quit();
    }
}
