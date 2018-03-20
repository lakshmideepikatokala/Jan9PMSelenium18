package com.h2k.rmnot.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.h2k.rmnot.pages.HomePage;
import com.h2k.rmnot.pages.ProductDealsPage;
import com.h2k.rmnot.util.UIBaseClass;

public class RMTests extends UIBaseClass{

	//@DataProvider(name="DP")
 //  public String[][] feedDP() throws  IOException
   {
  
           
     
		//String arr[][]= Utility.readXlsFile();
     // return arr;
 
   }
     
    @Parameters({"categoryName","categoryID","expectedCount"})
    @Test(priority=1)
    public void verifyCategoryCount(String categoryName,String categoryID,String expectedCount)
    {
        driver.get(url);
        HomePage hPage = new HomePage(driver);
        ProductDealsPage dealsPage = hPage.navigateToProductDeals();
        int actual = dealsPage.getCategoryCount(categoryName,categoryID);
        int expected= Integer.parseInt(expectedCount);
        Assert.assertEquals(actual,expected);
    }

    @Test(priority=2,dataProvider="DP")
  public void verifyAllCategoryCount(String categoryName,String categoryID,String expectedCount)
  {
    driver.get(url);
     HomePage hPage = new HomePage(driver);
      ProductDealsPage dealsPage = hPage.navigateToProductDeals();
     int actual = dealsPage.getCategoryCount(categoryName,categoryID);
      int expected= Integer.parseInt(expectedCount);
      Assert.assertEquals(actual,expected);
  }
}

	
