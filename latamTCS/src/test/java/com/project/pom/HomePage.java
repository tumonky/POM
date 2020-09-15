package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends base {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	By origen = By.id("compra-select-origin");
	By SelectorOrigen = By.xpath("(//span[contains(.,'Santi')])[1]");
	By destino = By.id("compra-select-destination");
	By DestinoSelector = By.xpath("//li[contains(.,'Nueva York (NYC), Estados Unidos')]");
	By FechaVuelta = By.name("field");
	By BotonBuscar = By.xpath("//button[contains(.,'Busca tu vuelo')]");
	
	
	public void BuscarVuelo () throws InterruptedException {
		
		Type("Santiago", origen);
		Thread.sleep(2000);
		click(SelectorOrigen);
		Type("Nueva York", destino);
		click(DestinoSelector);
		Type("20/08/2020", FechaVuelta);
		click(BotonBuscar);
				
	}
	
			
	
}
