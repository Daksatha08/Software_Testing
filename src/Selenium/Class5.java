package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		
		d.get("https://demoqa.com/automation-practice-form");
		
		d.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		
		//To pass the input in first name command
		
		WebElement firstname = d.findElement(By.id("firstName"));
		firstname.sendKeys("Nilla");
		
		
		//To pass the input in last name command
		
				WebElement lastname = d.findElement(By.id("lastName"));
				lastname.sendKeys("S");
		
		//To pass the input in email command
		WebElement email = d.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		
		
		//To pass the input in gender
		WebElement gender = d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]"));
		gender.click();
		
		
		// To pass the input in mobile number
		WebElement mobilenumber = d.findElement(By.id("userNumber"));
		mobilenumber.sendKeys("1234567890");
		
		//scroll 
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,1000)");
		//to select sports
		WebElement hobby = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		hobby.click();
		
		//to select Reading
		WebElement hobby1 = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
		hobby1.click();
		
		//to select Music
				WebElement hobby2 = d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
				hobby2.click();
		
	    //subject
			//	WebElement subject= d.findElement(By.id("//*[@id=\"subjectsContainer\"]/div/div[1]"));
				//subject.sendKeys("cse");
				
		//to pass input in current address	
				WebElement address = d.findElement(By.id("currentAddress"));
				address.sendKeys("Edaiyarpalayam,Mettupalayam,Coimbatore.");
				
		//to click the box
				WebElement box = d.findElement(By.id("dateOfBirthInput"));
				box.click();
				
	    //to click month
				WebElement box1 = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
				box1.click();
		//To select the month
				Select s = new Select(box1);
				s.selectByIndex(4);
		//To click year
				WebElement box2 = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
				box2.click();
				Select s1 = new Select(box2);
				s1.selectByIndex(103);
				
		// To select date
				WebElement date = d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]"));
				date.click();
				
		//To upload file
				WebElement file = d.findElement(By.id("uploadPicture"));
				file.sendKeys("C:\\Software_Testing\\Notes");
	}

}
