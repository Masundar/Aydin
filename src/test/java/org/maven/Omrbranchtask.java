package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Omrbranchtask {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://omrbranch.com/");

		WebElement SigUpbtn = driver.findElement(By.id("pr_register"));

		SigUpbtn.click();

		WebElement Selectmonth = driver.findElement(By.xpath("/*[@name='month']"));
		Select select = new Select(Selectmonth);

		List<WebElement> options = select.getOptions();
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\Maven\\Excel\\task.xlsx");

		Workbook workbook = new XSSFWorkbook();

		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");

		for (int i = 0; i < options.size(); i++) {

			Row Createrow = sheet.createRow(i);

			Cell createcell = Createrow.createCell(0);

			WebElement element = options.get(i);
			String text = element.getText();
			createcell.setCellValue(text);
			System.out.println(text);

			FileOutputStream Outputstream = new FileOutputStream(file);
			workbook.write(Outputstream);

		}

	}
}
