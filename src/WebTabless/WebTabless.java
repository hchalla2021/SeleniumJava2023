package WebTabless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import java.time.Duration;
import java.util.List;

public class WebTabless {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();// chrome browser launch
        driver.get("https://www.india.gov.in/my-government/whos-who/chief-ministers");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        int getrowscount = driver.findElements(By.xpath("//table//tr")).size();
        System.out.println(getrowscount);
        int getcolumnscount = driver.findElements(By.xpath("//table//td")).size();
        System.out.println(getcolumnscount);

        List<WebElement> geallcmnames = driver.findElements(By.xpath("//table//tr//td[2]"));

        for(WebElement getcms : geallcmnames) {

            System.out.println(getcms.getText());

            if(getcms.getText().equalsIgnoreCase("Shri YS Jagan Mohan Reddy")) {

                System.out.println("he is my state CM");
                break;
              }else {
                System.out.println("he is not my state CM");
            }
        }
    }
}
