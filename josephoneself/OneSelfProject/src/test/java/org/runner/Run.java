package org.runner;

import org.mainclass.BaseClass;
import org.modules.AccessRoleCreation;
import org.modules.MyProfile;
import org.modules.PathFinder;
import org.modules.UserSignInWithValidValues;
import org.modules.UserSigninWithInvalidvalues;
import org.modules.MyProfile;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run extends BaseClass {

	@BeforeClass
	public void test1() {
		System.out.println("Starting");
	}

	@Test
	public void test2() throws Throwable {
		//UserSigninWithInvalidvalues.invaliddata();
		UserSignInWithValidValues.validSignIn();
		//MyProfile.myProfile();
		//AccessRoleCreation.AccessRole();
		//PathFinder.CreatingPathFinder();
	}
}
