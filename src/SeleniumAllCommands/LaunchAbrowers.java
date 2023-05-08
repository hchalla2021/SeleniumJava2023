package SeleniumAllCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LaunchAbrowers {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");

        //System.setProperty("webdriver.edge.driver", "D:\\Trainings\\Selenium\\Drivers\\msedgedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "D:\\Trainings\\Selenium\\Drivers\\geckodriver.exe");

       WebDriver driver = new ChromeDriver();// chrome browser launch

        //WebDriver driver = new EdgeDriver();// edge browser launch

        //WebDriver driver = new FirefoxDriver();// edge browser launch


        driver.get("http://tutorialsninja.com/demo/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        String gettitlee = driver.getTitle();

        System.out.println("Title is " + gettitlee);

        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("iphone");

        driver.findElement(By.xpath("//*[@id=\"search\"]/span")).click();

        //Thread.sleep(3000);

       // String getprice = driver.findElement(By.xpath("(/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[1]/p[2]//text())[1]")).getText();

        //System.out.println(getprice);

        String getbeforeiphone = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")).getText();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a")).click();

        String getAfteriphone =  driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1")).getText();

        if(getbeforeiphone.equalsIgnoreCase(getAfteriphone)) {

            System.out.println("Before price" + getbeforeiphone);
            System.out.println("Afteer price" + getAfteriphone);

            System.out.println("Passed");
        }
         driver.close();
         //driver.quit();
    }
}
