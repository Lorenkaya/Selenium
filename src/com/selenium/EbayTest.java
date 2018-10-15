package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayTest {
	
	static String buscador;
	static String numero;
	static Integer variable = 0;
	static Integer variable2 = 0;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
	 driver.get("https://www.ebay.com/");
	 
	//	WebElement buscador = driver.findElement(By.id("gh-ac")).sendKeys("zapatillas");
   	//WebElement buscador = driver.findElement(By.id("gh-ac"));
	 driver.findElement(By.id("gh-ac")).sendKeys("zapatillas");
		//System.out.println(buscador);
		driver.findElement(By.id("gh-btn")).click();
	//	WebElement myDynamicElement = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.id("e1-60")));
		WebDriverWait wait = new WebDriverWait(driver,8);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("e1-52")));
		driver.findElement(By.id("e1-52")).click();
		driver.findElement(By.id("e1-32")).click();
    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.rcnt")));
	    WebElement resultado = driver.findElement(By.cssSelector("span.rcnt"));
	    System.out.println(resultado.getText());
        
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//a[text()='Mejor resultado']"))).perform();
	    act.moveToElement(driver.findElement(By.xpath("//a[text()='Precio + Envío: más bajo primero']"))).perform();
	    driver.findElement(By.xpath("//a[text()='Precio + Envío: más bajo primero']")).click();
	   
	    //  numero = driver.findElement(By.xpath("//span[text()='1 978']")).getText();
		//	WebDriverWait wait2 = new WebDriverWait(driver,8);
		//	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id(\"SortMenu\")/li[3]/a[1]")));
		//    driver.findElement(By.xpath("id(\"SortMenu\")/li[3]/a[1]")).click();
		
	    	
	    //if variable >= variable2; {
	    //   variable = variable2;
	       
	    	   
	    //}else
	    //	variable
	    	
	      
	    
	
    }
}


