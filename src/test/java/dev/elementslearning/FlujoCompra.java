package dev.elementslearning;

import org.testng.annotations.Test;

public class FlujoCompra extends SetUp {
	@Test(priority = 1)
	public void login() throws InterruptedException {
		Login login = new Login();
		login.login1();
	}
	
	@Test(priority = 2)
	public void comprar() throws InterruptedException {
		Buy compra1 = new Buy();
		compra1.compra();
	}
	@Test(priority = 3)
	public void salir() throws InterruptedException {
		LogOut finsesion = new LogOut();
		finsesion.logout1();
	}
}
