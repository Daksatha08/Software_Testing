package Selenium;


import org.openqa.selenium.chrome.ChromeDriver;
public class Class3 {

	public static void main(String[] args) {
	
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		d.get("https://www.instagram.com/");
	
			//to maximize the window
			d.manage().window().maximize();

			

			// go to particular website method1

			

			d.get("https://www.youtube.com");

			

			// go to particular website method2

			

			d.navigate().to("https://www.facebook.com/pages/create/?ref_type=registration_form");

			

			//To move backward

			d.navigate().back();

			

			//To move forward

			d.navigate().forward();

			

			// to close the browser method-1(closes only the running tab)

			//d.close(); //close is similar to quit
			
			
			//To get link
			d.get("https://www.google.co.in/");
			
			//navigate
			d.navigate().to("https://www.fb.com/");
			
			//To print current url
			
			String currenturl = d.getCurrentUrl();

			System.out.println("current page url is:"+currenturl);

			//To print current page title

			String pagetitle = d.getTitle();

			System.out.println("current page Title is:"+pagetitle);
			

			// to close the browser method-2(closes the entire browser tab)

			d.quit();



		}
		

	}

