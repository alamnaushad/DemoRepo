package UITestCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CloseAndQuitCommand {
    @Test
    public void verifyCloseAndQuit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        driver.findElement(By.xpath("//div[3]/button[@class='btn btn-info']")).click();
    }

    public static class DropDown {
        public static void main(String args[]){
            System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://testautomationpractice.blogspot.com/");

            driver.manage().window().maximize();

            WebElement ele = driver.findElement(By.xpath(".//select[@id='country']"));
            Select se = new Select(ele);
            List<WebElement> elements = se.getOptions();
            System.out.println("size: " +elements.size());
            driver.close();

        }
    }

    public static class FirstTest {
        public static void main(String args[]){
            System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/newtours/index.php");
            driver.manage().window().maximize();
            WebElement element = driver.findElement(By.xpath("//input[@name='userName']"));
                    element.sendKeys("userName");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
            driver.findElement(By.linkText("")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String actualTitle= driver.getTitle();
            System.out.println("title: " +actualTitle);
            String expectedTitle = "Login: Mercury Tours";
            Assert.assertEquals(actualTitle, expectedTitle);
            driver.close();
        }
    }
}
