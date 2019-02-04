package com.payasia.leave.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payasia.leave.qa.base.Leavetestbase;

public class ApplyLeave extends Leavetestbase {
	
	@FindBy(xpath = "//a[@id='lbsLeaveTab']")
	WebElement leavemenu;
	
	@FindBy(name = "applyLeaveLBSButton")
	WebElement applyleave;
	
	@FindBy(id = "empBalSumapplyLeaveDialog")
	WebElement diologboxdisplay;
	
	@FindBy(id = "empBalSumleaveTypeMain")
	WebElement Leavetypedropdown;
	
	@FindBy(xpath = "//input[@id = 'empBalSumleaveFromDate']")
	WebElement fromdatecalendar;
	
	@FindBy(name = "fromSessionId")
	WebElement fromSessiondropdown;
	
	@FindBy(xpath = "//input[@id = 'empBalSumleaveToDate")
	WebElement todate;
	
	@FindBy(name = "toSessionId")
	WebElement toSessiondropdown;
	
	@FindBy(xpath = "//textarea[@id = 'empBalSumleaveReason']")
	WebElement reasontext;
	
	@FindBy(xpath = "//textarea[@id = 'empBalSumleaveCC']")
	WebElement cctext;
	
	@FindBy(xpath = "//input[@id = 'empBalSumleaveShowReviewersButton']")
	WebElement showrwbtn;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement savebtn;
	
	@FindBy(xpath = "//*[@id=\\\"empBalSumapplyLeaveSuToWoFlow\\\"]/span") 
	WebElement submitbtn;
	
	public ApplyLeave() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonLeaveTab() {
		leavemenu.click();
	}
	
	public void ClickonApplyLeaveBtn() {
		applyleave.click();
	}
	
	public void NavigatintoDiologBoxPopup() {
		diologboxdisplay.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
