package com.naukri;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.LaunchBrowser;

public class ApplicationtestNaukari

{
	
	@BeforeTest
	public void launchnaukari()
	{
		LaunchBrowser.chromelaunch();
		
		
	}
	
	@Test
	public void signupnaukari() throws AWTException, InterruptedException
	{
		SignUpNaukari.signup();
		
	}

}
