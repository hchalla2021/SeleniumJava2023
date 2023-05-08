package SeleniumAllCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumCommands1 {

    public static String url = "https://courses.letskodeit.com/practice";
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();// chrome browser launch
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//*[@id=\"benzradio\"]")).click();
        Select carstype = new Select(driver.findElement(By.xpath("//*[@id=\"carselect\"]")));
        carstype.selectByVisibleText("Benz");
         driver.findElement(By.xpath("//*[@id=\"multiple-select-example\"]/option[3]")).click();
         driver.findElement(By.xpath("//*[@id=\"hondacheck\"]")).click();

        // isDisplayed
        if(driver.findElement(By.xpath("//*[@id=\"name\"]")).isDisplayed()) {
          driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("hari");
        }else {
            System.out.println("element does not exists");
        }

        // isEnabled
        if(driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).isEnabled()) {
            System.out.println("element is Enabled");
            driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).click();
        }else {
            System.out.println("element is disabled");
            //Assert.fail();
        }
        // isSelected
        if(driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).isSelected()) {
            System.out.println("element selected");
        }else {
            System.out.println("element is not selected");
            driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]")).click();

        }
    }
}
