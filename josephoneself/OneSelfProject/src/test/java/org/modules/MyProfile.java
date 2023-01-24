package org.modules;

import org.locators.PageElements;
import org.mainclass.BaseClass;
import org.report.Report;

public class MyProfile extends BaseClass implements PageElements{
	public static void myProfile() throws Throwable {
	Report.ReportCreateTestcase("My Profile Page");
	try {
		click(ProfilePic);
		click(MyProfile);
	IsElementDisplayed(txtProfile);
	Report.Pass("My Profile page is clicked successfully");
	}catch(Exception e) {
		Report.Fail("The user failed to click My Profile page");
	}
	try {
		click(Back);
		IsElementDisplayed(welcome);
		Report.Pass("Back to Welcome page successfully");
	}catch(Exception e) {
		Report.Fail("The user failed to get back into welcome page");
	}
}
}