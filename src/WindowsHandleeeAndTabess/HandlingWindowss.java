package WindowsHandleeeAndTabess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class HandlingWindowss {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        String mainwindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
        Set<String> getwindowss = driver.getWindowHandles();
        Iterator<String>itr = getwindowss.iterator();
        while (itr.hasNext()) {
         String childwindoww = itr.next();
         if(!childwindoww.equals(mainwindow)) {
             driver.switchTo().window(childwindoww);
             System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
         }
        }
        driver.switchTo().window(mainwindow);
        driver.quit();
    }
}
