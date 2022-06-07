package TestPack;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("vaibhavrane411996@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("vr411996");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement profile=driver.findElement(By.xpath("//span[text()='Vaibhav Rane']"));
		profile.click();
	   
		
	}

}
