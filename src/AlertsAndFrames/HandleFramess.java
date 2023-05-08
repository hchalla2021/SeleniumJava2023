package AlertsAndFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleFramess {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.println("The total number of iframes are " + iframeElements.size());
        driver.switchTo().frame(3);
        String gettext = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
        System.out.println(gettext);
        driver.switchTo().defaultContent();
        String gettextafterback = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
        System.out.println(gettextafterback);



    }
}
