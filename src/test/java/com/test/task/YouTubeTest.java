package com.test.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeTest {

    public void youtubeSearchTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://youtube.com");

        driver.close();
        driver.quit();
    }
}
