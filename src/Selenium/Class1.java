package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
public class Class1 {

	public static void main(String[] args) {
	
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		
		

	}

}
