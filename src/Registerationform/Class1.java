package Registerationform;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Class1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Software_Testing\\Selenium file\\chromedriver\\chromedriver.exe");
			ChromeDriver d =new ChromeDriver();
			d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
			
			//Time
			Thread.sleep(3000);

			//to give input to firstname
			WebElement fname= d.findElement(By.id("RESULT_TextField-1"));
			fname.sendKeys("Daksatha");
			
			//to give input to lastname
			WebElement lname= d.findElement(By.id("RESULT_TextField-2"));
			lname.sendKeys("S");
			
			Thread.sleep(3000);
			
			//to give input to phnno
			WebElement phnno= d.findElement(By.id("RESULT_TextField-3"));
			phnno.sendKeys("1234567890");
			
			Thread.sleep(1000);
			
			//to give the input for country
			WebElement country= d.findElement(By.id("RESULT_TextField-4"));
			country.sendKeys("India");
			
			Thread.sleep(1000);
			
			//to give the input for country
			WebElement city= d.findElement(By.id("RESULT_TextField-5"));
			city.sendKeys("Coimbatore");
			
			Thread.sleep(1000);
			
			//to give the input for country
			WebElement email= d.findElement(By.id("RESULT_TextField-6"));
			email.sendKeys("abc.gmail.com");
			
			Thread.sleep(1000);
			
			//to select gender
			//Female
			WebElement female = d.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label"));
			female.click();
			
			Thread.sleep(1000);
			//To select week days
			//monday
			WebElement monday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label"));
			monday.click();
			//tuesday
			WebElement tuesday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[3]/td/label"));
			tuesday.click();
			//wednesday
			WebElement wednesday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[4]/td/label"));
			wednesday.click();
			//thursday
			WebElement thursday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[5]/td/label"));
			thursday.click();
			//friday
			WebElement friday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[6]/td/label"));
			friday.click();
			//saturday
			WebElement saturday = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td/label"));
			saturday.click();
			
			Thread.sleep(1000);
			
			//Scroll
			JavascriptExecutor js=(JavascriptExecutor)d;
			js.executeScript("window.scrollBy(0,1000)");
			
			
			//To select time to contact
			//evening
			WebElement evening= d.findElement(By.id("RESULT_RadioButton-9"));
			Select s = new Select(evening);
			s.selectByIndex(3);
			
			Thread.sleep(1000);
			//Upload file
			WebElement file = d.findElement(By.id("RESULT_FileUpload-10"));
			file.sendKeys("C:\\Software_Testing\\Notes");
			
			//WebElement submit = d.findElement(By.id("FSsubmit"));
			//submit.click();
			
			//amazon link
			//d.get("https://www.amazon.com/sign/s?k=sign+in");
			
			//Screenshot code
			TakesScreenshot ss= (TakesScreenshot)d;
			
			//Source file -Take Screenshot calling method
			File source = ss.getScreenshotAs(OutputType.FILE);
			
			//Destination file- where the file to save
			File destination = new File("C:\\Software_Testing\\Screenshot\\img.png");
			
			//Copy function
			FileHandler.copy(source, destination);
			
			d.quit();			
	}

}
