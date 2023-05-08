package WindowsHandleeeAndTabess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class HandleTabess1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        String mainwindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
        Thread.sleep(1000);
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(mainwindow)) {
                driver.switchTo().window(tab);
            }
        }
    }
}