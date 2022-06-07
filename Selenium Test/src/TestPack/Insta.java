package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement user=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		WebElement password=driver.findElement(By.xpath("//input[@aria-label='Password']"));
		WebElement LogIn=driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		
		boolean result=LogIn.isEnabled();
		System.out.println(result);
		if(result)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("pass");
		}
		
		user.sendKeys("8237289209");
		password.sendKeys("uig7guk");
		LogIn.click();
	}

}
