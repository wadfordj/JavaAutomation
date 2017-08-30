package com.jonwadford;

import com.jonwadford.utils.DriverUtils;
import com.jonwadford.utils.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoopAnother {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverUtils.getDriver();
        driver.get("http://localhost:8000/");
    }

    @Test
    public void printTableValues() {
        boolean tableFlag = false;
        WebTableUtils tableBody = new WebTableUtils(driver.findElement(By.cssSelector("table.bluebordertable tbody")));
        int colNum = 0;
        for (int i = 2; i <= tableBody.getRowCount(); i++) {
            if(tableBody.getCellData(i,colNum).equals("Migration Description")){

                System.out.println("Column Contains Mig DESC");
                colNum = colNum + 1;
                if(tableBody.getCellData(i,colNum).equals("CPAREGAUTOScriptDev")){
                    tableFlag = true;
                    System.out.println(tableFlag);
                    break;
                }

            }

        }
        if (tableFlag){
            System.out.println("Found a Matching Column Name and Column Value ");
        }else{
            System.out.println("No Match Found - Test Failed");
        }
    }

}
