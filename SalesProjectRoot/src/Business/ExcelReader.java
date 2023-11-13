/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author smatcha
 */
public class ExcelReader {

    public static List<List<String>> readExcelTable(String filePath) throws Exception {
        List<List<String>> tableData = new ArrayList<>();

        try (XSSFWorkbook workbook = new XSSFWorkbook(filePath)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                List<String> rowData = new ArrayList<>();

                for (Cell cell : row) {
                    rowData.add(cell.getStringCellValue());
                }

                tableData.add(rowData);
            }
        }

        return tableData;
    }
}
