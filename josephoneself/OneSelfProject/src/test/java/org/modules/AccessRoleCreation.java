package org.modules;

import org.datadriven.DataDriven;
import org.locators.PageElements;
import org.mainclass.BaseClass;
import org.report.Report;

public class AccessRoleCreation extends BaseClass implements PageElements{

	public static void AccessRole() throws Throwable {
		Report.ReportCreateTestcase("Access Role Creation");
		//browserlaunch("https://oneself-admin-test.optisolbusiness.com/login");
		try {
		//UserSignInWithValidValues.validSignIn();
		click(AccessIcon);
		click(Role);
		sendkeys(roleName, DataDriven.readData(1, 2, "TestData"));
		click(btnCreate);
		IsElementDisplayed(txtRoleExist);
		Report.Fail("user failed to create a role");
		click(btnClose);
		}catch(Exception e) {
			Report.Pass("Role creation done successfully");
		}

	try {
		//UserSignInWithValidValues.validSignIn();
		click(AccessIcon);
		click(Role);
		sendkeys(roleName, DataDriven.readData(2, 2, "TestData"));
		click(btnCreate);
		IsElementDisplayed(txtRoleExist);
		Report.Fail("user failed to create a role");
		click(btnClose);
		}catch(Exception e) {
			Report.Pass("Role creation done successfully");
		}
	
	try {
		//UserSignInWithValidValues.validSignIn();
		click(AccessIcon);
		click(Role);
		sendkeys(roleName, DataDriven.readData(3, 2, "TestData"));
		click(btnCreate);
		IsElementDisplayed(txtRoleExist);
		Report.Fail("user failed to create a role");
		click(btnClose);
		}catch(Exception e) {
			Report.Pass("Role creation done successfully");
		}
	}
}
