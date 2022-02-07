package dev.elementslearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Login extends SetUp {


	public void login1() throws InterruptedException {

		driver.get(baseUrl);
		WebElement MyAccountB = driver.findElement(By.id("tdb3"));
		MyAccountB.click();
		WebElement user = driver.findElement(By.name("email_address"));
		user.clear();
		user.sendKeys(mailg);

		WebElement pass = driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys(password);

		WebElement singIn = driver.findElement(By.id("tdb5"));
		singIn.click();
		
		// Evaluacion
		String expectedText = "My Account Information";
		WebElement mensaje = driver.findElement(By.xpath("//h1[.='My Account Information']"));
		String actualText = mensaje.getText();
		Assert.assertEquals(actualText, expectedText, "Dashboard OK");
		Thread.sleep(4000);

	}

}
