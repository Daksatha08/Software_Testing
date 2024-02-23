package Registerationform;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class3 {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		//To get link
		d.get("https://www.google.co.in/");
		
		//Interact with search box
		WebElement searchbox = d.findElement(By.id("APjFqb"));
		
		//isEnabled
		boolean enablecheck = searchbox.isEnabled();
		System.out.println("Is textbox is enabled?"+enablecheck);
		
		//isDisplayed
		boolean displaycheck = searchbox.isDisplayed();
		System.out.println("Is textbox displayed?"+displaycheck);
		
		//getSize
		Dimension size = searchbox.getSize();
		System.out.println("Box size is?"+size);
		
		d.navigate().to("https://demoqa.com/automation-practice-form");
		
		WebElement female =d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		female.click();
		
		Thread.sleep(5000);
		boolean selectcheck = female.isSelected();
		System.out.println("Is female radiobutton selected?"+selectcheck);
		
		
		
		d.quit();
		
	}

}
