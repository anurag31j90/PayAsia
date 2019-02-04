package com.payasia.leave.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payasia.leave.qa.base.Leavetestbase;

public class PayAsiaLoginPage extends Leavetestbase {
	
	
	//Page Factory - OR:
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@value='Submit']")
		WebElement loginBtn;
		
		
		@FindBy(id="headerCompanyLogo")
		WebElement PayAsiaLogo;
		
		//Initializing the Page Objects:
		public PayAsiaLoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validatePayAsiaImage(){
			return PayAsiaLogo.isDisplayed();
		}
		
		public Homepage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			 //js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new Homepage();
		}
	
}
