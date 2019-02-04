package com.payasia.leave.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.payasia.leave.qa.base.Leavetestbase;
import com.payasia.leave.qa.pages.Homepage;
import com.payasia.leave.qa.pages.PayAsiaLoginPage;
import com.payasia.leave.qa.utils.CustomListener;

@Listeners(CustomListener.class)
public class PayAsiaLoginPageTest extends Leavetestbase {
	
	PayAsiaLoginPage loginPage;
	Homepage homePage;

	public PayAsiaLoginPageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		loginPage = new PayAsiaLoginPage();	
		homePage = new Homepage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Payasia");
	}
	
	@Test(priority=2)
	public void PayaisaLogoImageTest(){
		boolean flag = loginPage.validatePayAsiaImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=4)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Welcome To Payasia");
	}
	
	@Test(priority=5)
	public void verifyUserNameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=6)
	public void leaveMenuNavigation() {
		Homepage.leaveMenuNavigation();
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
