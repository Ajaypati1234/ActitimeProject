package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.Generic.Baseclass;

public class HomePage extends Baseclass {
	@FindBy(id="logoutLink")
	private WebElement logoutlnk;
	
	@FindBy(xpath ="//div[.='Tasks']")
	private WebElement tasklnk;
	
	@FindBy(xpath ="//div[.='Reports']")
	private WebElement reportlik;
	
	@FindBy(xpath ="//div[.='Users']")
	private WebElement userlnk;

	


    public HomePage(WebDriver driver) {
    PageFactory.initElements(driver,this);
}

	public WebElement getLogoutlnk() {
		return logoutlnk;
	}

	public WebElement getTasklnk() {
		return tasklnk;
	}

	public WebElement getReportlik() {
		return reportlik;
	}

	public WebElement getUserlnk() {
		return userlnk;
	}
	
	public void tasktab() {
		tasklnk.click();
	}
	
	}
    