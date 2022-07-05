package com.launching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonMobile {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.amazon.in");
		Thread.sleep(4000);
		drive.findElement(By.id("searchDropdownBox")).sendKeys("elec");
		drive.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy M53 5G");
		drive.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		drive.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy M53 5G (Mystique Green, 6GB, 128GB Storage)')])[1]")).click();
		Thread.sleep(6000);
		
		String parentWindow = drive.getWindowHandle();
		System.out.println("parentWindow Handle"+parentWindow);
		Set<String> childWindow = drive.getWindowHandles();
		for(String childWin:childWindow)
		drive.switchTo().window(childWin);
		Thread.sleep(6000);
		WebElement atc = drive.findElement(By.id("add-to-cart-button"));
		//((JavascriptExecutor) drive).executeScript("arguments[0].scrollIntoView();", element);
		//((JavascriptExecutor) drive).executeScript("arguments[0].scrollIntoView();", atc);
		atc.click();
		Thread.sleep(4000);
		drive.findElement(By.xpath("(//span[contains(text(),'Cart')])[12]")).click();
		Thread.sleep(10000);
		drive.quit();
	}

}
