package com.jonwadford;

import com.jonwadford.utils.DriverUtils;
import com.jonwadford.utils.WebTableUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Jon on 6/14/17.
 */
public class LoopTheTable {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverUtils.getDriver();
        driver.get("http://www.ussoccerda.com/all-clubs");
    }

    @Test
    public void printTableValues() {

        WebTableUtils tableBody = new WebTableUtils(driver.findElement(By.cssSelector("table.notranslate#club_directory_list")));
        WebTableUtils tableHeader = new WebTableUtils(driver.findElement(By.cssSelector("table.notranslate tbody")));

        for (int i = 2; i <= tableBody.getRowCount(); i++) {
            System.out.println("Club Name: "+tableBody.getCellData(i,1));
            System.out.println("Club Location: "+tableBody.getCellData(i,2));
            System.out.println("Programs Offered: "+tableBody.getCellData(i,3));
            System.out.println();
        }
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

