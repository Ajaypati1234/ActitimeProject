package com.Actitime.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readDataFromePropertyFile {
	
	public String readDataFromePropertyFile(String key) throws IOException {
		FileInputStream fils=new FileInputStream("./TestData/commondata.proparty");
		Properties p=new Properties();
		p.load(fils);
		  String value = p.getProperty(key);
		  return value;
	}

}
