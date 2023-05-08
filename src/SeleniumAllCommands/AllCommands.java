package SeleniumAllCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCommands {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        String getcurrenturl =  driver.getCurrentUrl();

        System.out.println(getcurrenturl);

        driver.navigate().to("https://www.amazon.in/");

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone");

        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

        Thread.sleep(3000);

        driver.navigate().back();

        driver.navigate().back();

        String getfbtitle = driver.getTitle();

        System.out.println(getfbtitle);

        driver.close();



    }
}
