package Registerationform;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class5 {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		//to get url

		d.get("https://demoqa.com/browser-windows");
		
		//To get parent window id
				String parentwindow = d.getWindowHandle();
				System.out.println(""+parentwindow);
		//to click the other tabs
		WebElement find = d.findElement(By.id("tabButton"));
		find.click();
		
		
		WebElement find1 = d.findElement(By.id("windowButton"));
		find1.click();
		
		//WebElement find2 = d.findElement(By.id("messageWindowButton"));
		//find2.click();	
		
		Set<String> childwindows = d.getWindowHandles();
		
		for (String allTabs : childwindows) {
			d.switchTo().window(allTabs);
			d.navigate().to("https://www.google.co.in/");
		}
			
			
	}

}
