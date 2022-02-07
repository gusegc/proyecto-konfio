package dev.elementslearning;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SetUp {

	static WebDriver driver;
	public String baseUrl = "https://5elementslearning.dev/demosite/index.php";
	public String mailg = "testa@testa.com";
	public String password = "password";
	
	@BeforeTest
	public void navegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
