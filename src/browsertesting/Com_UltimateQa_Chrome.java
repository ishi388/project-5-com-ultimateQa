package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_UltimateQa_Chrome {

    public static void main(String[] args) {


        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into browser
        driver.get(baseUrl);
        // maximize the window
        driver.manage().window().maximize();
        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of page
        String title = driver.getTitle();
        // Printing statement
        System.out.println("Title");

        //Get the current Url
        System.out.println("Current Url: " + driver.getCurrentUrl());

        // Get page source
        System.out.println("Page Source : " + driver.getPageSource());

        // Find the email field element
        driver.findElement(By.id("user[email]")).sendKeys("ishita12@gmail.com");
        //Find the password field element
        driver.findElement(By.id("user[password]")).sendKeys("ishi123");

        driver.close();
    }
}

