package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	public static WebDriver driver;

	@BeforeClass

	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void after() {
		driver.quit();
	}

	@Test

	public void login() {

		WebElement textusername = driver.findElement(By.id("email"));

		textusername.sendKeys("Greens");

		WebElement textpassword = driver.findElement(By.id("pass"));

		textpassword.sendKeys("Hello@123");

		WebElement btnlogin = driver.findElement(By.name("login"));

		btnlogin.click();

	}

	@Before
	public void beforemethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}

	@After

	public void Aftermethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
}
