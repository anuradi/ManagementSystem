package Group;

import DB.DB;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReport {

    private static final String[] columnHeader = {"Time Slot", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public static void writeExcel(String sheetName, String path, String where) {

        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet(sheetName);

            // styling cells
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 12);

            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            // Create a Row ( for Column Header)
            Row headerRow = sheet.createRow(0);

            for (int i = 0; i < columnHeader.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columnHeader[i]);
                cell.setCellStyle(headerCellStyle);
            }

            // Create Other rows and cells with database data
            try {
                ResultSet rs = DB.search("SELECT nar.day,nar.startTime,nar.endTime,l.name,sg.sub_groups_id,su.code,nar.room "
                        + "FROM not_available_time nat JOIN not_available_rooms nar on nat.notAvlRoom_id=nar.notAvlRoom_id "
                        + "JOIN lecturer l on nat.lecturer_id=l.idlecturer JOIN student_groups sg on nat.group_id=sg.idstudent_groups "
                        + "JOIN lecture_sessions ls on nat.session_id=ls.idlecture_sessions "
                        + "JOIN subjects su on ls.subjects_id=su.idsubjects " + where); //get data from database

                int rowNum = 1;

                while (rs.next()) {
                    Row row = sheet.createRow(rowNum++);             // create a row in excel

                    if (rs.getString(1).equals("Monday")) {
                        row.createCell(0).setCellValue(rs.getString(2) + " - " + rs.getString(3));
                        row.createCell(1).setCellValue(rs.getString(4) + " , " + rs.getString(5) + " , " + rs.getString(6) + " , " + rs.getString(7));
                        row.createCell(2).setCellValue("");
                        row.createCell(3).setCellValue("");
                        row.createCell(4).setCellValue("");
                        row.createCell(5).setCellValue("");
                    } else if (rs.getString(1).equals("Tuesday")) {
                        row.createCell(0).setCellValue(rs.getString(2) + " - " + rs.getString(3));
                        row.createCell(1).setCellValue("");
                        row.createCell(2).setCellValue(rs.getString(4) + " , " + rs.getString(5) + " , " + rs.getString(6) + " , " + rs.getString(7));
                        row.createCell(3).setCellValue("");
                        row.createCell(4).setCellValue("");
                        row.createCell(5).setCellValue("");
                    } else if (rs.getString(1).equals("Wednesday")) {
                        row.createCell(0).setCellValue(rs.getString(2) + " - " + rs.getString(3));
                        row.createCell(1).setCellValue("");
                        row.createCell(2).setCellValue("");
                        row.createCell(3).setCellValue(rs.getString(4) + " , " + rs.getString(5) + " , " + rs.getString(6) + " , " + rs.getString(7));
                        row.createCell(4).setCellValue("");
                        row.createCell(5).setCellValue("");
                    } else if (rs.getString(1).equals("Thursday")) {
                        row.createCell(0).setCellValue(rs.getString(2) + " - " + rs.getString(3));
                        row.createCell(1).setCellValue("");
                        row.createCell(2).setCellValue("");
                        row.createCell(3).setCellValue("");
                        row.createCell(4).setCellValue(rs.getString(4) + " , " + rs.getString(5) + " , " + rs.getString(6) + " , " + rs.getString(7));
                        row.createCell(5).setCellValue("");
                    } else if (rs.getString(1).equals("Friday")) {
                        row.createCell(0).setCellValue(rs.getString(2) + " - " + rs.getString(3));
                        row.createCell(1).setCellValue("");
                        row.createCell(2).setCellValue("");
                        row.createCell(3).setCellValue("");
                        row.createCell(4).setCellValue("");
                        row.createCell(5).setCellValue(rs.getString(4) + " , " + rs.getString(5) + " , " + rs.getString(6) + " , " + rs.getString(7));
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            // Resize all columnHeader to fit the content size
            for (int i = 0; i < columnHeader.length; i++) {
                sheet.autoSizeColumn(i);
            }
            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream(path);
            workbook.write(fileOut);
            fileOut.close();
            Desktop.getDesktop().open(new File(path));

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
