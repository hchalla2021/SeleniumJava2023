package HandlingCalendarTakescreenshot;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class HandlingCalendar {

    public  static String datee = "31";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();

        List<WebElement> getdates = driver.findElements(By.xpath("//div[@class=\"react-datepicker__month\"]//div//div"));
        for(WebElement datess : getdates) {
            System.out.println(datess.getText());
            if(datess.getText().equalsIgnoreCase(datee)) {
                datess.click();
                break;
              }
            }
        File screenshott = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
           // FileUtils.copyFile(screenshott, new File("D:\\Trainings\\Selenium\\Test2023.png"));
        }catch (Exception e) {
            System.out.println(e);
        }
     }
    }
