package org.Baseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin {

	public static void main(String[] args) throws IOException, InterruptedException {

		Methods m = new Methods();
		m.getDriver();
		m.enterUrl("https://adactinhotelapp.com/");
		m.maximize();

		WebElement txtUserName = m.findElementById("username");
		String name = m.getData("Sheet1", 1, 0);
		m.type(txtUserName, name);
		WebElement txtPassword = m.findElementById("password");
		String password = m.getData("Sheet1", 1, 1);
		m.type(txtPassword, password);
		WebElement btnLogin = m.findElementById("login");
		m.click(btnLogin);
		WebElement location = m.findElementById("location");
		m.selectOptionText(location, "Sydney");
		WebElement hotels = m.findElementById("hotels");
		m.selectOptionText(hotels, "Hotel Creek");
		WebElement roomType = m.findElementById("room_type");
		m.selectOptionText(roomType, "Standard");
		WebElement roomnos = m.findElementById("room_nos");
		m.selectOptionText(roomnos, "2 - Two");
		m.pressTab("room_nos");
		WebElement checkin = m.findElementById("datepick_in");
		String checkindate = m.getData("Sheet1", 7, 1);
		m.type(checkin, checkindate);

		Thread.sleep(1000);
		m.pressTab("datepick_in");
		WebElement checkout = m.findElementById("datepick_out");
		String checkoutdate = m.getData("Sheet1", 8, 1);
		m.type(checkout, checkoutdate);
		WebElement adults = m.findElementById("adult_room");
		m.selectOptionText(adults, "1 - One");
		WebElement childroom = m.findElementById("child_room");
		m.selectOptionText(childroom, "1  -  One");
		WebElement btnClick = m.findElementById("Submit");
		m.click(btnClick);
		Thread.sleep(1000);
		WebElement radiobutton = m.findElementById("radiobutton_0");
		m.click(radiobutton);
		WebElement btnContinue = m.findElementById("continue");
		m.click(btnContinue);
		WebElement firstName = m.findElementById("first_name");
		String setName = m.getData("Sheet1", 11, 3);
		m.type(firstName, setName);
		WebElement lastName = m.findElementById("last_name");
		String setdata = m.getData("Sheet1", 12, 3);
		m.type(lastName, setdata);
		WebElement address = m.findElementById("address");
		String setAddress = m.getData("Sheet1", 13, 3);
		m.type(address, setAddress);
		WebElement cardNum = m.findElementById("cc_num");
		String setCard = m.getData("Sheet1", 14, 3);
		m.type(cardNum, setCard);
		WebElement cardType = m.findElementById("cc_type");
		m.selectOptionText(cardType, "VISA");
		WebElement expMonth = m.findElementById("cc_exp_month");
		m.selectOptionText(expMonth, "March");
		WebElement expYear = m.findElementById("cc_exp_year");
		m.selectOptionText(expYear, "2022");
		WebElement cvv = m.findElementById("cc_cvv");
		String setCvv = m.getData("Sheet1", 16, 3);
		m.type(cvv, setCvv);
		WebElement btnBooknow = m.findElementById("book_now");
		m.click(btnBooknow);
		Thread.sleep(10000);
		WebElement orderNo = m.findElementById("order_no");
		String getattribute = m.getattribute(orderNo);
		m.writeData("Sheet1", 17, 3, getattribute);

	}

}
