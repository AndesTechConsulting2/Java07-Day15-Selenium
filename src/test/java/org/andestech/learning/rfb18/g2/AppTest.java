package org.andestech.learning.rfb18.g2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class AppTest
{
    private WebDriver wd = null;
    private ChromeOptions options = null;


    @BeforeClass
    public void initData() {
        System.setProperty("webdriver.chrome.driver",
                "E:\\drivers\\selenium\\chromedriver1.exe");
        System.out.println("+++ Class: " + this);

        options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);

       // options.addArguments("--headless");

       // options.setHeadless(true);
        options.addArguments("--start-maximized");
    }

    @Test
    public void testCaseChrome01()
    {
        wd = new ChromeDriver(options);
        wd.get("http://lenta.ru");
        assertTrue( true );
    }


    @AfterClass
    public void tearDown()
    {
      if(wd != null) wd.quit();
      System.out.println("--- Class: " + this);
    }

}
