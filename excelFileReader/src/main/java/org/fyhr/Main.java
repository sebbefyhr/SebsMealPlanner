package org.fyhr;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {




        try {
            File file  = new File("C:\\Users\\xxfyrrrs\\Downloads\\näringsbok.xlsx");
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook foodsWorkbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = foodsWorkbook.getSheetAt(0);

            Iterator<Row> itr = sheet.iterator();

            while(itr.hasNext()) {
                Row row = itr.next();
                Iterator<Cell> cellItr = row.iterator();

                StringBuilder sb = new StringBuilder();

                sb.append("insert into (");

                while (cellItr.hasNext()) {
                    Cell cell = cellItr.next();

                    switch (cell.getCellType()) {
                        case STRING:
                            sb.append(cell.getStringCellValue() + ", ");
                            break;
                        case NUMERIC:
                            sb.append(cell.getNumericCellValue() + ", ");
                    }



                }
                String line = sb.toString();




                if (!(line.contains("Bröd") || line.contains("Bullar, kakor, tårtor")|| line.contains("Rätter")
                || line.contains("Snacks") || line.contains("Måltidsersättning, sportpreparat"))) {

                } else {
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}