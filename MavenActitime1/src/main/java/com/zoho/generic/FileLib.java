package com.zoho.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FileLib {
	public String getPropertyData(String value) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(value);
		return data;
		
	}

}
