package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class4 {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//Sleep mode
		
		Thread.sleep(3000);
		
		
		//To pass the input in username command
		
		WebElement username = d.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		
		
		//To pass the input in password command
		
		WebElement password = d.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		
		//Click button
		
		WebElement login = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
				}

}