package com.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	
	public Configuration_Reader() throws IOException {

	File f =new File("C:\\Users\\user\\eclipse-workspace\\BDD_Cvf_Portal\\src\\test\\java\\com\\configuration\\Configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	
	 p = new Properties();
	p.load(fis);
	
	
	}
	
	
	public String getbrowser() {
	      String l = p.getProperty("browser");
	      return l;
	      
		}
		public String geturl() {
	         String k = p.getProperty("url");
	         return k;
	         
		}
		
	
	
	




	
	
}
