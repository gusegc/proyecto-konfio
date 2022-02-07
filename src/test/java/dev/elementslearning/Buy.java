package dev.elementslearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class Buy extends SetUp {
	
	@Test
	public void compra() throws InterruptedException {
		WebElement categoria = driver.findElement(By.linkText("Hardware->"));
		categoria.click();
		WebElement producto = driver.findElement(By.cssSelector("[alt='Graphics Cards']"));
		producto.click();
		
		WebElement tarjeta = driver.findElement(By.cssSelector("[alt='Matrox G200 MMS']"));
		tarjeta.click();
		
		WebElement continuaropt = driver.findElement(By.id("tdb5"));
		continuaropt.click();
		
		WebElement checkout = driver.findElement(By.id("tdb6"));
		checkout.click();
	
		WebElement shippingcont = driver.findElement(By.id("tdb6"));
		shippingcont.click();
		
				
		WebElement payopt = driver.findElement(By.xpath("//td[.='Cash on Delivery']"));
		payopt.click();
		
		WebElement paycont = driver.findElement(By.id("tdb6"));
		paycont.click();
		
			
		WebElement confirmar = driver.findElement(By.id("tdb5"));
		confirmar.click();
		Thread.sleep(4000);
		
		String expectedText = "Your Order Has Been Processed!";
		WebElement mensaje = driver.findElement(By.cssSelector("h1"));
		String actualText = mensaje.getText();
		Assert.assertEquals(actualText, expectedText, "Compra error");
		
	}

}
