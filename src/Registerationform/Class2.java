package Registerationform;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
		ChromeDriver d =new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		
		
		//Screenshot code
		TakesScreenshot ss= (TakesScreenshot)d;
		
		//Source file -Take Screenshot calling method
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		//Destination file- where the file to save
		File destination = new File("C:\\Software_Testing\\Screenshot\\img1.png");
		
		//Copy function
		FileHandler.copy(source, destination);
		
		//quit the browser
		d.quit();		
		
	}
}
