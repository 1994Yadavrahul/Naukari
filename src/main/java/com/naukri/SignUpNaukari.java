package com.naukri;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.config.Constants;

public class SignUpNaukari {
	public static void signup() throws AWTException, InterruptedException {
		windowHandle();
		Constants.driver.findElement(By.xpath("//input[@value='Register with us']")).click();

		Constants.driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();

		Constants.driver.findElement(By.id("fname")).click();

		Constants.driver.findElement(By.id("fname")).sendKeys("Rahul Singh Yadav");

		Constants.driver.findElement(By.id("email")).click();

		Constants.driver.findElement(By.id("email")).sendKeys("rahul.itm@look.com");

		Constants.driver.findElement(By.name("password")).click();

		Constants.driver.findElement(By.name("password")).sendKeys("rahul@123");

		Constants.driver.findElement(By.name("number")).click();

		Constants.driver.findElement(By.name("number")).sendKeys("123456789");

		Constants.driver.findElement(By.name("city")).click();

		Constants.driver.findElement(By.name("city")).sendKeys("Bengaluru/Bangalore");

		Constants.driver.findElement(By.name("uploadCV")).click();

		// StringSelection class
		StringSelection sel = new StringSelection("C:\\Users\\Rahul\\Desktop\\Rahulresume.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("selection" + sel);

		Robot robot = new Robot();
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		//Constants.driver.findElement(By.xpath("//div[text()='Send']")).click();

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public static void windowHandle() {
		Set<String> tab = Constants.driver.getWindowHandles();
		Iterator<String> window = tab.iterator();
		String parentWindow = window.next();
		String childWindow = window.next();
		Constants.driver.switchTo().window(parentWindow);

	}

}
