package com.example.tutorbuoi4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void testLogin() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("Logged In Successfully"));
        System.out.println("Login Successfully");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

}
