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

        StringBuilder sb = new StringBuilder();
        sb.append("insert into ingredient (ingredient_name, energy_kcal_per_100_gram, fats_g, protein_g, carbohydrates_g, fiberg, sugars_g, sugars_added_g, wholegrains_g, cholesterol_mg, vitamin_a_µg, retinol_µg, betakarotenµg, vitamin_d_µg, vitamin_e_mg, vitamin_k_µg, thiamine_mg, riboflavin_mg, niacin_mg, vitamin_b6_mg, folat_µg, vitamin_b12_µg, vitamin_c_mg, phosphorus_mg, iodine_µg, iron_mg, calcium_mg, potassium_mg, magnesium_mg, sodium_mg, salt_g, selenium_µg, zinc_mg)\n");
        sb.append("values\n");

        try {
            File file  = new File("C:\\Users\\xxfyrrrs\\Downloads\\näringsbok.xlsx");
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook foodsWorkbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = foodsWorkbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();

            while(rowIterator.hasNext()) {
                Row row = rowIterator.next();


                String line = row.getCell(1).getStringCellValue();

                if (line.equals("Bröd") || line.equals("Bullar, kakor, tårtor")|| line.equals("Rätter")
                        || line.equals("Snacks") || line.equals("Måltidsersättning, sportpreparat")){
                    continue;
                }

                Iterator<Cell> cellItr = row.iterator();
                sb.append("(");

                System.out.println("Line " + line);

                while (cellItr.hasNext()) {
                    Cell cell = cellItr.next();

                    if(cell.getColumnIndex()==1){
                        continue;
                    }

                    switch (cell.getCellType()) {
                        case STRING:
                            sb.append(cell.getStringCellValue().replaceAll(",", ".") + ", ");
                            break;
                        case NUMERIC:
                            if(!cellItr.hasNext()){
                                sb.append(cell.getNumericCellValue());
                            }else {
                                sb.append(cell.getNumericCellValue() + ", ");

                            }
                            break;
                    }
                    //System.out.println(sb.toString());
                }
                sb.append("),\n");
            }


            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            sb.toString().replaceAll(",\\).+" , "{)}");
            sb.append(";");




            char[] charbar = sb.toString().toCharArray();
            try(FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\xxfyrrrs\\Downloads\\insertscript.txt"))){
                for(int i = 0; i< charbar.length; i++){
                    fos.write(charbar[i]);
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