package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// To launch the website
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		d.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Thread.sleep(5000);
		
		
		//How to handle dropdown code
		//Select code for dropdown 2 - select is a class
		
		WebElement drop = d.findElement(By.id("animals"));
		Select s2 = new Select(drop);
		s2.selectByIndex(2);
		System.out.println("dropdown 2 selected");
		
		
		//select by value
		WebElement a = d.findElement(By.id("animals"));
		Select s = new Select(a);
		s.selectByValue("avatar");
		System.out.println("dropdown 2 selected");
		
	}
}
