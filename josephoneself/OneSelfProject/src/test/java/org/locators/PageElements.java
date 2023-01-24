package org.locators;

import org.openqa.selenium.By;

public interface PageElements {
	By txtuser = By.xpath("(//input[@type='email'])");
	By password = By.xpath("(//input[@type='password'])");
	By signin = By.xpath("(//button[@type='submit'])");
	By welcome = By.xpath("(//h1[text()=' WELCOME '] )");
	By Customer = By.xpath("(//span[text()=\"Customers\"])");
	By Staffs = By.xpath("(//span[text()=\"Access\"])");
	By Campaign = By.xpath("(//span[text()='Campaign'])");
	By Help = By.xpath("(//span[text()='Help'])");
	By Reference = By.xpath("(//span[text()='Reference'])");
	By Pathway = By.xpath("(//span[text()='Pathways'])");
	By labelPathway = By.xpath("(//label[text()=\"Pathways\"])");
	By PathFinder = By.xpath("(//span[text()='Pathfinder'])");
	By ProfilePic = By.xpath("(//img[@alt = \"User image\"])");
	By MyProfile = By.xpath("(//span[text()=\"My Profile\"])");
	By txtProfile = By.xpath("(//h1[text()=\"Profile\"])");
	By passwordChange = By.xpath("(//span[text()=\"Change Password\"])");
	By oldPassword = By.xpath("(//input[@placeholder=\"Old Password\"])");
	By requiredOldPW = By.className("ng-star-inserted");
	By visibleOldPassword = By.xpath("((//img[@alt=\"password-invisible\"])[1])");
	By visibleNewPassword = By.xpath("((//img[@alt=\"password-invisible\"])[2])");
	By visibleConfirmPassword = By.xpath("((//img[@alt=\"password-invisible\"])[3])");
	By PWbtnCancel = By.xpath("(//button[text()=\"Cancel\"])");
	By PWbtnNext = By.xpath("(//button[text()=\" Next\"])");
	By Back = By.xpath("(//h6[text()=\"Back\"])");
	By Logout = By.xpath("(//span[text()=\"Logout\"])");
	By Notification = By.xpath("(//img[@alt=\"notification\"])");
	By AccessIcon = By.xpath("(//img[@alt=\"accessInActive\"])");
	By Role = By.xpath("( //button [text()=\"+\"] )");
	By roleName = By.xpath("(//input[@type = \"text\"])");
	By btnCreate = By.xpath("(//button[text()=\"Create\"])");
	By btnCancel = By.xpath("(//button[text() = 'Cancel'])");
	By txtCreateRole = By.xpath("(//h4[text()=\"Create Role\"])");
	By btnClose= By.xpath("(//button[@aria-label=\"Close\"])");
	By txtRoleExist = By.xpath("(//small[text()=\" The Role exists\"])");
	By txtPathFinder = By.xpath("(//label[text()=\"PathFinder\"])");
	By addPathFinder = By.xpath("(//button[text()=\"+\"])");
	By txtAddCarePath = By.xpath("(//h4[text()=\"Add Care Path\"])");
	By PFpathName = By.xpath("(//input[@type=\"text\"])");
	By PFselectCategory = By.xpath("(//select[@formcontrolname =\"category\"])");
	By PFSelectCate = By.xpath("//select[@aria-label=\"Default select example\"]");
	By PFDescription = By.id("(\"description\")");
	By PFcancel = By.xpath("(//button[text()=\"Cancel\"])");
	By PFbtnSave = By.xpath("(//button[text()=\"Save\"])");
	//By startEvent = By.className("");
	// By = By.xpath();

}
