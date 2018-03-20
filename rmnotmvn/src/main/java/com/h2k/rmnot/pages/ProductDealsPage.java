package com.h2k.rmnot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDealsPage {

	WebDriver driver;
    public ProductDealsPage(WebDriver driver)
    {
        this.driver=driver;
    }
     
    public int getCategoryCount(String cName,String cNameID)
    {
        driver.findElement(By.linkText(cName)).click();
        List<WebElement> cList = driver.findElements(By.xpath("//section[@id='"+cNameID+"']/div/div"));
        System.out.println("Number of Elements in Category " + cName+ "is:::" + cList.size());
        return cList.size();
    }
	
}
