package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Automationtask {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\admin\\eclipse-workspace\\Maven\\Excel\\task.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				CellType celltype = cell.getCellType();

				switch (celltype) {
				case STRING:

					String txt = cell.getStringCellValue();
					System.out.println(txt);
					break;

				case NUMERIC:

					if (DateUtil.isCellDateFormatted(cell)) {
						java.util.Date dateCellvalue = cell.getDateCellValue();

						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY");

						String format = dateFormat.format(dateCellvalue);
						System.out.println(format);

					}

					else {
						double d = cell.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);

						String num = b.toString();
						System.out.println(num);

					}

					break;
				default:
					break;

				}

			}

		}

	}

}
