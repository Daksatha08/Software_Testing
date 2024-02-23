package Registerationform;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class Class4 {



	public static void main(String[] args) {

		//To launch the chrome browser

		System.setProperty("webdriver.chrome.driver", "C:\\\\Software_Testing\\\\Selenium file\\\\chromedriver\\\\chromedriver.exe");

		ChromeDriver d=new ChromeDriver();

		

		//to get url

		d.get("https://demoqa.com/browser-windows");

		

		WebElement find = d.findElement(By.id("tabButton"));

		find.click();
		
		
		//To get parent window id
		String parentwindow = d.getWindowHandle();
		System.out.println(""+parentwindow);
		
		 //multiple windows 
		Set<String> childwindows = d.getWindowHandles();
		// To show the id of all tabs one by one we use for loop
		//for loop will be used instead of system.out.prinln because there are multiples of tab
		//here we are using for each - array concept
		for (String allTabs : childwindows) {
			d.switchTo().window(allTabs);
		//d.close(); - inside the loop - all tab will be closed one by one
		
		}
		
		//outside the loop d.close(); - last tab will be closed
		d.close();
		
		d.switchTo().window(parentwindow);
		
		WebElement find1 = d.findElement(By.id("windowButton"));
		find1.click();
	}


}

