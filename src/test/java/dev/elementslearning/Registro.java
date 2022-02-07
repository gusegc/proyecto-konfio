package dev.elementslearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class Registro extends SetUp {

	

	public void sesion() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(8000);
		WebElement MyAccountB = driver.findElement(By.id("tdb3"));
		MyAccountB.click();
		WebElement RegisterB = driver.findElement(By.id("tdb4"));
		RegisterB.click();
		driver.findElement(By.name("gender")).click();
		WebElement nombre = driver.findElement(By.name("firstname"));
		nombre.click();
		nombre.sendKeys("Gus");
		WebElement apellido = driver.findElement(By.name("lastname"));
		apellido.click();
		apellido.sendKeys("Gar");
		WebElement nacimiento = driver.findElement(By.id("dob"));
		nacimiento.sendKeys("07/19/1992");
		nacimiento.sendKeys(Keys.ENTER);
		WebElement mail = driver.findElement(By.name("email_address"));
		mail.sendKeys(mailg);
		WebElement empresa = driver.findElement(By.name("company"));
		empresa.click();
		empresa.sendKeys("Konfio");
		WebElement calle = driver.findElement(By.name("street_address"));
		calle.click();
		calle.sendKeys("reforma");
		WebElement colonia = driver.findElement(By.name("suburb"));
		colonia.click();
		colonia.sendKeys("Lomas");
		WebElement cp = driver.findElement(By.name("postcode"));
		cp.click();
		cp.sendKeys("11000");
		WebElement ciudad = driver.findElement(By.name("city"));
		ciudad.click();
		ciudad.sendKeys("CDMX");
		WebElement estado = driver.findElement(By.name("state"));
		estado.click();
		estado.sendKeys("CDMX");

		WebElement pais = driver.findElement(By.name("country"));
		new Select(pais).selectByVisibleText("Mexico");

		WebElement telefono = driver.findElement(By.name("telephone"));
		telefono.click();
		telefono.sendKeys("1212121212");
		WebElement fax = driver.findElement(By.name("fax"));
		fax.click();
		fax.sendKeys("1212121212");
		WebElement news = driver.findElement(By.name("newsletter"));
		news.click();
		WebElement pass = driver.findElement(By.name("password"));
		pass.click();
		pass.sendKeys(password);
		WebElement passconf = driver.findElement(By.name("confirmation"));
		passconf.click();
		passconf.sendKeys(password);
		WebElement registrar = driver.findElement(By.id("tdb4"));
		registrar.click();
		Thread.sleep(4000);
		//Evaluacion
		String expectedText = "Your Account Has Been Created!";
		WebElement mensaje = driver.findElement(By.cssSelector("h1"));
		String actualText = mensaje.getText();
		Assert.assertEquals(actualText, expectedText, "Registro incorrecto");

		WebElement continuar = driver.findElement(By.id("tdb5"));
		continuar.click();
		
		//Evaluacion
		String expectedText2 = "My Account Information";
		WebElement mensaje2 = driver.findElement(By.xpath("//h1[.='My Account Information']"));
		String actualText2 = mensaje2.getText();
		Assert.assertEquals(actualText2, expectedText2, "Dashboard fail");

	}
}
