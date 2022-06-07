package TestPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium and Chrome files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		Thread.sleep(2000);
		
		//WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		WebElement promt=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		promt.click();
		Thread.sleep(1000);
		
		
		Alert a=driver.switchTo().alert();
		//a.accept();
		a.sendKeys("yes");
		
		
		String s=a.getText();
		System.out.println(s);
		
		
		
		Thread.sleep(4000);
		
		a.accept();
		
		
		
		/*driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		a=driver.switchTo().alert();
		
		String t=a.getText();
		System.out.println(t);
		Thread.sleep(2000);
		
		a.accept();*/
		
		
		
		
		
		
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-1500)");
		
		WebElement learnmore=driver.findElement(By.xpath("(//i[@class='pl-3 fas fa-caret-right'])[5]"));
		WebElement lambda=driver.findElement(By.xpath("//img[@alt='LambdaTest']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", learnmore);
		Thread.sleep(2000);
		
		//learnmore.click();
		
		js.executeScript("arguments[0].scrollIntoView(true)", lambda);
		Thread.sleep(2000);
		
		//lambda.click();
		System.out.println("end");*/
		
		
		
		
		
	}

}
