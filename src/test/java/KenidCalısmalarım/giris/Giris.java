package KenidCalısmalarım.giris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Giris {

    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void hepsiBuradaGiris() throws InterruptedException {
        driver.get("https://www.hepsiburada.com/");

        driver.findElement(By.xpath("//*[@id=\"myAccount\"]/span/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("alicamci2020@gmail.com" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Ali12345" + Keys.ENTER);
        


    }

    @Test
    public void trendyolGiris(){
        driver.get("https://m.trendyol.com/");
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"header-wrapper\"]/div[2]/div[1]/a")).click();
        driver.findElement(By.id("login-email")).sendKeys("alicamci2020@gmail.com");
        driver.findElement(By.id("login-password-input")).sendKeys("Esad1234" + Keys.ENTER);
    }

    @Test
    public void amazonGiris() throws InterruptedException {
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mehmetesad2008@gmail.com" + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Esad1234" + Keys.ENTER);
        Thread.sleep(10000);
    }


    @After
    public void after() {
        driver.close();
    }

}
