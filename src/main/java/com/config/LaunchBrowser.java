package com.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{
	
	public static void chromelaunch()
	{
		System.setProperty("webdriver.chrome.driver", Constants.driverLoaction);
		Constants.driver= new ChromeDriver();
		Constants.driver.manage().window().maximize();
		Constants.driver.get(Constants.url);
		Constants.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
}
