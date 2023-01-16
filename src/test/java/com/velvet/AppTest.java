package com.velvet;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest 
{
    @Test
    public void simpleTest() throws InterruptedException
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.es");
        Thread.sleep(2000);
        driver.findElement(By.id("L2AGLb")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Lorem ipsum dolor sit amet");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();
    }
}
