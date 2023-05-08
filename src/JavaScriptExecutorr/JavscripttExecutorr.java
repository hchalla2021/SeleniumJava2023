package JavaScriptExecutorr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavscripttExecutorr {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        //WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        //WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        WebElement scrolldown1 = driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //js.executeScript("arguments[0].value='Iphone';",searchbox);
        //js.executeScript("arguments[0].setAttribute('style','background:grey; border: 2px solid yellow;')",searchbtn);
        //js.executeScript("arguments[0].click();",searchbtn);
        Thread.sleep(2000);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView(true);",scrolldown1);
        //js.executeScript("window.scrollBy(0,-350)", "");
        //js.executeScript("window.scrollBy(0,1000)");
        js.executeScript("arguments[0].click();",scrolldown1);
       

        

    }
}
