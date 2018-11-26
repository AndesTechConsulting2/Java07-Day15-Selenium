package org.andestech.learning.rfb18.g2;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertTrue;

public class AppTest2
{
    private WebDriver wd = null;
    private FirefoxOptions options = null;
    private FirefoxProfile profile = null;


    @BeforeClass
    public void initData(){


    Capabilities caps = new DesiredCapabilities();

    System.setProperty("webdriver.gecko.driver",
            "E:\\drivers\\selenium\\geckodriver.exe");
        System.out.println("+++ Class: " + this);

        options = new FirefoxOptions();
        options.addArguments("--start-maximized");


    File file = new File("C:\\Users\\and\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\nywxnvk0.default");
    profile = new FirefoxProfile(file);

    profile.setPreference("browser.startup.homepage",
            "http://google.com|http://ya.ru");

    options.setProfile(profile);

    }

    @Test
    public void testCaseFFox01() throws InterruptedException {


        wd = new FirefoxDriver(options);
        Thread.sleep(2000);
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
