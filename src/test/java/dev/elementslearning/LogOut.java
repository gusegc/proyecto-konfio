package dev.elementslearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class LogOut extends SetUp {
	
	
	public void logout1() throws InterruptedException {
	driver.get(baseUrl);
	WebElement MyAccountB = driver.findElement(By.id("tdb3"));
	MyAccountB.click();
	String expectedText = "My Account Information";
	WebElement mensaje = driver.findElement(By.xpath("//h1[.='My Account Information']"));
	String actualText = mensaje.getText();
	Assert.assertEquals(actualText, expectedText, "Dashboard N-OK");
	
	
	
	WebElement Logout = driver.findElement(By.id("tdb4"));
	Logout.click();
	String expectedText1 = "Log Off";
	WebElement mensaje1 = driver.findElement(By.cssSelector("h1"));
	String actualText1 = mensaje1.getText();
	Assert.assertEquals(actualText1, expectedText1, "Fail logout");
	

	
	
	}

}
