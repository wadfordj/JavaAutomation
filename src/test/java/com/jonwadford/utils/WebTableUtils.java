package com.jonwadford.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jon on 6/14/17.
 */
public class WebTableUtils {

    private WebElement _webTable;

    public WebTableUtils(WebElement webTable){
        set_webTable(webTable);
    }

    public void set_webTable(WebElement _webTable){
        this._webTable = _webTable;
    }

    public int getRowCount(){
        List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
        return tableRows.size();
    }

    public String getCellData(int rowIdx, int colIdx) {
        List<WebElement> tableRows = _webTable.findElements(By.tagName("tr"));
        WebElement currentRow = tableRows.get(rowIdx-1);

        List<WebElement> tableCols = currentRow.findElements(By.tagName("td"));
        WebElement cell = tableCols.get(colIdx);
        return cell.getText();

    }
}
