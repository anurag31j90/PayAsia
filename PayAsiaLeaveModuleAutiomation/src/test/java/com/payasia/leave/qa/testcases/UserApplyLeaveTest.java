package com.payasia.leave.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payasia.leave.qa.base.Leavetestbase;
import com.payasia.leave.qa.pages.ApplyLeave;
import com.payasia.leave.qa.pages.Homepage;
import com.payasia.leave.qa.pages.PayAsiaLoginPage;

public class UserApplyLeaveTest extends Leavetestbase {
	
	PayAsiaLoginPage loginPage;
	Homepage homePage;
	ApplyLeave applyleavepage;
	
	@BeforeTest
	public void setUp(){
		initialization();
		loginPage = new PayAsiaLoginPage();	
		homePage = new Homepage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		//Homepage.leaveMenuNavigation();
	}
		
	
	@Test(priority=1)
	public void ClickonLeaveSubMenu() {
		System.out.println("Checking");
		Homepage.leaveMenuNavigation();
		applyleavepage.clickonLeaveTab();
		
		
	}

}
