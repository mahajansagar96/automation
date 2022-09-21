package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyHomePageTest extends BaseClass{
	
	@Test
	public void verify_TC_001_loginwithvalidcredential() {
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		
		
		Library.custom_sendkeys(login.gettxt_emailid(), "54321","EmailId");
		Library.custom_sendkeys(login.gettxt_password(),"12345", "Password");
		Library.custom_click(login.getbtn_login(),"LogIn");
		
	}
}