package WindowsHandleeeAndTabess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class HandleFrames {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"zen_all_courses_dynamic\"]/div[1]/h1")).getText());
        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div[2]/div/div/div/div/h1")).getText());
    }
}
