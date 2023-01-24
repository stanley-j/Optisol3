package org.modules;

import org.datadriven.DataDriven;
import org.locators.PageElements;
import org.mainclass.BaseClass;
import org.report.Report;

public class UserSigninWithInvalidvalues extends BaseClass implements PageElements {
	
	public static void invaliddata() throws Throwable {
		try {
    Report.Report();
	Report.ReportCreateTestcase("user sigin with invalid");
	browserlaunch("https://oneself-admin-test.optisolbusiness.com/login");
	sendkeys(txtuser,DataDriven.readData(1, 0, "TestData"));
	sendkeys(password,DataDriven.readData(1, 1, "TestData"));
	click(signin);
	
	IsElementDisplayed(welcome);
	Report.Pass("Error message displayed successfully");
	}catch(Exception e) {
		Report.Fail("Error message not displayed successfully");
	}	
  }
}