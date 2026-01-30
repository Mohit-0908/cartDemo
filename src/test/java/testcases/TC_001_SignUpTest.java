package testcases;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.SignUpPage;

public class TC_001_SignUpTest extends BaseClass {
	@Test
	public void signUpTest() {
		SignUpPage sp= new SignUpPage(driver);
		sp.addSign();
	}
}
