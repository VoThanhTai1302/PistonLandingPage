import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homepage {

    private WebDriver driver;
    private String driverPath = "C:\\sourcedriver\\chromedriver.exe";

    @Test(priority = 0)
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://piston.live/vi");

    }

    @Test(priority = 1)
    public void HeaderMenu() throws InterruptedException {
        setup();
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


        WebElement btnNext = driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[2]/div/button[2]"));
        WebElement btnBack = driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[2]/div/button[1]"));
        actions.moveToElement(btnNext).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(btnNext).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(btnBack).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(btnBack).click().build().perform();
        Thread.sleep(3000);

        driver.quit();
    }

    @Test(priority = 2)
    public void Banner() throws InterruptedException {
        setup();
        WebElement clickbtnJoinPiston = driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[1]/div/div[1]/div/div/div[1]/div/div[2]/a[1]/button"));
        WebElement clickLearMore = driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[1]/div/div[1]/div/div/div[1]/div/div[2]/a[2]/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(clickbtnJoinPiston).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickLearMore).click().build().perform();
        Thread.sleep(3000);
        driver.quit();

    }

    @Test(priority = 3)
    public void About() throws InterruptedException {
        setup();
        WebElement moveAbout1 = driver.findElement(By.xpath("//*[@id=\"about\"]/div[2]/div[2]/div/div/div[1]/div"));
        WebElement moveAbout2 = driver.findElement(By.xpath("//*[@id=\"about\"]/div[2]/div[2]/div/div/div[2]/div"));
        WebElement moveAbout3 = driver.findElement(By.xpath("//*[@id=\"about\"]/div[2]/div[2]/div/div/div[3]/div"));
        WebElement moveAbout4 = driver.findElement(By.xpath("//*[@id=\"about\"]/div[2]/div[2]/div/div/div[4]/div"));

        Actions actions = new Actions(driver);
        //About
        actions.moveToElement(moveAbout1).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(moveAbout2).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(moveAbout3).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(moveAbout4).build().perform();
        Thread.sleep(3000);
        driver.quit();

    }

    @Test(priority = 4)
    public void Tokenomics() throws InterruptedException {
        setup();
        WebElement moveTokenimics = driver.findElement(By.xpath("//*[@id=\"tokenomics\"]/div/div[2]/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(moveTokenimics).build().perform();
        Thread.sleep(3000);
        driver.quit();

    }

    @Test(priority = 5)
    public void Roadmap() throws InterruptedException {
        setup();
        WebElement moveRoadmap1 = driver.findElement(By.xpath("//*[@id=\"roadmap\"]/div[2]/div/div[3]/div/div[1]/div"));
        WebElement moveRoadmap2 = driver.findElement(By.xpath("//*[@id=\"roadmap\"]/div[2]/div/div[3]/div/div[2]/div/div"));
        WebElement moveRoadmap3 = driver.findElement(By.xpath("//*[@id=\"roadmap\"]/div[2]/div/div[3]/div/div[3]/div"));
        WebElement moveRoadmap4 = driver.findElement(By.xpath("//*[@id=\"roadmap\"]/div[2]/div/div[3]/div/div[4]/div"));
        WebElement moveRoadmap5 = driver.findElement(By.xpath("//*[@id=\"roadmap\"]/div[2]/div/div[3]/div/div[5]/div"));
        Actions actions = new Actions(driver);
        //Roadmap
        actions.moveToElement(moveRoadmap1).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(moveRoadmap2).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(moveRoadmap3).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(moveRoadmap4).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(moveRoadmap5).build().perform();
        Thread.sleep(3000);
        driver.quit();

    }

    @Test(priority = 6)
    public void Games() throws InterruptedException {
        setup();
        WebElement clickbtnPlayMillionnaire = driver.findElement(By.xpath("//*[@id=\"millionaire\"]/div[2]/div[1]/div/div[3]/a/button"));
        WebElement clickbtnPlayLottery = driver.findElement(By.xpath("//*[@id=\"lottery-kingdom\"]/div[2]/div[2]/div/div[3]/a/button"));
        Actions actions = new Actions(driver);
        //Play on Telegram
        actions.moveToElement(clickbtnPlayMillionnaire).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickbtnPlayLottery).click().build().perform();
        Thread.sleep(3000);
        driver.quit();

    }

    @Test(priority = 7)
    public void FAQs() throws InterruptedException {
        setup();
        WebElement clickFAQs1 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div[3]/div/div[1]/button/p"));
        WebElement clickFAQs2 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div[3]/div/div[2]/button/p"));
        WebElement clickFAQs3 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div[3]/div/div[3]/button/p"));
        WebElement clickFAQs4 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div[3]/div/div[4]/button/p"));
        WebElement clickFAQs5 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div[3]/div/div[5]/button/p"));
        WebElement clickFAQs6 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div[3]/div/div[6]/button/p"));
        WebElement clickFAQs7 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div[3]/div/div[7]/button/p"));
        Actions actions = new Actions(driver);
        //FAQs
        actions.moveToElement(clickFAQs1).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickFAQs2).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickFAQs3).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickFAQs4).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickFAQs5).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickFAQs6).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickFAQs7).click().build().perform();
        Thread.sleep(3000);
        driver.quit();

    }

    @Test(priority = 8)
    public void Footer() throws InterruptedException {
        setup();
        WebElement clickFooterTelegram = driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div[2]/div[1]/a[1]"));
        WebElement clickFooterInstagram = driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div[2]/div[1]/a[2]"));
        WebElement clickFooterFacebook = driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div[2]/div[1]/a[3]"));
        WebElement clickPolicy = driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div[2]/div[2]/a[1]"));
        WebElement clickTerm = driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div[2]/div[2]/a[2]"));
        Actions actions = new Actions(driver);
//Footer
        actions.moveToElement(clickFooterTelegram).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickFooterInstagram).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickFooterFacebook).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickPolicy).click().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(clickTerm).click().build().perform();
        Thread.sleep(3000);
        driver.quit();

    }

}
