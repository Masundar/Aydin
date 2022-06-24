package org.Junit;

import java.io.IOException;

import org.Baseclass.Methods;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junitassertion extends Methods {

	@BeforeClass

	public static void beforeclass() {
		getDriver();
		enterUrl("http://adactinhotelapp.com/");
		maximize();

	}

	@Test

	public void login() throws IOException, InterruptedException {

		WebElement txtusername = findElementById("username");

		String getusername = getData("Sheet1", 0, 0);

		type(txtusername, getusername);

		WebElement txtpassword = findElementById("password");

		String getpassword = getData("Sheet1", 1, 0);

		type(txtpassword, getpassword);

		WebElement btnlogin = findElementById("login");
		click(btnlogin);


		WebElement location = findElementById("location");
		selectOptionText(location, "Sydney");

		WebElement hotels = findElementById("hotels");
		selectOptionText(hotels, "Hotel Creek");

		WebElement roomType = findElementById("room_type");
		selectOptionText(roomType, "Standard");

		WebElement roomnos = findElementById("room_nos");
		selectOptionText(roomnos, "2 - Two");

		pressTab("room_nos");

		WebElement checkin = findElementById("datepick_in");
		String checkindate = getData("Sheet1", 7, 1);
		type(checkin, checkindate);

		Thread.sleep(1000);

		pressTab("datepick_in");

		WebElement checkout = findElementById("datepick_out");
		String checkoutdate = getData("Sheet1", 8, 1);

		type(checkout, checkoutdate);

		Thread.sleep(1000);

		WebElement adults = findElementById("adult_room");

		selectOptionText(adults, "1 - One");
		WebElement childroom = findElementById("child_room");

		selectOptionText(childroom, "0 - None");
		WebElement btnClick = findElementById("Submit");

		click(btnClick);

		WebElement radiobutton = findElementById("id");
		click(radiobutton);

		WebElement btnContinue = findElementById("continue");
		click(btnContinue);

		WebElement firstName = findElementById("first_name");
		String setName = getData("Sheet1", 11, 1);
		type(firstName, setName);

		WebElement lastName = findElementById("last_name");
		String setdata = getData("Sheet1", 12, 1);
		type(lastName, setdata);

		WebElement address = findElementById("address");
		String setAddress = getData("Sheet1", 13, 1);
		type(address, setAddress);

		WebElement cardNum = findElementById("cc_num");
		String setCard = getData("Sheet1", 14, 1);
		type(cardNum, setCard);

		WebElement cardType = findElementById("cc_type");
		selectOptionText(cardType, "VISA");

		WebElement expMonth = findElementById("cc_exp_month");
		selectOptionText(expMonth, "March");

		WebElement expYear = findElementById("cc_exp_year");
		selectOptionText(expYear, "2022");

		WebElement cvv = findElementById("cc_cvv");
		String setCvv = getData("Sheet1", 16, 1);
		type(cvv, setCvv);

		WebElement btnBooknow = findElementById("book_now");
		click(btnBooknow);

		Thread.sleep(10000);

		WebElement orderNo = findElementById("order_no");

		
	}

}
