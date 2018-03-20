package com.h2k.rmnot.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class UIBaseClass {
	
	 protected String url;
	 
	    protected WebDriver driver;
	 
	    @Parameters({"url","browserType"})
	    @BeforeTest
	    public void invokeBrowser(String url,String browserType)
	    { 
	    	System.out.println("full path to the executable"+ System.getProperty("user.dir")+ "/src/text/resources/geckodriver.exe");
	        if(browserType.equals("FF"))
	        {
	            System.out.println("in FF");
	            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/src/text/resources/geckodriver.exe");
	            driver = new FirefoxDriver();
	        }
	        else if(browserType.equals("CH"))
	        {
	            System.out.println("in CH");
	            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/text/resources/chromedriver.exe");
	            driver = new ChromeDriver();
	        }
	        else
	        {
	            /**
	             * Two points
	             * 1. zoom should be 100%
	             * 2. Enable protected mode should be enabled for all the security zones.
	             */
	            System.out.println("in IE");
	            System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	            driver = new InternetExplorerDriver();
	        }
	      
	        this.url=url;
	    }

}
