package com.Actitime.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Actitime.pom.HomePage;
import com.Actitime.pom.Logingpage;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static WebDriver driver;  
@BeforeSuite
public void databaseconnection() {
	Reporter.log("database connected",true);
}

@AfterSuite
public void databasedisconnected() {
	Reporter.log("databse disconnected",true);
}

@BeforeTest
public void launchbrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}


@AfterTest
public void closebrowser() {
	driver.close();
}

@BeforeMethod
public void login() throws IOException {
	readDataFromePropertyFile data=new readDataFromePropertyFile();
	String url = data.readDataFromePropertyFile("url");
	String un = data.readDataFromePropertyFile("username");
	String pw = data.readDataFromePropertyFile("password");
	driver.get(url);
	 Logingpage lp = new Logingpage(driver);
	 lp.loginToActitime(un, pw);
	//driver.findElement(By.id("username")).sendKeys(un);
	//driver.findElement(By.name("pwd")).sendKeys(pw);
	//driver.findElement(By.xpath("//div[.='Login ']")).click();
}
@AfterMethod
public void logout() throws InterruptedException {
Thread.sleep(4000);
HomePage hp=new HomePage(driver);
hp.logout();
}
}
