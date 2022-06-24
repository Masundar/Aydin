package org.pom;

import java.io.IOException;

import org.Baseclass.Methods;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class adabookingallclass extends Methods {

	@BeforeClass

	public static void beforeclass() {
		getDriver();
		enterUrl("https://adactinhotelapp.com/");
		maximize();
	}

	@Test

	public void booking() throws IOException, InterruptedException {

		login loginpage = new login();

		// Login
		String textUsername = getData("Sheet1", 1, 0);
		String txtpassword = getData("Sheet1", 1, 1);
		loginpage.logins(textUsername, txtpassword);

		// Search Hotels

		searchhotel hotel = new searchhotel();

		String dDnlocation = getData("Sheet1", 1, 2);

		String dDnhotels = getData("Sheet1", 1, 3);

		String dDnRoomType = getData("Sheet1", 1, 4);

		String dDnRoomNo = getData("Sheet1", 1, 5);

		String textcheckindate = getData("Sheet1", 1, 6);

		String textcheckoutdate = getData("Sheet1", 1, 7);

		String dDnAdultPerRoom = getData("Sheet1", 1, 8);

		String dDnchildPerRoom = getData("Sheet1", 1, 9);

		hotel.hotels(dDnlocation, dDnhotels, dDnRoomType, dDnRoomNo, textcheckindate, textcheckoutdate, dDnAdultPerRoom,
				dDnchildPerRoom);

		// Selecthotel

		selecthotel select = new selecthotel();
		select.slcthotel();

		// bookhotel
		bookhotel book = new bookhotel();

		String textfirstname = getData("Sheet1", 1, 10);
		String textlastname = getData("Sheet1", 1, 11);
		String textaddress = getData("Sheet1", 1, 12);
		String ccnumber = getData("Sheet1", 1, 13);
		String cctype = getData("Sheet1", 1, 14);
		String Ccmonth = getData("Sheet1", 1, 15);
		String ccyear = getData("Sheet1", 1, 16);
		String creditcvv = getData("Sheet1", 1, 17);

		book.bkhotel(textfirstname, textlastname, textaddress, ccnumber, cctype, Ccmonth, ccyear, creditcvv);

		bookingconfirm confirm = new bookingconfirm();

		cancelbooking cancel = new cancelbooking();

	}
}
