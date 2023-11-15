/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// import org.apache.poi.ss.usermodel.Cell;
// import org.apache.poi.ss.usermodel.Row;
// import org.apache.poi.ss.usermodel.Sheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author smatcha
 */
public class ExcelReader {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        FileInputStream fins= new FileInputStream(new File("/Users/smatcha/Documents/Dev/JavaAED/aed-sales-project/SalesProjectRoot/Data/sheet0.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fins);
        
        XSSFSheet sheet = wb.getSheetAt(0);
        FormulaEvaluator fmEval = wb.getCreationHelper().createFormulaEvaluator();
        
        for(Row row:sheet){
            
            for(Cell cell:row){
                switch(fmEval.evaluateInCell(cell).getCellTypeEnum()){
                
                    case NUMERIC:
                        
                        System.out.print(cell.getNumericCellValue()+"\t\t");
                        break;
                    
                    case STRING:
                        
                        System.out.print(cell.getStringCellValue()+"\t\t");
                        break;
                     
                
                }
            }
            System.out.println("");
            
        }
    }
}
