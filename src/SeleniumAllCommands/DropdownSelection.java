package SeleniumAllCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropdownSelection {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //driver.findElement(By.xpath("//*[@id=\"u_0_0_l1\"]")).click();
        Select getcars = new Select(driver.findElement(By.xpath("//*[@id=\"carselect\"]")));
        //getcars.selectByVisibleText("Benz");
        //getcars.selectByIndex(1);
       // getcars.selectByValue("Honda");


    }
}
