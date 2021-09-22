package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	
  public static WebDriver driver;
  public static Properties prop;
  
  public Base() 
  {
	  try {
		  prop= new Properties();
		  FileInputStream fip=new FileInputStream("C:\\Users\\DELL\\git\\repository2\\Salesforceproj\\src\\main\\java\\com\\qa\\sf\\config\\config.properties");
		  prop.load(fip);
		  
	  }
	  catch(FileNotFoundException e)
	  {
		  e.printStackTrace();
	  }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
	  
  }

  public static void initialization() {
	 if(prop.getProperty("browser").matches("firefox"))
	 {
		 driver=new FirefoxDriver();
	 }
	 if(prop.getProperty("browser").matches("chrome"))
	 {
		 driver=new ChromeDriver();
	 }
	
	 
  }
}
