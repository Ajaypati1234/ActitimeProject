package com.Actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.Generic.ReadDataFromeExcel;

public class Taskpage {
	
	private static final CharSequence Banke = null;

	@FindBy(xpath = "//div[.='Add New']")
	private WebElement Addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
   
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
	private WebElement dropdon;
	
	@FindBy(xpath = "(//div[.='Big Bang Company'])[6]")
	private WebElement compname;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement crecust;
	
	public Taskpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getAddnewbtn() {
		return Addnewbtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}
	
	

	public WebElement getCustname() {
		return custname;
	}
	
	public WebElement getCompname() {
		return compname;
	}
	
	
	
	
	public void addnew() throws EncryptedDocumentException, IOException, InterruptedException {
		ReadDataFromeExcel r=new ReadDataFromeExcel();
		String customer = r.readDataFromExcelFile("Sheet1", 1, 1);
		Addnewbtn.click();
		newcustomer.click();
		Thread.sleep(5000);
		custname.sendKeys(customer);
		Thread.sleep(4000);
		custdesc.sendKeys("Banke");
		Thread.sleep(4000);
		dropdon.click();
		Thread.sleep(4000);
		compname.click();
		crecust.click();
	}

	



	
	


	

	
	
	
}
