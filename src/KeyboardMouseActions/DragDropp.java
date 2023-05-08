package KeyboardMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragDropp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.switchTo().frame(0);
        WebElement drogg = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement dropp = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions action  = new Actions(driver);
        action.dragAndDrop(drogg, dropp).build().perform();



    }
}
