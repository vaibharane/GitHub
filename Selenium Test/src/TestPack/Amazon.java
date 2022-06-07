package TestPack;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		/*System.setProperty("webdriver.chrome.driver","E:\\Selenium and Chrome files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	//	driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.get("https://www.facebook.com/");
		WebElement create=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create.click();
		
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s=new Select(month);
		s.selectByIndex(1);*/
		
		DateFormat format=new SimpleDateFormat("dd-MM-yyyy HH mm ss");
		Date date=new Date();
		
		String d=format.format(date);
		System.out.println(d);
		
		
		/*TakesScreenshot t=(TakesScreenshot)driver;//new ChromeDriver();
		File source=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("path\\test12345.jpeg");
		FileHandler.copy(source, dest);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*DateFormat format=new SimpleDateFormat("dd-MM-yyyy HH mm ss");
		Date date=new Date();
		String d=format.format(date);
		System.out.println(d);
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\New folder\\Test10101"+ d +".jpeg");
		FileHandler.copy(source, dest);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	

	
	
	
		
		
		
		
	/*	WebElement search=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		search.sendKeys("facebook");
		WebElement button=driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		button.click();
		WebElement facebook=driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(facebook).perform();
		a.click().perform();
		
		
		
	    WebElement acclist=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement yourwishlist=driver.findElement(By.xpath("//span[text()='Your Wish List']"));

	WebElement yourorder=driver.findElement(By.xpath("//span[text()='Your Orders']"));
	WebElement india=driver.findElement(By.xpath("//span[@class='nav-line-2']"));
	//WebElement hindi=driver.findElement(By.xpath("//div[@class='nav-template nav-flyout-content nav-tpl-itemList']//i"));
	WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//WebElement bag=driver.findElement(By.xpath("//div[@aria-label='laptop bag']"));
	System.out.println("end");	
		Actions act=new Actions(driver);
		
		act.moveToElement(india).perform();
		//act.moveToElement(all).perform();
		Thread.sleep(1000);
		
	//	WebElement hindi=driver.findElement(By.xpath("//div[@class='nav-template nav-flyout-content nav-tpl-itemList']//i"));
		
		//act.moveToElement(hindi).perform();
		//act.click().perform();
		System.out.println("end");	
		//search.sendKeys("laptop");
		Thread.sleep(1000);
		//WebElement bag=driver.findElement(By.xpath("//div[@aria-label='laptop bag']"));
		//bag.click();
		
		
		
		
		/*act.moveToElement(acclist).perform();
		act.moveToElement(yourwishlist).perform();
		act.click().perform();*/
		
	
		//act.moveToElement(acclist).moveToElement(yourorder).click().build().perform();
		
		
		
		
		
	}

}
