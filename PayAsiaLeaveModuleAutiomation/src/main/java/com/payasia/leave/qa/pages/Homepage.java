package com.payasia.leave.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payasia.leave.qa.base.Leavetestbase;

public class Homepage extends Leavetestbase {
	
	@FindBy(xpath = "//div[contains(text(),'Welcome  demoemp')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeLink;
	
	@FindBy(xpath = "//select[@name='rafilter']")
	WebElement recentFilter;
	
	@FindBy(xpath = "//a[contains(text(),'Leave')]")
	static
	WebElement navigatetoleave;
	
	@FindBy(xpath = "//a[contains(text(),'Leave Balance Summary')]")
	static
	WebElement leaveBalance;
	
	// Initializing the Page Objects:
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	// Navigating to My request page under leave Menu
	public static void leaveMenuNavigation(){
		
		Actions action = new Actions(driver);
		action.moveToElement(navigatetoleave).build().perform();
		action.moveToElement(leaveBalance).build().perform();
		action.click().build().perform();
		//return new MyRequest();
	}
	
		
	}


