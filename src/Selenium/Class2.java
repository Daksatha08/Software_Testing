package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
public class Class2 {

	public static void main(String[] args) {
	
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		d.get("https://www.facebook.com/");
	
			//to maximize the window

			d.manage().window().maximize();

			

			// go to particular website method1

			

			d.get("https://www.fb.com");

			

			// go to particular website method2

			

			d.navigate().to("https://www.facebook.com/pages/create/?ref_type=registration_form");

			

			//To move backward

			d.navigate().back();

			

			//To move forward

			d.navigate().forward();

			

			// to close the browser method-1(closes only the running tab)

			//d.close();

			

			// to close the browser method-2(closes the entire browser tab)

			d.quit();



		}
		

	}
