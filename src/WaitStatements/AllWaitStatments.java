package WaitStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AllWaitStatments {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button")));

        /*FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                     .withTimeout(Duration.ofSeconds(60))
                     .pollingEvery(Duration.ofSeconds(10))
                     .ignoring(Exception.class);*/
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button")).click();




    }
}
