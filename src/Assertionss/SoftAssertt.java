package Assertionss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
//import org.testng.Assert;

import java.time.Duration;

public class SoftAssertt {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        String Expected = driver.getTitle();
        SoftAssert sa = new SoftAssert();
        String actual = "Google1";
        System.out.println(Expected);
        sa.assertEquals(Expected,actual);
        driver.close();

    }
}
