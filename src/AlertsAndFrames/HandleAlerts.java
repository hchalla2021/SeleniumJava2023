package AlertsAndFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleAlerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
        //Alert a = driver.switchTo().alert();//
       // a.accept();// Click on OK Button
        //a.dismiss();// click on Cancel buttton
        //a.sendKeys("Hello");// enter data in alert text box
        //System.out.println(a.getText());// get text on alert window

    }
}
