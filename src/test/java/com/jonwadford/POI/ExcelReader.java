package com.jonwadford.POI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExcelReader {

    public static void main(String[] args){
        //String fn = "/Users/Jon/Desktop/Workbook1.xlsx";
        //ExcelReader excelReader = new ExcelReader();
        //excelReader.getcellvalue(fn,10,1,0,"Code Group Id");

        String fileName = "Workbook1";
        System.out.println(fileName.length());
    }


//    public boolean getcellvalue(String fileName, int Row, int Column, int sheetIndex,String expectedCellValue)throws FileNotFoundException {
//
//        FileInputStream fis = new FileInputStream(fileName);
//
//        try {
//
//
//            Workbook wb = WorkbookFactory.create(fis);
//            org.apache.poi.ss.usermodel.Sheet sh = wb.getSheetAt(sheetIndex);
//
//            String cellValue = sh.getRow(Row).getCell(Column).getStringCellValue();
//
//            System.out.println(cellValue);
//
//            //Compare and validate
//            if (cellValue.contains(expectedCellValue)) {
//                System.out.println("Passed");
//            } else {
//                System.out.println("Failed");
//            }
//
//        } catch (Exception e) {
//            System.out.println("EXCEPTION IN GET CELLVALUE");
//        }
//    }
//
//    }
}
