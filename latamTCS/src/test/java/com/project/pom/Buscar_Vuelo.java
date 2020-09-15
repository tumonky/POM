package com.project.pom;

import static org.junit.Assert.*;

import javax.imageio.spi.RegisterableService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buscar_Vuelo {
	
	private WebDriver driver;
	HomePage homepage;
	

	@Before
	public void setUp() throws Exception {
		homepage = new HomePage(driver);
		driver = homepage.ConexionChrome();
		homepage.visit("https://www.latam.com/es_cl/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		homepage.BuscarVuelo();
	}

}
