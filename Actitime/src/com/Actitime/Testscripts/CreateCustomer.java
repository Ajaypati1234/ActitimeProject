package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.Generic.Baseclass;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.Taskpage;
@Listeners(com.Actitime.Generic.Listenerimplementation.class)
public class CreateCustomer extends Baseclass {
	
	@Test
	public void creatcustomer() throws EncryptedDocumentException, IOException, InterruptedException  {
		 HomePage hp = new HomePage(driver);
		hp.tasktab();
		Thread.sleep(5000);
		
		Taskpage tp = new Taskpage(driver);
		tp.addnew();
				
		
	}

}
