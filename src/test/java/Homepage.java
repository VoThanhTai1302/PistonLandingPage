import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homepage {

    private WebDriver driver;
    private String driverPath = "C:\\sourcedriver\\chromedriver.exe";

    @Test
    public void clickHeader() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://piston.live/vi");

        WebElement clickAbout = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/a[1]/span"));
        WebElement clickTokenomics = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/a[2]/span"));
        WebElement clickRoadmap = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/a[3]/span"));
        WebElement clickGames = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/a[4]/span"));
        WebElement clickFAQs = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/a[5]/span"));
        WebElement showLanguage = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[3]/div[1]/div[1]/div/button"));
        WebElement clickLanguageEN = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[3]/div[1]/div[1]/div/div/div/a[1]/span"));
        WebElement clickLanguageKR = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[3]/div[1]/div[1]/div/div/div/a[2]/span"));
        WebElement clickLanguageVI = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[3]/div[1]/div[1]/div/div/div/a[3]/span"));

        WebElement clickTelegram = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[3]/div[1]/div[1]/a[1]"));
        WebElement clickInstagram = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[3]/div[1]/div[1]/a[2]"));
        WebElement clickFacebook = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[3]/div[1]/div[1]/a[3]"));
        WebElement clickbtnConnectWallet = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[3]/div[1]/div[2]/div/button"));


        Actions actions = new Actions(driver);
        actions.moveToElement(clickAbout).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickTokenomics).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickRoadmap).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickGames).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickFAQs).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(showLanguage).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickLanguageEN).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickLanguageKR).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickLanguageVI).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickTelegram).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickInstagram).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickFacebook).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(clickbtnConnectWallet).click().build().perform();
        Thread.sleep(3000);
        driver.quit();


    }
}
