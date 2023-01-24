package org.modules;

import org.locators.PageElements;
import org.mainclass.BaseClass;
import org.report.Report;

public class PathFinder extends BaseClass implements PageElements {
public static void CreatingPathFinder() throws Throwable {
try {
	click(PathFinder);
	IsElementDisplayed(txtPathFinder);
	click(addPathFinder);
	IsElementDisplayed(txtAddCarePath);
	sendkeys(PFpathName, "Diabetes");
	selecttxt(PFSelectCate, "Shortcut");
	sendkeys(PFDescription, "Sample Test");
	click(PFbtnSave);
	Report.Pass("PathFinder is ready to create successfully");
	}catch(Exception e) {
		Report.Fail("The user failed to create a path");
	}/*try {
	click();
}catch(Exception e) {
	
}*/
Report.ReportCooldown();	

}

}