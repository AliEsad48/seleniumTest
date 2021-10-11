package KenidCalısmalarım.team8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebinarKytFormu {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.jotform.com/form/212804571037350");
    }


    @Test
    public void ad() throws InterruptedException {
        Thread.sleep(2000);
        WebElement name1 = driver.findElement(By.name("q3_ad[first]"));
        name1.sendKeys("Mehmet Esad");

    }


    @Test
    public void soyad() throws InterruptedException {

        WebElement name2 = driver.findElement(By.name("q3_ad[last]"));
        name2.sendKeys("Bayram");
        Thread.sleep(2000);
    }

    @Test
    public void mail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"input_4\"]")).sendKeys("alicamci2020@gmail.com");
        Thread.sleep(2000);
    }


    @Test
    public void alanKodu() throws InterruptedException {
        driver.findElement(By.cssSelector("#input_8_area")).sendKeys("+90");
        Thread.sleep(2000);
    }

    @Test
    public void telefon() throws InterruptedException {
        WebElement country= driver.findElement(By.xpath("//select[@id='input_7_country']"));
        country.click();


        Thread.sleep(2000);
    }

    @AfterClass
    public static void after() {
        driver.close();
    }


}
