package KenidCalısmalarım.ArabaAl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ArabaAl {

    static WebDriver driver;

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.sahibinden.com");
    }

    @Test
    public void aramayiBul() throws InterruptedException {
        driver.findElement(By.id("searchText")).sendKeys("Wolgsvogen Passat" + Keys.ENTER);
        Thread.sleep(1000);
    }

    @Test
    public void birinciyiSec() {
        driver.findElement(By.xpath("//*[@id=\"wideContainer\"]/div/div[2]/ul/li[2]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"searchResultsTable\"]/tbody/tr[1]/td[2]/a")).click();
        String tel= driver.findElement(By.xpath("//*[@id=\"classifiedDetail\"]/div/div[2]")).getText();
        System.out.println(tel);
    }




}
