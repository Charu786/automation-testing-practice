package automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        // launch browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get("https://the-internet.herokuapp.com/login");
        //Maximize window
        driver.manage().window().maximize();
        //Enter username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        //Enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        //click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Wait
        Thread.sleep(2000);
        //verify login success
        boolean isDisplayed = driver.findElement(By.xpath("//h2[text()='Secure Area']")).isDisplayed();
        if (isDisplayed) {
            System.out.println("Login Successfull");
        } else {
            System.out.println("Login Failed");
        }
        //close browser
        driver.quit();
    }
}


