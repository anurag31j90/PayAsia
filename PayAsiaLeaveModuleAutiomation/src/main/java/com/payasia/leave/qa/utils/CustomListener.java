package com.payasia.leave.qa.utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.payasia.leave.qa.base.Leavetestbase;

public class CustomListener extends Leavetestbase implements ITestListener {
	
	public static WebDriver driver;


	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
	   System.out.println("Failed Test");
	   takeScreenShot(result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
}
