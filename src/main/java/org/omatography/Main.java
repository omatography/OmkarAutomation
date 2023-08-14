package org.omatography;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Desktop\\OmkarAutomation\\driver\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=KqWUC-xWYpA");
    }

    @Test
    void access(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Desktop\\OmkarAutomation\\driver\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=KqWUC-xWYpA");
    }
}