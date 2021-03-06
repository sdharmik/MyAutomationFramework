package com.poc.ui.pagetasks;

import com.poc.ui.pageobjects.JobListingPageObjects;
import com.poc.utils.WebDriverTasks;

public class JobListingPageTasks {
	//public static WebDriverWait wait = new WebDriverWait(WebDriverTasks.getWebdriverSession(),10);
	
	/*public static synchronized void filterUserById(String userid){
		WebDriverWait wait = new WebDriverWait(WebDriverTasks.getWebdriverSession(),10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JobListingPageObjects.tableuserid_locator)));
		//WebDriverTasks.sendTextWithObject(JobListingPageObjects.getTableUserIDTextBox(), userid);
	}*/
	
	/*public static synchronized void EditUser(){
		WebDriverWait wait = new WebDriverWait(WebDriverTasks.getWebdriverSession(),10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JobListingPageObjects.editlink_locator)));
		WebDriverTasks.clickObject(JobListingPageObjects.getEditLink());
	}*/
	
	/*public static synchronized void EditUserFirstName(String firstname){
		WebDriverWait wait = new WebDriverWait(WebDriverTasks.getWebdriverSession(),10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JobListingPageObjects.rowusername_locator)));
		//WebDriverTasks.sendTextWithObject(JobListingPageObjects.getRecordUserNameTextBox(), firstname);
	}*/
	
	public static  void UpdateUserFirstName(String firstname,String userid){
		//WebDriverWait wait = new WebDriverWait(WebDriverTasks.getWebdriverSession(),10);
		//wait.until(ExpectedConditions.elementToBeClickable(JobListingPageObjects.getTableUserIDTextBox()));
		//WebDriverTasks.waitForElementToBeClickable(JobListingPageObjects.getTableUserIDTextBox());
		WebDriverTasks.sendTextWithObject(JobListingPageObjects.tableuserid_locator, userid);
		//filterUserById(userid);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JobListingPageObjects.editlink_locator)));
		//wait.until(ExpectedConditions.elementToBeClickable(JobListingPageObjects.getEditLink()));
		//WebDriverTasks.waitForElementToBeClickable(JobListingPageObjects.getEditLink());
		WebDriverTasks.clickObject(JobListingPageObjects.editlink_locator);
		//EditUser();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JobListingPageObjects.rowusername_locator)));
		//wait.until(ExpectedConditions.elementToBeClickable(JobListingPageObjects.getRecordUserNameTextBox()));
		//WebDriverTasks.waitForElementToBeClickable(JobListingPageObjects.getRecordUserNameTextBox());
		WebDriverTasks.sendTextWithObject(JobListingPageObjects.rowusername_locator, firstname);
		//EditUserFirstName(firstname);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JobListingPageObjects.updatelink_locator)));
		//wait.until(ExpectedConditions.elementToBeClickable(JobListingPageObjects.getUpdateLink()));
		//WebDriverTasks.waitForElementToBeClickable(JobListingPageObjects.getUpdateLink());
		WebDriverTasks.clickObject(JobListingPageObjects.updatelink_locator);
		
	}

}
