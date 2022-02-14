package AppiumTest.testdata;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class datamanup {

    public static void main(String[]args) throws IOException {

        FileInputStream fis = new FileInputStream("E:\\Test data\\TestData.xlsx");
        XSSFWorkbook doc = new XSSFWorkbook(fis);
       int sheets = doc.getNumberOfSheets();  // to get number of sheets
       System.out.println(sheets);
       for(int i =0; i<sheets;i++) {
           if (doc.getSheetName(i).equalsIgnoreCase("personaldetails"))
           {
               XSSFSheet sheet1 = doc.getSheetAt(i); //load first sheet or any desired sheet based on if condition
               Iterator<Row> row = sheet1.iterator();  //Sheet is collection of rows
                   Row firstrow = row.next(); // moved to 1st row
                   Iterator<Cell> cellvalue = firstrow.cellIterator(); // rows is collection of cell
               int k = 0;
               int column ;
                   while(cellvalue.hasNext())
                   {
                       Cell value = cellvalue.next();   //moved to fisrt cell
                       if(value.getStringCellValue().equalsIgnoreCase("vijay"))
                       {
                        column = k;
                       }
                   k++;
                   }



           }
       }
    }
}
