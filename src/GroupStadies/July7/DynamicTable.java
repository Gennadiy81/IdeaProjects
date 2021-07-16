package GroupStadies.July7;

import JavaClasses.day59_polymorphism_exceptions.WebElement;

import java.util.List;

public class DynamicTable {
    /**
     * if webtable is dynamic, i normally locate the table overall first, then find elements with tr
     * td tags within the table webelement.
     */
//    WebElement table = driver.findElement(By.id("tb1"));
//    List<WebElement> rows = table.findElements(By.tagName("tr"));
//        for (int i = 0; i < rows.size(); i++) {
//        List<WebElement> rowData = rows.get(i).findElements(By.tagName("td"));
//        for (int j = 0; j < rowData.size(); j++) {
//            System.out.println("Row: " + i +" Col: " + j + " value: " + rowData.get(j).getText());
//        }
//    }
//
//    /**Xpath version to find all elements
//     * I use xpath to dynamically find number or rows and cols using findElements method in webdriver.
//     * so even if table rows or cols change, my code is able to local the correct number of data on the page
//     *
//     */
//    List<WebElement> rows2 = driver.findElements(By.xpath("//table[@id='tb1']//tr"));
//        for (int i = 0; i < rows2.size(); i++) {
//        //List<WebElement> myRowData = rows2.get(i).findElements(By.tagName("td"));
//        List<WebElement> myRowData = driver.findElements(By.xpath("//table[@id='tb1']//tr["+i+"]/td"));
//        for (int j = 0; j < myRowData.size(); j++) {
//            System.out.println(driver.findElement(By.xpath("//table[@id='tb1']//tr["+i+"]/td["+j+"]")).getText());
      //  }
   // }

}
