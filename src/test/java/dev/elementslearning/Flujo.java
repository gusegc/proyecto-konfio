package dev.elementslearning;

import org.testng.annotations.Test;

public class Flujo extends SetUp {
	
	
	
	@Test(priority = 1)
	public void reg() throws InterruptedException
	{
		Registro regs = new Registro();
		regs.sesion();
	}
	
	@Test(priority = 2)
	public void salir () throws InterruptedException
	{
		LogOut finsesion = new LogOut();
		finsesion.logout1();
	}
	
	@Test(priority = 3)
	public void login() throws InterruptedException {
		Login login = new Login();
		login.login1();
	}

}
