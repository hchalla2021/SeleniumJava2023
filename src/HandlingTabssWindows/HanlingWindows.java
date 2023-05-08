package HandlingTabssWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class HanlingWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        String mainwindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
        Set<String> childwindow = driver.getWindowHandles();
        Iterator<String> itr = childwindow.iterator();
        while (itr.hasNext()) {
            String getchildwindows = itr.next();

            if (!mainwindow.equals(getchildwindows)) {
            driver.switchTo().window(getchildwindows);
                String getwindowtext =  driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
                System.out.println(getwindowtext);
                driver.close();
            }
        }
    }
}
