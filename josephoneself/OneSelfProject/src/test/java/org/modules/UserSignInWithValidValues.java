package org.modules;

import org.datadriven.DataDriven;
import org.locators.PageElements;
import org.mainclass.BaseClass;
import org.report.Report;

public class UserSignInWithValidValues extends BaseClass implements PageElements{
	
public static void validSignIn() throws Throwable {
	    Report.Report();
	    Report.ReportCreateTestcase("signin with valid values");
		browserlaunch("https://oneself-admin-test.optisolbusiness.com/login");
		try {
		sendkeys(txtuser,DataDriven.readData(3, 0, "TestData"));
		sendkeys(password,DataDriven.readData(3, 1, "TestData"));
		click(signin);
		IsElementDisplayed(welcome);
		Report.Pass("Signin done successfully");
		}catch(Exception e) {
			Report.Fail("user failed to signin");
		}

}

}
