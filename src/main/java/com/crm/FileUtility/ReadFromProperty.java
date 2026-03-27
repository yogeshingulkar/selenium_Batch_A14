package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperty {
public static String readProperty(String key) throws IOException {
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\configuration.properties");
	prop.load(fis);
	return prop.getProperty(key);
}
}
