package Selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class6 {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		d.get("https://demo.automationtesting.in/Alerts.html");
		
		
		// simple alert
		//To click the button
		WebElement box1 = d.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		box1.click();
		
		Thread.sleep(5000);
		
		//Alert handling main code
		Alert a =d.switchTo().alert();
		
		//Accept the alert
		a.accept();
		
		//close the browser
		//d.close();
		
		//confirmation alert
		//to click the button
		WebElement box2 = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		box2.click();
		
		//to click next button
		WebElement box3 = d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		box3.click();
		
		//Alert handling main code
				Alert b =d.switchTo().alert();
				
		//to cancel
				b.dismiss();
				
		//Confirmation alert
				//to click the button
				WebElement box5= d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
				box5.click();
				
				//to click next button
				WebElement box4 = d.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
				box4.click();
				
				Thread.sleep(5000);
				
				//Alert handling main code
						Alert c =d.switchTo().alert();
		       
			    // Use JavaScript to clear the text in the prompt
						//JavascriptExecutor js =(JavascriptExecutor)d;
						//JavascriptExecutor d.executeScript("arguments[0].value = '';", c);
						//((JavascriptExecutor) d).executeScript("arguments[0].value = '';", c);
					
				//To enter text
						c.sendKeys("Daksatha");
					
				//to accept
						c.accept();

	
				
		
		
		
		
	}
	}