package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        //locate the workbook
        XSSFWorkbook wb=new XSSFWorkbook("./learnselenium/data/CreateLead.xlsx");
        //locate the worksheet
        XSSFSheet ws = wb.getSheetAt(0);
        //to find the rowcount
        int rowCount = ws.getLastRowNum();
        System.out.println(rowCount);
        //t ofind the columncount
        int columnCount = ws.getRow(1).getLastCellNum();
        System.out.println(columnCount);
        //iterate entire data
        for (int i = 1; i <=rowCount; i++) {
            for (int j = 0; j <columnCount ; j++) {
                String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
                System.out.println(stringCellValue);
            }
        }
        wb.close();
    }

}
